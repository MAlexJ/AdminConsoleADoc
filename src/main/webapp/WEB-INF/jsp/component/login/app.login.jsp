<%--<h2>Login Page</h2>--%>

<%--<label>Email</label>--%>
<%--<input class="form-control" name="email" [(ngModel)]="email" />--%>


<%--<label>Password</label>--%>
<%--<input class="form-control" name="password" [(ngModel)]="password" />--%>

<%--<button class="btn btn-default" (click)="login(email, password)">Submit</button>--%>


<div id="login_form">
    <form class="form-signin" role="form">
        <h3 class="form-signin-heading">Please sign in</h3>
        <div class="form-group">
            <div class="input-group">
                <div class="input-group-addon">
                    <i class="glyphicon glyphicon-user"></i>
                </div>
                <input type="text" class="form-control" name="username" id="username" placeholder="Username"
                       autocomplete="off"/>
            </div>
        </div>

        <div class="form-group">
            <div class="input-group">
                <div class="input-group-addon">
                    <i class=" glyphicon glyphicon-lock "></i>
                </div>
                <input type="password" class="form-control" name="password" id="password" placeholder="Password"
                       autocomplete="off"/>
            </div>
        </div>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>

</div>
