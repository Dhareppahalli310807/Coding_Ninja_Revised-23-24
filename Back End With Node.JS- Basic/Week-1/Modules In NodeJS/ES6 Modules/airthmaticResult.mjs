//to import from airthmatic.js

//ES6 we need to use mjs extension
// import all function
import * as airthmaticModule from "./airthmatic.mjs";
console.log(airthmaticModule.sum(10,20));
console.log(airthmaticModule.div(10,20));

//import few function
import {sum} from "./airthmatic.mjs";
console.log(sum(10,20));

