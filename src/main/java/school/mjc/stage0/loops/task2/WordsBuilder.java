package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char x : chars){
            stringBuilder.append(x);
        }
        System.out.print(stringBuilder);
    }
}
