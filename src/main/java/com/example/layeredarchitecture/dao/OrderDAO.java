package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.*;

public interface OrderDAO {
    public String nextId() throws SQLException, ClassNotFoundException ;

    public static boolean existOrder(String orderId) throws SQLException, ClassNotFoundException ;

    public static boolean saveOrder(OrderDTO orderDTO) throws SQLException, ClassNotFoundException ;
}
