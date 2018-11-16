package com.trilogy.sample.severe;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalAssignedNull {

    // null assignment to Optional type detected
    Optional var = null;

    public void methodName() {

        // null assignment to Optional type detected
        Optional<String> opString = null;

        // null assignment to Optional type detected
        Optional op = null;

        // null assignment to Optional type detected
        methodName3(null);

        List<String> list = Arrays.asList("john", "mary");
        List<Optional> opList = list.stream().map(item -> Optional.of(item))
                .collect(Collectors.toList());
        // null assignment to Optional type detected
        opList.replaceAll(name -> null);
    }

    public Optional methodName2() {
        // null assignment to Optional type detected
        return null;
    }

    public void methodName3(Optional op) {
    }
}
