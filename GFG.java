import java.util.*;
//https://www.geeksforgeeks.org/stock-buy-sell/
public class GFG {
    public GFG() {
        super();
    }
    Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        GFG gfg = new GFG();
        Scanner s = new Scanner(System.in);
        //System.out.println("please enter the number");
        int Testcases = Integer.parseInt(s.nextLine());
        int i;    
        for(i=0;i<Testcases;i++)
        {   
            gfg.action();
        }
        s.close();
    }

    public void action()
    {
        int n = Integer.parseInt(s.nextLine());
        //int() A = new int(n);
        String all_input = s.nextLine();
        
        String[] integerStrings = all_input.split(" "); 
        // Splits each spaced integer into a String array.
        int[] A = new int[n]; 
        // Creates the integer array.
        for (int i = 0; i < A.length; i++){
            A[i] = Integer.parseInt(integerStrings[i]); 
        //Parses the integer for each string.
        }
        
        int LP=0,HP=0;
        
        int j=1;
        
        while(j<=(A.length-1))
        {
            if(A[j]>A[HP])
            {
                HP=j;
                j=j+1;
               //System.out.print("HP IS first"+HP);
                //System.out.print("LP IS first "+LP);
                
                if(HP==(A.length-1))
                {
                    if(HP-LP==0)
                    {
                        //System.out.print("came here 2");
                        if(HP==A.length-1){
                        System.out.println("No Profit");
                        }
                    }
                    else{
                    
                    System.out.print("("+LP+" "+HP+")" );
                    }    


                }
    
            }
            else if(A[j]==A[HP])
            {
                HP=j;
                if(A[LP]==A[HP])
                {
                LP=j;    
                }
                j=j+1;
    
                if(HP-LP==0)
                    {
                        //System.out.print("came here 2");
                        if(HP==A.length-1){
                        System.out.println("No Profit");
                        }
                    }

            }

            else    
            {
                if(HP-LP>0)
                {
                    //System.out.print("came here 1");
                      System.out.print("("+LP+" "+HP+")" );
                 
                 
                    //System.out.print("HP IS "+HP);
                    //System.out.print("LP IS "+LP);
                    
                }
                   
                HP=j;
                LP=j;
                j=j+1;
               
                
            }
            
            
        }
        
        
    }

}
