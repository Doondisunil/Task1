Interface Calc{
void calculate(int a);
}
class SubCalc1 implements Calc{
public void calculate(int a){
System.out.println("Square:"+(a*a));
}
}
class SubCalc2 implements Calc{
public void calculate(int a){
System.out.println("Square root:"+Math.sqrt(a));
}
}
public class InterfaceEx{
public static void main(String[] args){
Calc c1=new SubCalc1();
c1.calculate(5);
Calc c2=new SubCalc2();
c2.calculate(36);
}
}
