package com.marcos.moreira.springatv5;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	
	@RequestMapping("/envio-email")
	public String envioemail() {
		return "Email enviado com sucesso";
	}
}
