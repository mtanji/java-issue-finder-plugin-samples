package com.trilogy.sample.red;

public class ComparingStrings {
    public void methodName(String a, String b) {

        // this equality is detected
        if (a == b) {
            System.out.print("do something");
            System.out.print("do something else");
        }

        // this difference is detected
        if (a != b) {
            System.out.print("do something");
            System.out.print("do something else");
        }

    }
}
