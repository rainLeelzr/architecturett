package com.tuotuo.commontt.dao.impl;

import com.tuotuo.commontt.dao.UserDao;
import com.tuotuo.commontt.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends BaseDaoImpl<Integer, User> implements UserDao {

}