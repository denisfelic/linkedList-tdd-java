package ed.lista;

import java.util.Arrays;

public class Lista {

	private Aluno[] lista;
	private int quantidadeDeAlunosNaLista;

	public Lista() {
		this.lista = new Aluno[10];
	}

	public Aluno pega(int index) {
		return this.lista[index];
	}

	public boolean remove(int indexParaRemover) {
		int indiceAlunoParaRemover = this.verificaRetornaPosicaoObjetoNaLista(indexParaRemover);
		if(indiceAlunoParaRemover == -1) {
			return false;
		}
		
		removerDaLista(indiceAlunoParaRemover);
		return true;
	}


	public boolean remove(Aluno alunoParaRemover) {
		int indiceAlunoParaRemover = this.verificaRetornaPosicaoObjetoNaLista(alunoParaRemover);
		if(indiceAlunoParaRemover == -1) {
			return false;
		}
		removerDaLista(indiceAlunoParaRemover);
		return true;
		
		
	}

	private void removerDaLista(int indiceAlunoParaRemover) {
		Object conteudoDaProximaPosicaoNaLista = this.lista[indiceAlunoParaRemover + 1];
		// não precisa ordenar, pois já está no ultimo index da lista
		if(conteudoDaProximaPosicaoNaLista == null) {
			 this.lista[indiceAlunoParaRemover] = null;
			 removeUmaDaQuantidadeTotalDaLista();
		}
		
		this.lista[indiceAlunoParaRemover] = null;
		ordenarListaApartirDoIndice(indiceAlunoParaRemover);
		removeUmaDaQuantidadeTotalDaLista();

	}

	private void ordenarListaApartirDoIndice(int indiceAlunoParaRemover) {
		for(int i = indiceAlunoParaRemover; i < this.quantidadeDeAlunosNaLista - 1; i++) {
			Object proxPosicao = this.lista[i+1];
			if(proxPosicao != null) {
				lista[i] = lista[i+1];
			}
		}
		lista[quantidadeDeAlunosNaLista -1 ] = null;
	}

	private void removeUmaDaQuantidadeTotalDaLista() {
		this.quantidadeDeAlunosNaLista--;
	}
	
	
	public boolean contem(Aluno aluno) {
		if(verificaRetornaPosicaoObjetoNaLista(aluno) == -1) {
			return false;
		}
		return true;
	}

	private int verificaRetornaPosicaoObjetoNaLista(Aluno aluno) {
		for (int i = 0; i < this.tamanho() - 1; i++) {
				if(this.lista[i].equals(aluno)) {
					int posicaoOjbeto = i;
					return posicaoOjbeto;
				}
		}
		return -1;
	}
	
	private int verificaRetornaPosicaoObjetoNaLista(int indexAluno) {
		if(lista[indexAluno] == null) {
			return -1;
		}
		return indexAluno;
	}

	public void adiciona(Aluno aluno) {
		this.lista[quantidadeDeAlunosNaLista] = aluno;
		adicionaUmDaQuantidadeDeAlunosNaLista();
	}

	private void adicionaUmDaQuantidadeDeAlunosNaLista() {
		quantidadeDeAlunosNaLista++;
	}

	public int tamanho() {
		return this.quantidadeDeAlunosNaLista;
	}

	

	public void adiciona(Aluno a10, int indexParaAdicionar) {
		// verificar se index é valido
		boolean indexValido = verificaIndiceValido(indexParaAdicionar);
		if(!indexValido) {
			throw new IllegalArgumentException("Index invalido.");
		}
		
		liberarPosicaoArray(indexParaAdicionar);
		this.lista[indexParaAdicionar] = a10;
		adicionaUmDaQuantidadeDeAlunosNaLista();
		
	}

	private void liberarPosicaoArray(int indexParaAdicionar) {
		// Joga items para a direito do array, e libera um espaço no array
		for (int i = this.quantidadeDeAlunosNaLista; i >=  indexParaAdicionar; i--) {
			this.lista[i+1] = this.lista[i];
		}
		this.lista[indexParaAdicionar] = null;
	}

	private boolean verificaIndiceValido(int indexParaAdicionar) {
		return indexParaAdicionar >= 0 && indexParaAdicionar < quantidadeDeAlunosNaLista;
	}
	
	 
		@Override
		public String toString() {
			return Arrays.toString(lista);
		}
}
