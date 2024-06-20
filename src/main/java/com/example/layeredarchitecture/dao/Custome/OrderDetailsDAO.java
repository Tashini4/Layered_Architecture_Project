package com.example.layeredarchitecture.dao.Custome;

import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public interface OrderDetailsDAO {
    public  boolean saveOrderDetails(OrderDetailDTO detailDTO) throws SQLException, ClassNotFoundException;

}
