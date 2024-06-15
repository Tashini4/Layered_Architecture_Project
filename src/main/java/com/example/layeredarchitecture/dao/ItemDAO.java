package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    public void Delete(String code) throws SQLException, ClassNotFoundException ;
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException ;

    public void save(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

    public void update(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

    public boolean existItems(String code) throws SQLException, ClassNotFoundException ;

    public String nextCode() throws SQLException, ClassNotFoundException ;
    public ArrayList<ItemDTO> allItemId() throws SQLException, ClassNotFoundException ;

    boolean Update1(ItemDTO itemDTO)throws SQLException,ClassNotFoundException;
}

