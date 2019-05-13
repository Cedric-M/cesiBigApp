/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesi.integration;

import com.cesi.business.domain.Student;
import javax.ejb.Stateless;
import javax.persistence.*;

/**
 *
 * @author ced
 */
@Stateless
public class StudentDAO {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PersistenceContext(unitName = "bigAppPU")
    private EntityManager em;
    
    public void insert(Student student){
        em.persist(student);
    }
}
