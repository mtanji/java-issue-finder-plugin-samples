package com.trilogy.sample.severe;

import java.io.IOException;

public class TopLevelException {
    public void methodName1() throws Exception {

        // Exception being thrown detected
        throw new Exception();
    }

    public void methodName2() throws Throwable {

        // Throwable being thrown detected
        throw new Throwable();
    }

    public void methodName3() throws Exception {

        // Exception being thrown detected
        throw new Exception("A message");
    }

    public void methodName4() throws Exception {

        try {
            System.out.print("do something");
        } catch (Exception e) {
            // Exception being thrown detected
            throw new Exception("A message", e);
        }
    }

}
