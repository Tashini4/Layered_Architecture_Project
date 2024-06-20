package com.example.layeredarchitecture.dao.Custome.impl;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.dao.Custome.CustomerDAO;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public boolean update(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("UPDATE Customer SET name=?, address=? WHERE id=?",
                customerDTO.getName(),customerDTO.getAddress(),customerDTO.getId());

    }

    @Override
    public ArrayList<CustomerDTO> getAll( ) throws SQLException, ClassNotFoundException {

        ResultSet rst = SQLUtil.execute("SELECT * FROM Customer");

        ArrayList<CustomerDTO> customerList = new ArrayList<>();

        while (rst.next()){
            String id = rst.getString(1);
            String name = rst.getString(2);
            String address = rst.getString(3);

            CustomerDTO customerDTO = new CustomerDTO(id,name,address);

            customerList.add(customerDTO);
        }
        return customerList;

    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {

        ResultSet resultSet =  SQLUtil.execute("SELECT id FROM Customer WHERE id=?",id);

        return resultSet.next();
    }

    @Override
    public boolean save(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {

        return SQLUtil.execute("INSERT INTO Customer (id,name, address) VALUES (?,?,?)",customerDTO.getId(),customerDTO.getName(),customerDTO.getAddress());

    }

    @Override
    public void delete(String id) throws SQLException, ClassNotFoundException {

        SQLUtil.execute("DELETE FROM Customer WHERE id=?",id);

    }

    @Override
    public String getNewId() throws SQLException, ClassNotFoundException {

        ResultSet rst = SQLUtil.execute("SELECT id FROM Customer ORDER BY id DESC LIMIT 1;");
        return rst.next() ? String.format("C00-%03d", (Integer.parseInt(rst.getString(1).replace("C00-", "")) + 1)) : "C00-001";
    }

    @Override
    public CustomerDTO getCustomer(String newValue) throws SQLException, ClassNotFoundException {

        ResultSet rst = SQLUtil.execute("SELECT * FROM Customer WHERE id=?",newValue);
        rst.next();
        return new CustomerDTO(newValue + "", rst.getString("name"), rst.getString("address"));

    }
}
