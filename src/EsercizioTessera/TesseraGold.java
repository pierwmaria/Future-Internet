package EsercizioTessera;

class TesseraGold extends Tessera {

    private String secondoTitolare;
    private int puntiPremio;

    public TesseraGold() throws MaxTessereReached {
        super();
        this.secondoTitolare = "";
        this.puntiPremio = 0;
    }

    public TesseraGold(String primoTitolare, String secondoTitolare) throws MaxTessereReached {
        super(primoTitolare);
        this.secondoTitolare = secondoTitolare;
        this.puntiPremio = 0;
    }

    @Override
    public void buySomething(int punti) {
        super.buySomething(punti);
        this.puntiPremio += 10;
    }

    public String getSecondoTitolare() {
        return secondoTitolare;
    }

    public void setSecondoTitolare(String secondoTitolare) {
        this.secondoTitolare = secondoTitolare;
    }

}
