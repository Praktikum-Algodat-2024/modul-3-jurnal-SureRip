public class EasyAjalah {
    Node head;
    Node tail;

    public void addLagu(String judul, String artis, int rilis, int menit, int detik, String genre) {
        Node newNode = new Node(judul, artis, rilis, menit, detik, genre);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void urutkanBerdasarkanDurasi() {
        if (head == null){
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.next != null) {
                if (current.getDurasiTotal() > current.next.getDurasiTotal()) {
                    swapData(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void urutkanBerdasarkanRilis() {
        if (head == null){
            return;
        }
        Node current = head;
        while (current != null) {
            Node maxNode = current;
            Node nextNode = current.next;
            while (nextNode != null) {
                if (nextNode.rilis > maxNode.rilis) {
                    maxNode = nextNode;
                }
                nextNode = nextNode.next;
            }
            if (maxNode != current) {
                swapData(current, maxNode);
            }
            current = current.next;
        }
    }

    private void swapData(Node node1, Node node2) {
        String tempJudul = node1.judul;
        String tempArtis = node1.artis;
        int tempRilis = node1.rilis;
        int tempMenit = node1.menit;
        int tempdetik = node1.detik;
        String tempGenre = node1.genre;

        node1.judul = node2.judul;
        node1.artis = node2.artis;
        node1.rilis = node2.rilis;
        node1.menit = node2.menit;
        node1.detik = node2.detik;
        node1.genre = node2.genre;
        node2.judul = tempJudul;
        node2.artis = tempArtis;
        node2.rilis = tempRilis;
        node2.menit = tempMenit;
        node2.detik = tempdetik;
        node2.genre = tempGenre;
    }

    public Node cariLagu(String judul) {
        Node current = head;
        int pos = 1;
        boolean ditemukan = false;
        System.out.println("===============================================================================");
        System.out.println("||                              LOL Playlist                                 ||");
        System.out.println("===============================================================================");
        System.out.println("Judul lagu yang ingin dicari : " + judul);
        
        while (current != null) {
            if (current.judul.equalsIgnoreCase(judul)) {
                System.out.println("Lagu yang sesuai dengan judul '" + judul + "' ditemukan pada posisi ke - " + pos);
                System.out.println("===============================================================================");
                System.out.printf("%7d | %s - %s (%d)%n", pos, current.artis, current.judul, current.rilis);
                System.out.printf("%7d:%d     %s%n", current.menit, current.detik, current.genre);
                System.out.println("===============================================================================");
                ditemukan = true;
                break;
            }
            current = current.next;
            pos++;
        }
        if (!ditemukan) {
            System.out.println("Lagu dengan judul '" + judul + "' tidak ditemukan dalam playlist.");
            System.out.println("===============================================================================");
        }
        return null;
    }
    public void tampilkanPlaylist() {
        Node current = head;
        int pos = 1;
        System.out.println("===============================================================================");
        System.out.println("||                              LOL Playlist                                 ||");
        System.out.println("===============================================================================");
        if(head==null){
            System.out.println("There is no song in the playlist yet.");
            System.out.println("===============================================================================");
        }else{
            while (current != null) {
                System.out.printf("%7d | %s - %s (%d)%n", pos, current.artis, current.judul, current.rilis);
                System.out.printf("%7d:%d     %s%n", current.menit, current.detik, current.genre);
                System.out.println("===============================================================================");
                current = current.next;
                pos++;
            }
        }
    }
}
