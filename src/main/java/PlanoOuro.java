public class PlanoOuro implements Plano{

    private Double preco = 50.00;

    public String assinar(){ return "Plano Ouro assinado com sucesso";}
    public String cancelar(){ return "Plano Ouro cancelado com sucesso";}

    public Double getPreco(){return this.preco;}
}
