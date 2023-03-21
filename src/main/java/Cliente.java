

public class Cliente {

    private Plano plano;
    private Beneficio beneficio;

    public Cliente(FabricaAbstrata fabricaAbstrata){
        this.plano = fabricaAbstrata.createPlano();
        this.beneficio = fabricaAbstrata.createBeneficio();
    }

    public String assinarPlano(){ return this.plano.assinar(); }

    public String cancelarPlano(){ return this.plano.cancelar(); }

    public Double getPrecoPlano(){ return this.plano.getPreco(); }

    public String getBeneficio(){ return this.beneficio.getBeneficio(); }

}
