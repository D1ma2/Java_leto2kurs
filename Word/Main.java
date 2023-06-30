package Word;
import javax.swing.*;
import java.awt.*;
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
        JTextArea words1 = new JTextArea(5,20);
        words1.setLineWrap(true);
        JScrollPane jScrollPane = new JScrollPane(words1);
        jScrollPane.setBounds(150, 150, 200, 75);
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        window.add(jScrollPane);
        //Кнопочка
        JButton buttons = new JButton("Расчёт");
        buttons.setBounds(175, 240, 150, 25);
        buttons.setBackground(Color.GREEN);
        buttons.setForeground(Color.BLACK);
        window.add(buttons);
        // надпись
        JTextArea label = new JTextArea("Символы отличные от русских гласных букв:");
        JScrollPane label2 = new JScrollPane(label);
        label.setBackground(Color.PINK);
        label.setLineWrap(true);
        label.setEditable(false);
        label2.setBounds(100, 275, 320, 100);
        label2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        window.add(label2);
        JLabel numbers = new JLabel(" ");
        numbers.setBounds(100, 380, 300, 50);
        window.add(numbers);
        //обработчик нажатия на кнопку
        ActionListener actionListener = e -> {
            String a = null;
            int numbOfChar = 0;
            char[] rezult = null;
            a = String.valueOf(words1.getText());
            if (a.equals("")) {
                label.setText("Вы не ввели символы");
                numbers.setText("");
            }else{
                rezult = WordAccount.main(a);
                int l;
                l = NetSymbols.main(String.valueOf(rezult));
                if (l == 0 ) {
                    label.setText("Нет символов отличных от русских гласных букв");
                    numbers.setText("");
                }else{
                    label.setText("Символы отличные от русских гласных букв: " + String.valueOf(rezult));
                    numbOfChar = NumberOfCharacters.main(String.valueOf(rezult));
                    numbers.setText("Количество отличных от гласных символов: " + numbOfChar);
                }
            }
        };

        buttons.addActionListener(actionListener);

        window.setVisible(true);

    }
}