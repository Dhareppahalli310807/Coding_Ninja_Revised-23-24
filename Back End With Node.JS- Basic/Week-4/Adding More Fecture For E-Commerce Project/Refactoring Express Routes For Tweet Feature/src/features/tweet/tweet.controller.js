export default class TweetController{
    getTweets(req, res) {
    res.send("GET tweets called!");
  };
  
    createTweet(req, res) {
    res.send("POST tweet created!");
  };
}


