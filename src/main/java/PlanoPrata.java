public class PlanoPrata implements Plano{

    private Double preco = 25.00;

    public String assinar(){ return "Plano Prata assinado com sucesso";}
    public String cancelar(){ return "Plano Prata cancelado com sucesso";}

    public Double getPreco(){return this.preco;}
}
