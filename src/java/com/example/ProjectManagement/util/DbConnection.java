/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ProjectManagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HOME
 */
public class DbConnection {
    private Connection conn;
    private PreparedStatement stmt;
    
    
    public void open() throws ClassNotFoundException,SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
         conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_management", "root", null);
    
    }
    
    public PreparedStatement initStatement(String sql) throws SQLException
    {
        stmt=conn.prepareStatement(sql);
        return stmt;
    
    }
    
    public ResultSet executeQuery() throws SQLException
    {
        return stmt.executeQuery();
        
    }
    
    public int executeUpdate() throws SQLException
    {
        return stmt.executeUpdate();
    
    }
    
    public void close() throws ClassNotFoundException,SQLException
    {
    if( conn!=null || !conn.isClosed())
    {
        conn=null;
        conn.close();
    }
    }
}
