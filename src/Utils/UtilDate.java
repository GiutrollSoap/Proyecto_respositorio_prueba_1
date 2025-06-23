/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author UTN
 */
public abstract class UtilDate {
    
    public static int calculeAge(LocalDate fechaNacimiento) {
        if (fechaNacimiento == null || fechaNacimiento.isAfter(LocalDate.now())) {
        
        }
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public static boolean isTimeValid(LocalDate fecha) {
        return fecha != null && !fecha.isAfter(LocalDate.now());
    }

 
    public static boolean isAdult(LocalDate fechaNacimiento) {
        return calculeAge(fechaNacimiento) >= 18;
    }
}
