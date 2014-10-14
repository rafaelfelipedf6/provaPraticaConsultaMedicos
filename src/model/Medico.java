package model;

public class Medico extends Usuario{
	
	private String registro;
	private String especialidade;
	
	public Medico(String nome, String registro) {
		super(nome);
		this.registro = registro;
	}
	public Medico() {
		super();
	}
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}
