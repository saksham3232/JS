class User{
    constructor(email, password) {
        this.email = email;
        this.password = password
    }

    get email(){
        return this._email.toUpperCase()
    }
    set email(value){
        this._email = value
    }

    get password(){
        return `${this._password}saksham`
    }
    set password(value){
        this._password = value
    }
}

const sam = new User("sam@gmail.com", "abc")
console.log(sam.email);