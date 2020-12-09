package ISP.wrong;

public class Pinguim implements Aves {
    // wrong: quebra o princípio (a interface Aves a força à implementar esse método que não irá utilizar)
    public void setAltitude(int altitude) {
        // não faz nada - pinguim não voa
    }

    public void setLocalizacao(int longitude, int latitude) {
        // faz algo
    }

    public void renderizar() {
        // faz algo
    }
}
