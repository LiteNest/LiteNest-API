package container.desktop.api.service;

import container.desktop.api.entity.User;

import java.util.List;

public interface UserService<U extends User> extends EntityService<U>{

    void deleteById(Long id);
    List<? extends User> list();
    Status login(String username, String password);
    Status register(String username, String password);
    Status changePassword(String username, String password);
    String encryptPassword(String rawPassword);

    enum Status {
        SUCCESS,
        USER_ALREADY_EXISTS,
        USER_NOT_FOUND,
        INVALID_SECRET,
        FAILED;

    }
}
