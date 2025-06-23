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
public class Keeper extends Employeer {
    
    
    private String Activity;
    private String Especiality;

    public Keeper(String Activity, String Especiality, int Id, String CompleteName, LocalDate BirthDate, String CelphoneNumber, int Salary) {
        super(Id, CompleteName, BirthDate, CelphoneNumber, Salary);
        this.Activity = Activity;
        this.Especiality = Especiality;
    }

    public String getActivity() {
        return Activity;
    }

    public String getEspeciality() {
        return Especiality;
    }

    
   public String getType(){
       return "Keeper";
   }
   
   public void DoActivitys (String Activity){
         if (!Activity.isEmpty()) {
            Activity += "\n";
        }
        Activity += Activity;  
   }
   
    @Override
    public String toString() {
        return "Keeper{" + "Activity=" + Activity + ", Especiality=" + Especiality ;
    }
}
