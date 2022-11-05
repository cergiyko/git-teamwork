package model;

import lombok.Data;

@Data
public class Student {

    private Long id;
    private String name;
    private String colorHair="Yellow";
    private int age =21;
    public void sayAnything() {
        System.out.println("I'm student number 5");
    }

}
