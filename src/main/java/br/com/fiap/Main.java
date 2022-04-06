package br.com.fiap;

import br.com.fiap.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {
       EntityManagerFactory factory =  EntityManagerFactorySingleton.getInstance();
       EntityManager entityManager = factory.createEntityManager();



    }
}
