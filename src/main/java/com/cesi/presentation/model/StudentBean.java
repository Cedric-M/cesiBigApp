/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesi.presentation.model;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ced
 */
@Named(value = "studentModel")
@Dependent
public class StudentBean {

    
    private String firstname,lastname,email, password;
    /**
     * Creates a new instance of StudentBean
     */
    public StudentBean() {
    }
    
//méthodes d'action
    public String addIdentity(){
        System.out.println(firstname+" "+lastname);
        return "authentication";
    }
    public String addAuthentication(){
        System.out.println(email+" "+password);
        return "summary";
    }
    public String create(){
        System.out.println("création de l'étudiant");
        HttpSession session = (HttpSession)
        FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        session.invalidate();
    return "index";
    }
    
    //getters & setters
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    }
    
}
