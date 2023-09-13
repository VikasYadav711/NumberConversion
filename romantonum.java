import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.swing.text.html.parser.Element;

class romantoint {
    public static int romanToInt(String s) {
        int num=0;
        int temp3=s.length();
        for(int i=0;i<temp3;i++)
        {
  
            char temp= s.charAt(i);
           
            if(temp=='I' && i+1<temp3 && s.charAt(i+1)=='V')
            {
                num+=4;
                i++;
            }
            else if(temp=='I' && i+1<temp3 && s.charAt(i+1)=='X')
            {
                num+=9;
                i++;
            }
            else if(temp=='X' && i+1<temp3 && s.charAt(i+1)=='L')
            {
                num+=40;
                i++;
            }
            
            else if(temp=='X' && i+1<temp3 && s.charAt(i+1)=='C')
            {
                num+=90;
               i++;
            }
            
            else if(temp=='C' && i+1<temp3 && s.charAt(i+1)=='D')
            {
                num+=400;
               i++;
            }
            
            else if(temp=='C' && i+1<temp3 && s.charAt(i+1)=='M')
            {
                num+=900;
                i++;
            }
            
      
           else 
           {
             if(temp=='I' || temp== 'V' || temp== 'X' || temp=='L' || temp=='C' || temp=='D' || temp=='M')
            {
                 switch(temp)
                {
                    case 'V': num+=5; break;
                    case 'I': num+=1; break;
                    case 'X': num+=10; break;
                    case 'L': num+=50; break;
                    case 'C': num+=100; break;
                    case 'D': num+=500; break;
                    case 'M': num+=1000; break;
                }

            }
            }
        }
        return num;
    }
  

    public static void main(String args[])
    {
        String st;
        Scanner sc=new Scanner(System.in);
        st=sc.next();
        int res=romanToInt(st);
        System.out.println(res);
    }
}