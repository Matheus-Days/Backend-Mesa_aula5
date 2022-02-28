package service;

import model.User;

public class ServicoDownload implements Download{

    @Override
    public void downloadMusica(User user, String nomeMusica) {
        System.out.println("Usuário(a) " + user.getNickname() + " tem conta premium," +
                " iniciando o download de " + nomeMusica + "...");
    }
}
