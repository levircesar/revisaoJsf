package entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Relogio {
	@Id
	@GeneratedValue
	private Integer id;
	private String tipo;
	private Integer hora;
	private Integer minuto;
	private Integer segundo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getHora() {
		return hora;
	}
	public void setHora(Integer hora) {
		this.hora = hora;
	}
	public Integer getMinuto() {
		return minuto;
	}
	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}
	public Integer getSegundo() {
		return segundo;
	}
	public void setSegundo(Integer segundo) {
		this.segundo = segundo;
	}
	
}
