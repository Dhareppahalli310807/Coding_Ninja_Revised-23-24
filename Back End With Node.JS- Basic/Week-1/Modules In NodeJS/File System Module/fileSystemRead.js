// fileSystem is managed by host operating system
// programming language have to depend on OS accesses
const { isUtf8 } = require("buffer");
const fs = require("fs");

//to read file content using blocking code
console.log("Starting to read");

const buffer = fs.readFileSync('fileSystem.txt');
//const buffer = fs.readFileSync('fileSystem.txt', {encoding:"utf-8"}); convert it in coding 
console.log(buffer.toString());
console.log("this is another operation being performed..");

