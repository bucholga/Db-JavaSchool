package day8.singleton;


public interface Config {
    <T> Class<T> getImplClass(Class<T> type);
}
