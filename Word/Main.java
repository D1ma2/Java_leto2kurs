package Word;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {

    public static void main( String[] args) {

        JFrame window = new JFrame("Строки");
        window.setBounds(740, 290, 500, 500);
        window.setLayout(null);
        window.getContentPane().setBackground(Color.PINK);
        JLabel label1 = new JLabel("Введите текст для проверки ");
        label1.setBounds(165, 115, 300, 50);
        window.add(label1);
        //Поля для воода
        JTextField words1 = new JTextField();
        JTextField words2 = new JTextField();
        words1.setBounds(175, 150, 150, 50);
        //words2.setBounds(175, 65, 150, 50);
        window.add(words1);
        window.add(words2);
        //Кнопочка
        JButton buttons = new JButton("Расчёт");
        buttons.setBounds(175, 205, 150, 25);
        buttons.setBackground(Color.GREEN);
        buttons.setForeground(Color.BLACK);
        window.add(buttons);
        // надпись
        JLabel label = new JLabel("Число символов:");
        label.setBounds(190, 275, 300, 50);
        window.add(label);
        //обработчик нажатия на кнопку
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = null;
                int rezult = 0;
                a = String.valueOf(words1.getText());
                rezult = Word_Account.main(a);

                //label.setText(a);
                //Word_Account.main(a);
                label.setText("Число символов: " + String.valueOf(rezult));
            }

        };

        buttons.addActionListener(actionListener);

        window.setVisible(true);

    }
}