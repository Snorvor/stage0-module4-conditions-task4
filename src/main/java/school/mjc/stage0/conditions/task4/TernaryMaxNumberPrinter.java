package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int theBigger;

        first = first > second ? first : second;
        first = first > third ? first : third;
        theBigger = (second > third) ? second : third;
        theBigger = theBigger > first ? theBigger : first;
        System.out.println(theBigger);
    }
}
