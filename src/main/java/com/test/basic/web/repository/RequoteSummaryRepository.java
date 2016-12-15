package com.test.basic.web.repository;

import java.util.Map;

import com.test.basic.web.entity.AffectedPlaces;
import com.test.basic.web.entity.User;

public interface RequoteSummaryRepository {
	
	Map<String,User> getProductRequote();
	Map<Integer,AffectedPlaces> getAffectedProductRequote();

}
