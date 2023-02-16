import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        int Age = 17;
        if (Age < 18) {
            System.out.println("Если возраст человека равен " + Age + " то он не достиг совершеннолетия, нужно немного подождать");
        }
            if (Age>=18){
                System.out.println("Если возраст человека равен " + Age + " То он совершеннолетний");
            }

            }
    public static void task2 () {
        System.out.println("Задача 2");
        int Temperature =20;
        if (Temperature <= 5){
            System.out.println("На улице "+ Temperature + " градусов,  нужно надеть шапку");
        } if (Temperature > 5) {
            System.out.println("На улице "+ Temperature + " градусов, можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int Speed = 70;
        if (Speed > 70){
            System.out.println("Если скорость " +Speed + " то  придется заплатить штраф");
        }
        if (Speed <= 70){
            System.out.println("Если скорость " +Speed + " то можно ездить спокойно");
        }
    }

    public static void task4 ()
    {
        System.out.println("Задача 4");
        int Age = 8;
        if (2 < Age && Age<6) {
            System.out.println("Если возраст человека равен"+ Age + ", то ему нужно ходить в детский сад");
        } else if (Age > 7 && Age < 18) {
            System.out.println("Если возраст человека равен "+ Age + ", то ему нужно ходить в школу");
        } else if (Age > 18 && Age < 24){
            System.out.println("Если возраст человека равен "+ Age + ", то ему нужно ходить в университет");
        } else if (Age > 24){
            System.out.println("Если возраст человека равен "+ Age + ", то ему нужно ходить на работу");
        }

    }
    public static void task5 ()
    {
        System.out.println("Задача 5");
        int Age = 56;
        if (Age < 5){
            System.out.println("Если возраст ребенка равен " +Age+ " то он не может кататься на атракционе");
        }else if ( Age > 5 && Age < 14){
            System.out.println("Если возраст ребенка равен " +Age+ " то он он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }else if (Age > 14) {
            System.out.println("Если возраст ребенка равен " +Age+ " то он может кататься без сопровождения взрослого.");
        }
        }

    public static void task6 ()
    {
        System.out.println("Задача 6");
        int Total = 102;
        int Seat = 60;
        int Stay = 42;
        int OccupiedSeat = 60;
        int OccupiedStay = 42;
        if ( OccupiedStay + OccupiedSeat == Total ){
            System.out.println("Мест в вагоне нет");
        } else {
            if (Seat > OccupiedSeat) {
                System.out.println("В вагоне есть " + (Seat - OccupiedSeat) + " сидячих мест");
            } else {
                System.out.println("Сидячих мест в вагоне нет");
            }
            if (Stay > OccupiedStay) {
                System.out.println("В вагоне есть " + (Stay - OccupiedStay) + " стоячих мест");

            } else {
                System.out.println("Стоячих мест в вагоне нет");
            }
        }
    }
    public static void task7 ()
    {
        System.out.println("Задача 7");
        int one = 10;
        int two = 11;
        int three = 12;
        if (one > two && one > three){
            System.out.println( "Самое большое число - " + one);
        }else if ( two > one && two > three){
            System.out.println( "Самое большое число - " + two);
        }else if (three > one && three>one){
            System.out.println( "Самое большое число - " + three);
        }

    }

}