const user = {
    username : "saksham",
    loginCount : 8,
    signedIn : true,

    getUserDetails : function(){
        console.log("Got user details from database");
        console.log(`Username : ${this.username}`);
        console.log(this);
    }
}

console.log(user.username);
console.log(user.getUserDetails());
console.log(this);


function User(username, loginCount, isLoggedIn) {
    this.username = username
    this.loginCount = loginCount
    this.isLoggedIn = isLoggedIn

    this.greeting = function() {
        console.log(`Welcome ${this.username}`);
    }
    return this;
}

const user1 = new User("saksham", 12, true)
const user2 = new User("sam", 11, false)

console.log(user1);
console.log(user2);

console.log(user1.constructor);