<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <body>
        <h2>Course enrollement form.</h2>
        Select the courses to register:
        <form:form action="processCourses" modelAttribute="student">
              101-Python <form:checkbox path="enrolledCourses" value="101-Python" />
              102-Data Structures <form:checkbox path="enrolledCourses" value="102-Data Structures" />
              103-Algebra <form:checkbox path="enrolledCourses" value="103-Algebra" />
              104-Economics <form:checkbox path="enrolledCourses" value="104-Economics" />
            <input type="submit" action="submit"/>
        </form:form>
    </body>
</html>
