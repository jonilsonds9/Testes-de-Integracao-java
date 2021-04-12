package br.com.alura.leilao.util;

import javax.persistence.*;

public class JPAUtil {

    private static EntityManagerFactory factory = Persistence.
            createEntityManagerFactory("tests");

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

}
