public class Node {
    String judul;
    String artis;
    int rilis;
    int menit;
    int detik;
    String genre;
    Node next;
    Node prev;

    public Node(String artis, String judul, int rilis, int menit, int detik, String genre) {
        this.artis = artis;
        this.judul = judul;
        this.rilis = rilis;
        this.menit = menit;
        this.detik = detik;
        this.genre = genre;
        this.next = null;
        this.prev = null;
    }
    public int getDurasiTotal() {
        return menit * 60 + detik;
    }
}
