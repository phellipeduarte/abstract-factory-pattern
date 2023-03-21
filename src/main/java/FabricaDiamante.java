public class FabricaDiamante implements FabricaAbstrata{

    @Override
    public Plano createPlano() {
        return new PlanoDiamante();
    }

    @Override
    public Beneficio createBeneficio() {
        return new BeneficioDiamante();
    }
}
