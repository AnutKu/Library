/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package people;

/**
 *
 * @author Анна
 */
public class Tutor extends Human{
    public String patronymic;
    
    public Tutor(String surname, String name, String patronymic) {
        super(surname, name);
        this.patronymic = patronymic;
    }
    @Override
    public String getFullName() {
        return surname + " " + name + " " + patronymic;
    }
}
