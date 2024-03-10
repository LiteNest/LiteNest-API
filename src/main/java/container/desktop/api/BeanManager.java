package container.desktop.api;

public interface BeanManager {
    <T> T getBean(Class<T> requiredType);
    Object getBean(String name);
    <T> T getBean(String name, Class<T> requiredType);
}
