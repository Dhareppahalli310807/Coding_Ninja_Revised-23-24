// Please don't change the pre-written code
// Import the necessary modules here

import { ObjectId } from "mongodb";
import { getDB } from "../../config/mongodb.js";

const collectionName = "students";

class studentRepository {
  async addStudent(studentData) {
    const db = getDB();
    await db.collection(collectionName).insertOne(studentData);
  }

  async getAllStudents() {
    const db = getDB();
    const students = await db.collection(collectionName).find({}).toArray();
    return students;
  }

  //You need to implement methods below:
  // Start Writing your code
  async createIndexes() {
    const db = getDB();
    await db.collection(collectionName).createIndex({ "name": 1 });
    await db.collection(collectionName).createIndex({ "age": 1, "grade": -1 });
  }
  async getStudentsWithAverageScore() {
    const db = getDB();
    const pipeline = [
      {
        $group: {
          _id: "$name",
          averageScore: { $avg: "$score" }
        }
      },
      {
        $project: {
          _id: 0,
          name: "$_id",
          averageScore: 1
        }
      }
    ];
    const result = await db.collection(collectionName).aggregate(pipeline).toArray();
    return result;
  }

  async getQualifiedStudentsCount() {
    const db = getDB();
    const count = await db.collection(collectionName).countDocuments({
      age: { $gt: 9 },
      grade: { $lte: 'B' },
      "assignments.title": "math",
      "assignments.score": { $gte: 60 }
    });
    return count;
  }

  async updateStudentGrade() {
    const db = getDB();
    const session = db.client.startSession();
    session.startTransaction();

    try {
      const student = await db.collection(collectionName).findOne({ _id: new ObjectId(studentId) });
      if (!student) {
        throw new Error("Student not found");
      }

      // Update the assignment score
      const updatedAssignment = student.assignments.find(assignment => assignment.title === assignmentTitle);
      if (!updatedAssignment) {
        throw new Error("Assignment not found");
      }
      updatedAssignment.score = newScore;

      // Recalculate the grade
      const totalScore = student.assignments.reduce((total, assignment) => total + assignment.score, 0);
      const averageScore = totalScore / student.assignments.length;

      let grade;
      if (averageScore >= 90) {
        grade = 'A';
      } else if (averageScore >= 80) {
        grade = 'B';
      } else if (averageScore >= 70) {
        grade = 'C';
      } else if (averageScore >= 60) {
        grade = 'D';
      } else {
        grade = 'F';
      }

      // Update student's grade
      await db.collection(collectionName).updateOne(
        { _id: new ObjectId(studentId) },
        { $set: { grade: grade } },
        { session }
      );

      await session.commitTransaction();
      session.endSession();
    } catch (error) {
      await session.abortTransaction();
      session.endSession();
      throw error;
    }
  }
}

export default studentRepository;
