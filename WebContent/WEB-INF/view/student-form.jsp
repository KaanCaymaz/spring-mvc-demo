<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>	
<html>

<head>
	<title>Student Registration</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName" />
	<br><br>
	
	Last Name: <form:input path="lastName" />
	
	<br> <br>
	
<%-- 	Country: <form:select path="country"> --%>
<%-- 		<form:option value="Brazil" label="Brazil"/> --%>
<%-- 		<form:option value="Germany" label="Germany"/> --%>
<%-- 		<form:option value="Ukrain" label="Ukrain"/> --%>
<%-- 		<form:option value="Rusia" label="Rusia"></form:option> --%>
	
<%-- 	</form:select> --%>

		Country: <form:select path="country">
			<form:options items="${student.countries}"/>
		
		</form:select>
		
		<br><br>
		
		Favorite Language:
		<form:radiobuttons path="favoriteLanguage" items="${languages}"/>
		
<%-- 		Java <form:radiobutton path="favoriteLanguage" value="Java"/> --%>
<%-- 		C# <form:radiobutton path="favoriteLanguage" value="C#"/> --%>
<%-- 		PHP <form:radiobutton path="favoriteLanguage" value= "PHP"/> --%>
<%-- 		COBOL <form:radiobutton path="favoriteLanguage" value="COBOL"/> --%>


	<br><br>
	
	Operating Systems: 
	Linux <form:checkbox  path="operatingSystems" value="Linux"/>
	Mac OS<form:checkbox path="operatingSystems" value= "Mac OS"/>
	Ms Windows<form:checkbox path="operatingSystems" value="Ms Windows"/>
	
	<input type="submit" value="Sumbit" />
	
	</form:form>


</body>



</html>