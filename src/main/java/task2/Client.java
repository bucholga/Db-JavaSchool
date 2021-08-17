package task2;

import lombok.ToString;

import java.util.HashMap;

@ToString
public class Client {
    private final int debt;
    private final int bonus;
    private final String name;
    private final int salary;

    public Client(HashMap<String, Object> paramsMap) {
        this.debt = paramsMap.get("debt") != null ? (Integer) paramsMap.get("debt") : 0;
        this.bonus = paramsMap.get("bonus") != null ? (Integer) paramsMap.get("bonus") : 0;
        this.name = paramsMap.get("name") != null ? (String) paramsMap.get("name") : "Unknown";
        this.salary = paramsMap.get("salary") != null ? (Integer) paramsMap.get("salary") : 0;
    }
}
