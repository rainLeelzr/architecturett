package com.tuotuo.commontt.service;

import javax.servlet.http.HttpServletRequest;

import com.tuotuo.commontt.model.AdminUser;
import com.tuotuo.commontt.util.JsonResult;

public interface AdminUserService extends BaseService<Integer, AdminUser> {

	JsonResult Login(String passport, String password, HttpServletRequest request)  throws Exception;

	JsonResult saveOrUpdate(AdminUser admin);
}