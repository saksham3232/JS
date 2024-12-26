let myHeros = ["thor", "spiderman"]

let heroPower = {
    thor : "hammer",
    spiderman : "sling",

    getSpiderPower: function() {
        console.log(`Spidy power is ${this.spiderman}`);
    }
}

Object.prototype.saksham = function() {
    console.log(`Saksham is present in all objects`);
}

Array.prototype.sayHii = function() {
    console.log(`Saksham says hello!!`);
}

heroPower.saksham()
// heroPower.sayHii() give error bcz sayHii function is only prototype of Array object
myHeros.saksham()
myHeros.sayHii()

// Prototypal Inheritance

const User = {
    name : "chai",
    email : "cha@google.com"
}

const Teacher = {
    makeVideo : true
}

const TeachingSupport = {
    isAvailable : false
}

const TASupport = {
    makeAssignment : "JS Assignment",
    fullTime : true,
    __proto__ : TeachingSupport
}

Teacher.__proto__ = User

console.log(TASupport.isAvailable);
console.log(Teacher.name);

// modern syntax
Object.setPrototypeOf(TeachingSupport, Teacher)

console.log(TeachingSupport.makeVideo);


let anotherUsername = "ChaiAurCode     "

String.prototype.trueLength = function() {
    console.log(`${this}`);
    console.log(`True length is : ${this.trim().length}`);
}

anotherUsername.trueLength()
"saksham".trueLength()
"iceTea".trueLength()