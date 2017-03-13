package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Contato;

@ManagedBean(name="contatoBean")
@SessionScoped
public class ContatoBean {
	Contato contato = new Contato();
	
	@ManagedProperty(value="#{agendaBean}")
	AgendaBean agenda;
	
	public ContatoBean(){}
	
	public void setAgenda(AgendaBean bean){
		this.agenda = bean;
	}
	
	public AgendaBean getAgenda() {
		return agenda;
	}
	
	public String cadastrar() {
		
		this.agenda.cadastrar(this.getContato());
		this.setContato(new Contato());
		
		System.out.println("Cadastrou usuario");
		
		return "listar?redirect-facet=true";
}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public String editar(Contato contato){

		System.out.println("Editando contato");
		
		return "addcontato?redirect-facet=true";
	}
}
