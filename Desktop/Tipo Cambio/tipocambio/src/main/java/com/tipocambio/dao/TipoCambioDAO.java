package com.tipocambio.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.tipocambio.models.entity.TipoCambio;


public interface TipoCambioDAO extends PagingAndSortingRepository<TipoCambio, String>{
	
}
