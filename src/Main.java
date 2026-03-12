public class Main {
    public static void main(String[] args) {

        int[] poleCisel = {1,2,3,4,5,6,7,8,9};
        int pocetJednicek = 0;
        for (int p : poleCisel) {
            if (p == 1){
                pocetJednicek++;
            }
        }

        if (pocetJednicek == 1){
        System.out.println("ANO");
    }else{
            System.out.println("NE");
        }

        int pocet1 = 0;
        int pocet2 = 0;
        int pocet3 = 0;
        int pocet4 = 0;
        int pocet5 = 0;
        int pocet6 = 0;
        int pocet7 = 0;
        int pocet8 = 0;
        int pocet9 = 0;


        for (int p : poleCisel) {
            if (p == 1){pocet1++;}
            if (p == 2){pocet2++;}
            if (p == 3){pocet3++;}
            if (p == 4){pocet4++;}
            if (p == 5){pocet5++;}
            if (p == 6){pocet6++;}
            if (p == 7){pocet7++;}
            if (p == 8){pocet8++;}
            if (p == 9){pocet9++;}
        }

        if (pocet1 == 1 && pocet2 == 1 && pocet3 == 1 && pocet4 == 1 && pocet5 == 1 && pocet6 == 1 && pocet7 == 1 && pocet8 == 1 && pocet9 == 1){
            System.out.println("ANO");
        }else {
            System.out.println("NE");
        }

        int[] pocty = new int[9];


    }
}