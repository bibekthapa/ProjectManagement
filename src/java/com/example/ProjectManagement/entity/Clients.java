package com.example.ProjectManagement.entity;

public class Clients {
    
    private int client_id;
    private String client_name;
    private String client_description;
    
    
    public Clients(){}
    
    public Clients(int id,String name,String description)
    {
        this.client_id=id;
        this.client_name=name;
        this.client_description=description;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getClient_description() {
        return client_description;
    }

    public void setClient_description(String client_description) {
        this.client_description = client_description;
    }
    
    
    
}
