package com.test.basic.web.services;

import com.test.basic.web.entity.AffectedPlaces;
import com.test.basic.web.entity.User;

public interface RequoteSummary {
	
	User getRequoteSyummary(String serialId);
	AffectedPlaces getAffectedPlaces(int id);

}
