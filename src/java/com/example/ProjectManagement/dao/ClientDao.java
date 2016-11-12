/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ProjectManagement.dao;

import com.example.ProjectManagement.entity.Clients;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author HOME
 */
public interface ClientDao {
    
    List<Clients> getAll() throws ClassNotFoundException,SQLException;
    
}
