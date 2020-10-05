package Lesson_1;

public class Main {
    public static void main(String[] args) {

        byte b1 = 10; // -128 127
        short s1 = 500; // -30k 30k
        int i1 = 9000; // 2000000000
        long l1 = 88888888L;

        float f1 = 120.0f;
        double d1 = 13.2;

        boolean bool = true;
        char c1 = 'b';

        String str = "Привет";;
        System.out.println(b1 + " " + s1 + " " + i1 + " " + l1 + " " + f1 + " " + d1 + " " + c1 + " " + str);
        info1();
        info2();
        info3();
        info4();
        info5("Дима");
        info6();

    }
    static void info1() {
        int a = 8;
        int b = 2;
        int c = 10;
        int d = 5;
        System.out.println(a * (b + (c / d)));


    }
    static void info2(){
        int a = 8;
        int b = 2;
        boolean f = true;
        boolean g = false;
        System.out.println((a + b) >= 10 && (a + b) <= 20 ? f : g);
    }
    static  void info3(){
        int z = -58;
        System.out.println(z >= 0 ? "положительное" : "отрицательное");

    }
    static void info4() {
        int z = -10;
        if (z < 0) {
            System.out.println(true);
        } else {

        }

    }
    static void info5(String name){
        System.out.println("Привет " +  name + '!');
    }
    static void info6() {
        int a = 400;
        if (a %100==0 && a %400 ==0 ) {
            System.out.println("Високосный");

        }else if (a % 4 == 0 && a % 100 > 0) {
            System.out.println("Високосный");

        }else if (a % 100 == 0) {

        }else {
        }
        }

    }
