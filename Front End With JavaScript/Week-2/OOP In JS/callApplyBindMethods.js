const car ={
    name: `car`,
    color: `black`,
    getDetails(brand, seats){
        console.log(`this is a ${this.color} ${this.name} of ${this.brand} company. it has ${this.seats}`);
    },
};

const bus = {
    name:`bus`,
    color:`blue`,

}

car.getDetails(`BMW`, 5)
car.getDetails.call(bus, `star`, 40);// call method with help of this we can call other function
car.getDetails.apply(bus, [`gold`, 50]);// apply method here we need to used bracket to pass arguments
const vehicle = car.getDetails.bind(bus);//bind method
vehicle(`silver`,100);
