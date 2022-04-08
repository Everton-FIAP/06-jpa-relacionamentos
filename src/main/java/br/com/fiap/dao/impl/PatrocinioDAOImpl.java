package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entities.Patrocinio;

public class PatrocinioDAOImpl extends GenericDaoImpl<Patrocinio, Integer>{

	public PatrocinioDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
}
