public class Cliente {
    private String nome;
    private int telefone;
    private String horario;
    private ArrayList<Servico> servicosContratados;

    public Cliente(String nome, int telefone, String horario) {
        this.nome = nome;
        this.telefone = telefone;
        this.horario = horario;

    }
    public void adicionarServico(Servico servico) {
        servicosContratados.add(servico);
    }

    public void realizarServicos() {
        for (Servico servico : servicosContratados) {
            servico.realizar();
        }
    }
    public void desmarcarServico (String hora,Servico servico){
        this.horario = hora;
        servicosContratados.remove(servico);
        System.out.printf("Serviço desmarcado");
    }
















    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
