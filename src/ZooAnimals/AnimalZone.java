/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZooAnimals;

/**
 *
 * @author UTN
 */
public enum  AnimalZone {
    Farm("Farm"),
    Contact("Contact"),
    Feeding("Feeding"),
    Conservation_and_Rescue("Conservation and Rescue"),
    Nocturnal_tunel("Nocturnal Tunel"),
    Local_Biodiversity("Local Biodiversity");
    
   private final String ActualZone;
   
   AnimalZone(String Actualzonefr){
    this.ActualZone=Actualzonefr;
}

    public String getActualZone() {
        return ActualZone;
    }

    @Override
    public String toString() {
        return " ActualAimalZone=" + ActualZone;
    }
 
   
   
}
