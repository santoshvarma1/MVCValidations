<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <body>
        <h2>Successfully registered in the following courses:</h2>
        <ul>
            <c:forEach var="course" items="${student.enrolledCourses}">
                <li>${course}</li>
            </c:forEach>
        </ul>
        <h2>Happy Holidays</h2>
    </body>
</html>
