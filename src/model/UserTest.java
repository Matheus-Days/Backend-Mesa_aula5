package model;

import org.junit.jupiter.api.Test;
import service.Download;
import service.ServicoDownloadProxy;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void downloadTest() {
        User user1 = new User("João Silva", "João", "joao@email.com", "123");
        Download download = new ServicoDownloadProxy();
        download.downloadMusica(user1, "Macarena");

        user1.setUserType("Premium");
        download.downloadMusica(user1, "Macarena");
    }
}