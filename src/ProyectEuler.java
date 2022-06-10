public class ProyectEuler {

    public static void main(String[] args) {
        System.out.println("Que paso con el run");

        long sum = 0;
        for (long i = 1; i < 1000 ; i++) {
            if( i%5 == 0 || i%3 == 0){
                //System.out.println(i);
                sum += i;
            }
        }

        System.out.println("The sum is: " + sum);
    }
}
