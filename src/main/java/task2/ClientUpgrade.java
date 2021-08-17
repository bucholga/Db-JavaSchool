package task2;

import lombok.ToString;

import java.lang.reflect.Field;
import java.util.HashMap;


@ToString
public class ClientUpgrade {
    private final int debt;
    private final int bonus;
    private final String name;
    private final int salary;

    public ClientUpgrade(HashMap<String, Object> paramsMap){
        debt = 0;
        bonus = 0;
        name = "Unknown";
        salary = 0;
        for (String key:
             paramsMap.keySet()) {
            this.setAttribute(key, paramsMap.get(key));
        }
    }

    public void setAttribute(String key, Object value){
        try {
            Field field = this.getClass().getDeclaredField(key);
            field.setAccessible(true);
            field.set(this, value);
            field.setAccessible(false);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
