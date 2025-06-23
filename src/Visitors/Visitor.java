/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitors;

import java.time.LocalDate;

/**
 *
 * @author UTN
 */
public class Visitor {
    private String Id;
    private String Completename;
    private LocalDate Birthdate;
    private String Celphone; 

    public Visitor(String Id, String Completename, LocalDate Birthdate, String Celphone) {
        this.Id = Id;
        this.Completename = Completename;
        this.Birthdate = Birthdate;
        this.Celphone = null;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setCompletename(String Completename) {
        this.Completename = Completename;
    }

    public void setBirthdate(LocalDate Birthdate) {
        this.Birthdate = Birthdate;
    }

    public void setCelphone(String Celphone) {
               if(Celphone.matches("\\d{2}-\\d{2}-\\d{2}-\\d{2}")){
        this.Celphone = Celphone;
    }
    }

    public String getId() {
        return Id;
    }

    public String getCompletename() {
        return Completename;
    }

    public LocalDate getBirthdate() {
        return Birthdate;
    }

    public String getCelphone() {
        return Celphone;
    }

    @Override
    public String toString() {
        return "Visitor" + "Id=" + Id + ", Completename=" + Completename + ", Birthdate=" + Birthdate + ", Celphone=" + Celphone;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
