package Teszt1;

public class teszt1 {
    public static void main(String[] args) {
    }

    //    Adott két kenguru, akik a számegyenesen ugrálnak. Az első kenguru az x1 helyről indul, és v1 egységet ugrik
    //    (a pozitív irányba), a második kenguru pedig x2 helyről indul és egy ugrással v2 egységet ugrik. Döntsük
    //    el, hogy a két kenguru fog-e egy időben egy helyen tartózkodni a számegyenesen!
//    Valósítsd meg a kangaroosMeet metódust, amely az x1, v1, x2 és v2 értékét bemeneti paraméterül kapja! (A
//    bemeneti számok nemnegatív egészek lehetnek. A metódusnak a bemenetet nem kell ellenőriznie.) A metódus
//    visszatérési értéke a döntésnek megfelelő boolean érték legyen. (5p)
//
//    Példa #1:
//    x1 = 0; v1 = 3; x2 = 4; v2 = 2; esetén a kenguruk ugrásai:
//            0 => 3 => 6 => 9 => 12 illetve 4 => 6 => 8 => 10 => 12, tehát mindketten pontosan 4 ugrással jutottak
//            el a 12-es számra, így a válaszunk a feladat kérdésére igen.
//
//    Példa #2:
//    x1 = 0; v1 = 2; x2 = 5; v2 = 3; esetén viszont látszik, hogy az első kenguru hátrábbról indul és lassabb is,
//    tehát nem fognak találkozni semmikor a jövőben.
//
//    Bónusz kérdés (+2 pont): Megvalósítható-e ez a kangaroosMeet metódus O(1) futásidővel? Ha igen, akkor
//    implementáld le, ha nem, akkor indokold, hogy miért nem!
    public static boolean kangaroosMeet(int x1, int v1, int x2, int v2) {
        boolean answer = false;
        if (x1 < x2)
            while (x1 <= x2) {
                if (x1 == x2) {
                    answer = true;
                    break;
                }
                x1 += v1;
                x2 += v2;
            }
        if (x2 < x1)
            while (x2 <= x1) {
                if (x2 == x1) {
                    answer = true;
                    break;
                }
                x1 += v1;
                x2 += v2;
            }
        if (x1 == x2){
            answer = (v1==v2);
        }
        return answer;
    }


    //    Valósítsd meg a stairs metódust! A metódus egy egész számot vár bemenetként, és rajzoljon ki a kimenetre az
//    alább látható módon egy ilyen magas lépcsőt # és szóköz karakterekből! (A metódusnak a bemenetet nem kell
//    ellenőriznie.) (3p)
//    Példa kimenet height=5 bemenet esetén:
//            #
//            ##
//            ###
//            ####
//            #####
    public static void stairs(int height) {
        String[][] lepcsok = new String[height][height];
        for (int i = 0, hashIdx = lepcsok.length - 2; i < lepcsok.length; i++) {
            for (int j = 0; j < lepcsok[i].length; j++) {
                if (j <= hashIdx) {
                    lepcsok[i][j] = " ";
                    System.out.print(lepcsok[i][j]);
                } else {
                    lepcsok[i][j] = "#";
                    System.out.print(lepcsok[i][j]);
                }
            }
            System.out.println();
            hashIdx--;
        }
    }

    //    Mennyi a különbség a mátrix két átlójában szereplő elemek összege között? Valósítsd meg a
    //    matrixDiagonalDifference metódust! A metódus egy kétdimenziós tömböt kap paraméterül, és visszatérési értéke a
    //    mátrix átlóiban szereplő számok összegei közötti eltérés. (Ügyelj arra, hogy a metódusod visszatérési értéke a
    //    kérdésnek megfelelően mindig nemnegatív szám legyen! Feltételezheted, hogy a bemenetül kapott kétdimenziós
    //    tömb
    //    négyzetes mátrix, azaz a sorainak és oszlopainak száma egyenlő.) (3p)
    //    Írd meg a metódus szignatúráját saját magad!
    //    A metódus neve matrixDiagonalDifference legyen.
    public static int matrixDiagonalDifference(int[][] numbers) {
        int diagSumLeftToRight = 0;
        int diagSumRightToLeft = 0;
        for (int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
            diagSumLeftToRight += numbers[i][i];
            diagSumRightToLeft += numbers[i][j];
        }
        return Math.abs(diagSumLeftToRight - diagSumRightToLeft);
    }

    //    Valósítsd meg a matrixTopLeftNumber metódust! A metódus egy kétdimenziós tömböt kap paraméterül, és adja
    //    vissza ennek a mátrixnak a bal felső (első) elemét! (2p)
    public static int matrixTopLeftNumber(int[][] numbers) {
        return numbers[0][0];
    }

    //    Valósítsd meg a countSameNumbers metódust! A metódus két egészeket tartalmazó tömb paramétert kap, és azt
    //    kell megszámolnia, hogy hány elem szerepel az első tömbből a második tömbben! (Ügyelj arra, hogy ha egy
    //    szám többször szerepel a második tömbben, akkor azt csak egynek számold! Feltételezheted, hogy az első
    //    tömbben minden szám csak egyszer fordul elő.) (3p)
    //    Példa: {0, 1, 2, 3, 4} és {5, 6, 5, 4, 4, 4, 3} bemenetek esetén a kimenet 2 legyen, mert az első tömbből csak
    //    a 3-as és 4-es szám szerepel a második tömbben.
    public static int countSameNumbers(int[] numbers, int[] otherNumbers) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < otherNumbers.length; j++) {
                if (numbers[i] == otherNumbers[j]) {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }

    //    Szerepel-e a 101-es szám a tömbben? Valósítsd meg az alábbi findNumber101 metódust! A metódus visszatérési
    //    értéke legyen az az index, ahol a tömbben először szerepel a 101-es szám! Ha a tömbben ez a szám nem
    //    szerepel, akkor a visszatérési érték legyen -1. (2p)
    public static int findNumber101(int[] numbers) {
        int pos101 = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 101) {
                pos101 = i;
                break;
            }
        }
        return pos101;
    }


    //    Valósítsd meg az alábbi countEvenNumbers metódust! A metódus adja vissza, hogy a paraméterként kapott
    //    tömbben hány páros szám szerepel! (2p)
    public static int countEvenNumbers(int[] numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    //    Valósítsd meg az alábbi getLastNumber metódust! A metódus adja vissza a paraméterként kapott tömb utolsó
    //    elemét! (2p)
    public static int getLastNumber(int[] numbers) {
        return numbers[numbers.length - 1];
    }
}
