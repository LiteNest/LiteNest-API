package container.desktop.api.locator;

import container.desktop.api.entity.Container;
import container.desktop.api.entity.Image;
import container.desktop.api.entity.Network;
import container.desktop.api.entity.User;
import container.desktop.api.repository.ContainerRepository;
import container.desktop.api.repository.ImageRepository;
import container.desktop.api.repository.NetworkRepository;
import container.desktop.api.repository.UserRepository;
import lombok.Getter;

@Getter
public class RepositoryLocator {
    private static UserRepository<? extends User> userRepository = null;
    private static ContainerRepository<? extends Container> containerRepository = null;
    private static ImageRepository<? extends Image> imageRepository = null;
    private static NetworkRepository<? extends Network> networkRepository = null;

    public static void setUserRepository(UserRepository<? extends User> userRepository) {
        if (RepositoryLocator.userRepository == null) {
            RepositoryLocator.userRepository = userRepository;
        } else {
            throw new IllegalModificationException();
        }

    }

    public static void setContainerRepository(ContainerRepository<? extends Container> containerRepository) {
        if (RepositoryLocator.containerRepository == null) {
            RepositoryLocator.containerRepository = containerRepository;
        } else {
            throw new IllegalModificationException();
        }

    }

    public static void setImageRepository(ImageRepository<? extends Image> imageRepository) {
        if (RepositoryLocator.imageRepository == null) {
            RepositoryLocator.imageRepository = imageRepository;
        } else {
            throw new IllegalModificationException();
        }

    }

    public static void setNetworkRepository(NetworkRepository<? extends Network> networkRepository) {
        if (RepositoryLocator.networkRepository == null) {
            RepositoryLocator.networkRepository = networkRepository;
        } else {
            throw new IllegalModificationException();
        }

    }
}
