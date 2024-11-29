<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Manager - Add Contact</title>
<style type="text/css">
/* Style for the entire page */
body {
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    background: linear-gradient(135deg, #ffecd2, #fcb69f);
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

/* Style for the form container */
div.form-container {
    text-align: center;
    padding: 40px;
    background-color: rgba(255, 255, 255, 0.9);
    border-radius: 10px;
    box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
    width: 80%;
    max-width: 500px;
}

/* Style for the form title */
h2 {
    color: #d84315;
    margin-bottom: 20px;
    font-size: 24px;
    text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.1);
}

/* Style for the form elements */
table {
    width: 100%;
    border-collapse: separate;
    border-spacing: 0 10px; /* Spacing between table rows */
}

table td {
    padding: 10px;
    border: none;
}

input[type="text"] {
    width: 100%;
    padding: 12px;
    border: 1px solid #ffab91;
    border-radius: 5px;
    transition: border-color 0.3s ease;
    font-size: 16px;
}

input[type="text"]:focus {
    border-color: #d84315;
}

input[type="submit"] {
    width: 100%;
    padding: 12px;
    border: none;
    border-radius: 5px;
    background-color: #d84315;
    color: white;
    cursor: pointer;
    transition: background-color 0.3s ease, transform 0.2s ease;
    font-size: 16px;
    font-weight: bold;
}

input[type="submit"]:hover {
    background-color: #bf360c;
    transform: translateY(-2px);
}

/* Style for the "HOME" button */
.home-button {
    display: inline-block;
    text-decoration: none;
    color: #fff;
    padding: 10px 20px;
    margin-top: 20px;
    border: 2px solid #d84315;
    border-radius: 5px;
    transition: background-color 0.3s, color 0.3s, border-color 0.3s;
    background-color: #d84315;
}

.home-button:hover {
    background-color: #bf360c;
    border-color: #bf360c;
}
</style>
</head>
<body>
<div class="form-container">
    <h2>ADD CONTACT</h2>
    <form action="add_contact" method="post">
        <table>
            <tr>
                <td>FIRST NAME</td>
                <td><input type="text" name="firstName" required="required"></td>
            </tr>
            <tr>
                <td>LAST NAME</td>
                <td><input type="text" name="lastName" required="required"></td>
            </tr>
            <tr>
                <td>EMAIL</td>
                <td><input type="text" name="email" required="required"></td>
            </tr>
            <tr>
                <td>MOBILE</td>
                <td><input type="text" name="mobile" required="required"></td>
            </tr>
        </table>
        <input type="submit" value="ADD">
        <br>
        <a href="home_page" class="home-button">HOME</a>
    </form>
</div>
</body>
</html>
