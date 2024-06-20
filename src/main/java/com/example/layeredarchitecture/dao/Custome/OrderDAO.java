package com.example.layeredarchitecture.dao.Custome;

import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.*;

public interface OrderDAO {
    public String generateOId() throws SQLException, ClassNotFoundException ;

    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException ;

    public  boolean saveOrder(OrderDTO orderDTO) throws SQLException, ClassNotFoundException ;
}
