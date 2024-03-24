
import Library.Abonement;
import Library.Library;
import books.EnglishBook;
import books.RussianBook;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import people.Human;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Анна
 */
public class Main {
    public static void main(String args[]){
        Library.generateBooks(25, 25, 20, 20);
        Library.generateStudent(10);
        Library.generateTutor(10);
        ArrayList<String> allstudent = Library.getAllStudents();
        ArrayList<String> alltutor = Library.getAllTutors();
        ArrayList<String> allRusBooks = Library.getAllRusBooks();
        ArrayList<String> allEngBooks = Library.getAllEngBooks();
        Abonement abonement = new Abonement(allstudent, alltutor, allRusBooks, allEngBooks);
        JFrame frame = new LibraryJFrame();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

}}
