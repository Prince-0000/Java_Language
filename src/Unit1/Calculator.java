package Unit1;

public class Calculator {
    double add(double a,double b){
        return a+b;
    }
    public double subtract(double a,double b){
        return a-b;
    }
    public double multiply(double a, double  b){
        return a*b;
    }
    public double divide(double a, double b) throws ZeroException{
        if(b==0) throw new ZeroException();
        return a/b;
    }
}
