public class BorsellinoGold extends Borsellino {

    private int punti; //solo le variabili aggiunte, nuova

    public BorsellinoGold (int v, String s, int p){

        //aggiungo nuovi metodi
        //aggiungo costruttoree con tutte le variabili da settare, sia la classe che tutte le sottoclassi e inizializzo la privata
        super(v, s); //questi valori alla sottoclassa

        punti = p;     //chiamo il costruttore della seconda classe
    }
    public int getPunti(){
        return punti;
    }

    public void setPunti(int x) {
        this.punti = x;
    }

}
