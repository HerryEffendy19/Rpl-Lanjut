import java.io.*;
import java.util.Scanner;
public class stackarray
{
private int maxsize;
private double[] stackarray;
private int top;
public void inisiasi(int s)
{
maxsize = s;
stackarray = new double[maxsize];
top=-1;
}

public void push(double data)
{
if(top>=maxsize-1)
{
System.out.println("Stack Penuh. "+data+" Tidak Bisa Masuk");
System.out.println();
}
else
{
top++;
stackarray[top]=data;
System.out.println(data+" Masuk ke Stack");
}
}

public double pop()
{
double temp;
if(top>=0)
{
temp=stackarray[top];
System.out.println(temp+" Keluar dari Stack");
top--;
System.out.println();
return(temp);
}
else
{
System.out.println("Stack Sudah Kosong");
System.out.println();
return(-1);
}
}

public void clear()
{
top=-1;
System.out.println("Semua data terhapus!!!");
System.out.println();
}

public void view()
{
System.out.println("Isi Stack : ");
for(int i=top;i>=0;i--)
{
System.out.println(stackarray[i]+" ");
}
System.out.println();
}

public static void main(String[] args)
{
stack_array stack = new stack_array();
stack.inisiasi(15);
Scanner dataIn=new Scanner(System.in);
int x,a,ulang;
String lagi="";
do
{
System.out.println();
System.out.println("Menu :");
System.out.println("1. Push");
System.out.println("2. Pop");
System.out.println("3. Clear");
System.out.println("4. PrintStack");
System.out.println();
System.out.print("Masukkan pilihan anda = ");
x=dataIn.nextInt();
switch(x)
{
case 1: System.out.println();
System.out.print("Masukkan berapa tumpukkan (Maksimal 15 Tumpuk): ");
ulang=dataIn.nextInt();
for(int q=0;q<ulang;q++)
{
System.out.print("Masukkan nilai tumpukkan ke-"+(q+1)+": ");
a=dataIn.nextInt();
stack.push(a);
System.out.println();
}
break;

case 2: System.out.println();
System.out.print("Masukkan berapa tumpukkan (Maksimal 15 Tumpuk) yang akan dikeluarkan: ");
ulang=dataIn.nextInt();
for(int q=0;q<ulang;q++)
{
stack.pop();
}
break;

case 3: System.out.println();
stack.clear();
break;

case 4: System.out.println();
stack.view();
break;

default:
System.out.println("Out of Range");
}
System.out.println("Lagi (ya/tidak) : ");
lagi=dataIn.nextLine();
lagi=dataIn.nextLine();
}
while(!lagi.equals("tidak"));
}
}