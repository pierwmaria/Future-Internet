public class UsaBorsellino {

    public static void main(String[] args) {

        Borsellino a = new Borsellino(10, "pippo");
        BorsellinoGold b = new BorsellinoGold(15, "pluto", 20);
        //int x = a.getValore();
        int y = b.getValore();
        int z = b.getPunti();
        // int k = a.getPunti(); non lo posso fare perchè a è creato senza gold e senza valore
    }
}
