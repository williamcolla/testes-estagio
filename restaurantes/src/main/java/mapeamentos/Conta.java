package mapeamentos;
// Generated 25/07/2021 21:55:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Conta generated by hbm2java
 */
@Entity
@Table(name="conta"
    ,schema="public"
)
public class Conta implements java.io.Serializable {


     private int idConta;
     private Clientes clientes;
     private Produtos produtos;
     private BigDecimal totalConta;

    public Conta() {
    }

	
    public Conta(int idConta) {
        this.idConta = idConta;
    }
    public Conta(int idConta, Clientes clientes, Produtos produtos, BigDecimal totalConta) {
       this.idConta = idConta;
       this.clientes = clientes;
       this.produtos = produtos;
       this.totalConta = totalConta;
    }
   
     @Id 

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_conta", unique=true, nullable=false)
    public int getIdConta() {
        return this.idConta;
    }
    
    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cliente")
    public Clientes getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="produto")
    public Produtos getProdutos() {
        return this.produtos;
    }
    
    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    
    @Column(name="total_conta", precision=131089, scale=0)
    public BigDecimal getTotalConta() {
        return this.totalConta;
    }
    
    public void setTotalConta(BigDecimal totalConta) {
        this.totalConta = totalConta;
    }




}


