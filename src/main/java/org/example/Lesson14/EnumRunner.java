package org.example.Lesson14;

import java.util.Arrays;

public class EnumRunner {
    public static void main(String[] args) {
        ProcessorType processorType = ProcessorType.BIT_32; //Не нужно создавать new
        System.out.println(processorType);
        System.out.println(processorType.name());
        System.out.println(processorType.toString());
        System.out.println(processorType.valueOf("BIT_32"));
        System.out.println(Arrays.toString(processorType.values())); //enum - это массив
        System.out.println(ProcessorType.BIT_32.ordinal()); //порядковый номер
        System.out.println(processorType.getName());
        System.out.println(processorType.getDescription());


    }
}
