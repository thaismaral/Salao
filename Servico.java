abstract class Servico {
    protected String nome;
    protected double preco;
    protected float duracaoHora;

    protected Servico(String nome, double preco, float duracaoHora) {
        this.nome = nome;
        this.preco = preco;
        this.duracaoHora = duracaoHora;
    }
    protected float getDuracaoHora() {
        return duracaoHora;
    }
    protected String getNome() {
        return nome;
    }
    protected double getPreco() {
        return preco;
    }

    protected abstract void realizar();
}
