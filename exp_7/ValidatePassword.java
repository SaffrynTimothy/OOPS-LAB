import java.util.Scanner;
class Check_Password
{
    boolean Check_Password(char pass[],int len,int uc,int lc,int dc)
    {
        for(int i=0;i<len;i++)
        
        {
            if(pass[i]>65 && pass[i]<90)
            {
                uc++;
            }
            else if(pass[i]>97 && pass[i]<122)
            {
                lc++;
            }
            else if(pass[i]>48 && pass[i]<57)
            {
                dc++;
            }
            
        }
        if(dc>=2 && uc>=2 && lc>=2)
        {
            return false;
        }
        return true;
    }
}
public class ValidatePassword
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        String s;
        int len;
        int dc=0,lc=0,uc=0;
        boolean Condition=true;
        System.out.println("=====================================================================================");
        Check_Password cl=new Check_Password();
        System.out.println("Conditions to Satisfy:\n1 .At  least  two  Uppercase letters\n2. At least two Lowercase letters\n3. At least two Digits");

        while(Condition)
        {
            System.out.println("=====================================================================================");
            System.out.println("Enter Password: ");
            s=scan.next();
            System.out.println("=====================================================================================");
            char pass[]= new char[s.length()];
            pass=s.toCharArray();
            len=s.length();
            Condition=cl.Check_Password(pass, len, uc, lc, dc);
            if(Condition==true)
            {
                System.out.println("Wrong Password Try again");
                System.out.println("Conditions to Satisfy:\n1 .At  least  two  Uppercase letters\n2. At least two Lowercase letters\n3. At least two Digits");
            }
            else
            {
                System.out.println("Password Confirmed!!");
                System.out.println("=====================================================================================");               
            }
        }
    }
}
