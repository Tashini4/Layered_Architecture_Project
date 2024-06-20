package com.example.layeredarchitecture.dao.Custome;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;

public interface CustomerDAO  extends CrudDAO<CustomerDTO> {

    public CustomerDTO getCustomer(String s) throws SQLException, ClassNotFoundException;
}


