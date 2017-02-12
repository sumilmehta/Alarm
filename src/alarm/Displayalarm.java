/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alarm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sumil Mehta
 */
public class Displayalarm extends JFrame implements ActionListener
{
    JLabel L;
    JButton B1;
    JTextField T1,T2,T3;
    JFrame f = new JFrame("Display Alarm");
    public Displayalarm(String h,String m,String s)
    {
        super("Mainpage");
        //new AePlayWave("C:/Users/MGKV/Desktop/john cena.wav").start();
        int hh,mm,ss;
        hh=Integer.parseInt(h);
        mm=Integer.parseInt(m);
        ss=Integer.parseInt(s);
        f.setSize(400,400);
        f.getContentPane().setLayout(null);
        L=new JLabel("Alarm Set At :-");
        T1=new JTextField(h);
        T2=new JTextField(m);
        T3=new JTextField(s);
        L.setBounds(150,180,40,20);
        T1.setBounds(150,220,20,20);
        T2.setBounds(150,250,20,20);
        T3.setBounds(150,280,20,20);
        f.add(L);
        f.add(T1);
        f.add(T2);
        f.add(T3);
        f.setVisible(true);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {

    }
}


