/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ProjectManagement.dao.impl;

import com.example.ProjectManagement.dao.ClientDao;
import com.example.ProjectManagement.entity.Clients;
import com.example.ProjectManagement.util.DbConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HOME
 */
public class ClientDaoImpl implements ClientDao {

    DbConnection db = new DbConnection();

    @Override
    public List<Clients> getAll() throws ClassNotFoundException, SQLException {
        List<Clients> clientlst = new ArrayList<Clients>();
        
        
        db.open();
        String sql = "SELECT * FROM clients";
        db.initStatement(sql);
        ResultSet rs = db.executeQuery();
       

        while (rs.next()) {
             Clients client = new Clients();//clients should be instantiated over here
            
            client.setClient_id(rs.getInt("client_id"));
            client.setClient_name(rs.getString("client_name"));
            client.setClient_description(rs.getString("client_description"));
            clientlst.add(client);

        }
        return clientlst;
        
       
    }

}
