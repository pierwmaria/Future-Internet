package Array;

public class Titolare {
    String cognome;
    String nome;
    String indirizzo;
    public Titolare(){
        cognome="";
        nome="";
        indirizzo="";
    }
    public Titolare(String c, String n, String i){
        cognome = c;
        nome = n;
        indirizzo = i;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
}
