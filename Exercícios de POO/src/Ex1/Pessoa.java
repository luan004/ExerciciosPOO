package Ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
	
	private String nome;
	private int anoNasc;
	private double altura;
	
	// Nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	// Data de Nascimento
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	public int getAnoNasc() {
		return this.anoNasc;
	}
	
	// Altura
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return this.altura;
	}
	
	
	
	// Calcular idade
	public double calcIdade(int anoNasc) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        
        
		return Double.parseDouble(sdf.format(date)) - anoNasc;
	}
	
	
	// Imprimir Informações
	public void imprimirDadosPessoa() {
		System.out.println(
				  "\nNome: " + this.nome
				+ "\nAno de Nascimento: " + this.anoNasc
				+ "\nIdade: " + calcIdade(this.anoNasc)
				+ "\nAltura: " + this.altura
				);
	}

}
