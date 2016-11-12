


<%@page import="com.example.ProjectManagement.util.DbConnection"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.example.ProjectManagement.entity.Clients"%>
<%@page import="com.example.ProjectManagement.dao.ClientDao"%>
<%@page import="com.example.ProjectManagement.dao.impl.ClientDaoImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PAGE</title>
    </head>
    <body>
        
        
        <table class="table table-bordered table-striped">
            <%try{%>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Description</th>
                
            </tr>
           
                <%
                    DbConnection db=new DbConnection();
                     db.open();
                     String sql="SELECT * FROM clients";
                    db.initStatement(sql);
                   
                     ResultSet rs=db.executeQuery();
                    
                  
                   
                   
                   //ClientDao clientdao=new ClientDaoImpl();
                   //for(Clients c : clientdao.getAll()){
                   
                   while(rs.next()){
                %>
                 <tr>
                <td><%out.println(rs.getInt("client_id"));%></td>
            <td><%out.println(rs.getString("client_name"));%></td>
            <td><%out.println(rs.getString("client_description"));%></td>
            
            <%}%>
            </tr>
            <% }catch(ClassNotFoundException ioe)
            {
        ioe.getMessage();
        }
            catch(SQLException e)
        {
                e.getMessage();
        }
%>
        </table>
        <h1></h1>
        </div>
           
    </body>
</html>
