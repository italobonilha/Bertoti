public class Main {
    public static void main(String[] args) {
        App App = new App();
        Usuario usuario1 = new Usuario("Julia");
        Usuario usuario2 = new Usuario("Gaby");


        App.addUser(usuario1);
        App.addUser(usuario2);

        App.sendMessage("Olá, estas são as promoções disponíveis!");
    }
}