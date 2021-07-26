/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.math.BigDecimal;
import mapeamentos.Produtos;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author willi
 */
public class ProdutoDAO extends DAOGenerico<Produtos, BigDecimal>{
    public Produtos buscarProduto(Produtos prod){
        Session s = this.getSession();
        Produtos produto = null;
        
        try{
            s.beginTransaction();
            Query q = s.createQuery(" from Produtos where nomeProduto = :nomeProduto");
            q.setString("nomeProduto", prod.getNomeProduto());
            produto = findOne(q);
            s.close();
        }catch(HibernateException e){
            e.printStackTrace();
            s.close();
        }
        
        return produto;
    }
        
     public boolean salvarProduto(Produtos prod) {
        Session s = this.getSession();
        try{
            s.beginTransaction();
            this.save(prod);
            s.getTransaction().commit();
            return true;
        }catch(HibernateException e){
            s.getTransaction().rollback();
            System.out.println("HIBERNATE EXCEPTION: " + e);
            return false;
        }
    }
}
