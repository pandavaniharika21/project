package com.hcl.Sample;

public class Emp {
	
       static int x;
       void increment()
       {
           x++;
       }   
     }   
    class static_use 
    {
        public static void main(String args[])
        {
            Emp obj1 = new Emp();
            Emp obj2 = new Emp();
            obj1.x = 0;   
            obj1.increment();
            obj2.increment();
            System.out.println(obj1.x + " " + obj2.x);
         }
   }


