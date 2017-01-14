package model;
// Generated 01/11/2016 17:06:20 by Hibernate Tools 4.3.1



/**
 * AnexosId generated by hbm2java
 */
public class AnexosId  implements java.io.Serializable {


     private Integer cdanexo;
     private Integer cdduvida;

    public AnexosId() {
    }

    public AnexosId(Integer cdanexo, Integer cdduvida) {
       this.cdanexo = cdanexo;
       this.cdduvida = cdduvida;
    }
   
    public Integer getCdanexo() {
        return this.cdanexo;
    }
    
    public void setCdanexo(Integer cdanexo) {
        this.cdanexo = cdanexo;
    }
    public Integer getCdduvida() {
        return this.cdduvida;
    }
    
    public void setCdduvida(Integer cdduvida) {
        this.cdduvida = cdduvida;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AnexosId) ) return false;
		 AnexosId castOther = ( AnexosId ) other; 
         
		 return ( (this.getCdanexo()==castOther.getCdanexo()) || ( this.getCdanexo()!=null && castOther.getCdanexo()!=null && this.getCdanexo().equals(castOther.getCdanexo()) ) )
 && ( (this.getCdduvida()==castOther.getCdduvida()) || ( this.getCdduvida()!=null && castOther.getCdduvida()!=null && this.getCdduvida().equals(castOther.getCdduvida()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCdanexo() == null ? 0 : this.getCdanexo().hashCode() );
         result = 37 * result + ( getCdduvida() == null ? 0 : this.getCdduvida().hashCode() );
         return result;
   }   


}


