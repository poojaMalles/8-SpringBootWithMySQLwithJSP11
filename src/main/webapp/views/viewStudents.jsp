<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table border="1"
       align="center"
       cellSpacing="10px"
       cellpadding="10px">
    <tr>
        <th>s_id</th>
        <th>s_name</th>
        <th>s_dept</th>
        <th>s_image</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.s_id}</td>
            <td>${student.s_name}</td>
            <td>${student.s_dept}</td>
            <td>
                <img src=${student.s_image} width="50px" alt="Error">
            </td>
            <td>
                <a href="/edit/${student.s_id}">Edit</a>          
            </td>
            <td>
                <a href="/delete/${student.s_id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
  </table>