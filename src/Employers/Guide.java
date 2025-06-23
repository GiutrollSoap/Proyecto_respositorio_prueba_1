/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employers;

import java.time.LocalDate;

/**
 *
 * @author UTN
 */
public class Guide extends Employeer{
    private String Languages;
    private String Tours;

    public Guide(String Languages, String Tours, int Id, String CompleteName, LocalDate BirthDate, String CelphoneNumber, int Salary) {
        super(Id, CompleteName, BirthDate, CelphoneNumber, Salary);
        this.Languages = Languages;
        this.Tours = "";
    }
    
    public void addLanguages(String Languages){
           if (!Languages.toLowerCase().contains(Languages.toLowerCase())) {
            if (!Languages.isEmpty()) {
                Languages += "\n";
            }
            Languages += Languages;
        }
    }

    public void registerTour(String description) {
        if (!Tours.isEmpty()) {
            Tours += "\n";
        }
        Tours += description;
    }
    
    
    public String getLanguages() {
        return Languages;
    }

    public String getTours() {
        return Tours;
    }
    
  
    public String getType(){
        return "Guide";
    }

    @Override
    public String toString() {
        return "Guide{" + "Languages=" + Languages + ", Tours=" + Tours ;
    }
    
    
}
