package com.tipocambio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tipocambio.models.entity.TipoCambio;
import com.tipocambio.models.model.ConversionMoneda;
import com.tipocambio.models.model.Response;
import com.tipocambio.service.ITCService;

@RestController
@RequestMapping("/tipocambio")
public class TCController {

	@Autowired
	public ITCService iTCService;;

	@PostMapping("/insertar")
	public TipoCambio save(@RequestBody TipoCambio tc) {
		tc.setId(tc.getOrigen() + tc.getDestino());
		
		return iTCService.save(tc);
	}

	@PostMapping("/convertir")
	public Response convertir(@RequestBody ConversionMoneda cm) {
		System.out.println(cm.getDestino());
		System.out.println(cm.getOrigen());
		TipoCambio tc = iTCService.findById(cm.getOrigen()+ cm.getDestino());
		Response rp = new Response();
		if(tc != null) {
			double montoConvertido = tc.getTasa() * cm.getMonto();
			rp.estado = true;
			rp.mensaje ="Monto convertido satisfactoriamente";
			rp.montoConvertido = montoConvertido;
			
		} else {
			rp.estado = false;
			rp.mensaje = "No se encontró el tipo de camnbio solicitado";
		}
		return rp;
	}


}
