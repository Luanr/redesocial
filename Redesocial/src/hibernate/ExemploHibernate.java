package hibernate;

import constantes.Constantes;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import hibernate.control.ModelController;
import hibernate.control.ResultSetController;
import model.Disciplina;
import model.Duvida;
import model.Materia;
import model.Usuario;

public class ExemploHibernate {

	private ModelController modelCtr = new ModelController();

	public void close() {
		modelCtr.close();
	}

	public void clean() {
		modelCtr.deleteAll();
	}

	public void inserts() {
                Constantes c = new Constantes();
		Usuario pac1 = new Usuario();
                pac1.setCdusuario(1);
                pac1.setNome("Matheus loko maxado");
                pac1.setEmail("Matheusmaxado@gg.com");
                pac1.setFase("10");
                pac1.setSenha("senh@@@");
                modelCtr.insert(pac1);
                
                Disciplina alg = new Disciplina();
                alg.setCddisciplina(1);
                alg.setNome("Algebra");
                modelCtr.insert(alg);
                
                Materia mt =  new Materia();
                mt.setCdmateria(1);
                mt.setDisciplina(alg);
                mt.setNome("g.a");
                modelCtr.insert(mt);
                
                Duvida du = new Duvida();
                du.setCdduvida(1);
                du.setMateria(mt);
                du.setUsuario(pac1);
                du.setConteudo("BBSBSBSBBSBSBSBBS");
                du.setData(c.getDataAleatoria());
                
                modelCtr.insert(du);
                
		System.out.println("Inserções realizazadas com sucesso!!!");

	}

	@SuppressWarnings("unchecked")
	public void print() {
		int idPaciente = 43;
		//Alterar a chamada em função do último valor da sequence
		
		
	}

	public static void main(String[] args) {
		java.util.logging.Logger.getLogger("hibernate").setLevel(Level.INFO);
		ExemploHibernate ex = new ExemploHibernate();
		
                Constantes aleat = new Constantes();
                ex.clean();
		ex.inserts();
		ex.print();
		ex.close();
	}

}