/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books;

/**
 *
 * @author Анна
 */
public class EnglishFictionBook implements EnglishBook{
    public String authortitle;
    public Integer year;
    public String englishlevel;
    
     public EnglishFictionBook(String authortitle,String englishlevel, Integer year) {
        this.authortitle = authortitle;
        this.englishlevel = englishlevel;
        this.year = year;
    }

    
    @Override
    public String get_full_title() {
        return authortitle +  " (" + year + ")" + ": " + englishlevel;
    
}}
