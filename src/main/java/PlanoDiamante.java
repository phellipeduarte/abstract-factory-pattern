public class PlanoDiamante implements Plano{

    private Double preco = 100.00;

    public String assinar(){ return "Plano Diamante assinado com sucesso";}
    public String cancelar(){ return "Plano Diamante cancelado com sucesso";}

    public Double getPreco(){return this.preco;}
}
