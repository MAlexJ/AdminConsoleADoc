import {NgModule}      from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {APP_BASE_HREF} from '@angular/common';
import {FormsModule}   from '@angular/forms';
import {Routes, RouterModule} from '@angular/router';

import {AppComponent}   from '../component/app.component';
import {LoginComponent}   from '../component/login/login.component';
import {HomeComponent}   from '../component/home/home.component';

// route definition
const appRoutes: Routes = [
    {path: '', component: LoginComponent},
    {path: 'login', component: LoginComponent},
    {path: 'logout', component: LoginComponent},
    {path: 'home', component: HomeComponent}
];


@NgModule({
    imports: [BrowserModule, RouterModule.forRoot(appRoutes), FormsModule],
    declarations: [AppComponent, HomeComponent, LoginComponent],
    bootstrap: [AppComponent],
    providers: [{provide: APP_BASE_HREF, useValue: '/'}]
})
export class AppModule {
}