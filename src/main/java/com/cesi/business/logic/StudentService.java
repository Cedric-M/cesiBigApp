/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesi.business.logic;

import com.cesi.business.domain.Student;
import com.cesi.integration.StudentDAO;
import javax.ejb.Stateful;
import javax.ejb.Remove;
import javax.inject.Inject;

/**
 *
 * @author ced
 */
@Stateful
public class StudentService implements StudentServiceLocal {
    
    private Student student = new Student();
    
    @Inject
    StudentDAO studentDAO;

    @Override
    public void addStudent(String firstname, String lastname) {
        student.setFirstname(firstname);
        student.setLastname(lastname);
        System.out.println("Identité de l'etudiant " +firstname+ " " +lastname);
    }

    @Override
    public void addAuthenticationInformations(String email, String pwd) {
        student.setEmail(email);
        student.setPassword(pwd);
       System.out.println("Ajout des informations d'authentification :"+email+" "+pwd);
    }

    @Override
    @Remove
    public void save() {
        studentDAO.insert(student);
        System.out.println("Sauvegarde de l'étudiant créée");
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
