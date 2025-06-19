/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employers;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author UTN
 */
public abstract class Employeer {
    
    protected int Id;
    protected String CompleteName;
    protected LocalDate BirthDate;
    protected String CelphoneNumber;
    protected double Salary;

  private static final double SAlARIO_minimo = 300000;
    
    public Employeer(int Id, String CompleteName, LocalDate BirthDate, String CelphoneNumber, int Salary) {
        this.Id = Id;
        this.CompleteName = CompleteName;
        if (BirthDate.isBefore(LocalDate.now()) && Period.between(BirthDate, LocalDate.now()).getYears() >= 18) {
        this.BirthDate = BirthDate;
    }
        this.CelphoneNumber = CelphoneNumber;
         if(Salary > SAlARIO_minimo || Salary == SAlARIO_minimo){
            this.Salary = Salary;
       }
    }

   public void setBirthDate(LocalDate BirthDate) {
    if (BirthDate.isBefore(LocalDate.now()) && Period.between(BirthDate, LocalDate.now()).getYears() >= 18) {
        this.BirthDate = BirthDate;
    }
   }
   
    public void setCelphoneNumber(String CelphoneNumber) {
        this.CelphoneNumber = CelphoneNumber;
    }

    public void setSalary(int Salary) {
       if(Salary > SAlARIO_minimo || Salary == SAlARIO_minimo){
            this.Salary = Salary;
       }
    }

    public int getId() {
        return Id;
    }

    public String getCompleteName() {
        return CompleteName;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public String getCelphoneNumber() {
        return CelphoneNumber;
    }

    public double getSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return "Employeer{" + "Id=" + Id + ", CompleteName=" + CompleteName + ", BirthDate=" + BirthDate + ", CelphoneNumber=" + CelphoneNumber + ", Salary=" + Salary ;
    }

   
    
   
}
