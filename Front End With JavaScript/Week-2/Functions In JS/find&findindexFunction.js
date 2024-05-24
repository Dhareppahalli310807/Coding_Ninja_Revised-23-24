const inputs = [56,7,4,78,67];
const find1 = inputs.find((num)=> num > 65);
console.log(find1);// 78, 67

const find2 = inputs.findIndex((num) => num ===56);
console.log(find2);//0