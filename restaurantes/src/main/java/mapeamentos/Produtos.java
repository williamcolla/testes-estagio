package mapeamentos;
// Generated 25/07/2021 21:55:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Produtos generated by hbm2java
 */
@Entity
@Table(name="produtos"
    ,schema="public"
)
public class Produtos  implements java.io.Serializable {


     private int idProdutos;
     private String nomeProduto;
     private BigDecimal valorProduto;
     private Set contas = new HashSet(0);

    public Produtos() {
    }

	
    public Produtos(int idProdutos) {
        this.idProdutos = idProdutos;
    }
    public Produtos(int idProdutos, String nomeProduto, BigDecimal valorProduto, Set contas) {
       this.idProdutos = idProdutos;
       this.nomeProduto = nomeProduto;
       this.valorProduto = valorProduto;
       this.contas = contas;
    }
   
     @Id 

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_produtos", unique=true, nullable=false)
    public int getIdProdutos() {
        return this.idProdutos;
    }
    
    public void setIdProdutos(int idProdutos) {
        this.idProdutos = idProdutos;
    }

    
    @Column(name="nome_produto", length=30)
    public String getNomeProduto() {
        return this.nomeProduto;
    }
    
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    
    @Column(name="valor_produto", precision=131089, scale=0)
    public BigDecimal getValorProduto() {
        return this.valorProduto;
    }
    
    public void setValorProduto(BigDecimal valorProduto) {
        this.valorProduto = valorProduto;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="produtos")
    public Set getContas() {
        return this.contas;
    }
    
    public void setContas(Set contas) {
        this.contas = contas;
    }




}


