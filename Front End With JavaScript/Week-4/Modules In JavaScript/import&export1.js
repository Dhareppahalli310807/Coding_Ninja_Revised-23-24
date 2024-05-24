//what is the role of an imported item?
//to provide additional featuare to the main program beyound the module scope
//to allow the main program to access and utilize the functionality provided by the imported module

import { obj, add } from "./import&export2";
//import { add } from "./import&export2";

let a =20;
let b = 30;

console.log(obj);
console.log(add(2, 3));//5

//import everything
import * as something from "./import&export2";

//import something 
console.log(something.obj);
console.log(something.add(2, 3));//5


// rename
import { obj as obj1, add } from "./import&export2";
console.log(obj1);

//default import

import a from "./import&export2";