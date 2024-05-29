// make the necessary imports here
import mongoose from 'mongoose';
// implement the below schema
const messageSchema = new mongoose.Schema({
    username: { type: String, required: true },
    text: { type: String, required: true },
    room: { type: String, required: true },
    timestamp: { type: Date, required: true, default: Date.now }
});

// Create Message model from schema
export const Message = mongoose.model('Message', messageSchema);


