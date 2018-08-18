import java.io.*;
import javva.util.*;
import java.util.regres.*;
class AnjaliSingh04
{
public static void main(string args[])
{
Scanner sc=new Scanner(System.in);
int x;
string text=sc.nextLine();
x=integer.parseInt(sc.nextLine());
pass(text,x);
}
public static void pass(String t, int x)
{
String temp =t;
Scanner sc=new Scanner(System.in);
int i;
String a[]=new String[100];
ArrayList<Integer>res=new ArrayList<>();
for(i=0;i<n;i++)
{
a[i]=sc.nextLine();
}
for(i=0;i<n;i++)
{
for(int j=-1;(j=temp.indexOf(a[i],j+1))!=-1;)
{
res.add(j);
}
}
Collections.sort(res);
for(Integer k:res)
System.out.print(k+"");
}
]
