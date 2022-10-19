package br.com.martinez.calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
    
    public static void main(String[] args) {
        
        new Calculadora();
        
    }

    private String leitura;
    private int memoria;
    private double memoriaDiv;
    private char operacao;
    
    public Calculadora() {
        
        super("Calculadora"); 
        setLayout(null);
        setSize(265, 350);
        
        leitura = "0";
        memoria = 0;
        
        // display
        JTextField display = new JTextField("");
        display.setBounds(10, 10, 231, 50);
        add(display);

        // screen buttons
        JButton btnNum7 = new JButton("7");
        btnNum7.setBounds(10, 70, 50, 50);
        add(btnNum7);
        
        JButton btnNum8 = new JButton("8");
        btnNum8.setBounds(70, 70, 50, 50);
        add(btnNum8);
        
        JButton btnNum9 = new JButton("9");
        btnNum9.setBounds(130, 70, 50, 50);
        add(btnNum9);
        
        JButton btnC = new JButton("C");
        btnC.setBounds(190, 70, 50, 50);
        add(btnC);
        
        JButton btnNum4 = new JButton("4");
        btnNum4.setBounds(10, 130, 50, 50);
        add(btnNum4);
        
        JButton btnNum5 = new JButton("5");
        btnNum5.setBounds(70, 130, 50, 50);
        add(btnNum5);
        
        JButton btnNum6 = new JButton("6");
        btnNum6.setBounds(130, 130, 50, 50);
        add(btnNum6);
        
        JButton btnMult = new JButton("*");
        btnMult.setBounds(190, 130, 50, 50);
        add(btnMult);
        
        JButton btnNum1 = new JButton("1");
        btnNum1.setBounds(10, 190, 50, 50);
        add(btnNum1);
        
        JButton btnNum2 = new JButton("2");
        btnNum2.setBounds(70, 190, 50, 50);
        add(btnNum2);
        
        JButton btnNum3 = new JButton("3");
        btnNum3.setBounds(130, 190, 50, 50);
        add(btnNum3);
        
        JButton btnDiv = new JButton("/");
        btnDiv.setBounds(190, 190, 50, 50);
        add(btnDiv);
        
        JButton btnNum0 = new JButton("0");
        btnNum0.setBounds(10, 250, 50, 50);
        add(btnNum0);
        
        JButton btnSub = new JButton("-");
        btnSub.setBounds(70, 250, 50, 50);
        add(btnSub);
        
        JButton btnSum = new JButton("+");
        btnSum.setBounds(130, 250, 50, 50);
        add(btnSum);
        
        JButton btnResult = new JButton("=");
        btnResult.setBounds(190, 250, 50, 50);
        add(btnResult);
        
        // action of the buttons
        btnNum7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 7;
                display.setText(display.getText() + "7");
            }
        });
        
        btnNum8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 8;
                display.setText(display.getText() + "8");
            }
        });
        
        btnNum9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 9;
                display.setText(display.getText() + "9");
            }
        });
        
        btnNum4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 4;
                display.setText(display.getText() + "4");
            }
        });
        
        btnNum5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 5;
                display.setText(display.getText() + "5");
            }
        });
        
        btnNum6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 6;
                display.setText(display.getText() + "6");
            }
        });
        
        btnNum1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 1;
                display.setText(display.getText() + "1");
            }
        });
        
        btnNum2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 2;
                display.setText(display.getText() + "2");
            }
        });
        
        btnNum3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 3;
                display.setText(display.getText() + "3");
            }
        });
        
        btnNum0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 0;
                display.setText(display.getText() + "0");
            }
        });
        
        // action operation buttons
        btnSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = '+';
                memoria += Integer.parseInt(leitura);
                leitura = "0";
                display.setText(memoria + " + ");
            }
        });
        
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = '-';
                memoria += Integer.parseInt(leitura);
                leitura = "0";
                display.setText(memoria + " - ");
            }
        });
        
        btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = '*';
                memoria += Integer.parseInt(leitura);
                leitura = "0";
                display.setText(memoria + " * ");
            }
        });
        
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = '/';
                memoria += Integer.parseInt(leitura);
                leitura = "0";
                display.setText(memoria + " / ");
            }
        });
        
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = 'C';
                leitura = "0";
                memoria = 0;
                display.setText("");
            }
        });
        
        btnResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operacao) {
                    case '+': {
                        memoria += Integer.parseInt(leitura);
                        display.setText(display.getText() + " = " + memoria);
                        leitura = "0";
                        break;
                    }
                    case '-': {
                        memoria -= Integer.parseInt(leitura);
                        display.setText(display.getText() + " = " + memoria);
                        leitura = "0";
                        break;
                    }
                    case '/': {
                        memoriaDiv = memoria;
                        memoriaDiv /= Integer.parseInt(leitura);
                        display.setText(display.getText() + " = " + memoriaDiv);
                        leitura = "0";
                        break;
                    }
                    case '*': {
                        memoria *= Integer.parseInt(leitura);
                        display.setText(display.getText() + " = " + memoria);
                        leitura = "0";
                        break;
                    }
                }
            }
        });
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
        
    }
    
}
