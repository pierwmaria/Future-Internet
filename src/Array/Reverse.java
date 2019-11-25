package Array;

public class Reverse {
    int x[] = {3,37,21,14,8,9,13,12};
    int y[] = new int[N];
    int i = 0;
    int j = N - 1;
    //ciclo per inserire i numeri d aun vettore all'altro, al contrario
    for (i = 0; i < N ; i++ ){
        y[j] = x [i];
        j --;
    }
    //oppure con il ciclo while
    //int i = 0;
    //int j = N - 1;
    while (i < N){
        y[j] = x [i];
        i ++;
        j --;
    }
    // OPpure scambiare sullo stesso vettore gli elementi, sen∑a crearne un nuovo
    //int i = 0;
    //int j = N -1;
    for ( i = 0; i < N/2; i ++){
        // scambia x[i] con x[j]
        j--;
    }
    // Con il while
    //int i = 0;
    //int j = N - 1;
    while ( i < N/2){
        int a = x[i];
        x[i] = x [j];
        x[j]= a;
        i++;
        j--;
    }

}
