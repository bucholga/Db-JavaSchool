package day7;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
@Getter
public enum Seniority {
    JUN(0, 10), MIDDLE(11, 20), SENIOR(21, 100);

    private final int min, max;

    public static Seniority getBySalary(int salary) {
        var type = Arrays.stream(values())
                .filter(s -> s.getMax() >= salary && s.getMin() <= salary)
                .findFirst();
        return type.get();
    }
}
