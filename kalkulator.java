import java.util.Scanner;

public class kalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          
        System.out.print("Masukkan Nilai Pertama : ");
        int nilai1 = input.nextInt();
        System.out.print("Masukkan Nilai Kedua   : ");
        int nilai2 = input.nextInt();
        
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Pilih Operasi (1. Penjumlahan, 2. Pengurangan, 3. Perkalian, 4. Pembagian.)");
        int pilihan = input.nextInt();
        System.out.println("---------------------------------------------------------------------------");
        
        int hasil = 0;
        
        switch (pilihan) {
            case 1: 
                hasil = nilai1 + nilai2;
                break;
                
            case 2: 
                hasil = nilai1 - nilai2;
                break;
                
            case 3: 
                hasil = nilai1 * nilai2;
                break;
                
            case 4: 
                if (nilai2 != 0) {
                hasil = nilai1 / nilai2;       
            } else {
                System.out.println("Tidak dapat dibagi dengan nol");   
                return;
            }
            break;
            default:
                System.out.println("Pilihan Salah");
                return;
        }  
        
        System.out.println("Hasil: "+hasil);  
        System.out.println("---------");
    }
}
