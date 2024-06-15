package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDetailsDAOImpl {
    public static boolean saveOrderDetails(String orderId, OrderDetailDTO detailDTO) throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getDbConnection().getConnection()
                .prepareStatement("INSERT INTO OrderDetails (oid, itemCode, unitPrice, qty) VALUES (?,?,?,?)");
        stm.setString(1, orderId);
        stm.setString(2, detailDTO.getItemCode());
        stm.setBigDecimal(3, detailDTO.getUnitPrice());
        stm.setInt(4, detailDTO.getQty());

        return stm.executeUpdate()>0;
    }
    }

