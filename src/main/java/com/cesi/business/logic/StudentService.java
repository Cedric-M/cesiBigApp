/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesi.business.logic;

import javax.ejb.Stateful;
import javax.ejb.Remove;

/**
 *
 * @author ced
 */
@Stateful
public class StudentService implements StudentServiceLocal {

    @Override
    public void addStudent(String firstname, String lastname) {
        System.out.println("Identité de l'etudiant " +firstname+ " " +lastname);
    }

    @Override
    public void addAuthenticationInformations(String email, String pwd) {
       System.out.println("Ajout des informations d'authentification :"+email+""+pwd);
    }

    @Override
    @Remove
    public void save() {
        System.out.println("Sauvegarde de l'étudiant créée");
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}