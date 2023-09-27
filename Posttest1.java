import java.util.ArrayList;

public class Posttest1 {

    public static class Buku {
        private String judul;
        private String penulis;

        public Buku(String judul, String penulis) {
            this.judul = judul;
            this.penulis = penulis;
        }

        public String getJudul() {
            return judul;
        }

        public void setJudul(String judul) {
            this.judul = judul;
        }

        public String getPenulis() {
            return penulis;
        }

        public void setPenulis(String penulis) {
            this.penulis = penulis;
        }
    }

    public static void main(String[] args) {
        ArrayList<Buku> buku = new ArrayList<>();

        buku.add(new Buku("Pergi", "Tere Liye"));
        buku.add(new Buku("Bumi", "Tere Liye"));
        buku.add(new Buku("Bumi Manusia", "Pramoedya Ananta Toer"));
        buku.add(new Buku("Laskar Pelangi", "Andrea Hirata"));
        buku.add(new Buku("Cinta di Balik Tirai", "Habiburrahman El Shirazy"));

        for (Buku b : buku) {
            System.out.println("Buku berjudul " + b.getJudul() + " ditulis oleh " + b.getPenulis());
        }
    }
}