package com.d.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.d.models.paciente;

@Controller  //ruta controlador
public class IndexController {
	//ruta http://localhost:8080/
	@RequestMapping("/")//captura las rutas
	public String index(Model model) {
		model.addAttribute("nombre","");
		model.addAttribute("cita", "");
		model.addAttribute("area", "");
		model.addAttribute("hora", "");
		
//instancia de usuario
	Paciente paciente = new paciente("","","",);
	//pasando el objeto a la vista (JSP)
	model.addAttribute("paciente",paciente);
	
	System.out.println(paciente.hora());
		return "agendado.jsp";

	}
	
}
