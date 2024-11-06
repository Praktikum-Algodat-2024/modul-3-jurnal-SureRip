class Node {
    String name;
    String club;
    int No;
    int MP;
    int W;
    int D;
    int L;
    int GF;
    int GA;
    int GD;
    int Pts;
    Node next;

    Node(String name, String club, int No, int MP, int W, int D, int L, int GF, int GA, int GD, int Pts) {
        this.name = name;
        this.club = club;
        this.No = No;
        this.MP = MP;
        this.W = W;
        this.D = D;
        this.L = L;
        this.GF = GF;
        this.GA = GA;
        this.GD = GD;
        this.Pts = Pts;
        this.next = null;
    }
}
