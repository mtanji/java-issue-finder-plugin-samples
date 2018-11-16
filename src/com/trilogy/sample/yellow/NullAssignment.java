package com.trilogy.sample.yellow;

public class NullAssignment {
    public void methodname() {
        Integer variable = 1;
        // do a lot of things

        // this assignment is detected
        variable = null;

        // do a lot of things
        System.out.print(variable);
    }
}
