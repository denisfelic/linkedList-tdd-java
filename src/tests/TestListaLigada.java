package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import ed.lista.Aluno;
import ed.lista_ligada.ListaLigada;

public class TestListaLigada {

	@Test
	public void deveAdicionarElementosNoComecoDaLista() {
		Aluno a1 = new Aluno("a1");
		Aluno a2 = new Aluno("a2");
		Aluno a3 = new Aluno("a3");
		Aluno a4 = new Aluno("a4");

		ListaLigada listaLigada = new ListaLigada();

		listaLigada.adicionaNoComeco(a1);
		listaLigada.adicionaNoComeco(a2);
		listaLigada.adicionaNoComeco(a3);
		listaLigada.adicionaNoComeco(a4);

		assertEquals(4, listaLigada.tamanho());
		assertEquals(a1, listaLigada.pega(3));
		assertEquals(a2, listaLigada.pega(2));
		assertEquals(a3, listaLigada.pega(1));
		assertEquals(a4, listaLigada.pega(0));

	}

	@Test
	public void deveAdicionarElementosNoFimDaLista() {

		Aluno a1 = new Aluno("a1");
		Aluno a2 = new Aluno("a2");
		Aluno a3 = new Aluno("a3");
		Aluno a4 = new Aluno("a4");

		ListaLigada listaLigada = new ListaLigada();

		listaLigada.adiciona(a1);
		listaLigada.adiciona(a2);
		listaLigada.adiciona(a3);
		listaLigada.adiciona(a4);

		assertEquals(4, listaLigada.tamanho());
		assertEquals(a1, listaLigada.pega(0));
		assertEquals(a2, listaLigada.pega(1));
		assertEquals(a3, listaLigada.pega(2));
		assertEquals(a4, listaLigada.pega(3));
	}

	@Test
	public void deveRetornarElementoComBaseNoIndice() {
		Aluno a1 = new Aluno("a1");
		Aluno a2 = new Aluno("a2");
		Aluno a3 = new Aluno("a3");
		Aluno a4 = new Aluno("a4");

		ListaLigada listaLigada = new ListaLigada();
		listaLigada.adicionaNoComeco(a1);
		listaLigada.adicionaNoComeco(a2);
		listaLigada.adicionaNoComeco(a3);
		listaLigada.adicionaNoComeco(a4);

		assertEquals(4, listaLigada.tamanho());
		assertEquals(a4, listaLigada.pega(0));
		assertEquals(a3, listaLigada.pega(1));
		assertEquals(a2, listaLigada.pega(2));
		assertEquals(a1, listaLigada.pega(3));

	}

	@Test
	public void deveAdicionarTantoNoComecoComoNoFimDaLista() {
		Aluno a1 = new Aluno("a1");
		Aluno a2 = new Aluno("a2");
		Aluno a3 = new Aluno("a3");
		Aluno a4 = new Aluno("a4");

		ListaLigada listaLigada = new ListaLigada();
		listaLigada.adicionaNoComeco(a1);
		listaLigada.adicionaNoComeco(a2);
		listaLigada.adicionaNoComeco(a3);
		listaLigada.adiciona(a4);

		assertEquals(4, listaLigada.tamanho());
		assertEquals(a3, listaLigada.pega(0));
		assertEquals(a2, listaLigada.pega(1));
		assertEquals(a1, listaLigada.pega(2));
		assertEquals(a4, listaLigada.pega(3));
	}

	@Test
	public void deveAdicionarElementoNoMeioDaLista() {
		Aluno a1 = new Aluno("a1");
		Aluno a2 = new Aluno("a2");
		Aluno a3 = new Aluno("a3");
		Aluno a4 = new Aluno("a4");
		Aluno a10 = new Aluno("a10");

		ListaLigada listaLigada = new ListaLigada();
		listaLigada.adiciona(a1);
		listaLigada.adiciona(a2);
		listaLigada.adiciona(a3);
		listaLigada.adiciona(a4);
		listaLigada.adiciona(0, a10);

		assertEquals(5, listaLigada.tamanho());
		assertEquals(a10, listaLigada.pega(0));
		assertEquals(a1, listaLigada.pega(1));
		assertEquals(a2, listaLigada.pega(2));
		assertEquals(a3, listaLigada.pega(3));
		assertEquals(a4, listaLigada.pega(4));
	}

	@Test
	public void deveRemoverUmItemDoComecoDaLista() {
		Aluno a1 = new Aluno("a1");
		Aluno a2 = new Aluno("a2");
		Aluno a3 = new Aluno("a3");
		Aluno a4 = new Aluno("a4");

		ListaLigada listaLigada = new ListaLigada();
		listaLigada.adiciona(a1);
		listaLigada.adiciona(a2);
		listaLigada.adiciona(a3);
		listaLigada.adiciona(a4);
		listaLigada.removeDoComeco();
		

		assertEquals(3, listaLigada.tamanho());
		assertEquals(a2, listaLigada.pega(0));
		assertEquals(a3, listaLigada.pega(1));
		assertEquals(a4, listaLigada.pega(2));
	}
	
	@Test
	public void deveRemoverUltimoItemDaLista() {
		Aluno a1 = new Aluno("a1");
		Aluno a2 = new Aluno("a2");
		Aluno a3 = new Aluno("a3");
		Aluno a4 = new Aluno("a4");

		ListaLigada listaLigada = new ListaLigada();
		listaLigada.adiciona(a1);
		listaLigada.adiciona(a2);
		listaLigada.adiciona(a3);
		listaLigada.adiciona(a4);
		listaLigada.remove(3);
		System.out.println(listaLigada);

		assertEquals(3, listaLigada.tamanho());
		assertEquals(a1, listaLigada.pega(0));
		assertEquals(a2, listaLigada.pega(1));
		assertEquals(a3, listaLigada.pega(2));
	}
}
