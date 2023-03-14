package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int a = 0;

        if (power > 0){
            while (a <= power){
                int b = (int) Math.pow(2, a);
                System.out.println(b);
                a++;
            }
        }else if (power < 0) {
            System.out.println("too much power");
        } else if (power == 0) {
            System.out.println(1);
        }
    }
}
