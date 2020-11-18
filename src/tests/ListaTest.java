package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import ed.lista.Aluno;
import ed.lista.Lista;

public class ListaTest {
	
	@Test
	public void deveAdicionarUmObjetoNoComecoDaLista() {
		
		Aluno aluno = new Aluno("Denis");	
		Lista lista = new Lista();
		int tamanhoEsperadoLista = 1;
		
		lista.adiciona(aluno);
		Aluno objetoRetornado = lista.pega(0);
		int tamanhoRetornado = lista.tamanho();
		
		assertEquals(aluno, objetoRetornado);
		assertEquals(tamanhoRetornado, tamanhoEsperadoLista);
	}
	
	@Test
	public void deveAdicionarTresObjetosNaLista() {
		Aluno aluno1 = new Aluno("a1");
		Aluno aluno2 = new Aluno("a2");
		Aluno aluno3 = new Aluno("a3");
		int quantidadeEsperadaDeObjetos = 3;
		Lista lista = new Lista();
		
		lista.adiciona(aluno1);
		lista.adiciona(aluno2);
		lista.adiciona(aluno3);
		int quantidadeDeObjetosRetornados = lista.tamanho();
		
		assertEquals(quantidadeDeObjetosRetornados, lista.tamanho());
		assertEquals(aluno1, lista.pega(0));
		assertEquals(aluno2, lista.pega(1));
		assertEquals(aluno3, lista.pega(2));
 		
	}
	
	@Test
	public void deveRemoverUmObjetoDaListaComBaseNoObjetoPassadoPorParametro() {
		Aluno aluno1 = new Aluno("a1");
		Aluno aluno2 = new Aluno("a2");
		Aluno aluno3 = new Aluno("a3");
		Aluno aluno4 = new Aluno("a4");
		Aluno aluno5 = new Aluno("a5");
		Lista lista = new Lista();
		
		lista.adiciona(aluno1);
		lista.adiciona(aluno2);
		lista.adiciona(aluno3);
		lista.adiciona(aluno4);
		lista.adiciona(aluno5);
		lista.remove(aluno2);
 
 
		assertEquals(4, lista.tamanho());
		assertEquals(aluno1, lista.pega(0));
		assertEquals(aluno3, lista.pega(1));
		assertEquals(aluno4, lista.pega(2));
		assertEquals(aluno5, lista.pega(3));
		assertEquals(null, lista.pega(4));
	}
	
	@Test
	public void deveRemoverUmObjetoDaListaComBaseNoIndicePassadoPorParametro() {
		Aluno aluno1 = new Aluno("a1");
		Aluno aluno2 = new Aluno("a2");
		Aluno aluno3 = new Aluno("a3");
		Aluno aluno4 = new Aluno("a4");
		Aluno aluno5 = new Aluno("a5");
		Lista lista = new Lista();
		
		lista.adiciona(aluno1);
		lista.adiciona(aluno2);
		lista.adiciona(aluno3);
		lista.adiciona(aluno4);
		lista.adiciona(aluno5);
		lista.remove(1);
 
 
		assertEquals(4, lista.tamanho());
		assertEquals(aluno1, lista.pega(0));
		assertEquals(aluno3, lista.pega(1));
		assertEquals(aluno4, lista.pega(2));
		assertEquals(aluno5, lista.pega(3));
		assertEquals(null, lista.pega(4));
	}
	
	@Test
	public void deveRetornarUmAlunoQueEstejaContidoNaLista() {
		
		Aluno aluno1 = new Aluno("a1");
		Aluno aluno2 = new Aluno("a2");
		Aluno aluno3 = new Aluno("a3");
		int quantidadeEsperadaDeObjetos = 3;
		Lista lista = new Lista();
		Aluno alunoBuscado = aluno2;
		
		lista.adiciona(aluno1);
		lista.adiciona(aluno2);
		lista.adiciona(aluno3);
 		int quantidadeDeObjetosRetornados = lista.tamanho();


 		assertEquals(quantidadeDeObjetosRetornados, lista.tamanho());
		assertEquals(true, lista.contem(alunoBuscado));
		assertEquals(aluno1, lista.pega(0));
		assertEquals(aluno2, lista.pega(1));
		assertEquals(aluno3, lista.pega(2));
	}
	
	@Test
	public void deveAdicionarUmElementoEmUmaPosicaoValidaNaLista() {
		Aluno a1 = new Aluno("a1");
		Aluno a2 = new Aluno("a2");
		Aluno a3 = new Aluno("a3");
		Aluno a4 = new Aluno("a4");
		Aluno a5 = new Aluno("a5");

		Lista lista = new Lista();
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		lista.adiciona(a4);
		lista.adiciona(a5);

		
		Aluno a10 = new Aluno("A10");
		lista.adiciona( a10, 2);
		System.out.println(lista);
		
		assertEquals(6, lista.tamanho());
		assertEquals(a1, lista.pega(0));
		assertEquals(a2, lista.pega(1));
		assertEquals(a10, lista.pega(2));
		assertEquals(a3, lista.pega(3));
		assertEquals(a4, lista.pega(4));
		assertEquals(a5, lista.pega(5));
	}

}







