package EsercizioTessera;

public class UsaTessera {

    public static void main (String[]arg) {

        try {

            Tessera t1 = new Tessera();
            Tessera t2 = new Tessera();
            Tessera t3 = new Tessera("Pier");
            TesseraGold tg1 = new TesseraGold();
            System.out.println("Number of EsercizioTessera is: " + Tessera.getNumeroTessereEmesse());

            tg1.setSecondoTitolare("jacopo");
            tg1.setTitolare("perchè due titolari?");
            t1.setTitolare("Piero Baraldo");
            t1.buySomething(20);
            t2.buySomething(10);
            t3.buySomething(30);
            t1.buySomething(30);
            t2.buySomething(20);
            tg1.buySomething(40);
            System.out.println("User t1 has " + t1.getPunti() + " points");
            System.out.println("User t2 has " + t2.getPunti() + " points");

            t1.buySomething(30);
            t2.buySomething(10);
            System.out.println("User t1 has " + t1.getPunti() + " points");
            System.out.println("User t2 has " + t2.getPunti() + " points");

            t1.spendPunti(40);
            t2.spendPunti(40);
            System.out.println("User t1 has " + t1.getPunti() + " points");
            System.out.println("User t2 has " + t2.getPunti() + " points");

            // t1.spendPunti(1000);                // eccezione lanciata
            // t2.spendPunti(1000);                // non eseguita - contrazione dello stack
            System.out.println("Name EsercizioTessera owner of 0 is: " + Tessera.getNomeTitolare(0));
            // System.out.println("Name EsercizioTessera owner of 10 is: " + EsercizioTessera.getNomeTitolare(10));

            for(int i = 0; i < 1024; i++) {
                Tessera t = new Tessera();
                // dopo un po' si spacca perché dimensione massima raggiunta
            }

        } catch (NotEnoughPoints nep) {
            // output con standard err non in ordine
            System.err.println("Message from exception: " + nep.getMessage());
        } catch(MaxTessereReached mtr) {
            System.err.println("Message from exception: " + mtr.getMessage());
        } catch(TesseraNotFound tnf) {
            System.err.println("Message from exception: " + tnf.getMessage());
        }

    }

}
