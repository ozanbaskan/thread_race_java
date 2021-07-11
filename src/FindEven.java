import java.util.ArrayList;
import java.util.List;

public class FindEven implements Runnable {

    private List<Integer> integers = new ArrayList<>();

    public FindEven(List<Integer> integers) {
        this.integers = integers;
    }

    @Override
    public void run() {
        for (Integer i: this.integers)
        {
            if (i % 2 == 0) Array.addEven(i);
        }

    }
}
