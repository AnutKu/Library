/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books;

/**
 *
 * @author Анна
 */
public class RussianTextBook implements RussianBook{
    public String author;
    public String subject;
    public String literature_type;
    public Integer year;

    
    public RussianTextBook(String author, String subject, String literature_type, Integer year) {
        this.author = author;
        this.subject = subject;
        this.literature_type = literature_type;
        this.year = year;
    }
    
    @Override
    public String get_full_title() {
        return author + ": " + subject + ". " + literature_type + "(" + year + ")";

    }}
