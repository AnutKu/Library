/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books;

/**
 *
 * @author Анна
 */
public class RussianFictionBook implements RussianBook{
    public String authortitle;
    public Integer year;
    
     public RussianFictionBook(String authortitle, Integer year) {
        this.authortitle = authortitle;
        this.year = year;
    }
    
    @Override
    public String get_full_title() {
        return authortitle +  " (" + year + ")";
    
}}
