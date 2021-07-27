public class Function {

    //default constructor
    public Function(){

    }

    //1st constructor : Contain all method needed
    public Function(double x, double y){
        multiply(x, y);
        divide(x,y);
        add(x,y);
        subtract(x,y);
    }

    //multiply method
    public double multiply(double num1, double num2){
        return num1*num2;
    }

    //division method
    public double divide(double num1, double num2){
        return num1/num2;
    }

    //addition method
    public double add(double num1, double num2){
        return num1+num2;
    }

    public double subtract(double num1, double num2){
        return num1 - num2;

    }


}//end of function class
