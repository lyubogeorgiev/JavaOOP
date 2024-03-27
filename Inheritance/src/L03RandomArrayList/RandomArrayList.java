package L03RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {
    public T getRandomElement() {
        Random rnd = new Random();
        return this.get(rnd.nextInt(this.size() - 1));
    }
}
