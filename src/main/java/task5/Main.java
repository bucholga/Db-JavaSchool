package task5;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static <T> void forEachWithDelay(List<T> list, int delay, Consumer<T> consumer) {
        for (T element : list) {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            consumer.accept(element);
        }
    }

    public static void main(String[] args) {
        forEachWithDelay(List.of("one", "two", "three"), 6000, System.out::println);
    }
}
