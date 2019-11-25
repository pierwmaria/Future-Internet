package Array;

public class Conto {
    private Titolare t;
    private int cifra;

    public Conto(){
        //non solo inizializzare var, ma anche usare cxostruttore di titolare
        t = new Titolare();
        cifra = 0;
    }
    public Conto(String c, String n, String i, int x){
        t = new Titolare(c, n, i);
        cifra = x;
    }
    public Conto(String c, int x){
        t = new Titolare(c, "","");
        cifra = x;

    }
    public void setTitolare(String c, String n, String i){
        t.setCognome(c);
        t.setNome(n);
        t.setIndirizzo(i);
    }

    public void setTitolare(Titolare p){
        //nel main facico p=new titolare , c=new conto, e poi c.setTitolare(p) passandogli p)

        t.setCognome(p.getCognome());
        t.setNome(p.getNome());
        t.setIndirizzo(p.getIndirizzo());
    }
    public Titolare getT() {
        return t;
    }

    public void setT(Titolare t) {
        this.t = t;
    }
}
