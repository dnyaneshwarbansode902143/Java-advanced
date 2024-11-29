<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Manager Application</title>
<style type="text/css">
/* Style for the entire page */
body {
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    background: linear-gradient(135deg, #ece9e6, #ffffff);
    margin: 0;
    padding: 0;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    height: 100vh;
    overflow: hidden;
}

/* Style for the navigation bar */
nav {
    display: flex;
    justify-content: center;
    margin-bottom: 20px;
    background-color: #333;
    border-radius: 8px;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    padding: 10px 20px;
}

nav a {
    text-decoration: none;
    color: #fff;
    padding: 15px 25px;
    margin: 0 5px;
    border-radius: 8px;
    background-color: #4CAF50;
    transition: all 0.3s ease;
    font-weight: bold;
    font-size: 16px;
}

nav a:hover {
    background-color: #45a049;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
    transform: translateY(-2px);
}

/* Style for the container div */
div {
    text-align: center;
    padding: 40px 60px;
    background-color: rgba(255, 255, 255, 0.9);
    border-radius: 10px;
    box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
    max-width: 800px;
    margin: 0 20px;
    animation: slideIn 1s ease-out;
}

/* Style for the h1 header */
h1 {
    color: #333;
    font-size: 36px;
    margin-bottom: 20px;
    text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.1);
    animation: fadeIn 2s ease-in-out;
}

/* Keyframes for fade-in animation */
@keyframes fadeIn {
    from {
        opacity: 0;
        transform: translateY(-20px);
    }
    to {
        opacity: 1;
        transform: translateY(0);
    }
}

/* Keyframes for slide-in animation */
@keyframes slideIn {
    from {
        opacity: 0;
        transform: translateX(-100%);
    }
    to {
        opacity: 1;
        transform: translateX(0);
    }
}

/* Responsive design adjustments */
@media (max-width: 600px) {
    nav {
        flex-direction: column;
        align-items: center;
        padding: 10px;
    }

    nav a {
        margin: 5px 0;
        width: 100%;
        text-align: center;
    }

    div {
        padding: 20px 30px;
    }

    h1 {
        font-size: 28px;
    }
}
</style>
</head>
<body>
<div>
    <nav>
        <a href="add_page">ADD</a>
        <a href="contacts_page">CONTACTS</a>
        <a href="edit_page">EDIT</a>
        <a href="delete_page">DELETE</a>
        <a href="signout">SIGN OUT</a>
        <a href="delete_user">DELETE USER</a>
    </nav>
    <h1>WELCOME TO CONTACT MANAGER APPLICATION</h1>
</div>
</body>
</html>
