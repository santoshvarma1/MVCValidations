<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <body>
        <h2>Your admission is confirmed ${student.firstName} ${student.lastName}!!</h2>
        Date Of Birth: ${student.date}/${student.month}/${student.month} dd/mm/yyyy
        <br><br>
        Country Of Birth: ${student.birthCountry}
        <br><br>
        Country Of Residence: ${student.residenceCountry}
        <br><br>
        Favorite Programming Language: ${student.favoriteProgrammingLanguage}
        <br><br>
        Operating Systems:
        <ul>
            <c:forEach var="temp" items="${student.operatingSystems}">
                <li>${temp}</li>
            </c:forEach>
        </ul>
        <a href="enrollCourses">Click here to enroll in courses </a>
    </body>
</html>
