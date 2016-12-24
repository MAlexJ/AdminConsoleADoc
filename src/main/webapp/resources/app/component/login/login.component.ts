import {Component} from "@angular/core";

@Component({
    selector: 'login-app',
    templateUrl: 'app.login',
    styles:[`
        #login_form {
            padding-top: 40px;
            padding-bottom: 40px;
            background-color: #303641;
            color: #C1C3C6
         }
    `]
})
export class LoginComponent {

    user: User;

    login(email: string, password: string) {
        this.user = new User();
        this.user.password = password;
        this.user.email = email;
        console.log(this.user);
    }


}


export class User {

    private _email: string;
    private _password: string;

    get email(): string {
        return this._email;
    }

    set email(value: string) {
        this._email = value;
    }

    get password(): string {
        return this._password;
    }

    set password(value: string) {
        this._password = value;
    }
}