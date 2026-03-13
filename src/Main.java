public class Main {
    public static void main(String[] args) {

        int[] poleCisel = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int pocetJednicek = 0;
        for (int p : poleCisel) {
            if (p == 1) {
                pocetJednicek++;
            }
        }

        if (pocetJednicek == 1) {
            System.out.println("ANO");
        } else {
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
            if (p == 1) {
                pocet1++;
            }
            if (p == 2) {
                pocet2++;
            }
            if (p == 3) {
                pocet3++;
            }
            if (p == 4) {
                pocet4++;
            }
            if (p == 5) {
                pocet5++;
            }
            if (p == 6) {
                pocet6++;
            }
            if (p == 7) {
                pocet7++;
            }
            if (p == 8) {
                pocet8++;
            }
            if (p == 9) {
                pocet9++;
            }
        }

        if (pocet1 == 1 && pocet2 == 1 && pocet3 == 1 && pocet4 == 1 && pocet5 == 1 && pocet6 == 1 && pocet7 == 1 && pocet8 == 1 && pocet9 == 1) {
            System.out.println("ANO");
        } else {
            System.out.println("NE");
        }

        int[] pocty = new int[9];

        for (int p : poleCisel) {
            if (p >= 1 && p <= 9) {
                pocty[p - 1]++;
            }
        }

        boolean kontrola = true;
        for (int i = 0; i < pocty.length; i++) {
            if (pocty[i] != 1) {
                kontrola = false;
            }
        }

        if (kontrola) {
            System.out.println("ANO");
        } else {
            System.out.println("NE");
        }

        int[][] pole = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9}
                /*{1, 1, 1, 1, 1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3, 3, 3, 3, 3},
                {4, 4, 4, 4, 4, 4, 4, 4, 4},
                {5, 5, 5, 5, 5, 5, 5, 5, 5},
                {6, 6, 6, 6, 6, 6, 6, 6, 6},
                {7, 7, 7, 7, 7, 7, 7, 7, 7},
                {8, 8, 8, 8, 8, 8, 8, 8, 8},
                {9, 9, 9, 9, 9, 9, 9, 9, 9}*/
        };

        int[] pocty1 = new int[9];
        for (int i = 0; i < 9; i++) {
            pocty1[pole[0][i] - 1]++;
        }

        boolean kontrola1 = true;
        for (int p : pocty1) {
            if (p != 1) {
                kontrola1 = false;
            }
        }
        if (kontrola1) {
            System.out.println("ANO");
        } else {
            System.out.println("NE");
        }

        int[] pocty2 = new int[9];
        for (int i = 0; i < 9; i++) {
            pocty2[pole[1][i] - 1]++;
        }

        boolean kontrola2 = true;
        for (int p : pocty2) {
            if (p != 1) {
                kontrola2 = false;
            }
        }
        if (kontrola2) {
            System.out.println("ANO");
        } else {
            System.out.println("NE");
        }

        int[][] vsechnyRadky = new int[9][9];
        boolean kazdaKontrola = true;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                vsechnyRadky[i][pole[i][j] - 1]++;
            }
            for (int k = 0; k < 9; k++) {
                if (vsechnyRadky[i][k] != 1) {
                    kazdaKontrola = false;
                }
            }
        }
        if (kazdaKontrola) {
            System.out.println("ANO");
        } else {
            System.out.println("NE");
        }


        boolean kazdySloupec = true;
        for (int j = 0; j < 9; j++) {
            int[] sloupce = new int[9];
            for (int i = 0; i < 9; i++) {
                sloupce[pole[i][j] - 1]++;
            }
            for (int p : sloupce) {
                if (p != 1) {
                    kazdySloupec = false;
                }
            }
        }
        if (kazdySloupec) {
            System.out.println("ANO");
        } else {
            System.out.println("NE");
        }

        boolean finalniKontrola = true;

        for (int i = 0; i < 9; i++) {
            if (kontrolujPole(pole[i]) == false) {
                finalniKontrola = false;
            }
        }

        for (int j = 0; j < 9; j++) {
            int[] sloupec = new int[9];
            for (int i = 0; i < 9; i++) {
                sloupec[i] = pole[i][j];
            }
            if (kontrolujPole(sloupec) == false) {
                finalniKontrola = false;
            }
        }

        if (finalniKontrola) {
            System.out.println("ANO");
        } else {
            System.out.println("NE");
        }
    }

    public static boolean kontrolujPole(int[] pole) {
        int[] pocty = new int[9];
        for (int p : pole) {
            if (p >= 1 && p <= 9) {
                pocty[p - 1]++;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (pocty[i] != 1) {
                return false;
            }
        }
        return true;

    }
}