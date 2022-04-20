package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import entidade.Pincel;

@ManagedBean
//@RequestScoped
//@ViewScoped
//@SessionScoped
@ApplicationScoped
public class PincelBean {
	
	private Pincel pincel = new Pincel();
	
	private List<Pincel> lista = new ArrayList<Pincel>();
	
	public String salvar() {
		lista.add(pincel);
		pincel = new Pincel();
		return null;
	}

	public Pincel getPincel() {
		return pincel;
	}

	public void setPincel(Pincel pincel) {
		this.pincel = pincel;
	}

	public List<Pincel> getLista() {
		return lista;
	}

	public void setLista(List<Pincel> lista) {
		this.lista = lista;
	}
	
	
}
