package EsercizioTessera;

public class Tessera {

    private String titolare; //andrebbe private ricordati
    private int punti, acquisti, id;

    private static final int maxTessere = 1024;
    private static int contatore = 0;
    private static Tessera[] listaTitolari = new Tessera[maxTessere];

    public static int getNumeroTessereEmesse() {
        return contatore;
    }

    public static String getNomeTitolare(int id) throws TesseraNotFound {
        if(id >= contatore) throw new TesseraNotFound("EsercizioTessera non trovata");
        return listaTitolari[id].getTitolare();
    }

    public Tessera() throws MaxTessereReached {
        if(contatore >= maxTessere) throw new MaxTessereReached("Raggiunto il massimo numero di tessere: " + maxTessere);
        this.id = contatore;
        this.titolare = "";
        this.punti = 0;
        this.acquisti = 0;
        listaTitolari[contatore] = this;
        contatore++;
    }

    public Tessera(String titolare) throws MaxTessereReached {
        if(contatore >= maxTessere) throw new MaxTessereReached("Raggiunto il massimo numero di tessere: " + maxTessere);
        this.id = contatore;
        this.titolare = titolare;
        this.punti = 0;
        this.acquisti = 0;
        listaTitolari[contatore] = this;
        contatore++;
    }

    public void setTitolare(String titolare) {
        this.titolare = titolare;
    }

    public int getPunti() {
        return punti;
    }

    public String getTitolare(){
        return titolare;
    }

    public void buySomething(int punti) {
        this.increaseAcquisti();
        this.punti += punti;
    }

    public void resetPuntiAndAcquisti() {
        this.punti = 0;
        this.acquisti = 0;
    }

    public void spendPunti(int punti) throws NotEnoughPoints {
        if(this.checkEnoughPunti(punti)) {
            this.punti -= punti;
        } else throw new NotEnoughPoints("Punti insufficienti per titolare " + this.titolare);
    }

    private boolean checkEnoughPunti(int punti) {
        return this.punti >= punti;
    }

    private void increaseAcquisti() {
        this.acquisti++;
    }

    public int getAcquisti(){
        return acquisti;
    }

}


