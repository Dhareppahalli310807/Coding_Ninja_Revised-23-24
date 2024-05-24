//async is a keyword which is used before a function where await can be implimented
//await is a functionallity which helps us implement asynshronous operation that is promise based

const divEle = document.querySelector('.card-container');

function getUser(url){
  return fetch(url).then((response) => {
    if(!response.ok){
      throw new Error("Id does not match any DATA");
    }
    return response.json();
  });
}
async function getDetails(id){
    try{
    const response = await getUser(`https://dummyjson.com/users/${id}`);
    if(!response.ok){
        throw new Error("No data present..");
      }
    const userdata = await response.json();
    displayUser(userdata, 'beforeend');
    }catch(err){
        console.error(err);

    }
}

function displayUser(data, pos, className = ''){
  const card =`
    <div class="user-card ${className}">
    <img src=${data.image} alt="Profile Image"/>
    <h3>${data.firstName}</h3>
    <h3>${data.lastName}</h3>
    <p class="email">${data.email}</p>
    <button class="button">View Profile</button>
    </div>
    <script src="project-userCard.js"></script>
    `;
    divEle.insertAdjacentHTML(pos, card);
}
  
getDetails(3);