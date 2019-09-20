package com.sonarsource.support;

import java.util.Optional;

public class Reproducer {

    private Integer value;

    private  Optional<Integer> getValue(){
        return Optional.ofNullable(value);
    }

    public static void main(String[] args) {
        Reproducer instance = new Reproducer();
        Optional<Integer> v = instance.getValue();
        if (v.isPresent() && v.get() != null) {
            instance.value = null;
          }
        System.out.println("Done");
    }
}