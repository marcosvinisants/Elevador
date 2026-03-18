public class Main {
    public static void main(String[] args) {

        Elevador elevador = new Elevador(5);

        elevador.abrirPorta();
        elevador.subir();

        elevador.fecharPorta();
        elevador.subir();
        elevador.subir();

        elevador.mostrarAndarAtual();

        elevador.abrirPorta();
        elevador.statusPorta();

        elevador.fecharPorta();
        elevador.descer();

        elevador.mostrarAndarAtual();
    }
}