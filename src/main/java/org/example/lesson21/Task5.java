package org.example.lesson21;

public class Task5 {
    //Бросить одно из существующих в JDK исключений, отловить его
    //и выбросить свое собственное, указав в качестве причины отловленное

    static void main(String[] args)  {
      try{
          catchCustomException();
      }catch (MyException exception){
          System.out.println("CATCHED IN MAIN");
          exception.printStackTrace();
      }
    }

    public static void catchCustomException() {
        try {
            unsafe();
        } catch (RuntimeException exception) {
            System.out.println("caught ");
            throw new MyException(exception);
        }
    }

    public static void unsafe() {
        throw new RuntimeException("runtime exception ooops");
    }
}
