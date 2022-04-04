package com.tipocambio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tipocambio.dao.TipoCambioDAO;
import com.tipocambio.models.entity.TipoCambio;

@Service
public class TCServiceImpl implements ITCService{

	@Autowired
	public TipoCambioDAO tcDAO;

	@Override
	public List<TipoCambio> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoCambio findById(String id) {
		return tcDAO.findById(id).get(); 
	}

	@Override
	public TipoCambio save(TipoCambio tc) {
		return tcDAO.save(tc);
	}
	


}