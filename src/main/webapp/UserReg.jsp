<!DOCTYPE html>
<html>
<head>
    <title>Form Example</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }
        
        h1 {
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
        input[type="email"],
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
          h1, footer {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 10px;
        }
        
        input[type="submit"]:hover,
        input[type="reset"]:hover {
            background-color: #555;
        }
        
        .button-container {
            text-align: center;
        }
    </style>
</head>
<body onload="resetForm()">
    <h1>Submit a Form</h1>
    <form method="get" action="SimpleServlet" id="myForm">
        <label for="userid">User ID:</label>
        <input type="text" id="userid" name="userid" required autocomplete="off">
        
        <label for="username">User Name:</label>
        <input type="text" id="username" name="username" required autocomplete="off">
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required autocomplete="off">
        
        <label for="firstname">First Name:</label>
        <input type="text" id="firstname" name="firstname" required autocomplete="off">
        
        <label for="lastname">Last Name:</label>
        <input type="text" id="lastname" name="lastname" required autocomplete="off">
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required autocomplete="on">
        
        <label for="phoneNumber">Phone Number:</label>
        <input type="text" id="phoneNumber" name="phoneNumber" required autocomplete="off">
        
        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required autocomplete="off">
       
        <div class="button-container">
            <input type="submit" value="Submit">
            <input type="reset" value="Clear">
        </div>
    </form>
    
    <script>
        function resetForm() {
            document.getElementById("myForm").reset();
        }
    </script>
    
    <footer>
        Developed by Elelwani Magoba<br>
        You can contact me at email: <a href="mailto:elelwanimagoba@gmail.com">elelwanimagoba@gmail.com</a>
    </footer>
</body>
</html>
