<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<title> Student Registration Form</title>

</head>

<body>

The Student confirmed: ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}

<br><br>

 Favorite Language: ${student.favoriteLanguage} 
 
 <br><br>

Operating System: 
	<c:forEach var="system" items="${student.operatingSystems}">

		<tr>
			<ul>
				<li>
					${system}
				</li>
			</ul>
		</tr>
	</c:forEach>

</body>


</html>