public class Corte extends Servico{
    public Corte () {
        super("Corte de Cabelo",50.00,1);
    }

    @Override
    public void realizar() {
        System.out.println("Realizando corte de cabelo.");
    }
}
