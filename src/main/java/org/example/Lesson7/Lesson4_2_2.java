package org.example.Lesson7;

public class Lesson4_2_2 {
    /**
     * Написать функцию, принимающую 2 параметра: строку и слово - и
     * возвращающую True, если строка начинается и заканчивается этим словом.
     */
    public static void main(String[] args) {
        String value = "123 ndlgfnzd 123";
        String word = "123";
        System.out.println(IsStartAndEnd(value, word));
    }

    private static boolean IsStartAndEnd (String target, String word) {
        return target.startsWith(word) && target.endsWith(word);
    }
}
