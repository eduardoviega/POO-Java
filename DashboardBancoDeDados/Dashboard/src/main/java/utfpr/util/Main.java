/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.util;

import utfpr.banco.Banco;
import utfpr.gui.NewJFrame;

/**
 *
 * @author evand
 */
public class Main {
    public static void main(String[] args) {
        DataProvider provider = new DataProvider();
        Banco banco = provider.criarBanco("UTFPR");
      
    }
   
    
    
}
