/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import javax.enterprise.inject.Model;
import static java.lang.String.join;
import static java.util.Collections.nCopies;
import java.util.HashMap;
import java.util.Map;
import model.Valores;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author willi
 */
@Controller
public class ConverterController {

    @RequestMapping("converter")
    public String converter() {
        return "converter";
    }

    @RequestMapping("converterValores")
    public String converterValores(@ModelAttribute("Valores") Valores valor, Model model, RedirectAttributes redirectAttributes) {

        //model.addAttribute("romanos", valores.getRomanos());
        //model.addAttribute("arabicos", valores.getArabicos());
        int[] arabico = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romano = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int resultadoRomanos = 0;
        StringBuilder resultadoArabico = new StringBuilder();

        String romanos = valor.getRomanos();
        Integer arabicos = valor.getArabicos();

        if (valor.getEscolha() == true) {
            Map<Character, Integer> romano_arabico = new HashMap<Character, Integer>();
            romano_arabico.put('I', 1);
            romano_arabico.put('V', 5);
            romano_arabico.put('X', 10);
            romano_arabico.put('L', 50);
            romano_arabico.put('C', 100);
            romano_arabico.put('D', 500);
            romano_arabico.put('M', 1000);

            for (int i = 0; i < romanos.length(); i += 1) {
                if (i == 0 || romano_arabico.get(romanos.charAt(i)) <= romano_arabico.get(romanos.charAt(i - 1))) {
                    resultadoRomanos += romano_arabico.get(romanos.charAt(i));
                } else {
                    resultadoRomanos += romano_arabico.get(romanos.charAt(i)) - 2 * romano_arabico.get(romanos.charAt(i - 1));
                }
            }
            
            redirectAttributes.addFlashAttribute("resultadoRomanos", resultadoRomanos);
            
        } else if (valor.getEscolha() == false) {

            try {
                for (int i = 0; i < arabico.length; i++) {
                    int parteInteira = arabicos / arabico[i];
                    arabicos -= arabico[i] * parteInteira;
                    resultadoArabico.append(join("", nCopies(parteInteira, romano[i])));
                }
                
                redirectAttributes.addFlashAttribute("resultadoArabico", resultadoArabico);
                
            } catch (NullPointerException e) {
                String erro = "<div class='alert alert-danger alert-dismissible fade show' role='alert'><strong>Erro!</strong> Selecione uma das opções.<button type='button' class='close' data-dismiss='alert' aria-label='Close'><span aria-hidden='true'>&times;</span></button></div>";
                redirectAttributes.addFlashAttribute("erro", erro);
            }
        } else {
            String erro = "<div class='alert alert-danger alert-dismissible fade show' role='alert'><strong>Erro!</strong> Selecione uma das opções.<button type='button' class='close' data-dismiss='alert' aria-label='Close'><span aria-hidden='true'>&times;</span></button></div>";
            redirectAttributes.addFlashAttribute("erro", erro);
        }

        //return resultado.toString();
        System.out.println("\n\n@Ramano: " + romanos + " Decimal " + resultadoRomanos + " e \nDecimal: " + arabicos + " Romano " + resultadoArabico.toString());

        return "redirect:paginaInicial";

    }
}
