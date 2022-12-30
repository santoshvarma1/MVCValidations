<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <body>
        <h2>Student Registration Form</h2>
        <form:form action="processForm" modelAttribute="student">
            First name: <form:input path="firstName" />
            Last name: <form:input path="lastName" />
            <br><br>
            Date Of Birth: Date <form:input path="date" />
                           Month <form:input path="month" />
                           Year <form:input path="year" />
            <br><br>
            Country Of Birth:
            <form:select path="birthCountry">
                <form:options items="${student.countriesList}"/>
            </form:select>
            <br><br>
            Country Of Birth:
                <form:select path="residenceCountry">
                    <form:options items="${student.countriesList}"/>
                </form:select>
            <br><br>
            Favorite Programming Language:
                Java <form:radiobutton path="favoriteProgrammingLanguage" value="Java"/>
                Python <form:radiobutton path="favoriteProgrammingLanguage" value="Python"/>
                C <form:radiobutton path="favoriteProgrammingLanguage" value="C"/>
                Ruby <form:radiobutton path="favoriteProgrammingLanguage" value="Ruby"/>
            <br><br>
            Operating Systems:
                Linux <form:checkbox path="operatingSystems" value="Linux" />
                Windows <form:checkbox path="operatingSystems" value="Windows" />
                Mac0S <form:checkbox path="operatingSystems" value="MacOS" />
            <br><br>
            <input type="submit" action="submit"/>
        </form:form>
    </body>
</html>
