/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alarm;

/**
 *
 * @author Sumil Mehta
 */
import java.util.*;
import java.io.*;
public class Gettime{
  public void get()
{
  Calendar calendar = new GregorianCalendar();
  String am_pm;
  int hour = calendar.get(Calendar.HOUR);
  int minute = calendar.get(Calendar.MINUTE);
  int second = calendar.get(Calendar.SECOND);
  if(calendar.get(Calendar.AM_PM) == 0)
  am_pm = "AM";
  else
  am_pm = "PM";
  //System.out.println("Current Time : " + hour + ":"+ minute + ":" + second + " " + am_pm);
  }
}

