<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agendado</title>
</head>
<body>
<h1>Detalle de la cita<c:out value="${nombre}" ></c:out><c:out value="${cita}"></c:out></h1>
<p> <c:out value="${area}" ></c:out> </p><c:out value="${hora}" ></c:out>
<br> 
<p><c:out value="${paciente.nombre } ${paciente.cita} ${paciente.area() ${paciente.hora}" ></c:out></p>
</body>
</html>


