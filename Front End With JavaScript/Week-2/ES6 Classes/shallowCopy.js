const user1 ={
    userName: "sara",
    age: 12,
    marks:{
        math: 20,
        sci: 10
    }
}

//shallow copy

// const user2 = user1;
// console.log(user1);//sara
// console.log(user2);//sara

const user2 = {...user1};
console.log(user2);
console.log(user1);

user2.userName = "harry";
console.log(user2);
console.log(user1);


//object . assign

const user3 = Object.assign({}, user1);
console.log(user3);
console.log(user1);

user2.userName = "harry";
console.log(user3);
console.log(user1);
