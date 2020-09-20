package exam;
import javax.swing.*;
import java.io.*;
import java.awt.*;

public class Assignement {

    private JLabel lbl1;
    private JTextField txt1;
    private JPanel panel;
    private JFrame frame;

    public Assignement() throws IOException{
        createGUI();
        addLabels();
        books();

        frame.add(panel); 
        frame.setVisible(true);
    }

    public void createGUI(){ 
        frame = new JFrame();
        frame.setTitle("Books");
        frame.setSize(730, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBounds(10, 10, 10, 10);
//        panel.setBorder(BorderFactory.createLineBorder (Color.decode("#1854A2"), 2));
        frame.add(panel);
    }

    public void addLabels(){
        lbl1 = new JLabel("Labe 1 ");
        lbl1.setBounds(700, 450, 120, 25);
//        lbl1.setForeground(Color.white);
        panel.add(lbl1);
    }

    public void books() throws IOException{
        String result="";
        String line;
        LineNumberReader lnr = new LineNumberReader(new FileReader(new File("hoho.txt")));
        while((line = lnr.readLine()) != null){
            result += line;
        }
//        
        txt1 = new JTextField(20);
        txt1.setText(result);
//        JLabel label1 = new JLabel(result);
//        panel.add(label1);
        panel.add(txt1);
    }


    public static void main(String[] args) throws Exception{
        new Assignement();

    }
}