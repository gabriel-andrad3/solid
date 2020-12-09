package LSP.correct;

public class Main {
    public String imprimeNome(A object) {
        return object.getNome();
    }

    public static void main(String[] args) {
        A object1 = new A();
        B object2 = new B();

        Main teste = new Main();
        System.out.println(teste.imprimeNome(object2)); // classe filha consegue substituir a
        System.out.println(teste.imprimeNome(object1)); // classe pai
    }
}
