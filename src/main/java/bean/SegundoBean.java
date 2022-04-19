package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class SegundoBean {
	private String nome;
	private int idade;
	private int resultado;
	
	public String salvar() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		setResultado(idade*2);
		System.out.println("Resultado vezes dois: " + resultado);
		return "cadastro";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
}
