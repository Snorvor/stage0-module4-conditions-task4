package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int result;

        if (first > second) {
            System.out.println(first);
        } else if (second > first) {
            System.out.println(second);
        } else {
            result = first == second ? first : second;
            System.out.println(result);
        }
    }
}
