package com.example.demo.controllers;

import com.example.demo.services.UsuarioService;
import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping()
	public ArrayList<UsuarioModel> showUsuarios(){
		return usuarioService.showUsuarios();
	}

	@PostMapping()
	public UsuarioModel saveUsuario(@RequestBody UsuarioModel usuario) {
		return this.usuarioService.saveUsuario(usuario);
	}
	
	@GetMapping( path = "/{id}")
	public Optional<UsuarioModel> retrieveUsuarioById(@PathVariable("id") Long id){
		return this.usuarioService.retrieveById(id);
	}
	
	@GetMapping( path = "/query")
	public ArrayList<UsuarioModel> retrieveUsuarioByNombre(@RequestParam("nombre") String nombre){
		return this.usuarioService.retrieveByNombre(nombre);
	}
	
	@DeleteMapping( path = "/{id}")
	public String DeleteUsuarioById(@PathVariable("id") Long id) {
		boolean yes = this.usuarioService.deleteUsuario(id);
		if (yes) {
			return "User has been deleted";
		}else {
			return "User could not be deleted";
		}
	}
}
