<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>CustomerDetail Form</title>
</head>
<body>
    <div class="container">
        <h2>Customer Details</h2>
        <?php
        // ตรวจสอบว่ามีข้อมูลที่ถูกส่งมาจากฟอร์มหรือไม่
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            // ดึงข้อมูลจากฟอร์ม
            $firstName = $_POST['firstName'];
            $lastName = $_POST['lastName'];
            $age = $_POST['age'];

            // แสดงข้อมูล
            echo "<p id=\"firstname\">First Name: $firstName</p>";
            echo "<p><strong>Last Name:</strong> $lastName</p>";
            echo "<p><strong>Age:</strong> $age</p>";
        }
        ?>
    </div>
</body>
</html>
