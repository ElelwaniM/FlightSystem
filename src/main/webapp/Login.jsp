<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }
        
        h1, footer {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 10px;
        }
        
        form {
            max-width: 400px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }
        
        label {
            display: block;
            margin-top: 10px;
        }
        
        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        
        input[type="submit"],
        input[type="reset"] {
            background-color: #333;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            margin-top: 10px;
        }
        
        input[type="submit"]:hover,
        input[type="reset"]:hover {
            background-color: #555;
        }
        
        .button-container {
            text-align: center;
        }
        
        .register-link {
            text-align: center;
            margin-top: 20px;
        }
    </style>
</head>
<body onload="resetForm()">
    <h1>Login</h1>
    <form method="get" action="LoginServlet" id="loginForm">
        <label for="username">User name:</label>
        <input type="text" id="username" name="username" required autocomplete="off">
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required autocomplete="off">
       
        <div class="button-container">
            <input type="submit" value="Login">
            <input type="reset" value="Clear">
        </div>
    </form>
    
    <div class="register-link">
        <p>Don't have an account? <a href="UserReg.jsp">Register</a></p>
    </div>
    
    <script>
        function resetForm() {
            document.getElementById("loginForm").reset();
        }
    </script>

    <footer>
        Developed by Elelwani Magoba<br>
        You can contact me at email: <a href="mailto:elelwanimagoba@gmail.com">elelwanimagoba@gmail.com</a>
    </footer>
</body>
</html>
