package container.desktop.api.repository;

import container.desktop.api.entity.User;

public interface UserRepository<U extends User> extends Repository<U> {
    U findByUsername(String username);
    void deleteByUsername(String username);
}
