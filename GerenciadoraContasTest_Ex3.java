package negocio;

import testesistemabancario.GerenciadoraContas;
import testesistemabancario.ContaCorrente;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GerenciadoraContasTest_Ex3 {
	
	@Test
	public void testTransfereValor() {

            //*************** montagem de cenario ******************
            
            //criando conta corrente
            ContaCorrente conta01 = new ContaCorrente(1, 200, true);
            ContaCorrente conta02 = new ContaCorrente(2, 0, true);
            
            //adicionando as contas criadas no array
             List<ContaCorrente> contasDoBanco = new ArrayList<>();
             contasDoBanco.add(conta01);
             contasDoBanco.add(conta02);
             
            //instanciando o objeto
            GerenciadoraContas gerContas = new GerenciadoraContas(contasDoBanco);
            
            //***************Execução do teste**************
            gerContas.transfereValor(1, 100, 2);
            
            //******************Verificação*****************
            assertThat(conta02.getSaldo(), is(100.0));
            assertThat(conta01.getSaldo(), is(100.0));
	}

}
