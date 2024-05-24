class Circle{
    constructor(radius){
        this.radius = radius;
    }
 //getter method
    get diameter(){// can not accept parameter
        return this.radius* 2;
    }
// setter method
set diameter(newDiameter){//setter can accept at least one parameter
    this.diameter = newDiameter/2;
}
    // getDiameter(){
    //     console.log(this.radius* 2); //8
    // }
}

const circle = new Circle(4);
console.log(circle.radius);//4
//circle.getDiameter();
console.log(circle.diameter);//8
circle.diameter = 16;
console.log(circle.diameter);//8
circle.diameter = 20;
console.log(circle.diameter);//10
circle.diameter = 30;
console.log(circle.diameter);//15