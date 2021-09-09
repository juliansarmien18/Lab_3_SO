/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente.vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;

import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

public class VistaPrincipalTemplate extends JFrame {
  private static final long serialVersionUID = 1L;

  // Declaración Objetos Gráficos
  private JPanel pUno, pDos, pTres, pCuatro;
  private JLabel lTituloApp, lEslogan, lTituloLogin, lNotificaciones;
  private JLabel lFondo, lSvg1, lLogo, lUsuario, lClave, lFacebook, lTwitter, lYoutube;
  private JTextField tNombreUsuario;
  private JPasswordField tClaveUsuario;
  private JComboBox<String> cbTipoUsuario;
  private JButton bEntrar, bCerrar, bRegistrarse, bOpcion1, bOpcion2, bOpcion3;
  private JCheckBox checkSi, checkNo;
  private ButtonGroup grupo;

  // Declaración objetos Decoradores
  private Color colorPrincipal, colorGrisOscuro;
  // private Color colorNegroTransparente;
  private Font fontTPrincipal, fontTitulo, fontSubtitulo;
  // private Font fontMediana;
  private Cursor cMano;
  private Border bInferiorAzul;
  private ImageIcon iFondo, iLogo, iCerrar;
  private ImageIcon iSvg1, iUsuario2, iClave2, iPunto1, iFacebook1, iTwitter1, iYoutube1, iDimAux;

