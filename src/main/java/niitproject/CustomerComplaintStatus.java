package niitproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet
public class CustomerComplaintStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CustomerComplaintStatus() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List <Customer> complaint = new ArrayList <Customer> ();
		
		HttpSession session = request.getSession(false);
		String email = (String) session.getAttribute("Email");
		
		System.out.println(email);
		CustomerDAO dao = new CustomerDAO();
		complaint = dao.checkComplaintStatus(email);
		
		
		request.setAttribute("complaint", complaint);
		
		//RequestDispatcher rd = request.getRequestDispatcher("/Status.jsp");
		// rd.forward(request, response);
		response.sendRedirect("/jpaproject/Status.jsp");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
