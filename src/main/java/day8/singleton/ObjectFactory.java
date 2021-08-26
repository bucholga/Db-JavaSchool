package day8.singleton;

import design_patterns.mails.RandomUtil;
import lombok.Getter;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class ObjectFactory {
    @Getter
    private static ObjectFactory instance = new ObjectFactory();
    private Config config = new JavaConfig();

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {
            type = config.getImplClass(type);
        }

        T t = type.getDeclaredConstructor().newInstance();

        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandomInt.class)) {
                InjectRandomInt injectRandomInt = field.getAnnotation(InjectRandomInt.class);
                field.setAccessible(true);
                field.set(t, RandomUtil.between(injectRandomInt.min(), injectRandomInt.max()));
                field.setAccessible(false);
            }
        }

        return t;
    }




}
