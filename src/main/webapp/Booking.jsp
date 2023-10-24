<!DOCTYPE html>
<html>
<head>
    <title>Flight Booking</title>
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
            max-width: 600px;
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
		
		  h1, footer {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 10px;
        }
		
        input[type="text"],
        input[type="number"],
        input[type="date"] {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        .section-header {
            background-color: #333;
            color: #fff;
            padding: 8px;
            margin-top: 15px;
            border-radius: 3px;
        }

        .section-content {
            padding: 15px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        .button-container {
            text-align: center;
            margin-top: 15px;
        }
    </style>
</head>
<body>
    <h1>Flight Booking</h1>
    <form method="get" action="Bookings">
        <div class="section-header">UserInfo</div>
        <div class="section-content">
           <label for="destination" class="col-form-label">Source:</label>
					<select class="form-select" name="Source" required>
					<option selected>Select Destination</option>
						<option value="2">Kimberley(ZA)</option>
						<option value="7">Pretoria(ZA)</option>						
						<option value="45">Frans(ZA)</option>
						<option value="789">Johannesburg</option>
						
					</select>
     
        
        <label for="destination" class="col-form-label">Destination:</label>
					<select class="form-select" name="Destination" required>
						<option selected>Select Destination</option>
						<option value="2">Kimberley(ZA)</option>
						<option value="7">Pretoria(ZA)</option>						
						<option value="45">Frans(ZA)</option>
						<option value="789">Johannesburg</option>
						
					</select>
					
			<label for="User">UserID</label>
            <input type="text" id="UserID" name="UserID" required>

            <label for="Passengers">Number of Passengers:</label>
            <input type="number" id="Passengers" name="Passengers" required>

            <label for="Date">Date:</label>
            <input type="date" id="Date" name="Date" required>
        </div>

        <div class="section-header">Payment Section</div>
        <div class="section-content">
            <label for="CardNumber">Card Number:</label>
            <input type="text" id="CardNumber" name="CardNumber" required>

            <label for="CardHolderName">Cardholder Name:</label>
            <input type="text" id="CardHolderName" name="CardHolderName" required>

            <label for="CVV">CVV:</label>
            <input type="text" id="CVV" name="CVV" required>
        </div>

        <div class="button-container">
            <input type="submit" value="Book Flight">
            <input type="reset" value="Clear">
        </div>
    </form>
    <footer>
        Developed by Elelwani Magoba<br>
        You can contact me at email: <a href="mailto:elelwanimagoba@gmail.com">elelwanimagoba@gmail.com</a>
    </footer>
</body>
</html>
