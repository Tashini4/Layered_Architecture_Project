package com.example.layeredarchitecture.dao.Custome.impl;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.dao.Custome.OrderDetailsDAO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public class OrderDetailsDAOImpl implements OrderDetailsDAO {
    @Override
    public  boolean saveOrderDetails(OrderDetailDTO detailDTO) throws SQLException, ClassNotFoundException {
        /*PreparedStatement stm = DBConnection.getDbConnection().getConnection()
                .prepareStatement("INSERT INTO OrderDetails (oid, itemCode, unitPrice, qty) VALUES (?,?,?,?)");
        stm.setString(1, detailDTO.getOid());
        stm.setString(2, detailDTO.getItemCode());
        stm.setBigDecimal(3, detailDTO.getUnitPrice());
        stm.setInt(4, detailDTO.getQty());

        return stm.executeUpdate()>0;*/
        return SQLUtil.execute("INSERT INTO `Orders` (oid, date, customerID) VALUES (?,?,?)",detailDTO.getOid(),detailDTO.getItemCode(),detailDTO.getUnitPrice(),detailDTO.getQty());
    }
}

