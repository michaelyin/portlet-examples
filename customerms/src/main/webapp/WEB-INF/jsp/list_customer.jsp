<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table border = "1">
	<tr>
	    <th style="text-align:left">ID</th>
		<th style="text-align:left">Name</th>
		<th style="text-align:left">Address</th>
	</tr>
	<c:forEach items = "${list}" var ="consumer">
		<tr>
			<td><c:out value="${consumer.customerId}"></c:out></td>
			<td><c:out value="${consumer.name}"></c:out></td>
			<td><c:out value="${consumer.address}"></c:out></td>
		</tr>
	</c:forEach>
</table>
