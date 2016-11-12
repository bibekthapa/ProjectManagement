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
public class ClientDaoImpl implements ClientDao{
  // ClientDao clientdao=new ClientDaoImpl();

    @Override
    public List<Clients> getAll() throws ClassNotFoundException, SQLException {
               Clients client=new Clients();
             
                List<Clients> clientlst=new ArrayList<Clients>();
                client.setClient_id(1);
                client.setClient_name("Ram");
                client.setClient_description("Android Enterprizes");
                clientlst.add(client);
            
                return clientlst;
            }
            
           
    
   
    
}
