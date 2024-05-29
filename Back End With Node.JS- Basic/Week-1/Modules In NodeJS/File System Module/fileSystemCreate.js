const { isUtf8 } = require("buffer");
const fs = require("fs");

// creating and writing a file
try{
    fs.writeFileSync('fileSystemCreate.txt', 'Name: dhareppa halli, Age: 40, PhoneNumber: 9834258036, position: Product Manager');
}catch(err){
    console.log(err);
}

//append another data
fs.appendFileSync('fileSystemCreate.txt', 'Name:Demo Dumma, Age:50, PhoneNumber: 8308975297, position: Product Developer');

// try{
//     fs.writeFileSync('fileSystemCreate1.txt', 'Name: dhareppa halli, Age: 40, PhoneNumber: 9834258036, position: Product Manager');
// }catch(err){
//     console.log(err);
// }

// deleting the file
try{
    fs.unlinkSync('fileSystemCreate1.txt');
}catch(err){
    console.log(err);
}

//************************************************************************************************************************ */
//Read async file
fs.readFile('fileSystemCreate.txt', (err, data) =>{
    if(err){
        console.log(err);
    }else{
        console.log(data.toString());
    }
});

// write Async file
fs.writeFile('fileSystemCreate1.txt', 'this is a dada', (err) =>{
    if(err){
        console.log(err);
    }else{
        console.log("data was written");
    }
});

//append async file
fs.appendFile('fileSystemCreate.txt', '\n good by', (err)=>{
    if(err){
        console.log(err);
    }else{
        console.log("its append");
    }
});

//delete async file
fs.unlink('fileSystemCreate1.txt', (err)=>{
    if(err){
        console.log(err);
    }else{
        console.log("file was deleted");
    }
})