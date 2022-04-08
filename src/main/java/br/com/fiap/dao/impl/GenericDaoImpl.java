package br.com.fiap.dao.impl;

import br.com.fiap.dao.GenericDao;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

public abstract class GenericDaoImpl<T,K> implements GenericDao<T, K> {
	
	private EntityManager em;
	
	private Class<T> clazz;
	
	@SuppressWarnings("all")
	public GenericDaoImpl(EntityManager em) {
		this.em = em;
		this.clazz = (Class<T>) 
				((ParameterizedType) getClass().getGenericSuperclass())
						.getActualTypeArguments()[0];
	}

	public void cadastrar(T entity) {
		em.persist(entity);
	}

	public T procurar(K id)  {
		T entity = em.find(clazz, id);
		return entity;
	}

	public void atualizar(T entity) {
		em.merge(entity);
	}

	public void apagar(K id) {
		em.remove(procurar(id));
	}

	public void commit() throws Exception {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new Exception();
		}
	}

}