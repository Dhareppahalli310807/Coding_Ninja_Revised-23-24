// Please don't change the pre-written code
// Import the necessary modules here

import express from "express";
import TweetController from "./tweet.controller.js";

const tweetController = new TweetController()

const router = express.Router();

// Write your code here
router.get("/", tweetController.getTweets);

router.post("/", tweetController.createTweet);

export default router;
