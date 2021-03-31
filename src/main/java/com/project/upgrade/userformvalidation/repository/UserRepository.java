package com.project.upgrade.userformvalidation.repository;



import com.project.upgrade.userformvalidation.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Repository



public class UserRepository {

    @PersistenceUnit(unitName = "techblog")
    private EntityManagerFactory entityManagerFactory;


    public void registerUser(User newUser) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();

            entityManager.persist(newUser);
            transaction.commit();
        }
        catch(Exception e) {
            System.out.println(e);
            transaction.rollback();
        }
    }
    public List<User> getAllUser(String name) {
        EntityManager em = entityManagerFactory.createEntityManager();
        return em.createQuery(
                "SELECT c FROM User c WHERE c.user_name LIKE :username")
                .setParameter("username", name)
                .getResultList();

    }

}