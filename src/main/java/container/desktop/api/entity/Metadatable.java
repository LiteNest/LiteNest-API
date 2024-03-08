package container.desktop.api.entity;

@SuppressWarnings("all")
public interface Metadatable {
    void addMetaData(String key, String value);

    String getMetaData(String key);

    void deleteMetaData(String key);
    void clearMetaData();
}
