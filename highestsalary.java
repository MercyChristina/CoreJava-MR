//Display highest salary
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;
class Collectiondemo1 implements Comparable{
String Name,Designation;
int ID,age,salary;
Collectiondemo1(String Name,int ID,int age,int salary)
{

this.Name=Name;
this.ID=ID;
this.age=age;
this.salary=salary;
}
public String toString()
    {
        return Name+" "+ID+" "+age+" "+salary+" ";
    }
public int compareTo(Object o) {
       
        Collectiondemo1 dd =(Collectiondemo1) o;
       // return this.EmployeeName.compareTo(ee.EmployeeName);
        if(this.salary>dd.salary){
            return 1;
            
    }
        else if(this.salary<dd.salary){
            return -1;
    }
        else{
        return 0;
        }
   
    }
    
}
public class Collectiondemo2{

public static void main(String [] aa)
{
int a,s,d;
String n;

ArrayList <Collectiondemo1> arl=new ArrayList<Collectiondemo1>();
Scanner sc = new Scanner(System.in);
for(int i =0;i<2;i++){
System.out.println("Type Your name,id,age,salary...");
 n=sc.next();
 d=sc.nextInt();
a=sc.nextInt();
s=sc.nextInt();
Collectiondemo1 cdm = new Collectiondemo1(n,d,a,s);
arl.add(cdm);
}
Collectiondemo1 c = Collections.max(arl);
    System.out.println("highest salary person "+c);
    System.out.println("highest salary person "+c.Name);
System.out.println("before sorting "+arl);
        Collections.sort(arl);
         System.out.println("after sorting "+arl);
         
    
    }
   
}
