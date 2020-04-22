<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="UTF-8">
     
        <meta name="viewport" content="width=device-width,initial-scale=1.0">

        <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="style.css">

       <title>Register</title>
<style type="text/css">
.error{
color: red;
}

    html, body {
        height: 100%;
        width: 100%;
        margin: 0;
        background: #f2306a;
        background: -moz-linear-gradient(left, #f2306a 0%, #6d00a0 100%);
        background: -webkit-linear-gradient(left, #f2306a 0%, #6d00a0 100%);
        background: linear-gradient(to right, #f2306a 0%, #6d00a0 100%);
        filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#f2306a', endColorstr='#6d00a0', GradientType=1);
    }

    a {
        color: white;
        text-decoration: none;
    }

    a:visited {
        color: white;
        outline:0;
    }

    button:focus {
        outline:0;
    }

    input:focus {
        outline:0;
    }

    .loginForm {
        position: absolute;
        height: 650px;
        width: 350px;
        left: 50%;
        top: 50%;
        transform: translate(-50%, -50%);
        background-color: #050023;
        color: white;
        border-radius: 10px;
        font-family: 'Lato', sans-serif;
        font-weight: bold;
        box-shadow: 0px 7px 23px #ffffff7a
    }

    .formHead {
        height: 30%;
        width: 40%;
        text-align: center;
        background: #ff0067;
        margin: -58px 0 14% 30%;        
        border-radius: 100%;
    }

    .logo {
        padding-top: 34%;
        font-size: 30px;
    }
    
    .logo span {
        color: #050023;
        font-size: 32px;
    }

    .formBody {

    }

    .formInput {
        margin: 5%;
    }

    .formInput div {
        margin-bottom: 8px;
        text-align: center;
        color: white;
    }

    .formInput input {
        position: relative;
        height: 35px;
        width: 90%;
        padding: 0 5%;
        background: #050023;
        color: white;
        font-size: 15px;
        font-weight: bold;
        border-radius: 4px;
        border: 2px solid #ff0067;
    }

.formInput option {
        position: relative;
        height: 35px;
        width: 90%;
        padding: 0 5%;
        background: #050023;
        color: white;
        font-size: 15px;
        font-weight: bold;
        border-radius: 4px;
        border: 2px solid #ff0067;
    }

.formInput select {
        position: relative;
        height: 35px;
        width: 90%;
        padding: 0 5%;
        background: #050023;
        color: white;
        font-size: 15px;
        font-weight: bold;
        border-radius: 4px;
        border: 2px solid #ff0067;
    }

    .formInput input:focus {
        border: 2px solid #007ACC;
    }

    .rememberMe {
        margin: 8% 5%;
    }

    .loginButton {
        margin-top: 12%;
        text-align: center;
    }

    .loginButton button {
        padding: 12px 70px;
        background-color: #ff0067;
        color: white;
        border: 0;
        border-radius: 5px;
        font-weight: bold;
        text-transform: uppercase;
        cursor: pointer;
    }

    .forgotPass {
        margin-top: 4%;
        text-align: center;
        font-size: 13px;
        font-weight: bold;
    }

    input[type="checkbox"] {
        display: none;
    }
    input[type="checkbox"]+label:before {
        display: inline-block;
        height: 15px;
        width: 15px;
        margin: 0 2% 0 0;
        border: 2px solid #ff0067;
        border-radius: 4px;
        cursor: pointer;
        vertical-align: middle;
        content: "\00a0";
    }

    input[type="checkbox"]:checked+label:before {
        background: #ff0067;
        color: #050023;
        font-size: 12px;
        text-align: center;
        content: "\2713";
    }

    input[type="checkbox"]:checked+label:after {
        font-weight: bold;
    }

    @media (max-width: 480px) {
        .loginForm {
            height: 400px;
            width: 300px;
            top: 54%;
        }
        .formHead {
            height: 28%;
        }
        .logo {
            padding-top: 30%;
        }
        .loginButton {
            margin-top: 0%;
        }
    }

</style>
</head>
<body>
 <div>
  <form:form action="registerSuccess" method="post" modelAttribute="user">
            <div class="loginForm">
                <div class="formHead">
                    <div class="logo"> <span></span>Register</div>
                </div>
                <div class="formBody">
                    <div>
                        <div class="formInput">
                            <div>Username</div>
                           <form:input path="name"/>
                           <form:errors path="name" cssClass="error"/>
                        </div>
                         <div class="formInput">
                            <div>Password</div>
                           <form:password path="password"/>
                           <form:errors path="email" cssClass="error"/>
                        </div>
                        <div class="formInput">
                            <div>email</div>
                           <form:input path="email"/>
                           <form:errors path="email" cssClass="error"/>
                        </div>
                        
                        <div class="formInput">
                            <div>Age</div>
                           <form:input path="age"/>
                           <form:errors path="age" cssClass="error"/>
                        </div>
                        
                          <div class="formInput">
                            <div>Country</div>
                           <form:select path="country">
				<form:option value="India">India</form:option>
				<form:option value="US">US</form:option>
				<form:option value="Other">Other</form:option>
				</form:select>
				<form:errors path="country" cssClass="error"/>
                        </div>
                        
                        
                        
                        <div class="rememberMe">
                            <input id="remember" type="checkbox" class="checkRemember">
                            <label for="remember">Remember me</label>
                        </div>
                    </div>
                    <div class="loginButton">
                       <input type="submit" value="Register">
                    </div>
                    <div class="forgotPass">
                        <a href="https://instagram.com/mic_codes" target="_blank">Forgot password?</a>
                    </div>

                </div>
            </div>
             </form:form>
        </div>



  </body>
</html>