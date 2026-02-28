public class Loops {
    public static void main(String[] args) {
        /*
        while(expression){
            do something
            updation;
          }
         */

        /*
        do{
            do something
            updation;
          }while(expression);
         */

        /*
            for(initialization;condition;updation){
                do something;
              }
         */

//        int num = 0;
//        while(num <= 10){
//            System.out.println(num);
//            num++;
//        }

        for(int i = 1;i <= 5;i++){
            for(int j = 1;j <= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
