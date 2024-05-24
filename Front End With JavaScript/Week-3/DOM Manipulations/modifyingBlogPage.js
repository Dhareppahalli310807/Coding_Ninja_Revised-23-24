// For your convenience, the post part has already been added. Your task is to add event listeners to the buttons.

// For that:-

// 1. Creates a new div element with the class "blog-buttons".
// 2. Create a new button element with the class "blog-button" and "move-up" and append it to the "blog-buttons" div.
// 3. Create a new button element with the class "blog-button" and "move-down" and append it to the "blog-buttons" div.
// 4. Create a new button element with the class "blog-button" and "delete" and append it to the "blog-buttons" div.
// 5. Append the "blog-buttons" to "newbox" element
// 6. Add event listener to the "move-up", "move-down" and "delete" button
// 7. The move-up button should be able to move the blog item one step up in the "bloglist".
// 8. The move-down button should be able to move the blog item one step down in the "bloglist".
// 9. The delete button should be able to delete that particular blog from the dom element.

//complete the addBlog function to add moveup, movedown and delete button. 
function addBlog(blog) {
    const blogList = document.querySelector('.blog-list');
    
      
    const newBox = document.createElement('div');
    newBox.classList.add('blog-box');

    const newBlogPost = document.createElement('div');
    newBlogPost.classList.add('blog-post');
      newBox.appendChild(newBlogPost);
      

    const newBlogHeader = document.createElement('div');
    newBlogHeader.classList.add('blog-header');
    newBlogPost.appendChild(newBlogHeader);

    const newBlogTitle = document.createElement('h2');
    newBlogTitle.classList.add('blog-title');
    newBlogTitle.textContent = blog.title;
    newBlogHeader.appendChild(newBlogTitle);

    const newBlogDate = document.createElement('p');
    newBlogDate.classList.add('blog-date');
    newBlogDate.textContent = blog.date;
    newBlogHeader.appendChild(newBlogDate);

    const newBlogContent = document.createElement('p');
    newBlogContent.classList.add('blog-content');
    newBlogContent.textContent = blog.content;
    newBlogPost.appendChild(newBlogContent);

  // create a new div with className blog-buttons and append it to newBox
  const blogButtons = document.createElement('div');
  blogButtons.classList.add('blog-buttons');
  newBox.appendChild(blogButtons);

  //Create moveup button with class blog-button and move-up
  const moveUpButton = document.createElement('button');
  moveUpButton.classList.add('blog-button', 'move-up');
  moveUpButton.textContent = 'Move Up';
  blogButtons.appendChild(moveUpButton);
  
  //Add event listerner to moveup button
  moveUpButton.addEventListener('click', () => moveBlogUp(newBox));

  //Create movedown button with class blog-button and move-down
  const moveDownButton = document.createElement('button');
  moveDownButton.classList.add('blog-button', 'move-down');
  moveDownButton.textContent = 'Move Down';
  blogButtons.appendChild(moveDownButton);
  
  //Add event listerner to movedown button
  moveDownButton.addEventListener('click', () => moveBlogDown(newBox));

  //Create delete button with class blog-button and delete
  const deleteButton = document.createElement('button');
  deleteButton.classList.add('blog-button', 'delete');
  deleteButton.textContent = 'Delete';
  blogButtons.appendChild(deleteButton);
  
  //Add event listerner to delete button
  deleteButton.addEventListener('click', () => deleteBlog(newBox));

    blogList.appendChild(newBox);

  // Add event listeners to the buttons
}

function moveBlogUp(blogBox) {
  const prev = blogBox.previousElementSibling;
  if (prev !== null) {
      blogBox.parentNode.insertBefore(blogBox, prev);
  }
}

// Function to move blog item one step down
function moveBlogDown(blogBox) {
  const next = blogBox.nextElementSibling;
  if (next !== null) {
      blogBox.parentNode.insertBefore(next, blogBox);
  }
}

// Function to delete blog item
function deleteBlog(blogBox) {
  blogBox.parentNode.removeChild(blogBox);
}

const blogData = [
{
title: 'First Blog Post',
date: 'January 1, 2022',
content: 'This is the content of the first blog post.'
},
{
title: 'Second Blog Post',
date: 'February 1, 2022',
content: 'This is the content of the second blog post.'
},
{
title: 'Third Blog Post',
date: 'March 1, 2022',
content: 'This is the content of the third blog post.'
}
];

blogData.forEach(blog => addBlog(blog)); // Automatically call the function for each blog in the array