package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Proveedores;

public interface IProveedoresService {

	//Metodos del CRUD
			public List<Proveedores> listarProveedores(); //Listar All 
			
			public Proveedores guardarProveedores(Proveedores proveedores);	//Guarda un Estudiante CREATE
			
			public Proveedores proveedoresXID(int id); //Leer datos de un Estudiante READ
			
			public Proveedores actualizarProveedores(Proveedores proveedores); //Actualiza datos del estudiante UPDATE
			
			public void eliminarProveedores(int id);// Elimina el estudiante DELETE
}
