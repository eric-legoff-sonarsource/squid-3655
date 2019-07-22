package com.sonarsource.support;

import java.util.Optional;

public class Reproducer {

    private Integer value;

    private  Optional<Integer> getValue(){
        return Optional.ofNullable(value);
    }

    public static void main(String[] args) {
        Reproducer instance = new Reproducer();
        if (instance.getValue().isPresent() && instance.getValue().get() != null) {
            instance.value = null;
          }
        System.out.println("Done");
    }
}