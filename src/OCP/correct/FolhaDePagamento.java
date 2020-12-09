package OCP.correct;

public class FolhaDePagamento {
    private float saldo;

    public void calcular(Remuneravel func) {
        this.saldo = func.remuneracao();
    }
}
