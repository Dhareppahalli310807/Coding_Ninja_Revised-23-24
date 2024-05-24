const divEle = document.querySelector('.card-container');

function getDetails(id){
  //getting id , id+1 and id-1
  const req = fetch(`https://dummyjson.com/users/${id}`)
  .then((response)=>{
    if(!response.OK){
        throw new Error("Id does not match from data");
    }
    return response.json();
  })
  .then((user)=>{
    console.log(user);
  })
  .catch((err)=>{
    console.log(err);
  });
}
  
getDetails(2);