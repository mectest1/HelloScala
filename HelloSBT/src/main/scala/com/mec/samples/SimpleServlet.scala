package com.mec.samples

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet
import scala.xml.NodeSeq


class SimpleServlet extends HttpServlet{
  override def doGet(request: HttpServletRequest, response:HttpServletResponse) = {
    response.setContentType("text/html")
    response.setCharacterEncoding("UTF-8")
    
    val responseBody: NodeSeq = 
        <html><body><h1>Hello, World!</h1></body></html>
    
    
  }
}