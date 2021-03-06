public class Problem2 {
    /*
    Each new term in the Fibonacci sequence is generated by adding the previous two terms.
    By starting with 1 and 2, the first 10 terms will be:

    1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

    By considering the terms in the Fibonacci sequence whose values do not exceed four million, find
    the sum of the even-valued terms.
     */
    public static void main(String[] args) {
        fibonacciSeries();
    }

    public static void fibonacciSeries(){
        float fistTerm = 1;
        float secondTerm = 2;
        float newTerm = 0;
        float sum = 0.00f;

        System.out.println(fistTerm);
        System.out.println(secondTerm);

        while(newTerm <= 4000000){

            if (secondTerm%2 == 0){
                sum += secondTerm;
            }

            newTerm = fistTerm + secondTerm;
            fistTerm = secondTerm;
            secondTerm = newTerm;

            if (newTerm > 4000000){
                break;
            }



            //System.out.println(newTerm);

        }

        System.out.println("La sumas es: " + sum);
    }

}
