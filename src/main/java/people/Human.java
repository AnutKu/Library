/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package people;


public abstract class Human {
    public String surname;
    public String name;

    public Human(String surname, String name){
        this.surname = surname;
        this.name = name;
    }

    public String getFullName() {
        return surname + " " + name;
    }
}