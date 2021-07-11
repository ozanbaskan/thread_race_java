import java.util.ArrayList;
import java.util.List;

public class FindOdd implements Runnable {

    private List<Integer> integers = new ArrayList<>();

    public FindOdd(List<Integer> integers) {
        this.integers = integers;
    }

    @Override
    public void run() {

        for (Integer i: this.integers)
        {
            if (i % 2 == 1) Array.addOdd(i);
        }
    }
}
