


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Test extends JFrame{

    public static void main(String[] args) throws IOException {
        JFrame pencere = new JFrame();
        pencere.setTitle("DVD");

        JFrame ekleme_penceresi = new JFrame();
        ekleme_penceresi.setTitle("DVD | Ekle");
        ekleme_penceresi.setSize(275,500);
        ekleme_penceresi.setLocationRelativeTo(null);
        ekleme_penceresi.setResizable(false);

        JFrame silme_penceresi = new JFrame();
        silme_penceresi.setTitle("DVD | Sil");
        silme_penceresi.setSize(250,150);
        silme_penceresi.setLocationRelativeTo(null);
        silme_penceresi.setResizable(false);

        pencere.setSize(520,500);
        pencere.setResizable(false);
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setState(JFrame.ICONIFIED);
        pencere.setLocationRelativeTo(null);
        pencere.setLayout(new FlowLayout());

        ekleme_penceresi.setLayout(new FlowLayout());


        JLabel info_message = new JLabel();
        info_message.setText("Şarkıcı adını büyük harfle başlayarak yazınız.");
        JLabel info_message_two = new JLabel();
        info_message_two.setText("Şarkıları virgül koyarak yazınız.                           ");

        JLabel info_show = new JLabel();
        info_show.setText("*******************************************************");

        JLabel info_show_two = new JLabel();
        info_show_two.setText("*******************************************************");

        //info_message.setVerticalTextPosition(JLabel.BOTTOM);
        //info_message.setHorizontalTextPosition(JLabel.CENTER);
        //info_message_two.setVerticalTextPosition(JLabel.BOTTOM);
        //info_message_two.setHorizontalTextPosition(JLabel.CENTER);
        ekleme_penceresi.add(info_show);
        ekleme_penceresi.add(info_message);
        ekleme_penceresi.add(info_message_two);
        ekleme_penceresi.add(info_show_two);



        silme_penceresi.setLayout(new FlowLayout());

        JTextArea liste = new JTextArea(25,42);
        JScrollPane scroll = new JScrollPane(liste,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pencere.add(scroll);
        pencere.setLocationRelativeTo(null);
        pencere.setVisible(true);

        JButton azlistele = new JButton("A-Z Listele");
        pencere.add(azlistele);
        JButton zalistele = new JButton("Z-A Listele");
        pencere.add(zalistele);
        JButton dvdekle = new JButton("DVD Ekle");
        pencere.add(dvdekle);
        JButton dvdsil = new JButton("DVD Sil");
        pencere.add(dvdsil);
        JButton ikibin = new JButton("2000'den öncesi");
        pencere.add(ikibin);
        //JLabel sarkici_adi = new JLabel("Şarkıcı adı");
        //sarkici_adi.setLocation(0,0);
        //ekleme_penceresi.add(sarkici_adi);

        JTextField sarkici_field = new JTextField(10);
        //sarkici_field.setText("");

        //JLabel dvd_basligi = new JLabel("DVD Başlığı");
        //ekleme_penceresi.add(dvd_basligi);
        JTextField dvd_bas_field = new JTextField(10);
        //dvd_bas_field.setText("DVD Başlığını giriniz...");

        //JLabel  cikis_tarih= new JLabel("Çıkış tarihi");
        //ekleme_penceresi.add(sarkici_adi);
        JTextField cikis_tarih_field = new JTextField(10);
        //cikis_tarih_field.setText("Çıkış tarihini giriniz...");

        //JLabel fiyat = new JLabel("DVD Fiyatı");
        //ekleme_penceresi.add(fiyat);
        JTextField fiyat_field = new JTextField(10);
        //fiyat_field.setText("Fiyatını giriniz...");

        //JLabel sarkilar = new JLabel("Şarkılar");
        //ekleme_penceresi.add(sarkilar);
        JTextArea sarki_liste = new JTextArea(10,20);
        //sarki_liste.setText("Şarkıları giriniz...");

        JButton ekleme = new JButton("Ekle");


        JLabel label1 = new JLabel();
        label1.setText("Şarkıcı adı   :");

        JLabel label2 = new JLabel();
        label2.setText("DVD Başlığı :");

        JLabel label3 = new JLabel();
        label3.setText("Çıkış Tarihi  :");

        JLabel label4 = new JLabel();
        label4.setText("Fiyat              :");

        JLabel label5 = new JLabel();
        label5.setText("Şarkı Listesi");






        ekleme_penceresi.add(label1);
        ekleme_penceresi.add(sarkici_field);
        ekleme_penceresi.add(label2);
        ekleme_penceresi.add(dvd_bas_field);
        ekleme_penceresi.add(label3);
        ekleme_penceresi.add(cikis_tarih_field);
        ekleme_penceresi.add(label4);
        ekleme_penceresi.add(fiyat_field);
        ekleme_penceresi.add(label5);
        ekleme_penceresi.add(sarki_liste);
        ekleme_penceresi.add(ekleme);

        JLabel label11 = new JLabel();
        label11.setText("Şarkıcı adı   :");

        JLabel label12 = new JLabel();
        label12.setText("DVD Başlığı :");

        JLabel label123 = new JLabel();
        label123.setText("__________________________________________________");


        JTextField sarkici_ad = new JTextField(10);
        //sarkici_ad.setText("Şarkıcı adını giriniz...");


        JTextField dvd_sil = new JTextField(10);
        //dvd_sil.setText("DVD Başlığını giriniz...");


        JButton silme = new JButton("Sil");

        silme_penceresi.add(label11);
        silme_penceresi.add(sarkici_ad);
        silme_penceresi.add(label12);
        silme_penceresi.add(dvd_sil);
        silme_penceresi.add(label123);

        silme_penceresi.add(silme);





        DoubleLinkedList d1=new DoubleLinkedList();
        try {

            // Scanner file=new Scanner(new FileReader("bilgiler.txt"));
            BufferedReader file=new BufferedReader(new FileReader("bilgiler.txt"));
            String album=file.readLine();

            while (album!=null){
                DVD dvd=new DVD();
                ArrayList<String> array=new ArrayList<>();

                StringTokenizer albumToken=new StringTokenizer(album,".");
                while (albumToken.hasMoreTokens()){
                    String albumBilgileri=albumToken.nextToken();
                    StringTokenizer sarkiciToken=new StringTokenizer(albumBilgileri,",");
                    int i=0;
                    while (sarkiciToken.hasMoreTokens()){
                        i++;
                        String parcalıBilgi=sarkiciToken.nextToken();
                        array.add(parcalıBilgi);
                        if (i==1){
                            dvd.setAdSoyad(parcalıBilgi);
                        }else if (i==2){
                            dvd.setDvdBasligi(parcalıBilgi);
                        }else if (i==3){
                            dvd.setCikisTarihi(Integer.parseInt(parcalıBilgi));
                        }else if (i==4){

                            dvd.setFiyat(Integer.parseInt(parcalıBilgi));
                        }
                        else if(i>4){
                            dvd.sarkilar.add(parcalıBilgi);
                        }

                    }
                }

                d1.siraliEkle(dvd,d1.eklenicekKonum(dvd));
                album=file.readLine();
            }
            String listeye_eklenecek = d1.listele_yazdir();
            liste.setText(listeye_eklenecek);

            azlistele.addActionListener((ActionEvent e) -> {
                String eklenecek_liste = d1.artanSirala();
                liste.setText(eklenecek_liste);
            });

            zalistele.addActionListener((ActionEvent e) -> {
                String eklenecek_liste = d1.azalanSirala();
                liste.setText(eklenecek_liste);
            });

            dvdekle.addActionListener((ActionEvent e) -> {
                ekleme_penceresi.setVisible(true);
            });

            dvdsil.addActionListener((ActionEvent e) -> {
                silme_penceresi.setVisible(true);
            });
            ikibin.addActionListener((ActionEvent e) -> {
                String adding = d1.ikiBinOncesiDvdler();
                liste.setText(adding);
            });

            silme.addActionListener((ActionEvent e) -> {
                String adsoyad = sarkici_ad.getText();
                String dvdbaslik = dvd_sil.getText();
                if(d1.delete(adsoyad,dvdbaslik))
                {
                    JOptionPane.showMessageDialog(ekleme_penceresi,"DVD Başarıyla Silindi!");
                }
                else
                {
                    JOptionPane.showMessageDialog(ekleme_penceresi,"DVD Bulunamadı!");
                }
                String adding = d1.listele_yazdir();
                liste.setText(adding);
                silme_penceresi.setVisible(false);
                try {
                    d1.yedekle();
                } catch (IOException ex) {
                    Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                }
            });

            ekleme.addActionListener((ActionEvent e) -> {
                DVD temp = new DVD();
                temp.setAdSoyad(sarkici_field.getText());
                temp.setDvdBasligi(dvd_bas_field.getText());
                temp.setCikisTarihi(Integer.parseInt(cikis_tarih_field.getText()));
                temp.setFiyat(Integer.parseInt(fiyat_field.getText()));
                String sentence = sarki_liste.getText();
                StringTokenizer tokenizer = new StringTokenizer(sentence, ",");
                while (tokenizer.hasMoreElements()){
                    String token = (String) tokenizer.nextElement();
                    temp.sarkilar.add(token);
                }
                d1.siraliEkle(temp,d1.eklenicekKonum(temp));
                String adding = d1.listele_yazdir();
                liste.setText(adding);
                JOptionPane.showMessageDialog(ekleme_penceresi,"DVD Başarıyla Eklendi!");
                ekleme_penceresi.setVisible(false);
                try {
                    d1.yedekle();
                } catch (IOException ex) {
                    Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                }
            });

        }catch (FileNotFoundException e){
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
