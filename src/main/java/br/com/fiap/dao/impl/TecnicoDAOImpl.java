package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entities.Tecnico;

public class TecnicoDAOImpl extends GenericDaoImpl<Tecnico, Integer>{

	public TecnicoDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
}
