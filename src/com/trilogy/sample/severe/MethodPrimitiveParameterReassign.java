package com.trilogy.sample.severe;

public class MethodPrimitiveParameterReassign {

    public void methodName1(byte pByte, short pShort, int pInt, long pLong) {

        // reassignment of primitive parameter detected
        pByte = 1;

        // reassignment of primitive parameter detected
        pShort = 1;

        // reassignment of primitive parameter detected
        pInt = 1;

        // reassignment of primitive parameter detected
        pLong = 1;

        // reassignment of primitive parameter detected
        pLong++;

        // reassignment of primitive parameter detected
        --pLong;
    }

    public void methodName2(boolean pBoolean, char pChar, float pFloat, double pDouble) {

        // reassignment of primitive parameter detected
        pBoolean = true;

        // reassignment of primitive parameter detected
        pChar = '1';

        // reassignment of primitive parameter detected
        pFloat = 1.0f;

        // reassignment of primitive parameter detected
        pDouble = 1.0;

    }
}
