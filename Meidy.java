/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package meidy.afif;


/**
 *
 * @author MeidyAfif
 */
import java.util.Scanner;
public class Meidy {

    public static void main(String[] args) {
        System.out.println("Operator Penugasan");
        Scanner userInput = new Scanner(System.in);
        
        double num1, num2, num3, hasil;
        boolean hasilb;
        
        
        System.out.println("Penjumlahan");
        System.out.println("Input Angka -1 :");
        num1 = userInput.nextInt();
        System.out.println("Input Angka -2 :");
        num2 = userInput.nextInt();
        
        //Penjumlahan
        hasil = num1 += num2;
        System.out.println("Hasil += "+ hasil);
        
        
        System.out.println("Pengurangan");
        System.out.println("Input Angka -1 :");
        num1 = userInput.nextInt();
        System.out.println("Input Angka -2 :");
        num2 = userInput.nextInt();
        
        //Pengurangan
        hasil = num1 -= num2;
        System.out.println("Hasil -= "+ hasil);
        
        
        System.out.println("Perkalian");
        System.out.println("Input Angka -1 :");
        num1 = userInput.nextInt();
        System.out.println("Input Angka -2 :");
        num2 = userInput.nextInt();
        
        //Perkalian
        hasil = num1 *= num2;
        System.out.println("Hasil *= "+ hasil);
        
        
        System.out.println("Pembagian");
        System.out.println("Input Angka -1 :");
        num1 = userInput.nextInt();
        System.out.println("Input Angka -2 :");
        num2 = userInput.nextInt();
        
        //Pembagian
        hasil = num1 /= num2;
        System.out.println("Hasil /= "+ hasil);
        
        
        System.out.println("Sisa Bagi");
        System.out.println("Input Angka -1 :");
        num1 = userInput.nextInt();
        System.out.println("Input Angka -2 :");
        num2 = userInput.nextInt();
        
        //Sisa Bagi
        hasil = num1 %= num2;
        System.out.println("Hasil %= "+ hasil);
        
        
        System.out.println("Operator Pembanding");
        
        System.out.println("Lebih Besar");
        System.out.println("Input Angka -1 :");
        num1 = userInput.nextInt();
        System.out.println("Input Angka -2 :");
        num2 = userInput.nextInt();
        
        //Lebih Kecil
        hasilb = num1 > num2;
        System.out.println( hasilb);
        
        
        System.out.println("Lebih Kecil");
        System.out.println("Input Angka -1 :");
        num1 = userInput.nextInt();
        System.out.println("Input Angka -2 :");
        num2 = userInput.nextInt();
        
        //Sama Dengan
        hasilb = num1 < num2;
        System.out.println( hasilb);
        
        
        System.out.println("Sama Dengan");
        System.out.println("Input Angka -1 :");
        num1 = userInput.nextInt();
        System.out.println("Input Angka -2 :");
        num2 = userInput.nextInt();
        
        //Tidak Sama Dengan
        hasilb = num1 == num2;
        System.out.println( hasilb);
        
        
        System.out.println("Tidak Sama Dengan");
        System.out.println("Input Angka -1 :");
        num1 = userInput.nextInt();
        System.out.println("Input Angka -2 :");
        num2 = userInput.nextInt();
        
        //Tidak Sama Dengan
        hasilb = num1 != num2;
        System.out.println( hasilb);
        
        
        System.out.println("Lebih Besar Sama Dengan");
        System.out.println("Input Angka -1 :");
        num1 = userInput.nextInt();
        System.out.println("Input Angka -2 :");
        num2 = userInput.nextInt();
        
        //Lebih Besar Sama Dengan
        hasilb = num1 >= num2;
        System.out.println( hasilb);
        
        
        System.out.println("Lebih Kecil Sama Dengan");
        System.out.println("Input Angka -1 :");
        num1 = userInput.nextInt();
        System.out.println("Input Angka -2 :");
        num2 = userInput.nextInt();
        
        //Lebih Kecil Sama Dengan
        hasilb = num1 <= num2;
        System.out.println( hasilb);
        
        
        System.out.println("Operator Bitwise");
        
        int Num1,Num2;
        
        System.out.println("============AND");
        System.out.println("Masukkan Nilai -1 : ");
        Num1 = userInput.nextInt();
        
        System.out.println("Masukkan Nilai -2 : ");
        Num2 = userInput.nextInt();
        
        System.out.println("Hasil AND adalah "+ (Num1 & Num2));
        
        
        System.out.println("============OR");
        System.out.println("Masukkan Nilai -1 : ");
        Num1 = userInput.nextInt();
        
        System.out.println("Masukkan Nilai -2 : ");
        Num2 = userInput.nextInt();
        
        System.out.println("Hasil OR adalah "+ (Num1 | Num2));
        
        
        System.out.println("============XOR");
        System.out.println("Masukkan Nilai -1 : ");
        Num1 = userInput.nextInt();
        
        System.out.println("Masukkan Nilai -2 : ");
        Num2 = userInput.nextInt();
        
        System.out.println("Hasil XOR adalah "+ (Num1 ^ Num2));
        
        
        System.out.println("============NOT");
        System.out.println("Masukkan Nilai -1 : ");
        Num1 = userInput.nextInt();
        
        System.out.println("Masukkan Nilai -2 : ");
        Num2 = userInput.nextInt();
        
        System.out.println("Hasil Negasi : " + "Negasi angka pertama : " + " " + (~Num1) + ","  + "Negasi Angka Kedua : " + " " + (~Num2));
        
        
        System.out.println("============LEFT SHIFT, RIGHT SHIFT");
        System.out.println("Masukkan Nilai -1 : ");
        Num1 = userInput.nextInt();
        
        System.out.println("Masukkan Nilai -2 : ");
        Num2 = userInput.nextInt();
        
        System.out.println("Hasilnya Left Shift dan Right Shift : " + "Bilangan Pertama >>" + " " + (Num1 >> 1) + ", " + "Bilangan Kedua <<" + " " + (Num2 << 1));
        
        
        
        
//        System.out.println("============LEFT SHIFT, RIGHT SHIFT (UNSIGNED)");
//        System.out.println("Masukkan Nilai -1 : ");
//        Num1 = userInput.nextInt();
//        
//        System.out.println("Masukkan Nilai -2 : ");
//        Num2 = userInput.nextInt();
//        
//        System.out.println("Hasilnya adalah " + "Bilangan Pertama >>>" + " " + (Num1 >>> 1) + "," + "Bilangan Kedua <<<" + " " + (Num2 <<< 1));
                
    }
}
