package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        boolean t;
        for (int i = 2; i <= printToInclusive; i++){
            t = true;
            for (int j = 2; j < i; j++){
                if (i%j == 0){
                    t = false;
                    break;
                }
            }
            if (t){
                System.out.println(i);
            }
        }
    }
}
