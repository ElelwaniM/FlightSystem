<!DOCTYPE html>
<html>
<head>
    <title>Place Input</title>
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
        
        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
          h1, footer {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 10px;
        }
        
        .button-container {
            text-align: center;
        }
        
        .return-link {
            text-align: center;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <h1>Airline Input</h1>
    <form method="get" action="Airlines" id="AirlineForm">
        <label for="placeId">Airline ID:</label>
        <input type="text" id="airlineid" name="airlineid" required autocomplete="off">
        
        <label for="placeName">Airline Name:</label>
        <input type="text" id="airlinename" name="airlinename" required autocomplete="off">
       
        <div class="button-container">
            <input type="submit" value="Submit">
            <input type="reset" value="Clear">
        </div>
    </form>
    
    <div class="return-link">
        <p>Return to <a href="UserReg.jsp">Login</a></p>
    </div>
    <footer>
        Developed by Elelwani Magoba<br>
        You can contact me at email: <a href="mailto:elelwanimagoba@gmail.com">elelwanimagoba@gmail.com</a>
    </footer>
</body>
</html>
