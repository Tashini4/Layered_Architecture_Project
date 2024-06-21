package com.example.layeredarchitecture.BO.custom;

import com.example.layeredarchitecture.BO.custom.impl.CustomerBOImpl;
import com.example.layeredarchitecture.BO.custom.impl.ItemBOImpl;
import com.example.layeredarchitecture.BO.custom.impl.PurchaseOrderBOImpl;
import com.example.layeredarchitecture.dao.Custome.impl.CustomerDAOImpl;
import com.example.layeredarchitecture.dao.Custome.impl.ItemDAOImpl;
import com.example.layeredarchitecture.dao.Custome.impl.OrderDAOImpl;
import com.example.layeredarchitecture.dao.SuperDAO;

public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory(){

    }
    public static BOFactory getBOFactory() {
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;
    }
    public enum BOTypes{
        CUSTOMER,ITEM,PLACE_ORDER
    }
    public SuperBO getBO(BOTypes boTypes){
        switch (boTypes){
            case CUSTOMER:
                return new CustomerBOImpl();
            case ITEM:
                return  new ItemBOImpl();
            case PLACE_ORDER:
                return new PurchaseOrderBOImpl();
                default:
                return null;
        }
    }


}
