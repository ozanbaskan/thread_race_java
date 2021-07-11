
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {



        int size = Array.getIntegers().size();
        List<Integer> subList1 = Array.getIntegers().subList(0,size / 4);
        List<Integer> subList2 = Array.getIntegers().subList(size / 4,size / 2);
        List<Integer> subList3 = Array.getIntegers().subList(size / 2,size / 4 * 3);
        List<Integer> subList4 = Array.getIntegers().subList(size / 4 * 3,size);

        FindEven findEven1 = new FindEven(subList1);
        FindEven findEven2 = new FindEven(subList2);
        FindEven findEven3 = new FindEven(subList3);
        FindEven findEven4 = new FindEven(subList4);

        FindOdd findOdd1 = new FindOdd(subList1);
        FindOdd findOdd2 = new FindOdd(subList2);
        FindOdd findOdd3 = new FindOdd(subList3);
        FindOdd findOdd4 = new FindOdd(subList4);

        try {
            Thread t1 = new Thread(findEven1);
            t1.start();
            t1.join();
            Thread t2 = new Thread(findOdd1);
            t2.start();
            t2.join();
            Thread t3 = new Thread(findEven2);
            t3.start();
            t3.join();
            Thread t4 = new Thread(findOdd2);
            t4.start();
            t4.join();
            Thread t5 = new Thread(findEven3);
            t5.start();
            t5.join();
            Thread t6 = new Thread(findOdd3);
            t6.start();
            t6.join();
            Thread t7 = new Thread(findEven4);
            t7.start();
            t7.join();
            Thread t8 = new Thread(findOdd4);
            t8.start();
            t8.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Array.getEvens());
        System.out.println(Array.getOdds());

    }




}
