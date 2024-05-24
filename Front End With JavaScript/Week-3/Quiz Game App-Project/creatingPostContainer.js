// Problem statement
// For the given markup and CSS, build a Social Media Page that would be able to utilize the post1 object present in the JS scaffold to build a container that would display the post on the Screen.

// Objectives:

// In the div with the id "posts" create a new div with the class "post". This div will contain:-

// 1- h3 tag, which should contain the author of post1.

// 2- img tag, which should contain the image present in post1.

// 3- p tag, which should contain the content of post1

// 4- A button which textContent "Like"

// 5- An input tag with text type.

// 6- A button with the textContent "Comment"

// 7- A div with the class "post-footer" showing the number of likes and numbers of comments on the post using the template literal `Likes: ${post1.likes} Comments: ${post1.comments.length}`.

// 8- A div with the class "comments-container" . Initially, the display should be set to none.

// 9- For all the comments present in the comment array of the post1, create a p tag with each comment as its textContent and append it to "comments-container" div.

// 10- Create a click event listener to the post-footer div, Which would set the display of the "comments-container" div to "block" or "none" on click depending on the value of the display of "comments-container" div..

// 11- Append each of these to the div with "post" class in the same sequence as given in the problem Statement.


// The visual representation of the structure is as follows:

//Complete this JS file to render the post1 on the screen with all the specified tags.
//Create the event Listener for the buttons.
// The code given below is for one object refactor the code it for using the JSON Data.
let postsData = [
  { id: 1, author: 'John', content: 'Hello, Instagram!', likes: 10, comments: ['Great post!', 'Nice photo!'], image: 'https://files.codingninjas.in/image2-28694.jpg' },
  { id: 2, author: 'Jane', content: 'This is a great post!', likes: 15, comments: [], image: 'https://files.codingninjas.in/oip-28704.jpg' },
  { id: 3, author: 'Alice', content: 'Another post', likes: 8, comments: [], image: 'https://files.codingninjas.in/th-2-28706.jpg' },
  { id: 4, author: 'Bob', content: 'Check out this photo!', likes: 20, comments: [], image: 'https://files.codingninjas.in/image1-28708.jpg' },
];

function renderPosts() {
  const postsContainer = document.getElementById('posts');
  postsContainer.innerHTML = '';

  postsData.forEach((post) => {
      const postElement = document.createElement('div');
      postElement.classList.add('post');

      const authorElement = document.createElement('h3');
      authorElement.textContent = post.author;

      const contentElement = document.createElement('p');
      contentElement.textContent = post.content;

      const imageElement = document.createElement('img');
      imageElement.src = post.image;
      imageElement.alt = 'Post Image';

      const likeButton = document.createElement('button');
      likeButton.textContent = `Like`;
      likeButton.classList.add('like-button');
      likeButton.dataset.id = post.id; // Store post id as a dataset
      likeButton.addEventListener('click', () => {
          if (!likeButton.disabled) {
    post.likes++;
    postFooter.textContent = `Likes: ${post.likes}   Comments: ${post.comments.length}`;
    likeButton.style.backgroundColor = 'red';
    likeButton.disabled = true;
  }
      });

      const commentInput = document.createElement('input');
      commentInput.type = 'text';
      commentInput.placeholder = 'Write a comment...';

      const commentButton = document.createElement('button');
      commentButton.textContent = 'Comment';
      commentButton.classList.add('comment-button')
      commentButton.addEventListener('click', () => {
          addComment(post, commentInput.value); // Pass the post and comment value
          commentInput.value = '';
      });

      const postFooter = document.createElement('div');
      postFooter.classList.add('post-footer');
      postFooter.textContent = `Likes: ${post.likes}   Comments: ${post.comments.length}`;

      const commentsContainer = document.createElement('div');
      commentsContainer.classList.add('comments-container');
      commentsContainer.style.display = 'none';

      post.comments.forEach((comment) => {
          const commentElement = document.createElement('p');
          commentElement.textContent = comment;
          commentsContainer.appendChild(commentElement);
      });

      postElement.appendChild(authorElement);
      postElement.appendChild(imageElement);
      postElement.appendChild(contentElement);
      postElement.appendChild(likeButton);
      postElement.appendChild(commentInput);
      postElement.appendChild(commentButton);
      postElement.appendChild(postFooter);
      postElement.appendChild(commentsContainer);

      postFooter.addEventListener('click', () => {
          if (commentsContainer.style.display === 'none') {
              commentsContainer.style.display = 'block';
          } else {
              commentsContainer.style.display = 'none';
          }
      });

      postsContainer.appendChild(postElement);
  });
}

// Set to keep track of liked posts
const likedPosts = new Set();

// Function to handle post liking
function likePost(post) {
  post.likes++;
  renderPosts();
}

// Function to handle adding a comment
function addComment(post, comment) {
  post.comments.push(comment);
  renderPosts();
}

renderPosts();



