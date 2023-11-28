public class Main {
    public static void main(String[] args) {
        Padrao configuracoes = Padrao.getInstance();

        System.out.println("Idioma atual: " + configuracoes.getIdioma());
        System.out.println("Tema de cor: " + configuracoes.getTemaCor());

        configuracoes.setIdioma("Inglês");
        configuracoes.setTemaCor("Escuro");

        System.out.println("Idioma atual: " + configuracoes.getIdioma());
        System.out.println("Tema de cor: " + configuracoes.getTemaCor());
    }
}
