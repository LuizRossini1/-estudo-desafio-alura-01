public class Cliente {
    String nome;
    String tipoDaConta;

    public Cliente(String nome, String tipoDaConta) {
        this.nome = nome;
        this.tipoDaConta = tipoDaConta;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: " + tipoDaConta);
    }
}