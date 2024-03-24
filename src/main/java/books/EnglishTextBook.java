/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books;

/**
 *
 * @author Анна
 */
public class EnglishTextBook implements EnglishBook{
    public String author;
    public String university;
    public String coursera;
    public String studylevel;
    public Integer year;

    
    public EnglishTextBook(String author, String university, String coursera,String studylevel, Integer year) {
        this.author = author;
        this.university = university;
        this.coursera = coursera;
        this.studylevel = studylevel;
        this.year = year;
    }
    
    @Override
    public String get_full_title() {
        return author + " " + university + ": " + coursera  + " for " + studylevel + " (" + year + ")";

    
}}
