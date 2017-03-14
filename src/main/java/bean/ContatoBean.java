package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Contato;

@ManagedBean(name="contatoBean")
@SessionScoped
public class ContatoBean {
	private Contato contato = new Contato();
	
	@ManagedProperty(value="#{agendaBean}")
	AgendaBean agenda;
	private boolean edita;
	
	public boolean isEdita() {
		return edita;
	}

	public void setEdita(boolean edita) {
		this.edita = edita;
	}

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
		return "listar?redirect-facet=true";
	}
	
	public String salvar() {
		this.setEdita(false);
		this.contato = new Contato();
		return "listar?redirect-facet=true";
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public String editar(Contato contato){
		this.setEdita(true);
		this.contato = contato;		
		return "addcontato?redirect-facet=true";
	}
}
