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
import javax.swing.JRadioButton;

public class VistaPrincipalTemplate extends JFrame {

    private static final long serialVersionUID = 1L;

    // Declaración Objetos Gráficos
    private JPanel pUno, pDos, pTres, pCuatro;
    private JLabel lTituloMemoria, lTituloProceso, lTituloModelo, lTituloSimulacion;
    private JLabel lSvg1;
    private JRadioButton r1, r2, r3, r4, r5;
    private JButton bAdd, bCerrar, bRegistrarse, bOpcion1, bOpcion2, bOpcion3;
    private JCheckBox checkSi, checkNo;
    private ButtonGroup grupo;

    // Declaración objetos Decoradores
    private Color colorPrincipal, colorGrisOscuro;
    // private Color colorNegroTransparente;
    private Font fontTPrincipal;
    // private Font fontMediana;
    private Cursor cMano;


    public VistaPrincipalTemplate() {
        this.generarFuentes();

        colorPrincipal = new Color(60, 78, 120);
        colorGrisOscuro = new Color(80, 80, 80);
        // colorNegroTransparente = new Color(30, 30, 30, 30);
        fontTPrincipal = new Font("Calibri (Cuerpo)", Font.PLAIN, 20);
        // fontMediana = new Font("LuzSans-Book", Font.PLAIN, 15);
        cMano = new Cursor(Cursor.HAND_CURSOR);

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
        pTres.setLocation(0, 400);
        pTres.setBackground(Color.blue);
        pTres.setLayout(null);
        this.add(pTres);

        pCuatro = new JPanel();
        pCuatro.setSize(400, 400);
        pCuatro.setLocation(400, 400);
        pCuatro.setBackground(Color.green);
        pCuatro.setLayout(null);
        this.add(pCuatro);

        lTituloMemoria = new JLabel("Uso de memoria");
        lTituloMemoria.setSize(200, 30);
        lTituloMemoria.setLocation((pUno.getWidth() - lTituloMemoria.getWidth()) / 2, 60);
        lTituloMemoria.setForeground(Color.black);
        lTituloMemoria.setFont(fontTPrincipal);
        pDos.add(lTituloMemoria);

        lTituloModelo = new JLabel("Modelo de memoria");
        lTituloModelo.setSize(250, 30);
        lTituloModelo.setLocation((pUno.getWidth() - lTituloModelo.getWidth()) / 2, 60);
        lTituloModelo.setForeground(Color.black);
        lTituloModelo.setFont(fontTPrincipal);
        lTituloModelo.setHorizontalAlignment(SwingConstants.CENTER);
        pUno.add(lTituloModelo);
        
        lTituloProceso = new JLabel("Lista de procesos");
        lTituloProceso.setSize(250, 30);
        lTituloProceso.setLocation((pTres.getWidth() - lTituloProceso.getWidth()) / 2, 60);
        lTituloProceso.setForeground(Color.black);
        lTituloProceso.setFont(fontTPrincipal);
        lTituloProceso.setHorizontalAlignment(SwingConstants.CENTER);
        pTres.add(lTituloProceso);

        bAdd = new JButton("Añadir");
        bAdd.setSize(250, 45);
        bAdd.setLocation((pTres.getWidth() - bAdd.getWidth()) / 2, 330);
        bAdd.setFocusable(false);
        bAdd.setBackground(colorPrincipal);
        bAdd.setForeground(Color.WHITE);
        bAdd.setCursor(cMano);
        pTres.add(bAdd);

        bCerrar = new JButton("x");
        bCerrar.setSize(30, 30);
        bCerrar.setLocation(350, 20);
        bCerrar.setFocusable(false);
        bCerrar.setBackground(Color.BLUE);
        bCerrar.setForeground(Color.WHITE);
        bCerrar.setCursor(cMano);
        bCerrar.setContentAreaFilled(true);
        bCerrar.setFocusable(false);
        bCerrar.setBorder(null);
        pDos.add(bCerrar);

        r1 = new JRadioButton("Modelo 1");
        r1.setBounds(100, 50, 100, 30);
        r1.setLocation(60, 120);
        r1.setFocusable(false);
        r1.setBackground(colorPrincipal);
        r1.setForeground(Color.black);
        r1.setCursor(cMano);
        pUno.add(r1);

        r2 = new JRadioButton("Modelo 2");
        r2.setBounds(100, 50, 100, 30);
        r2.setLocation(60, 170);
        r2.setFocusable(false);
        r2.setBackground(colorPrincipal);
        r2.setForeground(Color.black);
        r2.setCursor(cMano);
        pUno.add(r2);

        r3 = new JRadioButton("Modelo 4");
        r3.setBounds(100, 50, 100, 30);
        r3.setLocation(60, 220);
        r3.setFocusable(false);
        r3.setBackground(colorPrincipal);
        r3.setForeground(Color.black);
        r3.setCursor(cMano);
        pUno.add(r3);

        r4 = new JRadioButton("Modelo 4");
        r4.setBounds(100, 50, 100, 30);
        r4.setLocation(60, 270);
        r4.setFocusable(false);
        r4.setBackground(colorPrincipal);
        r4.setForeground(Color.black);
        r4.setCursor(cMano);
        pUno.add(r4);

        grupo = new ButtonGroup();
        grupo.add(r1);
        grupo.add(r2);
        grupo.add(r3);
        grupo.add(r4);

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
            ge.registerFont(Font.createFont(
                    Font.TRUETYPE_FONT,
                    new File("Clase3/resources/fonts/LUZRO.ttf")
            ));
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
    }
}
