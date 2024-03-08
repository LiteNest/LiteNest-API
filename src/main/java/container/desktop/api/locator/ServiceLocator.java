package container.desktop.api.locator;

import container.desktop.api.entity.Container;
import container.desktop.api.entity.Image;
import container.desktop.api.entity.Network;
import container.desktop.api.entity.User;
import container.desktop.api.service.ContainerService;
import container.desktop.api.service.ImageService;
import container.desktop.api.service.NetworkService;
import container.desktop.api.service.UserService;
import lombok.Getter;

@Getter
public class ServiceLocator {
    private static ContainerService<? extends Container> containerService = null;
    private static ImageService<? extends Image> imageService = null;
    private static NetworkService<? extends Network> networkService = null;
    private static UserService<? extends User> userService = null;

    public static void setContainerService(ContainerService<? extends Container> containerService) {
        if (ServiceLocator.containerService == null) {
            ServiceLocator.containerService = containerService;
        } else {
            throw new IllegalModificationException();
        }
    }

    public static void setImageService(ImageService<? extends Image> imageService) {
        if (ServiceLocator.imageService == null) {
            ServiceLocator.imageService = imageService;
        } else {
            throw new IllegalModificationException();
        }

    }

    public static void setNetworkService(NetworkService<? extends Network> networkService) {
        if (ServiceLocator.networkService == null) {
            ServiceLocator.networkService = networkService;
        } else {
            throw new IllegalModificationException();
        }

    }

    public static void setUserService(UserService<? extends User> userService) {
        if (ServiceLocator.userService == null) {
            ServiceLocator.userService = userService;
        } else {
            throw new IllegalModificationException();
        }
    }
}
