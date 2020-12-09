package LSP.wrong;

import OCP.correct.Remuneravel;

public class Voluntario implements Remuneravel {
    @Override
    public void remuneracao() {
        // wrong: quebra o princípio (não pode não fazer nada)
    }
}
