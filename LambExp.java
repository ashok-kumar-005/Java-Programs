import java.util.*;
interface SmallLargest
{  
    public void Calculate(int x,int y,int z);  
}  
  
class LambExp
{  
    public static void main(String[] args) 
    {  
        Scanner sObj = new Scanner(System.in);
        int a,b,c;
        SmallLargest SL=(x,y,z)->{ 
                                    int largest,smallest;
                                    largest = (x > y ? (x > z ? x : z) : (y > z ? y : z)); 
                                    smallest = (x < y ? (x < z ? x : z) : (y < z ? y : z)); 
                                    System.out.println("The largest among "+x+" "+y+" "+z+" is "+largest);  
                                    System.out.println("The smallest among "+x+" "+y+" "+z+" is "+smallest);  
                                 };  
        System.out.println("Enter any three numbers : ");
        a = sObj.nextInt(); b = sObj.nextInt(); c = sObj.nextInt();
        SL.Calculate(a,b,c);  
    }  
}