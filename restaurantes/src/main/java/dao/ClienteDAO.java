/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.math.BigDecimal;
import mapeamentos.Clientes;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author willi
 */
public class ClienteDAO extends DAOGenerico<Clientes, BigDecimal>{
    public Clientes buscarCliente(Clientes usuario){
        Session s = this.getSession();
        Clientes user = null;
        
        try{
            s.beginTransaction();
            Query q = s.createQuery(" from Clientes where nomeCliente = :nomeCliente");
            q.setString("nomeCliente", usuario.getNomeCliente());
            user = findOne(q);
            s.close();
        }catch(HibernateException e){
            e.printStackTrace();
            s.close();
        }
        
        return user;
    }
        
     public boolean salvarUsuario(Clientes usuario) {
        Session s = this.getSession();
        try{
            s.beginTransaction();
            this.save(usuario);
            s.getTransaction().commit();
            return true;
        }catch(HibernateException e){
            s.getTransaction().rollback();
            System.out.println("HIBERNATE EXCEPTION: " + e);
            return false;
        }
    }
}
