/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books;

/**
 *
 * @author Анна
 */
public class FictionbookFactory {
    public static Object createBook(String language, String authortitle, String englishlevel, Integer year) {
        if (language.equalsIgnoreCase("ENG")){
            return new EnglishFictionBook(authortitle, englishlevel,  year);
        }
        else if (language.equalsIgnoreCase("RUS")){
            return new RussianFictionBook(authortitle, year);
        }
        else{
            return null;
        }}}