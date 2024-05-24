const user1 ={
    username: "sara",
    age: 20,
    marks:{
        math: 20,
        sci: 10
    },
    getMarks(){
        console.log(this.marks);
    },
};

//deep copy
const user2 = JSON.parse(JSON.stringify(user1));

console.log(user2);
console.log(user1);

user2.userName = "harry";
user2.marks.math = 30;// able to update
console.log(user2);
console.log(user1);
