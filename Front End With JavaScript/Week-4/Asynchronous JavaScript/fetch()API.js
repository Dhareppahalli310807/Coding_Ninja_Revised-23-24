const divEle = document.querySelector('.card-container');

function getDetails(id){
  //getting id , id+1 and id-1
  const req = fetch(`https://dummyjson.com/users/${id}`);

  const response = req.then((response)=>{
    return response.json();
  });
  response.then((user)=>{
    console.log(user);
  })
}
  
getDetails(2);