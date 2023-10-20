public class Funcionario {
    private String nome;
    private int cpf;
    private int telefone;
    private int anoNascimento;
    private String endereco;
    private ArrayList<Cliente> clientesAtendidos;

    public Funcionario(String nome, int cpf, int telefone, int anoNascimento, String endereco, ArrayList<Cliente> clientesAtendidos) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.anoNascimento = anoNascimento;
        this.endereco = endereco;
        this.clientesAtendidos = clientesAtendidos;
        //this.clientesAtendidos = new ArrayList<>();
    }

    public void atenderCliente(Cliente cliente) {
        clientesAtendidos.add(cliente);
    }

    public void realizarServicos() {
        for (Cliente cliente : clientesAtendidos) {
            System.out.println("Funcionário " + nome + " está atendendo o cliente " + cliente.getNome() + ":");
            cliente.realizarServicos();
        }
    }



}
