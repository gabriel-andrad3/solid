package OCP.wrong;

public class FolhaDePagamento {
    private float saldo;

    public void calcular(Funcionario func) {
        if (func instanceof ContratoClt) {
            this.saldo = func.salario();
        }
        if (func instanceof Estagio) {
            this.saldo = func.bolsaAuxilio();
        }
    }
}
