public class Calculator {
    private String operation;
    private double num1;
    private double num2;
    private double res;
    private boolean flag;

    {
        res = 0.0;
        flag = true;
    }

    //constructor
    public Calculator(String operator, double num1, double num2) {
        this.operation = operator;
        this.num1 = num1;
        this.num2 = num2;
    }
    //constructor

    //setters and getters
    public String getOperator() {
        return operation;
    }

    public void setOperator(String operator) {
        this.operation = operator;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    //setters and getters

    //metods
    public void calculated() {
        if (operation.equals("+") || operation.equals("*") || operation.equals("/") || operation.equals("-")) {
            switch (operation) {
                case "+":
                    res = num1 + num2;
                    break;
                case "-":
                    res = num1 - num2;
                    break;
                case "*":
                    res = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0.0) {
                        try {
                            throw new RuntimeException();
                        } catch (RuntimeException e) {
                            System.out.println("Error! Division by zero");
                            flag = false;
                        }
                    } else {
                        res = num1 / num2;
                    }
            }
        } else {
            try {
                throw new OperationError();
            } catch (OperationError e) {
                System.out.println("Operation Error!");
                flag = false;
            }
        }

        if (flag) {
            System.out.println(res);
        }
    }
    //metods
}
class OperationError extends Exception{
    public OperationError(){};
}
