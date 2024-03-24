/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package people;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author Анна
 */
public class Generator {
    public static final Faker faker = new Faker(Locale.forLanguageTag("ru-RU"));
    public static ArrayList<Student> all_students = new ArrayList<>();
    public static ArrayList<Tutor> all_tutors = new ArrayList<>();
    public static ArrayList<Student> generateStudent(int quantity){
        for (int i = 0; i < quantity; i++){
            String name = faker.name().firstName();
            String surname = faker.name().lastName();
            String group = "Группа № " + faker.number().numberBetween(1, 1000);
            Student student = (Student) God.createHuman("student", name, surname, null, group);
            all_students.add(student);
        }
        return all_students;}
    public static ArrayList<Tutor> generateTutor(int quantity){
        for (int i = 0; i < quantity; i++){
            String name = faker.name().firstName();
            String surname = faker.name().lastName();
            String patronymic = faker.name().firstName();
            Tutor tutor = (Tutor) God.createHuman("tutor", name, surname, patronymic, null);
            all_tutors.add(tutor);
            
        }
        return all_tutors;
    }
    
    
    public static ArrayList<String> getAllStudents() {
    ArrayList<String> allStudent = new ArrayList<>();
    
    // Добавление всех элементов с применением метода get_full_title()
    for (Student s : all_students) {
        allStudent.add(s.getFullName());
    }
    return allStudent;}
    
    public static ArrayList<String> getAllTutors() {
    ArrayList<String> allTutor = new ArrayList<>();
    
    // Добавление всех элементов с применением метода get_full_title()
    for (Tutor t : all_tutors) {
        allTutor.add(t.getFullName());
    }
    return allTutor;}
}
