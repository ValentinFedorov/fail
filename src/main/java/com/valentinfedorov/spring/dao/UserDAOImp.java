package com.valentinfedorov.spring.dao;

import com.valentinfedorov.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class UserDAOImp implements UserDAO{

    @PersistenceContext
    private EntityManager em;
    @Override
    public List<User> getAllUsers() {
        return em.createQuery("from User").getResultList();
    }
}
