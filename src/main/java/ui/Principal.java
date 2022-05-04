package ui;

import dao.RelogioDao;
import entidade.Relogio;

public class Principal {
	
	public static void main(String[] args) {
		Relogio r = new Relogio();
		r.setTipo("Digital");
		r.setHora(10);
		r.setMinuto(11);
		r.setSegundo(12);
		
		RelogioDao.salvar(r);
		
	}
	
}
