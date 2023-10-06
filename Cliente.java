public class Cliente {
    private String nome;
    private int telefone;
    private String servico;
    private String horario;

    private String marcarHorario(String hora){
        this.horario = horario;
        return
    }

    private String desmarcarHorario(String hora){
        return
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

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getHorario() {
        return horario;
    }

    public Cliente(String nome, int telefone, String servico, String horario) {
        this.nome = nome;
        this.telefone = telefone;
        this.servico = servico;
        this.horario = horario;
    }
}
