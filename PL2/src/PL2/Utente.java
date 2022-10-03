package PL2;

public class Utente 
{
	private String nome;
	private String genero;
	private int idade;
	private float altura;
	private int peso;
	private float imc;
	public Utente(String nome, String genero, int idade, float altura, int peso) 
	{
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		imc = 0;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "Utente: \nNome: " + nome + "\nGénero: " + genero + "\nIdade: " + idade + " anos\nAltura: " + altura + "m\nPeso: "
				+ peso+ "kg\nIMC: "+ imc;
	}
}