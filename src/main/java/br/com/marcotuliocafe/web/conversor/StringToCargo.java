package br.com.marcotuliocafe.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.marcotuliocafe.domain.Cargo;
import br.com.marcotuliocafe.service.CargoService;

@Component
public class StringToCargo implements Converter<String, Cargo> {

	
	@Autowired
	private CargoService service;
	
	@Override
	public Cargo convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}

}

