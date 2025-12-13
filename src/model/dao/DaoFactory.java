package model.dao;

import db.DB;
import modelDaoImpl.SellerDaoJDBC;


public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new modelDaoImpl.DepartmentDaoJDBC(DB.getConnection());
    }
}