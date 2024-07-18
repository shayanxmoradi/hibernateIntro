package main.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ApplicationContext {
    private EntityManagerFactory emf;
    private EntityManager em;

    public EntityManagerFactory  getEntityManagerFactory() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("postgresdb");
        }
        return emf;
    }

    public EntityManager getEntityManager() {
        if (em == null) {
            em = getEntityManagerFactory().createEntityManager();
        }
        return em;
    }


}
