import React, { createContext, useContext, useState } from 'react';

// Create context
const PostContext = createContext();

// Custom hook to use the PostContext
export const usePostContext = () => useContext(PostContext);

// Custom provider component
export const PostProvider = ({ children }) => {
  const [savedPosts, setSavedPosts] = useState([]);

  const addPost = (post) => {
    setSavedPosts((prevPosts) => [...prevPosts, post]);
  };

  const resetPosts = () => {
    setSavedPosts([]);
  };

  return (
    <PostContext.Provider value={{ savedPosts, addPost, resetPosts }}>
      {children}
    </PostContext.Provider>
  );
};
