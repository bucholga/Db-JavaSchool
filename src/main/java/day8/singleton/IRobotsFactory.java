package day8.singleton;

import design_patterns.mails.RandomUtil;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class IRobotsFactory {
    private ObjectFactory objectFactory;

    public IRobotsFactory(ObjectFactory objectFactory){
        this.objectFactory = objectFactory;
    }

    @SneakyThrows
    public <T> T createIRobot (Class<T> type){

        T t = type.getDeclaredConstructor().newInstance();

        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectByType.class)) {
                field.setAccessible(true);
                field.set(t, objectFactory.createObject(field.getType()));
                field.setAccessible(false);
            }
        }
        return t;
    }
}
