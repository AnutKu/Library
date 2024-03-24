/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books;

/**
 *
 * @author Анна
 */
public class TextbookFactory{ 
    public static Object createBook(String language, String author, String university, String course, String studylevel, Integer year, String literature_type) { 
        if (language.equalsIgnoreCase("ENG")){ 
             return new EnglishTextBook(author, university, course, studylevel, year); 
         } 
         else if (language.equalsIgnoreCase("RUS")){ 
             return new RussianTextBook(author,  course, literature_type, year); 
         } 
         else{ 
             return null; 
    }}}
