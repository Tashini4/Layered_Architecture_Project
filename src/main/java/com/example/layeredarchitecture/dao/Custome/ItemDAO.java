package com.example.layeredarchitecture.dao.Custome;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;

public interface ItemDAO extends CrudDAO<ItemDTO> {

    public ItemDTO Item(String newItemCode) throws SQLException, ClassNotFoundException;

}

