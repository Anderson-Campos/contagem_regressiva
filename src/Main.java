public class Main {
    public static void main(String[] args) {

        for (int i = 10; i > 0  ; i--) {
            System.out.println(i);
        }
        System.out.println("Finalizou FOR");
        System.out.println("------------------------------------");

        int w = 10;
        while(w > 0){
            System.out.println(w);
            w--;
        }
        System.out.println("Finalizou WHILE");
        System.out.println("------------------------------------");

        int dw = 10;
        do {
            System.out.println(dw);
            dw--;
        }while (dw > 0);
        System.out.println("Finalizou DO WHILE");
        System.out.println("------------------------------------");

    }
}