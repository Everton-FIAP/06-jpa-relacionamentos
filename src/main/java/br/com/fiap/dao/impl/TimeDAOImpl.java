package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entities.Time;

public class TimeDAOImpl extends GenericDaoImpl<Time, Integer>{

	public TimeDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
}
