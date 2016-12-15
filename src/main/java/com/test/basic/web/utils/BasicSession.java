package com.test.basic.web.utils;

import java.util.List;
import java.util.Map;

public interface BasicSession {
	
	void saveDataInSession(String name,Object object);
	Object getDataFromSession(String name);
	void clearDataFromSession(String name);	

}
