
PROBLEM STATEMENT
Points: 30

Lord Paul of the Seven Kingdoms has organized a fighting tournament between all the warriors of the kingdom. He finally gets the match summary of the entire tournament, which states which warrior fought with which warrior. Lord Paul wants you to find out the number of warriors who participated in maximum number of matches. (Which means they survived these many matches!) If there are warriors with equal number of matches, print all of them in lexicographical order (sorted order).

Input:

First line of input contains number of matches N.
Next N lines contains two names of worriers who fought with each other.

Output:

Print number of worriers who participated in maximum numbers of matches. If there are warriors with equal number of matches, print all of them in lexicographical order (sorted order).

Constraints:

1 ? N ? 105
1 ? |length of team name| ? 20

Note:

All team names will be in Uppercase only.
SAMPLE INPUT

5
GER JAP
IND JAP
GER JAP
IND BRZ
IND POL

SAMPLE OUTPUT

2
IND
JAP



public class AnonymousObject
{
    public static void main(String args[])
    {
        Number n=new Number()
        {
       public void printNumber()
       {
           int n=12;
           System.out.println(n+" is the number");
       }
        };
        n.printNumber();
    }
}
interface Number
    {
        
        
        public void printNumber();

    }