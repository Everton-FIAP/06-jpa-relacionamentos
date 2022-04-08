package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entities.Jogador;

public class JogadorDAOImpl extends GenericDaoImpl<Jogador, Integer> {

	public JogadorDAOImpl(EntityManager em) {
		super(em);
	}
}
