/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import constantes.Constantes;
import hibernate.control.ModelController;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import model.Disciplina;
import model.Usuario;
import java.util.Random;
import javax.persistence.EntityManager;
import model.Duvida;
import model.Materia;
import model.Respondeu;
import org.hibernate.Query;

/**
 *
 * @author luan
 */
public class PrimeiraConexao {
    Constantes c = new Constantes();
    private final ModelController modelCtr = new ModelController();
    
    
    public void alimentaBanco() {
        modelCtr.deleteAll();
        
        for(int i = 0; i < 20; i++) {
        Usuario usr = new Usuario();
            String name = c.geraNome();
            String mail = c.geraEmail(name,c.geraDominio());
            usr.setNome(name);
            usr.setCdusuario(i);
            usr.setSenha(new Random().nextInt(400)+"snh@"+new Random().nextInt(400));
            usr.setEmail(mail);
            usr.setFase(String.valueOf(new Random().nextInt(9) + 1));
            //System.out.println(name +" "+usr.getEmail()+" "+usr.getSenha()+" "+usr.getFase());
            modelCtr.insert(usr);
            
            
            Disciplina calc = new Disciplina();
            if(i < Constantes.disciplinas.length) {
                calc.setCddisciplina(i);
                calc.setNome(Constantes.disciplinas[i]);
                modelCtr.insert(calc);
            }
            
            Materia mat = new Materia();
            if(i < Constantes.palavrasChave.length) {
                mat.setCdmateria(i);
                mat.setDisciplina(calc);
                mat.setNome(Constantes.palavrasChave[i]);
                modelCtr.insert(mat);
            }
            
            Duvida nova = new Duvida();
            if(i < Constantes.duvidas.length) {
                nova.setCdduvida(i);
                nova.setMateria(mat);
                nova.setUsuario(usr);
                nova.setConteudo(Constantes.duvidas[i]);
                nova.setData(c.getDataAleatoria());
                modelCtr.insert(nova);
            }
            
            Respondeu resp = new Respondeu();
            if(i < Constantes.respostas.length) {
                resp.setUsr(usr);
                resp.setDvd(nova);
                resp.setHra(c.getDataAleatoria());
                resp.setDvd(nova);
            }
        }
        
    }
    
    @SuppressWarnings("unchecked")
    public void print() {
	int cdUsuario = 0;
        
        System.out.println("\n-- Relação de Usuários por Id:\n");
        Usuario pac = (Usuario)modelCtr.getByCode(Usuario.class, cdUsuario);
        while(pac != null) {
                int duvidas = 0, codigoDuvida = 0;
                Duvida dv = (Duvida) modelCtr.getByCode(Duvida.class, codigoDuvida);
                while(dv != null) {
                    if(dv.getUsuario().getCdusuario() == pac.getCdusuario()) {
                        duvidas++;
                    }
                    codigoDuvida++;
                    
                    dv = (Duvida) modelCtr.getByCode(Duvida.class, codigoDuvida);
                }
        	System.out.println("Id: "+pac.getCdusuario()+" Nome: "+pac.getNome()+"      Numero de duvidas : "+duvidas);
		cdUsuario++;
                pac = (Usuario)modelCtr.getByCode(Usuario.class, cdUsuario);
        }
        
    }
    
    public void close() {
        modelCtr.close();
    }
    
    
    
    public static void main(String[] args) {
        java.util.logging.Logger.getLogger("hibernate").setLevel(Level.INFO);
        PrimeiraConexao con = new PrimeiraConexao();
        con.alimentaBanco();
        con.print();
        con.close();
    }
}
