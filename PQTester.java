//(c) A+ Computer Science
//www.apluscompsci.com

//Name -  

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTester
{
 private Queue<String> pQueue;

 public PQTester()
 {
   pQueue = new PriorityQueue<String>();
 }

 public PQTester(String list)
 {
   setPQ(list);
 }

 public void setPQ(String list)
 {
   pQueue = new PriorityQueue<String>();
   String[] items = list.split(" ");
   for (String s: items)
    pQueue.add(s);
 }
 
 public Object getMin()
 {
  return pQueue.peek();
 }
 
 public String getNaturalOrder()
 {
  String output="";
  while (!pQueue.isEmpty())
    output+= pQueue.poll() + " ";
  return output;  
 }

 //write a toString method
 public String toString()
 {
   return "toString() - " + pQueue.toString() + "\ngetMin() - " + getMin() + "\ngetNaturalOrder() - " + getNaturalOrder();
 }
}
