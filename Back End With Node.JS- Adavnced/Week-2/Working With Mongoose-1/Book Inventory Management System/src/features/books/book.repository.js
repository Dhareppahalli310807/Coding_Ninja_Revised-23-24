// -------------pre-written code starts---------------
import mongoose from 'mongoose';
import { bookSchema } from './book.schema.js'

// creating model from schema.
const booksModel = mongoose.model('Book', bookSchema);

export default class BookRepository {

    //book creation
    async createBook(bookData) {
        const book = new booksModel(bookData);
        const savedBook = await book.save();
        return savedBook;
    }

    // filtering of book by id
    async getOne(id) {
        const book = await booksModel.findById(id);
        return book;
    }

    // ------------prewritten code ends----------------


    // Complete the following functions:

    //filtering the books based on genre
    async listBooksByGenre(genre) {
        try {
            return await booksModel.find({ genre: genre });
        } catch (err) {
            throw new Error(err);
        }
    }

    //increasing the count of available books
    async updateBookAvailability(bookId, quantity) {
        try {
            return await booksModel.findOneAndUpdate({ _id: bookId }, { $inc: { availableCopies: quantity } }, { new: true });
        } catch (err) {
            console.log(err);
            throw new Error(err);
        }
    }

    //deletion of book
    async deleteBookById(bookId) {
        try {
            return await booksModel.findOneAndDelete({ _id: bookId });
        } catch (err) {
            throw new Error(err);
        }
    }
}