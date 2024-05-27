<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<body bgcolor="pink">
    <form:form modelAttribute="student" method="get" action="/updateandsave">
        <table>
            <tr>
                <td>S ID:</td>
                <td><form:hidden path="s_id"  /></td>
            </tr>
            <tr>
                <td>S Name:</td>
                <td><form:input path="s_name" /></td>    
            </tr>  
            <tr>
                <td>S Dept:</td>
                <td><form:input path="s_dept" /></td>    
            </tr>      
            <tr>
                <td>S Image:</td>
                <td><form:input path="s_image" /></td>    
            </tr>  
            <tr>
                <td colspan="2">
                    <input type="submit" value="Update" >
                </td>
                  
            </tr>  
        </table>
    </form:form>
 </body>
                