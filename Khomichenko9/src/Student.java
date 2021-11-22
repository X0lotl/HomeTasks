public class Student {
    private final String _firstname;
    private final String _lastname;

    Student(String firstname, String lastname){
        this._firstname = firstname;
        this._lastname  = lastname;
    }
    void printStudent10Times(){
        for (int i = 0; i<10; i++){
            System.out.printf("%s %s\n", this._firstname, this._lastname);
        }
    }

    void squaresTable(){
        for (int i = 1; i <= 5; i++){
            int number = ((i*2) - 1);
            System.out.printf("%d^2 = %d \n", number, number*number);
        }
    }

    void sumNFirst(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    void sumNFirstOdd(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            int number = ((i*2) - 1);
            sum += number;
        }
        System.out.println(sum);
    }

    void sumNFirstMultiplicativeInverse(int n){
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double number = i;
            System.out.println(1/number);
            sum += (1 / number);
        }
        System.out.println(sum);
    }
    void powerOfTwoTable(){
        for (int i = 0; i <= 10; i++){
            int number = (int) Math.pow(2,i);
            System.out.printf("2^%d = %d \n", i, number);
        }
    }
    void factorial(int number){
    }
}