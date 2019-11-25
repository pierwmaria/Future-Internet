package Array;

public class Esempio_1 {
    public static void main(String args[]) {
        int[] X = {24, 34, 23, 45, 12, 36, 56, 89, 90, 3, 71};
        int max, i;
        max = X[10];
        for (i = 1; i < X.length; i++) {
            // attenzione perchè non può essere <= 10 se no indexOutofBounds
            if (X[i] > max) {
                max = X[i];
            }
        }
        int somma = 0;
        for (i = 0; i < X.length; i++) {
            somma = somma + X[i];
        }
        float media = somma / X.length;

        System.out.println("media = " + media);

        System.out.println("Massimo = " + max);

        //in quale posizione si trova un certo elemento , il 7?

        int[] Y = {12, 23, 27, 7, 34, 17, 19, 8};
        //ciclo for che scorre tutti gli elementi del v, e quando trova l'elemento lo segna in una var

        int posizione = -1;
        int elementoDaTrovare = 7;

        for (i = 0; i < Y.length; i++) {
            if (Y[i] == elementoDaTrovare) {
                posizione = i;
            }
        }
        if (posizione == -1){
            System.out.println("non trovato");}

            else {
                System.out.println("trovato");
                System.out.println(posizione);
        }

        System.out.println("Posizione elemento da trovare = " + posizione);
        // con il ciclo while è possibile creare più sentenze per terminar eil ciclo
        i = 0;
        while (i < X.length and posizione == -1){
            if (X[i] == elementoDaTrovare)
            {posizione = i;}
            i ++;
        }
    }
}
