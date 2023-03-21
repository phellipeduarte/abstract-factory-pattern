import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    void deveAssinarPlanoPrata(){
        FabricaAbstrata fabricaAbstrata = new FabricaPrata();
        Cliente cliente = new Cliente(fabricaAbstrata);
        assertEquals("Plano Prata assinado com sucesso", cliente.assinarPlano());
    }

    @Test
    void deveCancelarPlanoPrata(){
        FabricaAbstrata fabricaAbstrata = new FabricaPrata();
        Cliente cliente = new Cliente(fabricaAbstrata);
        assertEquals("Plano Prata cancelado com sucesso", cliente.cancelarPlano());
    }

    @Test
    void deveObterPrecoPlanoPrata(){
        FabricaAbstrata fabricaAbstrata = new FabricaPrata();
        Cliente cliente = new Cliente(fabricaAbstrata);
        assertEquals(25.00, cliente.getPrecoPlano());
    }

    @Test
    void deveAssinarPlanoOuro(){
        FabricaAbstrata fabricaAbstrata = new FabricaOuro();
        Cliente cliente = new Cliente(fabricaAbstrata);
        assertEquals("Plano Ouro assinado com sucesso", cliente.assinarPlano());
    }

    @Test
    void deveCancelarPlanoOuro(){
        FabricaAbstrata fabricaAbstrata = new FabricaOuro();
        Cliente cliente = new Cliente(fabricaAbstrata);
        assertEquals("Plano Ouro cancelado com sucesso", cliente.cancelarPlano());
    }

    @Test
    void deveObterPrecoPlanoOuro(){
        FabricaAbstrata fabricaAbstrata = new FabricaOuro();
        Cliente cliente = new Cliente(fabricaAbstrata);
        assertEquals(50.00, cliente.getPrecoPlano());
    }

    @Test
    void deveAssinarPlanoDiamante(){
        FabricaAbstrata fabricaAbstrata = new FabricaDiamante();
        Cliente cliente = new Cliente(fabricaAbstrata);
        assertEquals("Plano Diamante assinado com sucesso", cliente.assinarPlano());
    }

    @Test
    void deveCancelarPlanoDiamante(){
        FabricaAbstrata fabricaAbstrata = new FabricaDiamante();
        Cliente cliente = new Cliente(fabricaAbstrata);
        assertEquals("Plano Diamante cancelado com sucesso", cliente.cancelarPlano());
    }

    @Test
    void deveObterPrecoPlanoDiamante() {
        FabricaAbstrata fabricaAbstrata = new FabricaDiamante();
        Cliente cliente = new Cliente(fabricaAbstrata);
        assertEquals(100.00, cliente.getPrecoPlano());
    }

    @Test
    void deveObterBeneficioPrata(){
        FabricaAbstrata fabricaAbstrata = new FabricaPrata();
        Cliente cliente = new Cliente(fabricaAbstrata);
        assertEquals("No plano Prata, você pode visitar o parque de diversões uma vez no mês", cliente.getBeneficio());
    }

    @Test
    void deveObterBeneficioOuro(){
        FabricaAbstrata fabricaAbstrata = new FabricaOuro();
        Cliente cliente = new Cliente(fabricaAbstrata);
        assertEquals("No plano Ouro, você pode visitar o parque de diversões vez na semana", cliente.getBeneficio());
    }

    @Test
    void deveObterBeneficioDiamante(){
        FabricaAbstrata fabricaAbstrata = new FabricaDiamante();
        Cliente cliente = new Cliente(fabricaAbstrata);
        assertEquals("No plano Diamante, você pode visitar o parque de diversões três vezes na semana, podendo levar um amigo", cliente.getBeneficio());
    }
}
