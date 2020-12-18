package dao.Impl;

import dao.IUserDao;

public class IUSerDaoOracleImpl implements IUserDao {
    @Override
    public void getUser() {
        System.out.println("查询Oracle数据库");
    }
}
