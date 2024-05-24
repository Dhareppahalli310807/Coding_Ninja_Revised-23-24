class Vehicle {
    //constructor
    constructor(name, color, wheels, number){
        this.name = name;
        this.color = color;
        this.wheels = wheels;
    }
    //methods
    getDetails(){
        console.log(`The ${this.name} is ${this.color} in color it has ${this.wheels} wheels`);
    }
}
//inheriated child to parent with using extend keyword
class car extends Vehicle{
    constructor(color,brand, purpse){
        //need to call super constructor menas parent constructor using super keyword
        super("car", color, 4);
        this.brand = brand;
        this.purpse = purpse;
    }
    getDetails(){//method overwridden
        console.log(`The ${this.name} is ${this.color} in color of ${this.brand} company it has ${this.wheels} wheels. it is for the ${this.purpse}`);
    }
}

//instance creation
const car1 = new car("red", "audi", "travelling");
car1.getDetails();
