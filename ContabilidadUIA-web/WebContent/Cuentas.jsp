<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page import="uia.com.contabilidad.ContabilidadUIA.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
	<jsp:useBean id='contabilidad' class='uia.com.contabilidad.ContabilidadUIA'/>
	
	<form name="formCuentas" id="form1" action="/cuentas.jsp">
  		Proveedores: <select name="proveedor">	
		<c:forEach var="proveedor" items="${contabilidad.getListaProveedores()}">
			<option value="${cuentas.id}">${cuentas.name}</option>	
		</c:forEach>
		</select>
  		<input type="submit" value="Submit">
  	</form>
	
	<form name="formCuentas" id="form2" action="/cuentas.jsp">
  		Cuentas: <select name="cuenta">	
		</select>
  		<input type="submit" value="Submit">
  	</form>

	<form name="formCheques" id="form2" action="/cuentas.jsp">
  		Cheques: <select name="cuenta">	
		</select>
  		<input type="submit" value="Submit">
  	</form>
</body>
</html>