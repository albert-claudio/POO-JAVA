import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class ButtonFrame extends JFrame {
        private JButton plainJButton; //botão apenas com texto
        private JButton fancyJButton; //botão com icones

        public ButtonFrame(){
            super("Testando Botão");
            setLayout(new FlowLayout());

            plainJButton = new JButton("Click Button"); //botão com texto
            add(plainJButton);

            Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));
            Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));
            fancyJButton = new JButton("Fancy Button", bug1); //configura imagem
            fancyJButton.setRolloverIcon(bug2); // configura imagem de rollover
            add(fancyJButton); //adiciona fancyJButton ao JFrame

            // CRIA NOVO BUTTONHANDLER DE TRATAMENTO PARA TRATEMENTO DE EVENTO DE BOTÃO
            ButtonHandler handler = new ButtonHandler();
            fancyJButton.addActionListener(handler);
            plainJButton.addActionListener(handler);
        }

        private class ButtonHandler implements ActionListener{
            //tratar evento botão
            @Override
            public void actionPerformed(ActionEvent event){
                JOptionPane.showConfirmDialog(ButtonFrame.this, String.format(
                        "Você pressionou: %s", event.getActionCommand()));
            }
        }
    }

