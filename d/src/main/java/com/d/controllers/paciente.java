package com.d.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/paciente")
public class paciente {
	@Autowired
	PacienteService pacienteService;
	
	@RequestMapping("")
	public String inicio(@ModelAttribute("paciente") Paciente paciente) {
		
		return "paciente.jsp";
	}
	@PostMapping("/guardar")
	public String guardarPaciente(@Valid @ModelAttribute("paciente") Paciente paciente,
			BindingResult resultado,
			Model model) {
		if(resultado.hasErrors()) {
			model.addAttribute("msgError","Datos erroneos");
			return "paciente.jsp";
		}else {
			//enviamos el obeto a persistir en base datos
			autoService.guardarPaciente(paciente);
			//obtener una lista de pacientes
			List<Paciente> listaPaciente = pacienteService.findAll();
			//pasamos la lista de pacientes al jsp
			model.addAttribute("pacientesCapturados", listaPacientes);
			return "citasMedicas.jsp";
		}
		@RequestMapping("/editar/{hora}{areaMedica}") //editar para el despliegue 
		public String editar(@PathVariable("hora", "areaMedica") Integer hora
				Model model) {
			System.out.println("la hora escogida es: "+hora);
	}
		public String editar(@PathVariable("areaMedica") String areaMedica,
				Model model) {
			System.out.println("la area escogida es: "+areaMedica);
	}
		Paciente paciente = pacienteService.buscarId(id);
		model.addAttribute("paciente", paciente);//pasar al jsp
		
		return "citasMedicas.jsp";//redireccionar a otra url o path
	} 
		
	@PostMapping("/actualizar/{{hora}{areaMedica}}")
	
	public String editar(@PathVariable("hora", "areaMedica") Integer hora
			citasMedicas citasMedicas) {
		System.out.println("la hora a actualizar es: "+hora);
}
	public String editar(@PathVariable("areaMedica") String areaMedica,
			citasMedicas citasMedicas) {
		System.out.println("la area a actualizar es: "+areaMedica);
}
	Paciente paciente = pacienteService.buscarId(id);
	model.addAttribute("paciente", paciente);//pasar al jsp
	return "citasMedicas.jsp";//redireccionar a otra url o path
} 
	
			//enviamos el obeto a persistir en base datos
			autoService.guardarcitasMedicas(citasMedicas);
			
			return "redirect:/paciente/citasMedicas";
		}
	
}
