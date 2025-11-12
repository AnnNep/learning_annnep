package org.example.Lesson7;

public class Lesson4_2 {
    /**
     * Заменить грустные смайлы :( в строке на веселые :)
     */
    public static void main(String[] args) {
        String value = "sedgvfd :( hxvfk :) hbvikn :( jnf :(";
        String result = replace(value);
        System.out.println(result);
    }

    public static String replace (String value) {
        return value.replace(":(",":)");
    }
}
