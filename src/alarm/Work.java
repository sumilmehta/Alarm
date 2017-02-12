/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alarm;

/**
 *
 * @author Sumil Mehta
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import javax.sound.sampled.*;
public class Work
{
    int hr,mn,sec,i,j,k,ch,cm,cs;
    int count=8;
    String am_pm,filename,snoozetime;
    private static final long serialVersionUID = 1L;

    
     public void get()
{
  Calendar calendar = new GregorianCalendar();
  
  ch = calendar.get(Calendar.HOUR);
  cm = calendar.get(Calendar.MINUTE);
  cs = calendar.get(Calendar.SECOND);
  if(calendar.get(Calendar.AM_PM) == 0)
  am_pm = "AM";
  else
  am_pm = "PM";
  
  }
    public void clock(String h,String m,String s,String n,String ampm,String time)
    {
        hr=Integer.parseInt(h);
        mn=Integer.parseInt(m);
        sec=Integer.parseInt(s);
        System.out.println(hr+" "+mn+" "+sec);
        get();
        System.out.println(ch+" "+cm+" "+cs);
        filename=n;
        snoozetime=time;
        if(hr==12&&am_pm=="PM")
            hr=0;
        if(hr==12&&am_pm=="AM")
            hr=0;
       System.out.println(ampm);
        try
       { //Functions ob=new Functions(h,m,s);
            // Snooze obj2=new Snooze(h,m,s);
       // obj2.start();
           while(count>0)
           {
               get();
               if(hr==ch&&mn==cm&&sec==cs&&am_pm==ampm)
               {
                  System.out.println(filename);
                    //AePlayWave obj=new AePlayWave("C:/Users/Dev/Desktop/john cena.wav");
                    AePlayWave obj=new AePlayWave(filename);
                 Snooze obj1=new Snooze(h,m,s,ampm,obj,filename,snoozetime);
        obj.start();
       obj1.start();
       // Functions ob=new Functions(h,m,s);
                   break;
               }
           }
          

       }
       catch(Exception e)
       {
           System.out.println("Error....");
       }
    }
    
 }


