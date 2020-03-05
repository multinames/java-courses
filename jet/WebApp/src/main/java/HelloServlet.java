import somePackage.Cart;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
      //  httpServletResponse.getWriter().print("Hello from servlet");

        HttpSession session = request.getSession();

        Cart cart = (Cart)session.getAttribute("cart");

        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        Integer count = (Integer)session.getAttribute("count");

        if(cart == null) {
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);
        }

        session.setAttribute("cart",cart);

        try {
            getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }

    }



        /*if(count == null ) {
            session.setAttribute("count",1);
            count =1;
        }else {
            session.setAttribute("count",count+1);
        }
*/

        /*String name= request.getParameter("name");
        String surname= request.getParameter("surname");*/



        /*PrintWriter pw = response.getWriter();
        pw.println("<html>");
        //pw.println("<h1> Hello, " +name + " " +surname + " </h1>");
        // pw.println("<h1> Your count is "+ count+ "</h1>");
        pw.println("</html>");*/


       // httpServletResponse.sendRedirect("/FirstPage.jsp");

      /*  RequestDispatcher dispatcher = request.getRequestDispatcher("/FirstPage.jsp");
        try {
            dispatcher.forward(request,httpServletResponse);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    */



}