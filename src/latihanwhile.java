import java.util.Scanner;
public class latihanwhile {
    public static void main(String[]args)
    {
        Scanner input= new Scanner (System.in);
        System.out.println ("masukkan nilai:");
        int nilai=input.nextInt();
        int nombor;
        while(nilai>=0)
        {
        
        for(nombor=1;nombor<=nilai;nombor++)
        {
            System.out.print(" "+nilai);
        } 
        System.out.println("");
        nilai--;
        }               
    }
}
