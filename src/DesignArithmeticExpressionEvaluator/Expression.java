package DesignArithmeticExpressionEvaluator;

public class Expression implements ArithmeticExpression{

    private ArithmeticExpression leftArithmeticExpression;
    private ArithmeticExpression rightArithmeticExpression;
    private Operation operation;

    public Expression(ArithmeticExpression leftPart, ArithmeticExpression rightPart,Operation operation) {
        leftArithmeticExpression = leftPart;
        rightArithmeticExpression = rightPart;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        switch (operation){
            case ADD:
                return leftArithmeticExpression.evaluate()+rightArithmeticExpression.evaluate();
            case SUBTRACT:
                return leftArithmeticExpression.evaluate()-rightArithmeticExpression.evaluate();
            case MULTIPLY:
                return leftArithmeticExpression.evaluate()*rightArithmeticExpression.evaluate();
            case DIVIDE:
                return leftArithmeticExpression.evaluate()/rightArithmeticExpression.evaluate();
        }
        return 0;
    }
}
