package service;

import model.User;

public class ServicoDownloadProxy implements Download{

    @Override
    public void downloadMusica(User user, String nomeMusica) {
        if (user.getUserType() == "Premium") {
            Download download = new ServicoDownload();
            download.downloadMusica(user, nomeMusica);
        } else {
            System.out.println("Usuário(a) " + user.getNickname() + " não é premium. Aprimore para fazer o download.");
        }
    }
}
