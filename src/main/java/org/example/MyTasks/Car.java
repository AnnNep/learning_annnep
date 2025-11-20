package org.example.MyTasks;
//НАСЛЕДОВАНИЕ: Object -> Car -> BMW -> BMWv1
//                            -> Kia
//                            -> Toyota

public abstract class Car implements Rideable{ //АБСТРАКЦИЯ
    private int HowOftenTO; //Как часто нужно проводить тех. обслуживание (в тысячах км)
    private String Country; //Страна производителя
    private int Year; //Год выпуска машины
//Поля можем считать ИНКАПСУЛЯЦИЕЙ
    public Car(int howOftenTO, String country, int year) {
        this.HowOftenTO = howOftenTO;
        this.Country = country;
        this.Year = year;
    }

    public abstract void CarAdvantages();

    public void CarInformation(){
        System.out.println("Обслуживание нужно проводить каждые " + HowOftenTO + " тыс. км., страна-производитель: " + Country);
        System.out.println("Возраст машины: " + HowOld());
    }

    //protected - Модификатор предоставляет доступ только наследникам
       protected int HowOld() {
           int CurrentYear = 2025;
           int CarAge;
           CarAge = CurrentYear - getYear();
           return CarAge;
       }

    @Override
    public String ride() {
        String rewiew = "На машине можно ездить";
        return rewiew;
    }

    public int getHowOftenTO() {
        return HowOftenTO;
    }

    public String getCountry() {
        return Country;
    }

    public int getYear() {
        return Year;
    }

    public int getCarAge() {
        return HowOld();
    }




}
