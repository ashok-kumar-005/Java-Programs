import java.util.*;
interface finding
{  
    public void find();  
}  
  
class largeorsmall
{  
    public static void main(String[] args) 
    {  
        Scanner obj = new Scanner(System.in);

        finding f=()->{ 
                                    int a,b,c;
                                    System.out.println("Enter any three numbers : ");
                                    a = obj.nextInt(); b = obj.nextInt(); c = obj.nextInt();
                                    int largest,smallest;
                                    if(a > b)
                                    {
                                        if(a > c)
                                            largest = a;
                                        else
                                            largest = c;
                                        if(b < c)
                                            smallest = b;
                                        else
                                            smallest = c;
                                    }
                                    else
                                    {
                                        if(b > c)
                                            largest = b;
                                        else
                                            largest = c;
                                        if(a < c)
                                            smallest = a;
                                        else
                                            smallest = c;
                                           
                                    }
                                    System.out.println("Largest : "+largest);  
                                    System.out.println("Smallest : "+smallest);  
                                 };  
        
        f.find();  
    }  
}