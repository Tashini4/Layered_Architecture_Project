package com.example.layeredarchitecture.BO.custom.impl;


import com.example.layeredarchitecture.BO.custom.ItemBO;
//import com.example.layeredarchitecture.dao.custom.ItemDAO;
//import com.example.layeredarchitecture.dao.custom.impl.ItemDAOImpl;
import com.example.layeredarchitecture.dao.Custome.DAOFactory;
import com.example.layeredarchitecture.dao.Custome.ItemDAO;
import com.example.layeredarchitecture.dao.Custome.impl.ItemDAOImpl;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBOImpl implements ItemBO {
    ItemDAO itemDAO = (ItemDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.ITEM);
    @Override
    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException {
        //ItemDAO itemDAO = new ItemDAOImpl();
       return itemDAO.getAll();
    }

    @Override
    public boolean deleteItem(String code) throws SQLException, ClassNotFoundException {
       // ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.delete(code);
    }

    @Override
    public boolean saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
        //ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.add(dto);
    }

    @Override
    public boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
        //ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.update(dto);
    }

    @Override
    public boolean existItem(String code) throws SQLException, ClassNotFoundException {
       // ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.exist(code);
    }

    @Override
    public String generateNewCode() throws SQLException, ClassNotFoundException {
        //ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.generateNewID();
    }
}
