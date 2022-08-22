package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Piezas;

public interface IPiezasService {

	//Metodos del CRUD
			public List<Piezas> listarPiezas(); //Listar All 
			
			public Piezas guardarPiezas(Piezas piezas);	//Guarda un Estudiante CREATE
			
			public Piezas piezasXID(int id); //Leer datos de un Estudiante READ
			
			public Piezas actualizarPiezas(Piezas piezas); //Actualiza datos del estudiante UPDATE
			
			public void eliminarPiezas(int id);// Elimina el estudiante DELETE
}
