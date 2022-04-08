package br.com.fiap;

import br.com.fiap.dao.impl.TecnicoDAOImpl;
import br.com.fiap.dao.impl.TimeDAOImpl;
import br.com.fiap.entities.Tecnico;
import br.com.fiap.entities.Time;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {
       EntityManagerFactory factory =  EntityManagerFactorySingleton.getInstance();
       EntityManager entityManager = factory.createEntityManager();
       
       Tecnico tecnico = new Tecnico();
       tecnico.setNome("Parreira");
       tecnico.setTempoCarreira(20);
       tecnico.setDataNascimento(LocalDate.of(1980, 1, 1));
       
       
       TecnicoDAOImpl tecnicoDao = new TecnicoDAOImpl(entityManager);
       tecnicoDao.cadastrar(tecnico);
     
       Time time = new Time();
       TimeDAOImpl timeDao = new TimeDAOImpl(entityManager);
       
       time.setNome("Palmeiras");
       time.setNomeEstadio("Allianz-Parque");
       time.setCodigoTecnico(tecnico);
    
       
       timeDao.cadastrar(time);
       
       System.out.println(timeDao.procurar(1));
    }
}
