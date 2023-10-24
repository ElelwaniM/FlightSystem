<!DOCTYPE html>
<html>
<head>
    <title>Success</title>
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
        
        .message-container {
            max-width: 400px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            text-align: center;
            animation: fade-in 0.5s ease-in;
        }
        
        .success-message {
            color: #00cc00;
            font-weight: bold;
        }
        
        .return-link {
            text-align: center;
            margin-top: 20px;
        }
        
          h1, footer {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 10px;
        }
        
        @keyframes fade-in {
            from {
                opacity: 0;
            }
            to {
                opacity: 1;
            }
        }
    </style>
</head>
<body>
    <h1>Success</h1>
    <div class="message-container">
        <p class="success-message">Record Successfully installed</p>
    </div>
    
    <div class="return-link">
        <p>Return to <a href="Admin">Login</a></p>
    </div>
    
    <script>
        // Redirect after 5 seconds
        setTimeout(function() {
            alert("You will be redirected to the login page.");
            window.location.href = "Admin";
        }, 5000);
    </script>
    <footer>
        Developed by Elelwani Magoba<br>
        You can contact me at email: <a href="mailto:elelwanimagoba@gmail.com">elelwanimagoba@gmail.com</a>
    </footer>
</body>
</html>
