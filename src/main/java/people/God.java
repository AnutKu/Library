package people;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Анна
 */
public class God {
     public static Human createHuman(String who, String name, String surname, String patronymic, String group){
         if (who.equalsIgnoreCase("student")){
             return new Student(surname, name, group);
         }
         else if (who.equalsIgnoreCase("tutor")){
             return new Tutor(surname, name, patronymic);
         }
         else{
             return null;
         }}
     /*public static void printStudents() {
        for (Student student : Generator.all_students) {
            System.out.println(student.getFullName());
        }
    }*/}
     
    
    
     

