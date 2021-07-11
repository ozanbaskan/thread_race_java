import java.util.ArrayList;
import java.util.List;

public class Array {

    private static List<Integer> integers = new ArrayList<>();

    private static List<Integer> odds = new ArrayList<>();
    private static List<Integer> evens = new ArrayList<>();

    static
    {
            for (int i = 1; i <= 10000;i++)
            {
                integers.add(i);
            }
    }

    public static List<Integer> getIntegers() {
        return integers;
    }

    public static void setIntegers(List<Integer> integers) {
        Array.integers = integers;
    }

    public static void addOdd(Integer i)
    {
        Array.odds.add(i);
    }

    public static void addEven(Integer i)
    {
        Array.evens.add(i);
    }

    public static List<Integer> getOdds() {
        return odds;
    }

    public static void setOdds(List<Integer> odds) {
        Array.odds = odds;
    }

    public static List<Integer> getEvens() {
        return evens;
    }

    public static void setEvens(List<Integer> evens) {
        Array.evens = evens;
    }
}
