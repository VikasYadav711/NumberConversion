import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.swing.text.html.parser.Element;

class romantoint {
    public static int romanToInt(String s) {
        int num=0;
        int temp3=s.length();
        for(int i=0;i<temp3;i++)
        {
          //  String temp2="";
            char temp= s.charAt(i);
           
            if(temp=='I' && i+1<temp3 && s.charAt(i+1)=='V')
            {
               // temp2="IV";
               num+=4;
               // i++;
                i++;
            }
            else if(temp=='I' && i+1<temp3 && s.charAt(i+1)=='X')
            {
                num+=9;
                //temp2="IX";
                //i++;
                i++;
            }
            else if(temp=='X' && i+1<temp3 && s.charAt(i+1)=='L')
            {
                num+=40;
                //temp2="XL";
                //i++;
                i++;
            }
            
            else if(temp=='X' && i+1<temp3 && s.charAt(i+1)=='C')
            {
                num+=90;
                //temp2="XC";
                //i++;
               i++;
            }
            
            else if(temp=='C' && i+1<temp3 && s.charAt(i+1)=='D')
            {
                num+=400;
                //temp2="CD";
               // i++;
               i++;
            }
            
            else if(temp=='C' && i+1<temp3 && s.charAt(i+1)=='M')
            {
                num+=900;
            //    temp2="CM";
                i++;
            }
            
           // if(temp==("I" || "V" || "X" || "L" || "C" || "D" || "M"))
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
                // switch(temp)
                // {
                //     case "V": num+=5; break;
                //     case "I": num+=1; break;
                //     case "X": num+=10; break;
                //     case "L": num+=50; break;
                //     case "C": num+=100; break;
                //     case "D": num+=500; break;
                //     case "M": num+=1000; break;
                // }
            }
            }
        }
        return num;
       // System.out.println(num);
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