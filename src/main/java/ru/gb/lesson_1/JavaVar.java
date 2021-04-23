package ru.gb.lesson_1;

public class JavaVar {

    public static void main(String[] args) {

        //1. Создадим переменные всех пройденных типов данных
        // и инициализируем их значения.
        String val;
        val = "Создаем и инициализируем переменные";

        byte val_1;
        val_1 = 11;

        short val_2;
        val_2 = 15;

        int val_3;
        val_3 = 150;

        long val_4;
        val_4 = 1000L;

        float val_5;
        val_5 = 13.58f;

        double val_6;
        val_6 = 125.689;

        char val_7;
        val_7 = '*';

        boolean val_8;
        val_8 = true;

        System.out.println(val + "\nbyte - " + val_1 + ", short - " + val_2 + ", int - " + val_3 + ", long - " + val_4 +
                ", float - " + val_5 + ", double - " + val_6 + ", char - " + val_7 + ", boolean - " + val_8 );

        System.out.println(computation(2.3f,4.8f,0.2f, 3.6f));
        System.out.println(check(8,5));
        check_2(10);
        System.out.println(check_3(-2));
        hello("Денис");
        leapYear(1911);
    }

    //2. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.
    static float computation(float a, float b, float c, float d) {
        float comp = a * (b + (c / d));
        return comp;
    }

    //3. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    //в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    static boolean check(int a, int b){
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //4. Написать метод, которому в качестве параметра передается целое число, метод должен
    //напечатать в консоль, положительное ли число передали или отрицательное.
    static void check_2(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    //5. Написать метод, которому в качестве параметра передается целое число. Метод должен
    //вернуть true, если число отрицательное, и вернуть false если положительное.
    static boolean check_3(int a){
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    //6. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    //Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    static void hello (String name){
        System.out.println("Привет, " + name);
    }

    //7. Написать метод, который определяет, является ли год високосным, и выводит сообщение в
    //консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
    //високосный.
    static void leapYear(int year) {
        if ((year % 4 == 0) || (!(year % 100 == 0) && (year % 400 == 0))) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }
}
