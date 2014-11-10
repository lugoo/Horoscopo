package com.mycompany.horoscopos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class servlethoroscopos extends HttpServlet {

 
    protected void dopost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
String nombre=request.getParameter("Nombre");
String signo=request.getParameter("Signo");

pitoniza pit= new pitoniza(new zodiaco());

out.println("Buen día" + nombre);
out.println("El día de hoy tu horoscopo es:" + pit.obtenerfuturo(signo));
    }
}
