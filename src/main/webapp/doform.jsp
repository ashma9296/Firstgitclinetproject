<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Product Entry</title>
</head>
<body>

	<form:form id="loginForm" modelAttribute="productObj" action="result"
		method="post">
		
		<table align="center">
		<tr>
				<td><form:label path="id">Id : </form:label></td>
				<td><form:input path="id" name="id" id="id" />
				</td>
			</tr>
			<tr>
				<td><form:label path="name"> Name : </form:label></td>
				<td><form:input path="name" name="name" id="name" />
				</td>
			</tr>
			<tr>
				<td><form:label path="category">Category : </form:label></td>
				<td><form:input path="category" name="category"
						id="category" /></td>
			</tr>
			<tr>
				<td><form:label path="manufacturer">Manufacturer :</form:label></td>
				<td><form:input path="manufacturer" name="manufacturer"
						id="manufacturer" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><form:button id="save" name="save">Save</form:button>
				</td>
			</tr>
			<tr></tr>
		</table>
	</form:form>

</body>
</html>