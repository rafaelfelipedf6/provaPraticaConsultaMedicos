package controller;
import java.util.ArrayList;
import model.*;

public class ControleConsulta {
	ArrayList<Consulta> listaConsultas;
	
	public ControleConsulta(){
		listaConsultas = new ArrayList<Consulta>();
	}
	public void adicionar(Consulta umConsulta){
		
		listaConsultas.add(umConsulta);
		
	}
	public void remover(Consulta umConsulta){
		
		listaConsultas.remove(umConsulta);
	
	}
	public Consulta buscar(String umNome){
		
		for (Consulta umConsulta: listaConsultas){
			if (umConsulta.getNome().equalsIgnoreCase(umNome)){
				return umConsulta;
			}
		}
		return null;
	}
}	
