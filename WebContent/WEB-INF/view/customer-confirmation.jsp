<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Customer Confirmation Page</title>
</head>
<body>
Customer Confirmed : ${customer.firstName}  ${customer.lastName}
<br><br>
Free Passes: ${customer.freePasses}
<br><br>

Postal code: ${customer.postalCode}
<br><br>

Course code: ${customer.courseCode}

</body>
</html>