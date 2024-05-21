/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package havalimani;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author HAYYAN ALKHATTAB
 */
public class Havalimani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String t = "12:00";
        LocalTime time = parseTime(t);
        displayTime(time);
    }
    private static LocalTime parseTime(String inputTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return LocalTime.parse(inputTime, formatter);
    }
    private static void displayTime(LocalTime time) {
        System.out.println("Time is : " + time);
    }
    
}
