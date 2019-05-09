package proto;
 
import java.util.ArrayList;
 
import java.util.Scanner;
 
public class Batch197 {
 
    protected static Scanner input;
    public static int n;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.println("\n <=== Contoh Input Seperti Diatas ==>");
        System.out.println("Berapa banyak data yang akan dimasukkan?");
        int jumlahInput = input.nextInt();
 
        n = jumlahInput;
 
        Orang org = new Orang();
 
        for (int i = 0; i < jumlahInput; i++) {
            System.out.println("Berikan input ID ke - " + (i + 1));
            org.listId[i] = input.nextInt();
 
            System.out.println("Berikan input Nama : ");
            org.listNama[i] = input.next();
 
            System.out.println("Berikan input Alamat : ");
            org.listAlamat[i] = input.next();
 
            System.out.println("Berikan input Jenis Kelamin : ");
            org.listJenisKelamin[i] = input.next();
 
            System.out.println("Berikan input Nomor Telepon : ");
            org.listNoTelepon[i] = input.next();
        }
 
        for (int j = 0; j < n; j++) {
            System.out.println("\nData pribadi untuk input ke - " + (j + 1));
            System.out.println("ID \t\t: " + org.listId[j]);
            System.out.println("Nama \t\t: " + org.listNama[j]);
            System.out.println("Alamat \t\t: " + org.listAlamat[j]);
            System.out.println("Jenis Kelamin \t: " + org.listJenisKelamin[j]);
            System.out.println("Nomor Telepon \t: " + org.listNoTelepon[j]);
        }
 
    }// Main
 
}// Class