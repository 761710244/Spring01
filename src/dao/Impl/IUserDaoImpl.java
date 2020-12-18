package dao.Impl;

import dao.IUserDao;

public class IUserDaoImpl implements IUserDao {

    @Override
    public void getUser() {
        System.out.println("查询mysql数据库！");
    }
}
