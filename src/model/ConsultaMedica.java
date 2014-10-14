package model;

public class ConsultaMedica {
	
	private Medico medico;
	private Paciente paciente;
	private String diagnostico;
	
	public ConsultaMedica(Paciente paciente) {
		super();
		this.paciente = paciente;
	}
	
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	
	
}
