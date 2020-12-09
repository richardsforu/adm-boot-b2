<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h1 align="center">Product Page</h1>

	<hr width="50%" />


	<c:if test="${product ne null }">

		<div align="center">

			<form action="find" method="post" autocomplete="off">
				<input name="id" placeholder="Product ID" />
				<button>Find</button>
				<br/>
				<h3 align="center">${param.msg}</h3>

			</form>

			<br /> <br />
			<c:if test="${product.id>0}">
				<table border="1">
					<thead>
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Price</th>
							<th>Description</th>
						</tr>
					</thead>

					<tbody>
						<tr>
							<td>${product.id}</td>
							<td>${product.name}</td>
							<td>${product.price}</td>
							<td>${product.description}</td>
						</tr>

					</tbody>
				</table>
			</c:if>

		</div>
	</c:if>

	


</body>
</html>