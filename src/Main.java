public class Main {
    public static void main(String[] args) {
       double[] numbers ={21.9, 18.4, -21.7, 1.19, -1.9, 4.19, 9.13, 16.15, -11.18, 1.12, 7.4, 11.11, 5.8, 9.5, -5.14};
       double lang = 0;
       int reac = 0;
       boolean bool = false;
       for (double f : numbers) {
           if (f < 0) {
               bool = true;
           } else if (bool) {
               reac++;
               lang += f;
           }
       }
        System.out.println(lang / reac);
        }
    }