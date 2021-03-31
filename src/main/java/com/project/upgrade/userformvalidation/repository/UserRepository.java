package com.project.upgrade.userformvalidation.repository;



import com.project.upgrade.userformvalidation.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository



public class UserRepository {

    private EntityManagerFactory entityManagerFactory;

    public void registerUser(User newUser) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try{
            transaction.begin();
            //Persist saves the data in your database.
            entityManager.persist(newUser);
            //Committing transaction to your database if exception doesnt come.
            transaction.commit();

        } catch (Exception e){
            System.out.println(e);
            transaction.rollback();
        }

    }

    public User checkCredentials(String username, String password) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            TypedQuery<User> query = entityManager.createQuery("SELECT u from User u WHERE u.username = :username AND u.password = :password", User.class);
            query.setParameter("username", username);
            query.setParameter("password", password);
            return query.getSingleResult();
        } catch (NoResultException e){
            return null;
        }
    }

}