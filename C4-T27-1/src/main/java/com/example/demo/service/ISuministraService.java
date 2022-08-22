package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Suministra;

public interface ISuministraService {

	//Metodos del CRUD
			public List<Suministra> listarSuministros(); //Listar All 
			
			public Suministra guardarSuministra(Suministra suministra);	//Guarda un RegistroCurso CREATE
			
			public Suministra suministraXID(int id); //Leer datos de un RegistroCurso READ
			
			public Suministra actualizarSuministra(Suministra suministra); //Actualiza datos del RegistroCurso UPDATE
			
			public void eliminarSuministra(int id);// Elimina el RegistroCurso DELETE
}
