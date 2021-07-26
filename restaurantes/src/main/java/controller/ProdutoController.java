/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProdutoDAO;
import javax.servlet.http.HttpServletRequest;
import mapeamentos.Produtos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author willi
 */

@Controller
public class ProdutoController {
    
    @RequestMapping("cadastrar-produtos")
    public String retornaCadastro(Model model) {
        model.addAttribute("Produtos", new Produtos());
        return "cadastrar-produtos";
    }
    
    @RequestMapping("salvarCliente")
    public String salvarUsuario(Model model, @ModelAttribute("Produtos") Produtos prod, BindingResult result, HttpServletRequest request, RedirectAttributes redirectAttributes) {
        ProdutoDAO prodDAO = new ProdutoDAO();
        
        if (prodDAO.salvarProduto(prod)) {
            System.out.println("Cadastro efetuado com sucesso!");
            String status = "<div class='alert alert-success alert-dismissible fade show' role='alert'><strong>Sucesso!</strong> Faça o seu login agora.<button type='button' class='close' data-dismiss='alert' aria-label='Close'><span aria-hidden='true'>&times;</span></button></div>";
            redirectAttributes.addFlashAttribute("status", status);
            return "redirect:/cadastrar-usuario";
        } else {
            System.out.println("Cadastro não efetuado!");
            String erro = "<div class='alert alert-success alert-dismissible fade show' role='alert'><strong>Erro!</strong> Não foi possível realizar o login.<button type='button' class='close' data-dismiss='alert' aria-label='Close'><span aria-hidden='true'>&times;</span></button></div>";
            redirectAttributes.addFlashAttribute("erro", erro);
            return "redirect:/cadastrar-usuario";
        }
    }
    
}
