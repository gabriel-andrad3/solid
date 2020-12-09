package OCP.wrong;

public class FolhaDePagamento {
    private float saldo;

    public void calcular(Funcionario func) {
        if (func instanceof ContratoClt) { //wrong: para cada tipo de funcionario, precisa de um novo if (quebra principio de NÃO ALTERAR)
            this.saldo = func.salario();
        }
        else if (func instanceof Estagio) {
            this.saldo = func.bolsaAuxilio();
        }
    }
}
