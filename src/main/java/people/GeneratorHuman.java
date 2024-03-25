/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package people;

import java.util.ArrayList;

/**
 *
 * @author Анна
 */
public class GeneratorHuman {

    public static ArrayList<Student> all_students = new ArrayList<>();
    public static ArrayList<Tutor> all_tutors = new ArrayList<>();
    public static ArrayList<Student> generateStudent(int quantity){
        for (int i = 0; i < quantity; i++){
            Student student = (Student) God.createHuman("student");
            all_students.add(student);
        }
        return all_students;}
    public static ArrayList<Tutor> generateTutor(int quantity){
        for (int i = 0; i < quantity; i++){
            Tutor tutor = (Tutor) God.createHuman("tutor");
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
