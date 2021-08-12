package flyaway;

import java.io.IOException;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StoreServletFlights
 */
@WebServlet("/StoreServletFlights")
public class StoreServletFlights extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StoreServletFlights() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	int  id =Integer.parseInt(request.getParameter("t11"));
	
	String source= request.getParameter("t6");
	
	String destination= request.getParameter("t7");

	String airline= request.getParameter("t8");
	
	String ticket_price= request.getParameter("t9");

		flights f = new flights();
		f.setId(id);
f.setSource(source);
f.setDestination(destination);
f.setAirline(airline);
f.setTicket_price(ticket_price);
		flightDAO dao = new flightDAO();
		dao.store(f);
		request.getRequestDispatcher("admin.html").forward(request, response);
	}

}
