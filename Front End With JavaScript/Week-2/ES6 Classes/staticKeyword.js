//constructor function

function Vehicle(name, color, wheels){
    this.name = name;
    this.color = color;
    this.wheels = wheels;

    this.getDetails = function(){
        console.log(`The ${this.name} is ${this.color} in color it has ${this.wheels} wheels`);
    };
}

// class creation
class VehicleCl{
    
    //constructor
    constructor(name, color, wheels, Number){
        this.name = name;
        this.color = color;
        this.wheels = wheels;
    }
    //static method
    static showMsg(){
        console.log("hii");
    }

    //methods
    getDetails(){
        console.log(`The ${this.name} is ${this.color} in color it has ${this.wheels} wheels and the registration number is`);
    }
}

//instance creation
const Vehicle1 = new VehicleCl("scotter", "black", 2);
console.log(Vehicle1);


