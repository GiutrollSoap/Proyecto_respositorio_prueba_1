/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZooAnimals;
import java.time.LocalDateTime;
/**
 *
 * @author J
 */
public class ZooAnimal {
    private String AnimalId;
    private String AnimalName;
    private String AnimalScpecie;
    private LocalDateTime AnimalBirtDate;
    private AnimalZone ActualAnimalZone;
    private boolean FisrCheckpoint;

    public void setAnimalId(String AnimalId) {
        if(AnimalId !=null &&AnimalId.matches("^[A-Za-z]{1}-//d{4}$")){
        this.AnimalId = AnimalId;
        }        
    }
    
    public void setAnimalName(String AnimalName) {
        this.AnimalName = AnimalName;
    }

    public void setAnimalScpecie(String AnimalScpecie) {
        this.AnimalScpecie = AnimalScpecie;
    }

    public void setAnimalBirtDate(LocalDateTime AnimalBirtDate) {
        if(AnimalBirtDate.isBefore(LocalDateTime.now())&&AnimalBirtDate.isEqual(LocalDateTime.now())){
        this.AnimalBirtDate = AnimalBirtDate;
        }
    }

    public void setActualAnimalZone(AnimalZone ActualAnimalZone) {
        this.ActualAnimalZone = ActualAnimalZone;
    }

    public void setFisrCheckpoint(boolean FisrCheckpoint) {
        this.FisrCheckpoint = FisrCheckpoint;
    }

    public String getAnimalId() {
        return AnimalId;
    }
   
    
    public String getAnimalName() {
        return AnimalName;
    }

    public String getAnimalScpecie() {
        return AnimalScpecie;
    }

    public LocalDateTime getAnimalBirtDate() {
        return AnimalBirtDate;
    }

    public AnimalZone getActualAnimalZone() {
        return ActualAnimalZone;
    }

    public boolean isFisrCheckpoint() {
        return FisrCheckpoint;
    }

       public ZooAnimal(String AnimalId, String AnimalName, String AnimalScpecie, LocalDateTime AnimalBirtDate, AnimalZone ActualAnimalZone, boolean FisrCheckpoint) {
          if(AnimalId !=null &&AnimalId.matches("^[A-Za-z]{1}-//d{4}$")){
        this.AnimalId = AnimalId;
        }
        this.AnimalName = AnimalName;
        this.AnimalScpecie = AnimalScpecie;
          if(AnimalBirtDate.isBefore(LocalDateTime.now())&&AnimalBirtDate.isEqual(LocalDateTime.now())){
        this.AnimalBirtDate = AnimalBirtDate;
        }
        this.ActualAnimalZone = ActualAnimalZone;
        this.FisrCheckpoint = FisrCheckpoint;
    }
    
    @Override
    public String toString() {
        return "ZooAnimal{" + "AnimalId=" + AnimalId + ", AnimalName=" + AnimalName + ", AnimalScpecie=" + AnimalScpecie + ", AnimalBirtDate=" + AnimalBirtDate + ", ActualAnimalZone=" + ActualAnimalZone + ", ZooAnimal Have pass Conservation and rescue?=" + FisrCheckpoint + '}';
    }

 
   
    
}
