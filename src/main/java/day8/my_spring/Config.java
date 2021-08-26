package day8.my_spring;


public interface Config {
    <T> Class<T> getImplClass(Class<T> type);
}
