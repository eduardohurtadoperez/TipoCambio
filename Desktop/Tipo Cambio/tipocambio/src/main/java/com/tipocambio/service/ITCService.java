package com.tipocambio.service;

import java.util.List;

import com.tipocambio.models.entity.TipoCambio;


public interface ITCService {
	public List<TipoCambio> findAll();
	public TipoCambio findById(String id);	
	public TipoCambio save(TipoCambio tc);
	 
}
