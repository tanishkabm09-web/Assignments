package lambdaExpressions;




    interface Calculator{
        int operate(int a, int b);
    }
     class LamdbaReturnStatement {
        public static void main(String[] args) {
            Calculator multiply = (a, b)->{
                int result = a*b;
                return result;
            };
            System.out.println("Multiplication : " + multiply.operate(10,15));
        }

    }

