public class PintarCabelo extends Servico{
    public PintarCabelo () {
        super("Pintar Cabelo",150.00,3);
    }

    @Override
    public void realizar() {
        System.out.println("Realizando pintura no cabelo.");
    }
}
