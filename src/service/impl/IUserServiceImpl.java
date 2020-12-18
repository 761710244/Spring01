package service.impl;

import dao.IUserDao;
import service.IUserService;

public class IUserServiceImpl implements IUserService {
    IUserDao userDao;

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
