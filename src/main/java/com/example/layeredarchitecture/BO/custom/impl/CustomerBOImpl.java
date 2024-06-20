package com.example.layeredarchitecture.BO.custom.impl;

import com.example.layeredarchitecture.BO.custom.CustomerBO;
//import com.example.layeredarchitecture.dao.custom.CustomerDAO;
//import com.example.layeredarchitecture.dao.custom.impl.CustomerDAOImpl;
import com.example.layeredarchitecture.dao.Custome.CustomerDAO;
import com.example.layeredarchitecture.dao.Custome.DAOFactory;
import com.example.layeredarchitecture.dao.Custome.impl.CustomerDAOImpl;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    @Override
    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException {
      //  CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.getAll();
    }

    @Override
    public boolean addCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {
       // CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.add(dto);
    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {
       // CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.update(dto);
    }

    @Override
    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException {
        //CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.exist(id);
    }

    @Override
    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException {
        //CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.delete(id);
    }

    @Override
    public String generateNewCustomerID() throws SQLException, ClassNotFoundException {
       // CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.generateNewID();
    }
}
