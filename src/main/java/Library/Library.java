/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import books.BookGenerator;
import books.EnglishBook;
import books.RussianBook;
import java.util.ArrayList;
import people.Generator;
import people.Human;
import people.Student;

/**
 *
 * @author Анна
 */
public class Library {    
    
    // Статический метод для генерации книг
    public static void generateBooks(Integer kol_rf, Integer kol_rt, Integer kol_ef, Integer kol_et) {
        BookGenerator.generateEngTextBook(kol_et);
        BookGenerator.generateRusTextBook(kol_rt);
        BookGenerator.generateEngFicBook(kol_ef);
        BookGenerator.generateRusFicBook(kol_rf);
        
    }
    
    public static ArrayList<String> allRusBooks;

    public static ArrayList<String>  getAllRusBooks() {
        allRusBooks = BookGenerator.getAllRusBooks();
        return allRusBooks;
    }
    public static ArrayList<String> allEngBooks;

    public static ArrayList<String> getAllEngBooks() {
        allEngBooks = BookGenerator.getAllEngBooks();
        return allEngBooks;
    }    
    
    public static void generateStudent(Integer kol_stud) {
        Generator.generateStudent(kol_stud);      
    }
    
    public static void generateTutor(Integer kol_tutor) {
        Generator.generateTutor(kol_tutor);        
    }
    public static ArrayList<String> allStudent;
    public static ArrayList<String> getAllStudents() {
        allStudent = Generator.getAllStudents();
        return allStudent;
    }
    
    public static ArrayList<String> allTutor;
    public static ArrayList<String> getAllTutors() {
        allTutor = Generator.getAllTutors();
        return allTutor;
    }
}
