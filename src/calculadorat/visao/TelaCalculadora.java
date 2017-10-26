package calculadorat.visao;

import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import calculadorat.negocio.Calculadora;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.SwingConstants;

public class TelaCalculadora extends JFrame{
    //private JLabel lbDigito = new JLabel("VISOR");
    private JTextField jtVisor = new JTextField(50);
    
    Font font = new Font("Courrier", Font.BOLD,20);
    
    Calculadora calc = new Calculadora(); //Objeto Calculadora

    public TelaCalculadora() throws HeadlessException{
        super("Calculadora - Thander");
        
        this.setLayout(null);
        Container t = this.getContentPane();
        
        //t.add(lbDigito);
        //lbDigito.setBounds(120,10,50,15);
        

        t.add(jtVisor);
        jtVisor.setBounds(15,10,270,70);
        jtVisor.setHorizontalAlignment(SwingConstants.RIGHT);
        jtVisor.setFont(font);

        //Numeros -------------------------------------------------------------
        
        //Botão Numero 1 
        JButton btNum1 = new JButton("1");
        t.add(btNum1);
        btNum1.setBounds(15,90,60,50);
        btNum1.addActionListener (
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calc.concatNum(1);
                    jtVisor.setText(calc.getDigito());
                }
            });
        //---------------------------------------------------------------------
        
        //Botão Numero 2
        JButton btNum2 = new JButton("2");
        t.add(btNum2);
        btNum2.setBounds(85,90,60,50);
        btNum2.addActionListener (
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calc.concatNum(2);
                    jtVisor.setText(calc.getDigito());
                }
            });
        //---------------------------------------------------------------------
        
        //Botão Numero 3
        JButton btNum3 = new JButton("3");
        t.add(btNum3);
        btNum3.setBounds(155,90,60,50);
        btNum3.addActionListener (
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calc.concatNum(3);
                    jtVisor.setText(calc.getDigito());
                }
            });
        //---------------------------------------------------------------------
        
        //Botão Numero 4
        JButton btNum4 = new JButton("4");
        t.add(btNum4);
        btNum4.setBounds(15,150,60,50);
        btNum4.addActionListener (
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calc.concatNum(4);
                    jtVisor.setText(calc.getDigito());
                }
            });
        //---------------------------------------------------------------------
        
        //Botão Numero 5
        JButton btNum5 = new JButton("5");
        t.add(btNum5);
        btNum5.setBounds(85,150,60,50);
        btNum5.addActionListener (
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calc.concatNum(5);
                    jtVisor.setText(calc.getDigito());
                }
            });
        //---------------------------------------------------------------------
        
        //Botão Numero 6
        JButton btNum6 = new JButton("6");
        t.add(btNum6);
        btNum6.setBounds(155,150,60,50);
        btNum6.addActionListener (
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calc.concatNum(6);
                    jtVisor.setText(calc.getDigito());
                }
            });
        //---------------------------------------------------------------------
        
        //Botão Numero 7
        JButton btNum7 = new JButton("7");
        t.add(btNum7);
        btNum7.setBounds(15,210,60,50);
        btNum7.addActionListener (
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calc.concatNum(7);
                    jtVisor.setText(calc.getDigito());
                }
            });
        //---------------------------------------------------------------------
        
        //Botão Numero 8
        JButton btNum8 = new JButton("8");
        t.add(btNum8);
        btNum8.setBounds(85,210,60,50);
        btNum8.addActionListener (
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calc.concatNum(8);
                    jtVisor.setText(calc.getDigito());
                }
            });
        //---------------------------------------------------------------------
        
        //Botão Numero 9
        JButton btNum9 = new JButton("9");
        t.add(btNum9);
        btNum9.setBounds(155,210,60,50);
        btNum9.addActionListener (
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calc.concatNum(9);
                    jtVisor.setText(calc.getDigito());
                }
            });
        //---------------------------------------------------------------------
        
        
        //Botão Numero 0
        JButton btNum0 = new JButton("0");
        t.add(btNum0);
        btNum0.setBounds(155,270,60,50);
        btNum0.addActionListener (
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calc.concatNum(0);
                    jtVisor.setText(calc.getDigito());
                }
            });
        //---------------------------------------------------------------------
        
        
        
        
       
        //Operadores ----------------------------------------------------------
        //Botão de Soma
        JButton btSoma = new JButton("+");
        t.add(btSoma);
        btSoma.setBounds(225,90,60,50);
        btSoma.addActionListener (
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calc.soma(jtVisor.getText());
                    jtVisor.setText("");
                }
            });
        //---------------------------------------------------------------------
        
        //Botão de Subtrair
        JButton btSub = new JButton("-");
        t.add(btSub);
        btSub.setBounds(225,150,60,50);
        btSub.addActionListener (
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calc.subtracao(jtVisor.getText());
                    jtVisor.setText("");
                }
            });
        //---------------------------------------------------------------------
        
        //Botão de Dividir
        JButton btDividir = new JButton("/");
        t.add(btDividir);
        btDividir.setBounds(225,210,60,50);
        btDividir.addActionListener (
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calc.divisao(jtVisor.getText());
                    jtVisor.setText("");
                }
            });
        //---------------------------------------------------------------------
        
        //Botão de Multiplicação
        JButton btMult = new JButton("X");
        t.add(btMult);
        btMult.setBounds(225,270,60,50);
        btMult.addActionListener (
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calc.multiplicacao(jtVisor.getText());
                    jtVisor.setText("");
                }
            });
        //---------------------------------------------------------------------
        //Fecha Operadores ----------------------------------------------------
        
         //Botão de Limpar -----------------------------------------------------
        JButton btLimpar = new JButton("LIMPAR");
        t.add(btLimpar);
        btLimpar.setBounds(15,270,130,50);
        btLimpar.addActionListener (
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jtVisor.setText("");
                    calc.setDigito("");
                }
            });
        //Fecha Botão de Limpar -----------------------------------------------
        
        
        //Botão de Resultado
        JButton btResultado = new JButton("=");
        t.add(btResultado);
        btResultado.setBounds(15,330,270,50);
        btResultado.addActionListener (
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jtVisor.setText(""+calc.calculo(jtVisor.getText()));
                    ;
                    
                }
            });
        //---------------------------------------------------------------------
        
        
        this.setSize(305,420);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(
                TelaCalculadora.EXIT_ON_CLOSE
        );
    }

}
