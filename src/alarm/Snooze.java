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
public class Snooze extends Thread implements ActionListener{
   // String a,b,c;
     JLabel L,l;
        JButton B1,B2;
        JTextField T1,T2,T3,T4;
        JFrame f = new JFrame("Alarm");
        String A="00";
        String B="00";
        String C="00";
        String am_pm,n,snoozetime;
        AePlayWave obj1;
        int hr,min,sec,snooze;
    Snooze(String h,String m,String s,String ampm,AePlayWave obj,String filename,String snooze)
    {
        A=h;
        B=m;
        C=s;
        am_pm=ampm;
        obj1=obj;
        n=filename;
        snoozetime=snooze;
    }

    public void run()
    {
        f.setSize(1000,600);
            f.getContentPane().setLayout(null);
            L = new JLabel("Currently set Alarm Time was :-");
            l=new JLabel("©Sumil");
            T1 = new JTextField(A);
            T2 = new JTextField(B);
            T3 = new JTextField(C);
            T4 = new JTextField(am_pm);
            B1 = new JButton("Snooze");
            B2 = new JButton("Stop Alarm");
            T1.setBounds(580,320,40,20);
            T2.setBounds(640,320,40,20);
            T3.setBounds(700,320,40,20);
            T4.setBounds(760,320,40,20);
            L.setBounds(580,300,170,15);
            l.setBounds(900,520,100,40);
            B1.setBounds(420,150,160,50);
            B1.addActionListener(this);
            B2.setBounds(420,220,160,50);
            B2.addActionListener(this);
            f.add(L);
            f.add(l);
            f.add(T1);
            f.add(T2);
            f.add(T3);
            f.add(T4);
            f.add(B1);
            f.add(B2);
                f.setVisible(true);
          //      setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==B1)
        {
            obj1.stop();
            hr=Integer.parseInt(A);
            min=Integer.parseInt(B);
            sec=Integer.parseInt(C);
            snooze=Integer.parseInt(snoozetime);
            min=min+snooze;
            f.dispose();
            if(min>=60)
                hr=hr+1;
            if(hr>=12)
           {
               if(am_pm=="PM")
               {
                   if(hr>12)
                   {
                       hr=0;
                       am_pm="AM";
                   }
               }
               else if(am_pm=="AM")
               {
                   hr=1;
                   am_pm="PM";
               }
           }
           Work obj=new Work();
           obj.clock(Integer.toString(hr),Integer.toString(min),Integer.toString(sec),n,am_pm,Integer.toString(snooze));
        }
        if(e.getSource()==B2)
        {
            System.exit(0);
        }
    }


}
