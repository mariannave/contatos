package model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	List<Contato> contatos;
	
	private Agenda() {
		this.contatos = new ArrayList<Contato>();
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
	public void adicionarContato(Contato contato) {
		this.contatos.add(contato);
	}

}
