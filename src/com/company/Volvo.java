package com.company;

public class Volvo extends Car{
    private String name;


    public Volvo(int id, String name) {
        super(id);
        this.name = name;
    }

    public void type(){
        System.out.println("Jeg er en volvo");
    }

    @Override
    public String toString() {
        return "Volvo{" +
                "name='" + name + '\'' +
                "id='" + super.toString()+
                '}';
    }
}
