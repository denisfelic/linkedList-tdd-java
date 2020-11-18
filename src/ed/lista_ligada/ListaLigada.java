package ed.lista_ligada;

public class ListaLigada {

	private int qtdElementos;
	private Celula primeiraCelula = null;
	private Celula ultmaCelula;

	/**
	 * Adiciona no começo da lista, como método "shift" do array.
	 * 
	 * @param elemento
	 */
	public void adicionaNoComeco(Object elemento) {
		Celula novaCelula = new Celula(elemento, this.primeiraCelula);
		this.primeiraCelula = novaCelula;

		// caso seja o primeiro elemento a ser adicionado, ele também será o último da
		// lista, afinal só tem 1 elemento no total.
		if (qtdElementos == 0) {
			this.ultmaCelula = novaCelula;
		}
		qtdElementos++;

	}

	public void adiciona(Object elemento) {
		if (qtdElementos == 0) {
			adicionaNoComeco(elemento);
		} else {
			Celula proximaCelula = null;
			Celula novaCelula = new Celula(elemento, proximaCelula);
			this.ultmaCelula.setProximoElemento(novaCelula);
			this.ultmaCelula = novaCelula;
			this.qtdElementos++;
		}
	}

	public boolean adiciona(int index, Object elemento) {
		if(!this.indiceValido(index)) {
			throw new IllegalArgumentException("Indice invalido");
		}
		
		if(index == 0) {
			this.adicionaNoComeco(elemento);
			return true;
		}
		Celula atual = this.buscaCelula(index - 1);
		Celula novaCelula = new Celula(elemento, atual.getProximoElemento());
		atual.setProximoElemento(novaCelula);
		qtdElementos++;
		return true;
	}

	public Object pega(int index) {
		if (!indiceValido(index)) {
			return null;
		}

		Celula celulaBuscada = buscaCelula(index);
		if( celulaBuscada != null);
			return celulaBuscada.getElemento();

	}

	private Celula buscaCelula(int index) {
		Celula atual = this.primeiraCelula;

		for (int i = 0; i < qtdElementos; i++) {
			if (index == i) {
				return atual;
			}
			atual = atual.getProximoElemento();
		}
		return null;
	}

	private boolean indiceValido(int index) {
		return index >= 0 && index < qtdElementos;
	}

	public void removeDoComeco() {
		if(this.qtdElementos == 0) {
			throw new IllegalArgumentException("Erro ao remover elemento \"0\", Lista vazia");
		}
		
		this.primeiraCelula = this.primeiraCelula.getProximoElemento();
		this.qtdElementos--;
		
		if(this.qtdElementos == 0) {
			this.ultmaCelula = null;
		}
		
	}
	
 
	public boolean remove(int index) {
		if(!indiceValido(index)) {
			return false;
		}
		
		if(index == 0) {
			this.removeDoComeco();
			return true;
		}
		
		Celula celulaParaRemover = this.buscaCelula(index - 1);
		// TODO
		return true;
	}

	public int tamanho() {
		return qtdElementos;
	}

	public boolean contem(Object elemento) {
		return false;
	}

	@Override
	public String toString() {
		if (qtdElementos == 0)
			return "[]";

		StringBuilder stringBuilder = new StringBuilder("[");
		Celula atual = this.primeiraCelula;

		for (int i = 0; i < qtdElementos; i++) {
			stringBuilder.append(atual.getElemento());
			stringBuilder.append(", ");
			atual = atual.getProximoElemento();
		}
		stringBuilder.append("]");
		String elementsToString = stringBuilder.toString();
		return elementsToString;
	}

}
