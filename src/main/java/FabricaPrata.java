public class FabricaPrata implements FabricaAbstrata{

    @Override
    public Plano createPlano(){
        return new PlanoPrata();
    }

    @Override
    public Beneficio createBeneficio(){
        return new BeneficioPrata();
    }
}
