package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        try (Stream<String> lines = Files.lines(Paths.get("C:\\Users\\Xiaomi\\JavaSchoolDB\\git-repo\\homework-task2\\data\\song.txt"))){
            long count = lines
                    .flatMap(line-> Arrays.stream(line.split("\\s+")))
                    .count();
            System.out.println(count);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
