/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

/**
 *
 * @author Vahar
 */
import Cliente.vista.VistaPrincipalTemplate;
import javax.swing.SwingUtilities;

public class App {
    
  public static void main(String[] args) throws Exception {
    Runnable runApplication = new Runnable() {
      public void run() {
        VistaPrincipalTemplate iniciar = new VistaPrincipalTemplate();
        iniciar.getClass();
      }
    };
    SwingUtilities.invokeLater(runApplication);
  }
}
