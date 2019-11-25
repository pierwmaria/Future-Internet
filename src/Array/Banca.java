package Array;

public class Banca {
    Titolare tit;
    Conto[] conti;
    public Banca(){
        tit = new  Titolare();
        conti = new Conto[100];
        int i;
        for (i=0; i < 100; i++){
            conti[i] = new Conto();
        }
    }


    public void setTitolare ( String c, String n, String i) {
        tit.setCognome(c);
        tit.setNome(n);
        tit.setIndirizzo(i);
    }
    //public void setTitolareConto(int i, String c, String n, int ind){
    //    conti[i].setTitolare(c, n , ind);
    //}

    public void pagaInteressi(){
        int i; int x;
        for (i=0; i<N; i++);{
            x= conti[i].getSomma;
            x = (int)x 1.02;
            conti[i].setSomma;
        }
    }


}
