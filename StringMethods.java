import java.util.*;
class StringMethods
{
  public static void main(String args[])
  {
    Scanner inp=new Scanner(System.in);
    String str1 = "Ashok";
    String str2 = "ashok";
    char ch = str1.charAt(2);
    System.out.println("Character at index 2 is : "+ch);
    System.out.println("Comparison of "+str1+" and "+str2+" is "+str1.compareTo(str2));
    System.out.println("Comparison of "+str2+" and "+str1+" is "+str2.compareTo(str1));
    System.out.println("Concatenation of "+str1+" and "+str2+" is "+str1.concat("@").concat(str2).concat(".com"));
    System.out.println("String "+str1+" contains h or not ?"+str1.contains("h"));
    System.out.println("String "+str1+" contains z or not ?"+str1.contains("z"));
    System.out.println("String "+str1+" starts with 'A' ?"+str1.startsWith("A"));
    System.out.println("String "+str1+" starts with 'a' ?"+str1.startsWith("a"));
    System.out.println("String "+str1+" ends with 'k' ?"+str1.endsWith("k"));
   System.out.println("String "+str1+" ends with 'K' ?"+str1.endsWith("K"));
   System.out.println(str1+" equals to "+str2+" : "+str1.equals(str2));
   System.out.println("ashok equals to "+str2+" : "+("ashok").equals(str2));
   System.out.println(str1+" equals to "+str2+" by ignoring case :  "+str1.equalsIgnoreCase(str2));
   String s1 = " ";
   System.out.println("s1 is empty : "+s1.isEmpty()); 
   System.out.println("Joining strings "+str1+" and "+str2+" : "+String.join("and",str2,str1));
   String ash = "Hello Ashok";
   System.out.println("Last index of l from this string 'Hello Ashok' is at  "+ash.lastIndexOf('l'));
   System.out.println("Last index of l from this string 'Hello Ashok' is at  "+ash.lastIndexOf('o'));
   System.out.println("Length of string 'Hello Ashok' :  "+ash.length());
   System.out.println("Replacing 'l' with lllllllllllll from String  'Hello ashok'"+ash.replace("l","llllllllllllllllll")); 
   String repall = "hello this is me Ashok and Ashok is my Official name";
   System.out.println("Replacing 'Ashok' with 'Shoku'  from String  'repall' "+repall.replace("Ashok","Shoku"));  
   String[] wordlist = repall.split("\\s");
   System.out.println("By splitting 'repel' string : ");
   for(String words:wordlist)
      System.out.println(words);    
    int year = 2021;
    System.out.println("Conversion of integer "+year+" to string is : "+String.valueOf(year));
    String spaces = " This sentence contains spaces   ";
    System.out.println("After removing spaces from string \n"+spaces+" is : \n"+spaces.trim());
    System.out.println("Converts full string \n"+spaces+" to uppercase  : \n"+spaces.toUpperCase());
    System.out.println("Converts full string \n"+spaces+" to lowercase  : \n"+spaces.toLowerCase());
    System.out.println("Converts full string \n"+spaces+" to characters of Array  : ");
    char[] characters = spaces.toCharArray();
    for(int i=0;i<characters.length;i++)
      System.out.println(characters[i]);
    String sub = "Hello Java";
    System.out.println("Substring of "+sub+" is : "+sub.substring(3));
    System.out.println("Substring of "+sub+" is : "+sub.substring(3,8));
    System.out.println("Substring of from 0 "+sub+" is : "+sub.substring(-1));
  }
}