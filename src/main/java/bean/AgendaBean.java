package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Agenda;
import model.Contato;

@ManagedBean(name="agendaBean")
@SessionScoped
public class AgendaBean {
	private Agenda agenda;
	
	List<Contato> contatos= new ArrayList<Contato>();
	
	
	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.agenda.setContatos(contatos);
	}

	public void remover(Contato contato) {
		System.out.println("Removendo o contato");
		this.contatos.remove(contato);
	}
	
	public void cadastrar(Contato contato){
		this.contatos.add(contato);
	}
	
}