  public VistaPrincipalTemplate() {
    this.generarFuentes();

    colorPrincipal = new Color(60, 78, 120);
    colorGrisOscuro = new Color(80, 80, 80);
    // colorNegroTransparente = new Color(30, 30, 30, 30);
    fontTPrincipal = new Font("Rockwell Extra Bold", Font.PLAIN, 20);
    fontTitulo = new Font("Calibri (Cuerpo)", Font.BOLD, 17);
    fontSubtitulo = new Font("Forte", Font.PLAIN, 13);
    // fontMediana = new Font("LuzSans-Book", Font.PLAIN, 15);
    cMano = new Cursor(Cursor.HAND_CURSOR);
    bInferiorAzul = BorderFactory.createMatteBorder(0, 0, 2, 0, colorPrincipal);
 

    pUno = new JPanel();
    pUno.setSize(400, 400);
    pUno.setLocation(0, 0);
    pUno.setBackground(Color.red);
    pUno.setLayout(null);
    this.add(pUno);
    
    pDos = new JPanel();
    pDos.setSize(400, 400);
    pDos.setLocation(400, 0);
    pDos.setBackground(Color.white);
    pDos.setLayout(null);
    this.add(pDos);
    
    pTres = new JPanel();
    pTres.setSize(400, 400);
    pTres.setLocation(400, 400);
    pTres.setBackground(Color.blue);
    pTres.setLayout(null);
    this.add(pTres);
    
    pCuatro = new JPanel();
    pCuatro.setSize(400, 400);
    pCuatro.setLocation(0, 400);
    pCuatro.setBackground(Color.green);
    pCuatro.setLayout(null);
    this.add(pCuatro);

    
    lTituloApp = new JLabel("Login de Usuario");
    lTituloApp.setBounds(100, 20, 220, 30);
    lTituloApp.setForeground(Color.WHITE);
    lTituloApp.setFont(fontTPrincipal);
    pDos.add(lTituloApp);

    lSvg1 = new JLabel();
    lSvg1.setBounds(100, 100, 500, 345);
    pDos.add(lSvg1);

    lEslogan = new JLabel("Te ayudamos en todo");
    lEslogan.setSize(130, 20);
    lEslogan.setLocation((pUno.getWidth() - lEslogan.getWidth()) / 2, 60);
    lEslogan.setHorizontalAlignment(SwingConstants.CENTER);
    lEslogan.setForeground(colorGrisOscuro);
    lEslogan.setFont(fontSubtitulo);
    pUno.add(lEslogan);

    lTituloLogin = new JLabel("Registra tus Datos");
    lTituloLogin.setSize(150, 30);
    lTituloLogin.setLocation((pUno.getWidth() - lTituloLogin.getWidth()) / 2, 80);
    lTituloLogin.setForeground(colorGrisOscuro);
    lTituloLogin.setFont(fontTitulo);
    lTituloLogin.setHorizontalAlignment(SwingConstants.CENTER);
    pUno.add(lTituloLogin);

    lNotificaciones = new JLabel("¿Recibir Notificaciones?");
    lNotificaciones.setSize(140, 20);
    lNotificaciones.setLocation((pUno.getWidth() - lNotificaciones.getWidth()) / 2, 400);
    lNotificaciones.setForeground(colorGrisOscuro);
    lNotificaciones.setFont(fontSubtitulo);
    lNotificaciones.setHorizontalAlignment(SwingConstants.CENTER);
    pUno.add(lNotificaciones);

    lUsuario = new JLabel();
    lUsuario.setBounds(40, 140, 30, 30);
    pUno.add(lUsuario);

    lClave = new JLabel();
    lClave.setBounds(40, 270, 30, 30);
    pUno.add(lClave);

    tNombreUsuario = new JTextField("Nombre Usuario");
    tNombreUsuario.setSize(260, 40);
    tNombreUsuario.setLocation((pUno.getWidth() - tNombreUsuario.getWidth()) / 2, 130);
    tNombreUsuario.setForeground(colorPrincipal);
    tNombreUsuario.setBackground(Color.WHITE);
    tNombreUsuario.setCaretColor(colorGrisOscuro);
    tNombreUsuario.setBorder(bInferiorAzul);
    tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
    pUno.add(tNombreUsuario);

    tClaveUsuario = new JPasswordField("Clave Usuario");
    tClaveUsuario.setSize(260, 40);
    tClaveUsuario.setLocation((pUno.getWidth() - tClaveUsuario.getWidth()) / 2, 260);
    tClaveUsuario.setForeground(colorPrincipal);
    tClaveUsuario.setCaretColor(colorGrisOscuro);
    tClaveUsuario.setBorder(bInferiorAzul);
    tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
    pUno.add(tClaveUsuario);

    cbTipoUsuario = new JComboBox<String>();
    cbTipoUsuario.addItem("Cliente");
    cbTipoUsuario.addItem("Cajero");
    cbTipoUsuario.addItem("Administrador");
    cbTipoUsuario.setSize(220, 30);
    cbTipoUsuario.setLocation((pUno.getWidth() - cbTipoUsuario.getWidth()) / 2, 210);
    cbTipoUsuario.setForeground(colorPrincipal);
    cbTipoUsuario.setBackground(Color.WHITE);
    ((JLabel) cbTipoUsuario.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
    pUno.add(cbTipoUsuario);

    bEntrar = new JButton("Entrar");
    bEntrar.setSize(250, 45);
    bEntrar.setLocation((pUno.getWidth() - bEntrar.getWidth()) / 2, 330);
    bEntrar.setFocusable(false);
    bEntrar.setBackground(colorPrincipal);
    bEntrar.setForeground(Color.WHITE);
    bEntrar.setCursor(cMano);
    pUno.add(bEntrar);

    bRegistrarse = new JButton("Registrarse");
    bRegistrarse.setBounds(240, 460, 145, 35);
    bRegistrarse.setFocusable(false);
    bRegistrarse.setBackground(colorPrincipal);
    bRegistrarse.setForeground(Color.WHITE);
    bRegistrarse.setCursor(cMano);
    pUno.add(bRegistrarse);
    

    bCerrar = new JButton();
    bCerrar.setBounds(350, 10, 45, 30);
    bCerrar.setFocusable(false);
    bCerrar.setBackground(Color.BLUE);
    bCerrar.setForeground(Color.WHITE);
    bCerrar.setCursor(cMano);
    bCerrar.setContentAreaFilled(false);
    bCerrar.setFocusable(false);
    bCerrar.setBorder(null);
    pUno.add(bCerrar);

    bOpcion1 = new JButton();
    bOpcion1.setBounds(10, 220, 30, 20);
    bOpcion1.setCursor(cMano);
    bOpcion1.setContentAreaFilled(false);
    bOpcion1.setFocusable(false);
    bOpcion1.setBorder(null);
    pDos.add(bOpcion1);

    bOpcion2 = new JButton();
    bOpcion2.setBounds(10, 250, 30, 20);
    bOpcion2.setCursor(cMano);
    bOpcion2.setContentAreaFilled(false);
    bOpcion2.setFocusable(false);
    bOpcion2.setBorder(null);
    pDos.add(bOpcion2);

    bOpcion3 = new JButton();
    bOpcion3.setBounds(10, 280, 30, 20);
    bOpcion3.setCursor(cMano);
    bOpcion3.setContentAreaFilled(false);
    bOpcion3.setFocusable(false);
    bOpcion3.setBorder(null);
    pDos.add(bOpcion3);

    lFacebook = new JLabel();
    lFacebook.setBounds(20, 460, 30, 30);
    lFacebook.setCursor(cMano);
    pDos.add(lFacebook);

    lTwitter = new JLabel();
    lTwitter.setBounds(60, 460, 30, 30);
    lTwitter.setCursor(cMano);
    pDos.add(lTwitter);

    lYoutube = new JLabel();
    lYoutube.setBounds(100, 460, 30, 30);
    lYoutube.setCursor(cMano);
    pDos.add(lYoutube);

    lFondo = new JLabel();
    lFondo.setBounds(0, 0, 600, 600);
    pDos.add(lFondo);

    checkSi = new JCheckBox("Si");
    checkSi.setSize(45, 25);
    checkSi.setFocusable(false);
    checkSi.setBackground(Color.WHITE);
    checkSi.setLocation((pUno.getWidth() - checkSi.getWidth()) / 2 - 15, 375);
    checkSi.setCursor(cMano);
    pUno.add(checkSi);

    checkNo = new JCheckBox("No");
    checkNo.setSize(45, 25);
    checkNo.setFocusable(false);
    checkNo.setBackground(Color.WHITE);
    checkNo.setLocation((pUno.getWidth() + checkNo.getWidth()) / 2 - 15, 375);
    checkNo.setCursor(cMano);
    pUno.add(checkNo);

    grupo = new ButtonGroup();
    grupo.add(checkSi);
    grupo.add(checkNo);

    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(800, 800);
    setLocationRelativeTo(this);
    setUndecorated(true);
    setLayout(null);
    setVisible(true);
  }

  private void generarFuentes() {
    try {
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      ge.registerFont( Font.createFont(
          Font.TRUETYPE_FONT,
          new File("Clase3/resources/fonts/LUZRO.ttf")
      ));
    } catch (IOException | FontFormatException e) {
      System.out.println(e);
    }
  }
}
