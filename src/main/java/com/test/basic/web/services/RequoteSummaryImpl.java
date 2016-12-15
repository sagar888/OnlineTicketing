package com.test.basic.web.services;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.test.basic.web.entity.AffectedPlaces;
import com.test.basic.web.entity.User;
import com.test.basic.web.repository.RequoteSummaryRepository;

@Service
public class RequoteSummaryImpl implements RequoteSummary{
	
	@Inject
	private RequoteSummaryRepository requoteSummaryRepository;

	@Override
	public User getRequoteSyummary(String serialId) {
		
		Map<String,User> products = requoteSummaryRepository.getProductRequote();
		
		Optional<User> selectedProduct = products.entrySet().stream().filter(product ->product.getKey().
				equalsIgnoreCase(serialId)).map(Map.Entry::getValue).findFirst();
		return selectedProduct.get();

	}

	@Override
	public AffectedPlaces getAffectedPlaces(int id) {
		Map<Integer,AffectedPlaces> affectedPlaces = requoteSummaryRepository.getAffectedProductRequote();
		Optional<AffectedPlaces> affProd = affectedPlaces.entrySet().parallelStream().filter((affPro) -> affPro.getKey().equals(new Integer(id)))
		.map(Map.Entry::getValue).findFirst();
	
		return affProd.get();
	}

}
