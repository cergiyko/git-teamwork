package model;

import lombok.Data;

@Data
public class Student {

    private Long id;
    private String name;

    public void sayAnything() {
        System.out.println("I'm student number 5");
    }

}
