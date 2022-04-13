<%-- 
    Document   : index
    Created on : Apr 13, 2022, 12:46:05 PM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ArithmeticServlet" method="POST">
            Enter a number  <input type="int" name ="n1" required/> <br/>
            Enter a number  <input type="int" name ="n2" required/> <br/>
            <input type="submit" name="s" value="Add"/>
        </form>
        <h1>
            <%  if (request.getParameter("result") == null) {
                out.println(request.getParameter("result"));
            } else {
                out.println("Error");
            }
            %>
        </h1>
    </body>
</html>
