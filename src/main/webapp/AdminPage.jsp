<!DOCTYPE html>
<html>
<head>
    <title>Admin Portal</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
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

        .header {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 20px;
        }

        .button-container {
            text-align: center;
            margin-top: 50px;
        }

        .admin-button {
            background-color: #333;
            color: #fff;
            padding: 15px 30px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            margin: 10px;
        }

        .admin-button:hover {
            background-color: #555;
        }
    </style>
</head>
<body>
    <div class="header">
        <h1>Admin Portal</h1>
    </div>
    <div class="container">
        <div class="row button-container">
            <div class="col-md-4">
                <button class="admin-button btn btn-primary" onclick="window.location.href='Flights.jsp'">Create Flights</button>
            </div>
            <div class="col-md-4">
                <button class="admin-button btn btn-success" onclick="window.location.href='Place.jsp'">Manage Places</button>
            </div>
            <div class="col-md-4">
                <button class="admin-button btn btn-info" onclick="window.location.href='Airline.jsp'">Add Airlines</button>
            </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <footer>
        Developed by Elelwani Magoba<br>
        You can contact me at email: <a href="mailto:elelwanimagoba@gmail.com">elelwanimagoba@gmail.com</a>
    </footer>
</body>
</html>
