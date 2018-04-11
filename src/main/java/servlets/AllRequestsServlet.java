package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


  public class AllRequestsServlet extends HttpServlet {

      public void doGet(HttpServletRequest request,
                        HttpServletResponse response) throws ServletException, IOException {

          Map<String, Object> pageVariables = createPageVariablesMap(request);
          pageVariables.put("message", "");
          String parameter = request.getParameter("key");
          response.getWriter().println(parameter);

      }

      private static Map<String, Object> createPageVariablesMap(HttpServletRequest request) {
          Map<String, Object> pageVariables = new HashMap<>();
          pageVariables.put("values",request.getParameter("key"));
          return pageVariables;
      }
  }

