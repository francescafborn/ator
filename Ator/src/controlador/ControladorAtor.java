/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.AtorDao;
import javax.swing.JOptionPane;
import modelo.Ator;
import tela.manutencao.Manutencao_ator;

/**
 *
 * @author Administrador
 */
public class ControladorAtor {

    public static void inserir(Manutencao_ator man){
        Ator objeto = new Ator();
        objeto.setSigla(man.jtfNome_artistico.getText());
        objeto.setNome(man.jtfNome_real.getText());
        
        boolean resultado = AtorDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        } //To change body of generated methods, choose Tools | Templates.
    }
    
}
