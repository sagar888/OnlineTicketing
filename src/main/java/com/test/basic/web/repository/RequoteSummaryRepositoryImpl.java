package com.test.basic.web.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.test.basic.web.entity.AffectedPlaces;
import com.test.basic.web.entity.User;

@Service
public class RequoteSummaryRepositoryImpl implements RequoteSummaryRepository {

	@Override
	public Map<String,User> getProductRequote() {
		
		Map<String,User> map = getGenericMapData();
		return map;
	}
	
	
	@SuppressWarnings("unchecked")
	private Map<String,User> getGenericMapData(){
		Map<String,User> map = new HashMap<String,User>();
		map.put("A12356780",new User(10,"Apple","A12356780",7000,"iPhone"));
		map.put("B12356780",new User(11,"Nokia","B12356780",5000,"Windows"));
		map.put("C12356780",new User(12,"Samsung","C12356780",4000,"Android"));
		return map;
	}


	@Override
	public Map getAffectedProductRequote() {
		Map<Integer,AffectedPlaces> map = getAffectedMapData();
		return map;
	}
	
	@SuppressWarnings("unchecked")
	private Map<Integer,AffectedPlaces> getAffectedMapData(){
		Map<Integer,AffectedPlaces> map = new HashMap<Integer,AffectedPlaces>();
		map.put(new Integer(10), new AffectedPlaces(10,"Battery",9000));
		map.put(new Integer(11), new AffectedPlaces(11,"ScreenGuard",5000));
		map.put(new Integer(12), new AffectedPlaces(12,"oSCompatability",4000));
		return map;
	}

}
