package people;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Locale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Анна
 */
public class God {
     public static Human createHuman(String who){
         if (who.equalsIgnoreCase("student")){
             Student student = createstudent();
             return student;
         }
         else if (who.equalsIgnoreCase("tutor")){
             Tutor tutor = createtutor();
             return tutor;
         }
         else{
             return null;
         }}
    public static Student createstudent(){
        Faker faker = new Faker(Locale.forLanguageTag("ru-RU"));
        String name = faker.name().firstName();
        String surname = faker.name().lastName();
        String group = "Группа № " + faker.number().numberBetween(1, 1000);
        return new Student(surname, name, group);

    }

    public static Tutor createtutor(){
        Faker faker = new Faker(Locale.forLanguageTag("ru-RU"));
        String name = faker.name().firstName();
        String surname = faker.name().lastName();
        String patronymic = faker.name().firstName();
        return new Tutor(surname, name, patronymic);

    }

     /*public static void printStudents() {
        for (Student student : Generator.all_students) {
            System.out.println(student.getFullName());
        }
    }*/}
     
    
    
     

