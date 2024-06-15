package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException ;
    public void Add(String id, String name, String address) throws SQLException, ClassNotFoundException;
    public void update(String id, String name, String address) throws SQLException, ClassNotFoundException ;
    public boolean existCustomers(String id) throws SQLException, ClassNotFoundException ;
    public void Delete(String id) throws SQLException, ClassNotFoundException ;
    public String nextId() throws SQLException, ClassNotFoundException ;
    public ArrayList<CustomerDTO> allCustomerId() throws SQLException, ClassNotFoundException ;
}


