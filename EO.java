import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EO extends HttpServlet {
    @Override
    public void init(){
        System.out.println("Servlet Initialized");
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EO</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EO at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        try{
            out.print("<html><body><center>");
            int no;
            no=Integer.parseInt(request.getParameter("txt"));
            if(no%2==0){
                out.print(no+"is even number");
            }
            else{
                out.print(no+"is odd number");
            out.print("</center></body></html>");
            }
        }
        catch(Exception e){
            System.out.println("ERROR"+e.getMessage());
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
    public void destroy(){
        System.out.println("Servelet Destroyed");
    }
}
