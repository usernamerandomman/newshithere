public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música no iPhone...");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero + " no iPhone...");
    }

    @Override
    public void navegar(String url) {
        System.out.println("Navegando para " + url + " no iPhone...");
    }

    
}
