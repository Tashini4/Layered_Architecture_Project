package com.example.layeredarchitecture.dao.Custome;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.dao.Custome.impl.CustomerDAOImpl;
import com.example.layeredarchitecture.dao.Custome.impl.ItemDAOImpl;
import com.example.layeredarchitecture.dao.Custome.impl.OrderDAOImpl;
import com.example.layeredarchitecture.dao.custom.impl.OrderDetailsDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {

    }

    public static DAOFactory getDaoFactory() {
        return (daoFactory == null) ? daoFactory = new DAOFactory() : daoFactory;
    }
    public enum DAOTypes{
        CUSTOMER,ITEM,ORDER,ORDER_DETAIL
    }
    public CrudDAO getDAO(DAOTypes daoTypes){
        switch (daoTypes){
            case CUSTOMER:
                return new CustomerDAOImpl();
            case ITEM:
                return new ItemDAOImpl();
            case ORDER:
                return new OrderDAOImpl();
            case ORDER_DETAIL:
                return new OrderDetailsDAOImpl();
            default:
                return null;
        }
    }

}
