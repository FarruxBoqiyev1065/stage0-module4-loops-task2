package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void printFactorialRow(int printToInclusive) {
        int a = 0, factorial = 1;
        while (a <= printToInclusive){
            System.out.println(factorial);
            a++;
            factorial *= a;
        }
    }

    public static void main(String[] args) {
        printFactorialRow(4);
    }
}
