package model;
// Generated 01/11/2016 17:06:20 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
/**
 * Materia generated by hbm2java
 */
@Entity
@Table(name = "Materia")
public class Materia  implements java.io.Serializable {

    @Id
    @Column(name="cdMateria", unique=true, nullable=false)
    private int cdmateria;
    
    @ManyToOne
    @JoinColumn(name = "cdDisciplina")
    private Disciplina disciplina;
    
    @Column(name="Nome")
    private String nome;
    
    
    //private Set<SegueMateriaId> segueMaterias = new HashSet<SegueMateriaId>();
    //private Set<PubliMateria> publiMaterias = new HashSet<PubliMateria>();
    //private Set duvidas = new LinkedList(Duvida);

    public Materia() {
    }

	
    public Materia(int cdmateria) {
        this.cdmateria = cdmateria;
    }
    public Materia(int cdmateria, Disciplina disciplina, String nome) {
       this.cdmateria = cdmateria;
       this.disciplina = disciplina;
       this.nome = nome;
      // this.segueMateria = segueMaterias;
     //  this.publiMaterias = publiMaterias;
      // this.duvidas = duvidas;
    }

     
    public int getCdmateria() {
        return this.cdmateria;
    }
    
    public void setCdmateria(int cdmateria) {
        this.cdmateria = cdmateria;
    }
    public Disciplina getDisciplina() {
        return this.disciplina;
    }
    
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
   /* public Set getSegueMaterias() {
        return this.segueMaterias;
    }
    
    public void setSegueMaterias(Set segueMaterias) {
        this.segueMaterias = segueMaterias;
    }
    public Set getPubliMaterias() {
        return this.publiMaterias;
    }
    
    public void setPubliMaterias(Set publiMaterias) {
        this.publiMaterias = publiMaterias;
    }
    public Set getDuvidas() {
        return this.duvidas;
    }
    
    public void setDuvidas(Set duvidas) {
        this.duvidas = duvidas;
    }*/




}


