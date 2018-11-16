package com.trilogy.sample.severe;

public class MethodObjectParameterReassign {

    public void methodName(Person person) {

        // reassignment of object parameter detected
        person = new Person();
    }

    class Person {

    }
}
