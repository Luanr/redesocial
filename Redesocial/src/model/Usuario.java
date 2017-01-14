package model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/* Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario")
public class Usuario  implements java.io.Serializable {

    @Id
    @Column(name ="cdusuario")
     private Integer cdusuario;
    
    @Column(name = "nome")
     private String nome;
    
    @Column(name = "senha")
     private String senha;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "fase")
    private String fase;
     
    //@Column(name = "duvidas")   
    // private Set<Duvida> duvidas = new HashSet<Duvida>();
    
    /*
    @Column(name = "segueMaterias")
     private Set segueMaterias = new HashSet(0);
     @Column(name = "publicacaos")
     private Set publicacaos = new HashSet(0);
*/
     public Usuario() {}

     public Usuario(int cdusuario, String nome, String senha, String email, String fase, Set duvidas, Set segueMaterias, Set publicacaos) {
       this.setCdusuario(cdusuario);
       this.setNome(nome);
       this.setSenha(senha);
       this.setEmail(email);
       this.setFase(fase);
       //this.setDuvidas(duvidas);
       //this.setSegueMaterias(segueMaterias);
       //this.setPublicacaos (publicacaos);
    }
      public Usuario(String nome, String senha, String email, String fase, Set duvidas, Set segueMaterias, Set publicacaos) {
     
       this.setNome(nome);
       this.setSenha(senha);
       this.setEmail(email);
       this.setFase(fase);
       //this.setDuvidas(duvidas);
     //  this.setSegueMaterias(segueMaterias);
      // this.setPublicacaos (publicacaos);
    }


  
   
    public int getCdusuario() {
        return cdusuario;
    }
    
    public void setCdusuario(int cdusuario) {
        this.cdusuario = cdusuario;
    }
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFase() {
        return fase;
    }
    
    public void setFase(String fase) {
        this.fase = fase;
    }
    
    //public Set getDuvidas() {
    //    return duvidas;
    //}
    
    //public void setDuvidas(Set<Duvida> duvidas) {
    //    this.duvidas = duvidas;
    //}
    /*
    public Set getSegueMaterias() {
        return segueMaterias;
    }
    
    public void setSegueMaterias(Set segueMaterias) {
        this.segueMaterias = segueMaterias;
    }
    public Set getPublicacaos() {
        return publicacaos;
    }
    
    public void setPublicacaos(Set publicacaos) {
        this.publicacaos = publicacaos;
    }
*/


    



}


