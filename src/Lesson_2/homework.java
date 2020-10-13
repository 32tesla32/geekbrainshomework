package Lesson_2;

public class homework {
    public static void replacement (int[] mass) {
        for(int a=0; a < mass.length; a++){
            mass[a] = (mass[a] == 1) ? 0 : 1;
            System.out.println(mass);
        }

    }
}
