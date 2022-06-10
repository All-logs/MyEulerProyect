/*
  The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143 ?

 */

public class Problem3 {
    public static void main(String[] args) {
        double largestPrimerFactor = 0.0;
        double numerote = 600851475143.0;

        for (double i = (600851475143.0-100); i < numerote; i++) {
            if (esPrimov2(i)) {
                largestPrimerFactor = i;
            }
        }

        if (largestPrimerFactor == 0){
            System.out.println("fallo");
        }else {
            System.out.println("ultimo " + largestPrimerFactor);
        }

    }

    public static void esPrimo(long chekNum){
        System.out.println(chekNum + "<-");
        int aux = 0;
        for (long i = 2; i < chekNum; i++) {

            if(chekNum%i == 0){
                aux++;
                break;
            }

            if(i+1 == chekNum){
                System.out.println(chekNum + " es primo");
            }

        }

        if(aux > 0){
            System.out.println(chekNum + " no es primo");
        }

        System.out.println(aux);
    }


    public static boolean esPrimov2 (double chekNum){
        //System.out.println(chekNum + "<-");
        //long largestPrimerFactor;
        int aux = 0;
        double i;
        for (i = 2; i < chekNum; i++) {

            if((chekNum % i) == 0){
                aux++;
                break;
            }
        }

        if(aux == 0 ){
            //System.out.println(chekNum + " es primo");
            return true;
        }

       /* if(aux > 0){
            System.out.println(chekNum + " no es primo");
        }
        */

        //System.out.println(aux);
        return false;
    }
}
