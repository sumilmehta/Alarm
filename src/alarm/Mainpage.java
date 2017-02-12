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
public class Mainpage extends JFrame implements ActionListener
{
        JLabel L,l;
        JButton B1,B2;
        JTextField T1,T2,T3,T4;
        JFrame f = new JFrame("Mainpage");
        String A="00";
        String B="00";
        String C="00";
        public Mainpage(String A,String B,String C)
        {
            super("Mainpage");
           // A=a;
            //B=b;
            //C=c;
            f.setSize(1000,600);
            f.getContentPane().setLayout(null);
            L = new JLabel("Currently set Alarm Time is :-");
            l=new JLabel("©Sumil");
            T1 = new JTextField(A);
            T2 = new JTextField(B);
            T3 = new JTextField(C);
            T4 = new JTextField("AM/PM");
            B1 = new JButton("Set Alarm Time");
            B2 = new JButton("About");
            T1.setBounds(400,260,40,20);
            T2.setBounds(460,260,40,20);
            T3.setBounds(520,260,40,20);
            T4.setBounds(580,260,40,20);

            L.setBounds(420,220,170,15);
            l.setBounds(900,520,60,40);
            B1.setBounds(420,150,160,50);
            B1.addActionListener(this);
            B2.setBounds(420,350,160,50);
            B2.addActionListener(this);
            f.add(L);
            f.add(T1);
            f.add(T2);
            f.add(T3);
            f.add(T4);
            f.add(B1);
            f.add(B2);
            f.add(l);
                f.setVisible(true);
                setDefaultCloseOperation(EXIT_ON_CLOSE);

        }
        void displaysettime(String a,String b,String c)
        {
            T1.setText(a);
            T2.setText(b);
            T3.setText(c);
            f.setVisible(true);
        }
        public void actionPerformed(ActionEvent e)
        {

            if(e.getSource()==B1)
            {
                //f.setVisible(false);
                f.setVisible(false);
               Set obj=new Set();

            }
            if(e.getSource()==B2)
            {
                JOptionPane.showMessageDialog(null,"**Programmed by: Sumil Mehta**","Created by",JOptionPane.INFORMATION_MESSAGE);
            }

        }


    }

