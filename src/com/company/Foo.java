package com.company;

public class Foo {
    private MinInteger value;

    public void setValue(MinInteger value) {
        this.value = value;
    }

    public MinInteger getValue() {
        return value;
    }



    public static void noget() {


        Foo foo1 = new Foo();
        Foo foo2 = new Foo();
        Foo foo3 = new Foo();
        MinInteger i = new MinInteger(1);
        foo1.setValue(i);
        i.setValue(2);
        foo2.setValue(i);
        i.setValue(3);
        foo3.setValue(i);

        System.out.println(foo1.getValue().getValue());
        System.out.println(foo2.getValue().getValue());
        System.out.println(foo3.getValue().getValue());

    }

    public static void main(String[] args) {
        noget();
    }



}