package javaapplication1;
import java.util.Scanner;
abstract class car
{
    int[] reg_no=new int[20];
    String[] reg_date=new String[20];
    car(int i,int a,String b)
    {
        reg_no[i]=a;
        reg_date[i]=b;
    }
}
class TransportVehicles extends car
{
    int[] validity_no=new int[20];
    String[] start_date=new String[20];
    String[] period=new String[20];
    TransportVehicles(int i,int a,String b,int v,String s,String p)
    {
        super(i,a,b);
        validity_no[i]=v;
        start_date[i]=s;
        period[i]=p;
    }
    void details_tv(int i)
    {
        System.out.println("Validity no: "+validity_no[i]);
        System.out.println("Start Date: "+start_date[i]);
        System.out.println("Period : "+period[i]);
    }
}
class PrivateVehicle extends TransportVehicles
{
    String[] owner_name=new String[20];
    String[] owner_address=new String[20];
    PrivateVehicle(int i,int a,String b,int v,String s,String p,String on,String oa)
    {
        super(i,a,b,v,s,p);
        owner_name[i]=on;
        owner_address[i]=oa;
    }
    void details_pv(int i)
    {
        System.out.println("Owner Name: "+owner_name[i]);
        System.out.println("Owner Address: "+owner_address[i]);
    }
}
public class NewMain3
{
    public static void main(String[]args)
    {
        int n,i,a,v,ch;
        
        String b,s,p,on,oa;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no. of Details: ");
        n=scan.nextInt();
        PrivateVehicle obj[]=new PrivateVehicle[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter Details: ");
            System.out.println("Enter Reg no : ");
            a=scan.nextInt();
            System.out.println("Enter Reg Date: ");
            b=scan.next();
            System.out.println("Validity no.: ");
            v=scan.nextInt();
            System.out.println("Start Date: ");
            s=scan.next();
            System.out.println("Period: ");
            p=scan.next();
            System.out.println("Owner Name: ");
            on=scan.next();
            System.out.println("Owner Address: ");
            oa=scan.next();
            obj[i] = new PrivateVehicle(i,a,b,v,s,p,on,oa);
        }
        
        System.out.println("Enter Number for Transport Vehicle Details: ");
        ch=scan.nextInt();
        for(i=0;i<n;i++)
        {
              if(i==ch)
              {
                  obj[i].details_tv();
              }
        System.out.println("Enter Number for Private Vehicle Details: ");
        ch=scan.nextInt();
        for(i=0;i<n;i++)
        {
              if(i==ch)
              {
                  obj[i].details_pv();
              }
          }
    }
}
