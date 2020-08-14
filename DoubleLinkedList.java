
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class DoubleLinkedList {
    Scanner input = new Scanner(System.in);
    private Node head;
    private Node tail;

    private int size;

    public DoubleLinkedList() {
        size = 0;
    }

    private class Node {
        private DVD data;
        private Node next;
        private Node previous;

        public Node() {
            data = null;
            next = null;
            previous = null;

        }

        public Node(DVD data, Node next, Node previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }
    }

    private int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int eklenicekKonum(DVD dvd) {
        int konum = 1;
        if (size == 0) {
            addFirst(dvd);
            konum = 1;
        } else {

            Node temp = head;
            while (temp.next != null) {

                while (dvd.getAdSoyad().compareTo(temp.data.getAdSoyad()) >= 0) {
                    konum++;
                    if (dvd.getAdSoyad().compareTo(temp.data.getAdSoyad()) == 0) {

                        if (dvd.getCikisTarihi() < temp.data.getCikisTarihi()) {
                            konum--;
                            break;
                        }


                    }
                    temp = temp.next;
                    if (temp == null) {
                        break;
                    }

                }
                break;

            }

        }
        size++;
        return konum;
    }


    public void siraliEkle(DVD veri, int konum) {


        if (size == 2) {
            addFirst(veri);
            if (head.data.getAdSoyad().compareTo(head.next.data.getAdSoyad()) > 0) {
                head = head.next;
                head.next = head.previous;
                head.next.next = null;
                head.previous = null;
                head.next.previous = head;

            }
        } else if (size > 2) {
            Node yeniNode = new Node();
            yeniNode.data = veri;
            Node dolasici = head;
            for (int i = 1; i < konum; i++) {
                dolasici = dolasici.next;
            }
            if (konum == 1) {
                addFirst(veri);
            } else if (konum == size) {
                addLast(veri);

            } else {
                yeniNode.previous = dolasici.previous;
                dolasici.previous.next = yeniNode;
                dolasici.previous = yeniNode;
                yeniNode.next = dolasici;

            }

        }
    }


    public void addLast(DVD dvd) {
        Node node = new Node();
        node.data = dvd;
        tail.next = node;
        node.previous = tail;
        tail = node;
    }

    public void addFirst(DVD dvd) {
        Node tmp = new Node(dvd, head, null);
        if (head != null) {
            head.previous = tmp;
        }
        head = tmp;
        if (tail == null) {
            tail = tmp;
        }
    }

    public boolean delete(String adSoyad, String dvdBasligi) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.getAdSoyad().equalsIgnoreCase(adSoyad) && temp.data.getDvdBasligi().equalsIgnoreCase(dvdBasligi)) {
                if (temp.next == null) {
                    temp.previous.next = null;
                    temp.previous = tail;
                    return true;
                } else if (temp.previous == null) {
                    head = head.next;
                    head.next.previous = null;
                    return true;

                } else {
                    temp.previous.next = temp.next;
                    temp.next.previous = temp.previous;
                    return true;
                }
            }
            temp = temp.next;

        }
        size--;
        return false;
    }

    public void dvdBilgisiGoster() {
        System.out.print("DVD'lerinin bilgisini görmek istediğiniz sanatçının adını ve soyadını giriniz: ");
        String adSoyad = input.nextLine();

        Node node = head;
        while (node != null) {
            if (node.data.getAdSoyad().equalsIgnoreCase(adSoyad)) {
                System.out.println(node.data);
            }
            if (node.next != null) {
                node = node.next;
            } else {

                break;
            }
        }
    }

    public String artanSirala() {
        Node node = head;
        String tmp_str = "";
        int i = 1;
        while (node != null) {
            tmp_str +=i+")"+ node.data.toString()+"\n\n";
            node = node.next;
            i++;
        }
        return tmp_str;
    }

    public String azalanSirala() {
        Node node = tail;
        String tmp_str = "";
        int i = 1;
        while (node != null) {
            tmp_str +=i+")"+ node.data.toString()+"\n\n";
            node = node.previous;
            i++;
        }
        return tmp_str;
    }

    public String ikiBinOncesiDvdler() {
        Node node = head;
        String tmp_str = "";
        int i=1;
        while (node != null) {
            if (node.data.getCikisTarihi() < 2000) {
                tmp_str+= i+")"+node.data.toString()+"\n\n";
            }
            node = node.next;
        }
        return tmp_str;
    }


    public String listele_yazdir()
    {
        Node node = head;
        String tmp_str = "";
        int i = 1;
        while(node!=null)
        {
            tmp_str +=i+")"+node.data.toString()+"\n\n";
            node = node.next;
            i++;
        }
        return tmp_str;
    }

    public void yedekle() throws IOException{
        // Listenin son hali txt dosyası olarak kaydedilerek yedekleniyor
        Node task = tail;
        File file = new File("bilgiler.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter yazici = new BufferedWriter(fileWriter);
        while (task != null) // Listenin sonuna kadar kontrol ediliyor
        {
            String temp_str = "";
            String sarkilar = "";

            for(int i = 0; i<task.data.sarkilar.size(); i++)
            {
                sarkilar += task.data.sarkilar.get(i)+",";
            }
            sarkilar = sarkilar.substring(0,sarkilar.length()-1);
            temp_str = task.data.getAdSoyad()+","+task.data.getDvdBasligi()+","+task.data.getCikisTarihi()+","+task.data.getFiyat()+","+sarkilar+".";
            yazici.write(temp_str); // Bilgiler dosyanın satırına yazdırılıyor
            yazici.newLine();// Dosyada yeni satıra geçiyor
            task = task.previous; // Düğüm sonraki düğüme aktarılıyor
        }

        yazici.close();

    }
}