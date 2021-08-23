package task4Enums;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {
    public static <T> int countDuplicates(T template, List<T> list){
        int count = 0;
        for (T item : list){
            if (item.equals(template)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDuplicates("java", List.of("java", "java", "java", "main", "nitjava", "java")));
    }
}
