public class Padrao {
    private static Padrao instance;
    private String idioma;
    private String temaCor;

    private Padrao() {
        idioma = "Português";
        temaCor = "Claro";
    }

    public static Padrao getInstance() {
        if (instance == null) {
            instance = new Padrao();
        }
        return instance;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String novoIdioma) {
        idioma = novoIdioma;
    }

    public String getTemaCor() {
        return temaCor;
    }

    public void setTemaCor(String novoTemaCor) {
        temaCor = novoTemaCor;
    }
}
