package controller;
import java.util.ArrayList;
import model.*;

public class ControleConsulta {
	ArrayList<ConsultaMedica> listaConsultas;
	
	public ControleConsulta(){
		listaConsultas = new ArrayList<ConsultaMedica>();
	}
	public void adicionar(ConsultaMedica umConsulta){
		
		listaConsultas.add(umConsulta);
		
	}
	public void remover(ConsultaMedica umConsulta){
		
		listaConsultas.remove(umConsulta);
	
	}
	public ConsultaMedica buscar(String rg){
		
		for (ConsultaMedica umConsulta: listaConsultas){
			if (umConsulta.getPaciente().getRg().equals(rg)){
				return umConsulta;
			}
		}
		return null;
	}
}	
