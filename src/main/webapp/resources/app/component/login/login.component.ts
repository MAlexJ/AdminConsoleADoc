import {Component} from "@angular/core";

@Component({
    selector: 'login-app',
    templateUrl: 'app.login.html',
    styleUrls: ['app.login.css']
})
export class LoginComponent {

    login(username: string, password: string) {
        console.log(username + ' ' + password);
    }

}
