import java.util.LinkedList;

public class TugasStrukturData {
    public static void main(String[] args) {
        // Jawaban nomor 1
        int StrukturBaris;

        // Jawaban nomor 2
        String KataBaru = "Hasbi";

        // Jawaban nomor 3
        int[] empatAngka = {05, 10, 20, 12};

        // Jawaban nomor 4
        String[][] Angka = {
            {"05", "3", "5"},
            {"14", "19", "20"},
            {"22", "27", "12"}
        };

        // Jawaban nomor 5
        LinkedList<Integer> listAngka = new LinkedList<>();
        listAngka.add(05);
        listAngka.add(19);
        listAngka.add(44);
        listAngka.add(60);
        listAngka.add(12);

        // Hasil
        System.out.println("Nama: " + KataBaru);
        System.out.println("Array satu dimensi:");

        for (int angka : empatAngka) {
            System.out.print(angka + " ");
        }

        System.out.println("\nArray dua dimensi:");

        for (int i = 0; i < Angka.length; i++) {
            for (int j = 0; j < Angka[i].length; j++) {
                System.out.print(Angka[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Linked List: " + listAngka);
    }
}

