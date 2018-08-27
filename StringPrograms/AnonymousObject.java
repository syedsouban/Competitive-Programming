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