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
    //privite properties
    #regNumber;
    //constructor
    constructor(name, color, wheels, Number){
        this.name = name;
        this.color = color;
        this.wheels = wheels;
        this.#regNumber = Number
    }

    //privite method
    #getNumber(number){
        return number;
    }
    //methods
    getDetails(){
        console.log(`The ${this.name} is ${this.color} in color it has ${this.wheels} wheels and the registration number is ${this.#regNumber(this.#regNumber)}`);
    }
}

//instance creation
const Vehicle1 = new VehicleCl("scotter", "black", 2);
console.log(Vehicle1);

Vehicle1.name = "Car";
Vehicle1.#regNumber = 2223;
Vehicle1.getDetails();

Vehicle1.#regNumber();
