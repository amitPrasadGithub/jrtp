<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="./js/async.js"></script>
    </head>
    <body>
        <form:form method="POST" action="saveContact" modelAttribute="contactDTO">
            <table>
                <tr>
                    <td><form:hidden path="contactId"/></td>
                </tr>
                <tr>
                    <td>First Name </td>
                    <td><form:input path="firstName"/></td>
                </tr>
                <tr>
                    <td>Last Name </td>
                    <td><form:input path="lastName"/></td>
                </tr>
                <tr>
                    <td>Email </td>
                    <td>
                        <form:input path="email" id="emailId"/>
                        <font color="red">
                            <div class="hid" id="duplicateEmail"></div>
                        </font>
                        <font color="green">
                            <div class="hid" id="availableEmail"></div>
                        </font>
                    </td>
                </tr>
                <tr>
                    <td>Phone </td>
                    <td><form:input path="phone"/></td>
                </tr>
                <tr>
                    <td>Country </td>
                    <td>
                        <form:select path="country" id="countryId">
                            <form:option value="">-select-</form:option>
                            <form:options items="${countryList}"/>
                        </form:select>
                    </td>
                </tr>
                <tr>
                    <td>State </td>
                    <td>
                        <form:select path="state" id="stateId">
                            <form:option value="">-select-</form:option>
                        </form:select>
                    </td>
                </tr>
                <tr>
                    <td>City </td>
                    <td>
                        <form:select path="city" id="cityId">
                            <form:option value="">-select-</form:option>
                        </form:select>
                    </td>
                </tr>
                <tr>
                    <td><input type="submit" value="submit"></td>
                    <td><input type="reset" value="reset" onclick="reset()"></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>