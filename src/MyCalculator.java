public class MyCalculator implements Calculator {

    @Override
    public int calculate(int num1, int num2, String op){
        if(op.equals("+")){
            return num1+num2;
        }
        else if(op.equals("-")){
            return num2-num1;
        }
        else if(op.equals("*")){
            return num1*num2;
        }
        else {
            return num2/num1;
        }
    }
}