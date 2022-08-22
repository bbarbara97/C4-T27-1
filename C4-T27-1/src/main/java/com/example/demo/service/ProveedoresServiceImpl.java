package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProveedoresDAO;
import com.example.demo.dto.Proveedores;

@Service
public class ProveedoresServiceImpl implements IProveedoresService{

	@Autowired
	IProveedoresDAO iProveedoresDAO;

	@Override
	public List<Proveedores> listarProveedores() {
		return iProveedoresDAO.findAll();
	}

	@Override
	public Proveedores guardarProveedores(Proveedores proveedores) {
		return iProveedoresDAO.save(proveedores);
	}

	@Override
	public Proveedores proveedoresXID(int id) {
		return iProveedoresDAO.findById(id).get();
	}

	@Override
	public Proveedores actualizarProveedores(Proveedores proveedores) {
		return iProveedoresDAO.save(proveedores);
	}

	@Override
	public void eliminarProveedores(int id) {
		iProveedoresDAO.deleteById(id);
	}
}
