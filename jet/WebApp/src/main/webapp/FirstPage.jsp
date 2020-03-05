<html>
  <head>
     <title>First JSP</title>
  </head>
<body>
     <h2>Testing JSP</h2>
     <p>
     <!-- %@ page import="java.util.Date, logic.TestClass" % -->

     <!-- % TestClass testClass = new TestClass(); % -->
       <!-- %=
       testClass.getInfo()
       %> -->

       <%
       String name = request.getParameter("name");
       %>

       <%= "Hello, " + name %>


     </p>

</body>
</html>