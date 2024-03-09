package container.desktop.api.service;

import container.desktop.api.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface UserService<U extends User> extends EntityService<U>{

    @Nullable
    User findById(Long id);
    void deleteById(Long id);
    List<? extends User> list();
    Status login(String username, String password);
    Status register(String username, String password);
    Status changePassword(String username, String password);
    String encryptPassword(String rawPassword);
    U getByUsername(String username);

    @Getter
    @AllArgsConstructor
    enum Status {
        SUCCESS("成功"),
        USER_ALREADY_EXISTS("用户已存在"),
        USER_NOT_FOUND("用户不存在"),
        INVALID_SECRET("凭据无效"),
        FAILED("");
        @Setter
        private String message;

    }
}
