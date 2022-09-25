package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public ArrayList<UsuarioModel> showUsuarios(){
		return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
	}

	public UsuarioModel saveUsuario(UsuarioModel usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public Optional<UsuarioModel> retrieveById(Long id){
		return usuarioRepository.findById(id);
	}
	
	public ArrayList<UsuarioModel> retrieveByNombre(String nombre){
		return usuarioRepository.findByNombre(nombre);
	}
		
	public boolean deleteUsuario(Long id) {
		try {
			usuarioRepository.deleteById(id);
			return true;
		}catch(Exception error) {
			return false;
		}
	}
}
