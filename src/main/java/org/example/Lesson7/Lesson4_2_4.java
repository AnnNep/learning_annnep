package org.example.Lesson7;
/**
 * Подсчитать кол-во всех точек, запятых и ! в строке
 */
public class Lesson4_2_4 {
    public static void main(String[] args) {
        String value = "hfsl.,kmvtg!?ikj.,.";
        System.out.println(countSymbols(value));
    }

    public static int countSymbols(String value) {
        String result = value.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() - result.length();

    }
}
