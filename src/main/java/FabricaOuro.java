public class FabricaOuro implements FabricaAbstrata{


    @Override
    public Plano createPlano() {
        return new PlanoOuro();
    }

    @Override
    public Beneficio createBeneficio() {
        return new BeneficioOuro();
    }
}
