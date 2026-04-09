package entities;

public class Atleta implements Comparable<Atleta>{
	
	private String nome;
	private Integer idade;
	private Double pontuacao;
	
	public Atleta(String nome, Integer idade, Double pontuacao) {
		this.nome = nome;
		this.idade = idade;
		this.pontuacao = pontuacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Double pontuacao) {
		this.pontuacao = pontuacao;
	}

	@Override
	public int compareTo(Atleta o) {
		return this.nome.compareTo(o.getNome());
	}

	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", idade=" + idade + ", pontuacao=" + pontuacao + "]";
	}
	
	
	
}
