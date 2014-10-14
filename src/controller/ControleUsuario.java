package controller;
import java.util.ArrayList;
import model.*;

public class ControleUsuario {
	ArrayList<Usuario> listaUsuarios;
	
	public ControleUsuario(){
		listaUsuarios = new ArrayList<Usuario>();
	}
	public void adicionar(Usuario umUsuario){
		
		listaUsuarios.add(umUsuario);
		
	}
	public void remover(Usuario umUsuario){
		
		listaUsuarios.remove(umUsuario);
	
	}
	public Usuario buscar(String umNome){
		
		for (Usuario umUsuario: listaUsuarios){
			if (umUsuario.getNome().equalsIgnoreCase(umNome)){
				return umUsuario;
			}
		}
		return null;
	}
}	