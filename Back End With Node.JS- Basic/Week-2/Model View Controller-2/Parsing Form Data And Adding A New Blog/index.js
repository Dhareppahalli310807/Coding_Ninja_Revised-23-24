// Please don't change the pre-written code
// Import the necessary modules here

import express from "express";
import path from "path";
import expressEjsLayouts from "express-ejs-layouts";
import { renderBlogForm, addBlog, renderBlogs } from "./src/controllers/blog.controller.js";

const app = express();

app.set("view engine", "ejs");
app.set("views", path.resolve("src", "views"));
app.use(expressEjsLayouts);
app.use(express.urlencoded({ extended: true }));

// Write your code here
// Render Blog Form
app.get("/createblog", renderBlogForm);

// Render Blogs
app.get("/", renderBlogs);

// Add New Blog
app.post("/addblog", addBlog);
export default app;
