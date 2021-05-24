package com.daniel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculadoraController {

	//@GetMapping("/calculadora/index")
	@GetMapping(path = {"/calculadora/index", "/"})
	public String index(Model modelo) 
	{
		modelo.addAttribute("calcu", new Calculadora());
		return "/calculadora/index";
	}
	
	@PostMapping("/resultado")
	public String Resultado(@ModelAttribute Calculadora calcu, Model modelo)
	{
		calcu.Calcular();
		modelo.addAttribute("calcu", calcu);
		return "/calculadora/index";
	}
	
}
