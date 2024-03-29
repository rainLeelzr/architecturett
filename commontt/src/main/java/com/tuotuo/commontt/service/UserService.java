package com.tuotuo.commontt.service;

import com.tuotuo.commontt.model.User;
import net.sf.json.JSONObject;
import org.springframework.web.socket.TextMessage;

import java.util.Map;


public interface UserService extends BaseService<Integer, User> {
	public Map<String, Object> login(JSONObject data, String ip) throws Exception;
	public TextMessage TestConnection() ;

	User logout(JSONObject data);

	Map<String,Object> getUser(JSONObject data,User user);

    Map<String,Object> prizeDraw(JSONObject data,User user);
}