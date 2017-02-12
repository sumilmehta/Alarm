/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alarm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Sumil Mehta
 */
public class Set extends JFrame implements ActionListener
{
    JLabel L1,L2,L3,L4,l;
        JButton B1,B2;
        JTextField T1,T2,T3;
        JComboBox ampm=new JComboBox();
        JComboBox snoozetime=new JComboBox();
        static private final String newline = "\n";
    //JButton openButton, saveButton;
    //JTextArea log;
        int i=0,h,m,s;
        
        String filename,n;
    JFileChooser fc;
     
        JFrame f = new JFrame("Set Alarm Time");
        public Set()
        {
            super("Ringer");

            fc = new JFileChooser();

           

            f.setSize(600,600);
            f.getContentPane().setLayout(null);
            L1=new JLabel("Enter Hours :-");
            L2=new JLabel("Enter Minutes :-");
            L3=new JLabel("Enter Seconds :-");
            L4=new JLabel("Enter Snooze Time(mins.) :-");
            l=new JLabel("©Donddev");
            L1.setBounds(150,100,95,20);
            L2.setBounds(150,130,95,20);
            L3.setBounds(150,160,95,20);
            L4.setBounds(90,200,160,20);
            l.setBounds(510,530,160,20);
            f.add(L1);
            f.add(L2);
            f.add(L3);
            f.add(L4);
            f.add(l);
            T1=new JTextField();
            T2=new JTextField();
            T3=new JTextField();
            T1.setBounds(260,100,95,20);
            T2.setBounds(260,130,95,20);
            T3.setBounds(260,160,95,20);
            ampm.addItem("AM");
            ampm.addItem("PM");
            snoozetime.addItem("1");
            snoozetime.addItem("2");
            snoozetime.addItem("5");
            snoozetime.addItem("10");
            snoozetime.addItem("15");
            ampm.setBounds(380,160,50,20);
            snoozetime.setBounds(260,200,50,20);
            f.add(T1);
            f.add(T2);
            f.add(T3);
            B1=new JButton("Set Alarm");
            B2=new JButton("Browse for Alarm Tone");
            B2.setBounds(180,250,200,50);
            B1.setBounds(200,320,160,50);
            f.add(ampm);
            f.add(snoozetime);
            f.add(B1);
            f.add(B2);
            B1.addActionListener(this);
            B2.addActionListener(this);
            f.setVisible(true);
                setDefaultCloseOperation(EXIT_ON_CLOSE);

        }
        public void actionPerformed(ActionEvent e)
        {
           
            if(e.getSource()==B1)
            {
                //f.dispose();

                h=Integer.parseInt(T1.getText());
                m=Integer.parseInt(T1.getText());
                s=Integer.parseInt(T1.getText());
                System.out.println(n.substring(n.length()-3));
                Work obj=new Work();
                if((h<0||h>12)||(m<0||m>59)||(s<0||s>59))
                    JOptionPane.showMessageDialog(null,"**Specify time in 12-hour format and enter all the fields**","Warning",JOptionPane.INFORMATION_MESSAGE);
                else
                if(n==null)
                {
                    JOptionPane.showMessageDialog(null,"**Chooze Alarm Tone(.wav)**","Warning",JOptionPane.INFORMATION_MESSAGE);
                }
                else
               if(n.substring(n.length()-3).compareTo("wav")!=0)
                {
                    JOptionPane.showMessageDialog(null,"**Only .wav files are acceptable**","Warning",JOptionPane.INFORMATION_MESSAGE);
                }
               // if((h<0||h>12)||(m<0||m>59)||(s<0||s>59))
                 //   JOptionPane.showMessageDialog(null,"**Specify time in 12-hour format and enter all the fields**","Warning",JOptionPane.INFORMATION_MESSAGE);
                else
                {
                    f.dispose();
                    obj.clock(T1.getText(),T2.getText(),T3.getText(),n,(String)ampm.getSelectedItem(),(String)snoozetime.getSelectedItem());
             
                }
            }
            if(e.getSource()==B2)
            {
                JOptionPane.showMessageDialog(null,"**Select files only with .wav extension**","Warning",JOptionPane.INFORMATION_MESSAGE);
                int returnVal = fc.showOpenDialog(Set.this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                
                filename=file.getAbsolutePath();
                System.out.println(filename);
                
                filename=filename.replace('\\','/');
                System.out.println(filename);
                n=filename;
                
           
            }

        }


        }
}
