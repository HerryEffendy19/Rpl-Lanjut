import java.util.Scanner;
class BinerKeDesimal{
 public static void main(String[] args){
 
 int input;
 long a,b=0l,c=1,d,no1;
 Scanner y = new Scanner(System.in);
 System.out.print("Masukan angka biner : ");
 input=y.nextInt();
 
  
  a=(input);
  no1=a;
   while(a!=0){
   d=a%10;
   b=b+d*c;
   c=c*2;
   a=a/10;

  }
   System.out.print( "Hasil konversi Bil.Biner" + input +" adalah " + b);
    System.exit( 0 );
 }
}