package utils;

public class Pilha<T> {

	private static final int TAM_DEFAULT = 100;
	private int topoPilha;
	private T e[];

	public Pilha(int tamanho) { // construtor 1
		this.e = (T[]) new Object[tamanho];
		this.topoPilha = -1;
	}

	public Pilha() { // construtor 2
		this(TAM_DEFAULT);
	}

	// Verifica se a pilha
	// está vazia
	public boolean isEmpty() {
		return this.topoPilha == -1;
	}

	// Verifica se a pilha está
	// cheia
	public boolean isFull() {
		return this.topoPilha == this.e.length - 1;
	}

	// insere um elemento e
	// no topo da pilha
	public void push(T e) throws Exception {
		if (!this.isFull())
			this.e[++this.topoPilha] = e;
		else
			throw new Exception("overflow - Estourode Pilha");
	}

	// remove um elemento
	// do topo da pilha
	public T pop() throws Exception{
		if (! this.isEmpty( ))
			return this.e[this.topoPilha--];
		else{
			throw new Exception( "underflow - Esvaziamento de Pilha");
		}
	}
	
	//Retorna o elemento que está no topo da pilha
	public T topo() throws Exception{
		if ( ! this.isEmpty( )) {
			return this.e[this.topoPilha];
		}
		else{
			throw new Exception("Underlow - Esvaziamento de Pilha");
		}
	}
	
	// obtém o total de elementos armazenados na Pilha
	public int sizeElements() {
		return topoPilha+1;
	}
	
	

}
