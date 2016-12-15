package com.test.basic.web.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.ScopedProxyMode;

@Service
@Scope(value="session",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class BasicSessionImpl implements BasicSession {

	private Map<String,Object> sessionKey;
	
	@Override
	public void saveDataInSession(String name, Object object) {
		sessionKey = new HashMap<String, Object>();
		sessionKey.put(name, object);
		
	}

	@Override
	public Object getDataFromSession(String name) {
		
		Optional<Object> sessionObj = sessionKey.entrySet().parallelStream().filter(map -> map.getKey().
				equalsIgnoreCase(name)).map(Map.Entry::getValue).findFirst();
		
		return sessionObj.get();
	}

	@Override
	public void clearDataFromSession(String name) {
		
	}

}
