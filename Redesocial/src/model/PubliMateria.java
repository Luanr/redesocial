package model;
// Generated 01/11/2016 17:06:20 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
/**
 * PubliMateria generated by hbm2java
 */
@Entity
@Table(name = "PubliMateria")
public class PubliMateria  implements java.io.Serializable {

     @ManyToOne
    @JoinColumn(name = "ipmd")
     private PubliMateriaId id;
    @ManyToOne
    @JoinColumn(name = "cdMateria")
     private Materia materia;
    @ManyToOne
    @JoinColumn(name = "cdpublicacao")
     private Publicacao publicacao;

    public PubliMateria() {
    }

	
    public PubliMateria(PubliMateriaId id) {
        this.id = id;
    }
    public PubliMateria(PubliMateriaId id, Materia materia, Publicacao publicacao) {
       this.id = id;
       this.materia = materia;
       this.publicacao = publicacao;
    }
   
    public PubliMateriaId getId() {
        return this.id;
    }
    
    public void setId(PubliMateriaId id) {
        this.id = id;
    }
    public Materia getMateria() {
        return this.materia;
    }
    
    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    public Publicacao getPublicacao() {
        return this.publicacao;
    }
    
    public void setPublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }




}


