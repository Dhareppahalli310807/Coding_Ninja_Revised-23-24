import mongoose from 'mongoose';
import { bookSchema } from './book.schema.js'

const booksModel = mongoose.model("Book", bookSchema);

export default class BookRepository {
    async createBook(bookData) {
        const book = new booksModel(bookData);
        const savedBook = await book.save();
        return savedBook;
    }
    async getOne (id){
        const book = await booksModel.findById(id);
        return book;
    }
}

// export default class BookRepository {


//     // -----Change code in below functions only-----

//     //book creation
//         async createBook(bookData) {
//             try {
//                 const createdBook = await BookModel.create(bookData);
//                 return createdBook;
//             } catch (error) {
//                 throw new Error('Failed to create book');
//             }
//         }

//     //filtering the book by id
//     async getOne(id) {
//         try {
//             const book = await BookModel.findById(id);
//             if (!book) {
//                 throw new Error('Book not found');
//             }
//             return book;
//         } catch (error) {
//             throw new Error('Failed to get book by ID');
//         }
//     }
// }