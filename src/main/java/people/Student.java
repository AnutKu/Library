/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package people;

/**
 *
 * @author Анна
 */
public class Student extends Human {
    public  String group;
    
    public Student(String surname, String name, String group) {
        super(surname, name);
        this.group = group;
    }
    @Override
    public String getFullName() {
        return surname + " " + name + " " + group;
    }
        
}
