class User {
    constructor(username) {
        this.username = username
    }

    logMe() {
        console.log(`Username : ${this.username}`);
    }

    static createId() {
        console.log(`${this.username}abc`);
    }
}

const sam = new User("saksham")
sam.logMe()
// sam.createId()

class Teacher extends User {
    constructor(username, email) {
        super(username)
        this.email = email
    }
}

const poco = new Teacher("poco", "poco.com")
poco.logMe()
// poco.createId()