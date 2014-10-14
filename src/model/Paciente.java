package model;

public class Paciente extends Usuario {
	
	private String planoSaude;
	private String rg;
	private String idade;
	private String sintomas;
	
	public Paciente(String nome, String rg) {
		super(nome);
		this.rg = rg;
	}
	public Paciente() {
		super();
	}
	
	public String getPlanoSaude() {
		return planoSaude;
	}
	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg){
		this.rg = rg;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getSintomas() {
		return sintomas;
	}
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
}
