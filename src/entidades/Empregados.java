package entidades;

public class Empregados implements Comparable<Empregados>{

	private String sNome;
	private Double dSalario;

	public Empregados(String sNome, Double dSalario) {
		this.sNome = sNome;
		this.dSalario = dSalario;
	}
	
	public String getsNome() {
		return sNome;
	}
	public void setsNome(String sNome) {
		this.sNome = sNome;
	}
	public Double getdSalario() {
		return dSalario;
	}
	public void setdSalario(Double dSalario) {
		this.dSalario = dSalario;
	}
	@Override
	public int compareTo (Empregados outro){// Compara para ordenar Menor para Maior
//		return sNome.compareTo(outro.getsNome());
		return dSalario.compareTo(outro.getdSalario()); // Decrescente coloca o -dSalario or sNome
	}
}
