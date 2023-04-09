import java.util.Scanner;
public class flames {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 1st Name:");
        String name1=sc.nextLine();
        System.out.println("Enter your 2nd Name:");
        String name2=sc.nextLine();
        // System.out.println("Enter number of word occured more than one time in both names:");
        // int samelen=sc.nextInt();
        maincode s=new maincode();
        String namesort=name1.toLowerCase();
        String name1sort=name2.toLowerCase();
        s.check(namesort,name1sort);
    }
    
}
class maincode{
    public void check(String n,String m)
    {
        String name1=n;
        String name2=m;
        int count=0;
       
        for(int i=0;i<name1.length();i++)




        {
            for(int j=0;j<name2.length();j++)
            {
                char c=name1.charAt(i);
                 char d=name2.charAt(j);
                 if(c==d)
                 {
                   count++;
                 }
                
            }

        }
     int name1len=name1.length();
     int name2len=name2.length();
     int total=(name1len+name2len);
     int flam=total%6;
     switch(flam)
     {
        case 1:
        System.out.println("You both are Friends");
        break;
        case 2:
        System.out.println("You both are Lovers");
        
        break;
        case 3:
        System.out.println("You both are Affectonate");
        break;
        case 4:
        System.out.println("You both are Married/going to Marry");
        break;
        case 5:
        System.out.println("You both are Enemies");
        break;
        case 6:
        System.out.println("You both are Sblings");
     }

     


       
       
        
    }
}
