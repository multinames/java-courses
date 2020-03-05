<html>
<head>
    <title>Show Cart</title>
</head>
<body>
       <%@ page import = "somePackage.Cart" %>
       <% Cart cart = (Cart) session.getAttribute("cart"); %>

      <p> Name <%= cart.getName() %> </p>
       <p> Col <%= cart.getQuantity() %> </p>
</body>
</html>