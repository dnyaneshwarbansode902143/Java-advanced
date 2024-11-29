<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign In</title>
<style type="text/css">
/* Center the form */
body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
    margin: 0;
    padding: 0;
}

.container {
    width: 100%;
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
}

.form-container {
    text-align: center;
    background-color: #fff;
    border-radius: 8px;
    box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);
    padding: 30px;
    width: 300px;
}

h2 {
    color: #333;
    margin-bottom: 20px;
}

table {
    margin: 0 auto 20px auto;
    border-collapse: collapse;
    width: 100%;
}

table td {
    padding: 10px;
    text-align: left;
}

.input-container {
    position: relative;
    width: calc(100% - 10px); /* Adjusted width */
}

.input-container input {
    padding: 10px;
    width: calc(100% - 40px);
    border: 1px solid #ccc;
    border-radius: 6px;
    box-sizing: border-box;
    font-size: 16px;
    margin-bottom: 10px;
}

.show-password {
    position: absolute;
    top: 50%;
    right: 5px; /* Adjusted position */
    transform: translateY(-50%);
    cursor: pointer;
}

input[type="submit"] {
    padding: 12px 24px;
    background-color: #4CAF50; /* Green */
    color: white;
    border: none;
    border-radius: 6px;
    cursor: pointer;
    font-size: 16px;
    transition: background-color 0.3s ease;
}

input[type="submit"]:hover {
    background-color: #45a049; /* Darker Green */
}

h4 {
    margin-top: 20px;
}

h4 a {
    color: #4CAF50;
    text-decoration: none;
}

h4 a:hover {
    text-decoration: underline;
}

h3 {
    color: #f00;
    margin-top: 10px;
}
</style>

</head>
<body>
<div class="container">
    <div class="form-container">
        <h2>SIGN IN</h2>
        <form action="check_user" method="post">
            <table>
                <tr>
                    <td>EMAIL</td>
                    <td class="input-container">
                        <input type="text" name="email" required="required">
                    </td>
                </tr>
                <tr>
                    <td>PASSWORD</td>
                    <td class="input-container">
                        <input type="password" name="password" id="password" required="required">
                        <span class="show-password" onclick="togglePasswordVisibility()">&#128065;</span>
                    </td>
                </tr>
            </table>
            <input type="submit" value="SIGN IN">
        </form>
        <h4>New user? <a href="signup_page">Sign up</a></h4>
    </div>
</div>
<%
String message = (String) request.getAttribute("message");
if (message != null) {
%>
<div class="container">
    <h3><%=message%></h3>
</div>
<%
}
%>

<script>
function togglePasswordVisibility() {
    var passwordField = document.getElementById("password");
    if (passwordField.type === "password") {
        passwordField.type = "text";
    } else {
        passwordField.type = "password";
    }
}
</script>

</body>
</html>
