package myiphoneapp;

import myiphoneapp.components.browser.WebBrowser;
import myiphoneapp.components.musicplayer.MusicPlayer;
import myiphoneapp.components.phone.Phone;

public class MainApp {
	public static void main(String[] args) {
        System.out.println("Main Application");
        
        WebBrowser browser = new WebBrowser();
        MusicPlayer musicPlayer = new MusicPlayer();
        Phone phone = new Phone();
        
        
        browser.exibirPagina("https://www.google.com");
        browser.adicionarNovaAba();
        browser.atualizarPagina();

        musicPlayer.tocar("Nome da Música");
        musicPlayer.pausar();
        musicPlayer.selecionarMusica("Nome da Música");

        phone.ligar();
        phone.atender();
        phone.iniciarCorreioVoz();
    }

}
