package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Piezas;
import com.example.demo.dto.Proveedores;
import com.example.demo.service.PiezasServiceImpl;
import com.example.demo.service.ProveedoresServiceImpl;

@RestController
@RequestMapping("/api")
public class ProveedoresController {

	@Autowired
	ProveedoresServiceImpl proveedoresServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedores> listarProveedores(){
		return proveedoresServiceImpl.listarProveedores();
	}
	
	
	@PostMapping("/proveedores")
	public Proveedores salvarProveedores(@RequestBody Proveedores proveedores) {
		
		return proveedoresServiceImpl.guardarProveedores(proveedores);
	}
	
	
	@GetMapping("/proveedores/{id}")
	public Proveedores ProveedoresXID(@PathVariable(name="id") int id) {
		
		Proveedores Proveedores_xid= new Proveedores();
		
		Proveedores_xid=proveedoresServiceImpl.proveedoresXID(id);
		
		System.out.println("Proveedores XID: "+Proveedores_xid);
		
		return Proveedores_xid;
	}
	
	@PutMapping("/proveedores/{id}")
	public Proveedores actualizarProveedores(@PathVariable(name="id")int id,@RequestBody Proveedores Proveedores) {
		
		Proveedores Proveedores_seleccionado= new Proveedores();
		Proveedores Proveedores_actualizado= new Proveedores();
		
		Proveedores_seleccionado= proveedoresServiceImpl.proveedoresXID(id);
		
		Proveedores_seleccionado.setNombre(Proveedores.getNombre());
		
		Proveedores_actualizado = proveedoresServiceImpl.actualizarProveedores(Proveedores_seleccionado);
		
		System.out.println("El proveedor actualizado es: "+ Proveedores_actualizado);
		
		return Proveedores_actualizado;
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void eleiminarProveedores(@PathVariable(name="id")int id) {
		proveedoresServiceImpl.eliminarProveedores(id);
	}
	
}
