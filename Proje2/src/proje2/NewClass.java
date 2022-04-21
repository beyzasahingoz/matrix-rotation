package Proje2;
import java.util.Scanner;

/**
 * Proje2
 * Kullanicinin girdileriyle matris array elemanlarini dondurur.
 * 2.odev
 * 12.12.2020
 * @author beyza sahingoz @beyza.sahingoz@stu.fsm.edu.tr
 */
public class NewClass {

    public static void main(String[] args) {
//        set edilecek diziyi tanimlayip olusturuyorum.
        int[] dizi = {5, 5, -1, 100, 2};
        int[][] array = new int[dizi[0]][dizi[1]];
        for (int i = 0; i < dizi[0]; i++) {
            for (int j = 0; j < dizi[1]; j++) {
                array[i][j] = (int) (Math.random() * dizi[3]);
            }
        }
        Scanner s = new Scanner(System.in);
//       Menu kismini yazdiriyorum ve kullanicidan girdi istiyorum.
        System.out.println("1. Uygulamayi calistir.");
        System.out.println("2. Matris olustur.");
        System.out.println("3. Direction.");
        System.out.println("4. Step number.");
        System.out.println("5. Exit.");
        System.out.print("Seceneginizi sayi olarak giriniz: ");
        String secenek = s.next();
//       Menuyu kontrol ediyorum.
        boolean kontrol = true;
        while (kontrol) {
            if (kontrol) {
                if (IntegeraDonustur(secenek) == 5) {
                    kontrol = false;
                    System.out.println("Iyi gunler..");
                } else if (IntegeraDonustur(secenek) == 2) {
                    matris(dizi);
                    array = new int[dizi[0]][dizi[1]];
                    for (int i = 0; i < dizi[0]; i++) {
                        for (int j = 0; j < dizi[1]; j++) {
                            array[i][j] = (int) (Math.random() * dizi[3]);
                        }
                    }
                    System.out.print("Menu secenegi: ");
                    secenek = s.next();
                } else if (IntegeraDonustur(secenek) == 3) {
                    direction(dizi);
                    System.out.print("Menu secenegi: ");
                    secenek = s.next();
                } else if (IntegeraDonustur(secenek) == 4) {
                    donme(dizi);
                    System.out.print("Menu secenegi: ");
                    secenek = s.next();
                } else {
                    for (int i = 0; i < secenek.length(); i++) {
                        if (secenek.charAt(i) > 57 || secenek.charAt(i) < 48) {
                            System.out.println("Menudeki seceneklere ait sayilari giriniz.");
                            System.out.print("Menu secenegi: ");
                            secenek = s.next();
                        }
                    }
                    if (IntegeraDonustur(secenek) == 1) {
                        System.out.println("Array={" + dizi[0] + "," + dizi[1] + "," + dizi[2] + "," + dizi[3] + "," + dizi[4] + "}");
                        System.out.println("");
                        System.out.println("Baslangicta: ");
                        for (int i = 0; i < dizi[0]; i++) {
                            for (int j = 0; j < dizi[1]; j++) {
                                System.out.print(array[i][j] + "\t");;
                            }
                            System.out.println("");
                        }
                        System.out.println("");
                        System.out.println("Olusan: ");
                        ArrayDondur(dizi, array);

                        System.out.print("Menu secenegi: ");
                        secenek = s.next();
                    }
                    if (IntegeraDonustur(secenek) > 5 || IntegeraDonustur(secenek) < 1) {
                        System.out.println("Menudeki seceneklere ait sayilari giriniz.");
                        System.out.print("Menu secenegi: ");
                        secenek = s.next();
                    }
                }
            }
        }
    }
//  Satir sutun ve sayi araligi icin method olusturuyorum.

    public static void matris(int[] dizi) {
        Scanner s = new Scanner(System.in);
//      Sırayla satir, sutun ve sayi araligi isteyip bu degerlerin kontrollerini yapiyorum.
        boolean kontrol0 = true;
        System.out.print("Satir boyutu: ");
        String temp0 = s.next();
        while (kontrol0) {
            if (kontrol0) {
                for (int i = 0; i < temp0.length(); i++) {
                    if (temp0.charAt(i) > 57 || temp0.charAt(i) < 48) {
                        System.out.println("1'den buyuk sayi giriniz..");
                        System.out.print("Satir boyutu:");
                        temp0 = s.next();
                        break;
                    } else if (IntegeraDonustur(temp0) == 0) {
                        System.out.println("1'den buyuk sayi giriniz..");
                        System.out.print("Satir boyutu: ");
                        temp0 = s.next();
                        break;
                    } else if (IntegeraDonustur(temp0) == 1) {
                        System.out.println("1'den buyuk sayi giriniz..");
                        System.out.print("Satir boyutu: ");
                        temp0 = s.next();
                        break;
                    } else {
                        kontrol0 = false;
                    }
                }
            }
        }
        dizi[0] = IntegeraDonustur(temp0);
        boolean kontrol1 = true;
        System.out.print("Sutun boyutu: ");
        String temp1 = s.next();

        while (kontrol1) {
            if (kontrol1) {
                for (int i = 0; i < temp1.length(); i++) {
                    if (temp1.charAt(i) > 57 || temp1.charAt(i) < 48) {
                        System.out.println("1'den buyuk sayi giriniz..");
                        System.out.print("Sutun boyutu: ");
                        temp1 = s.next();
                        break;
                    } else if (IntegeraDonustur(temp1) == 0) {
                        System.out.println("1'den buyuk sayi giriniz..");
                        System.out.print("Sutun boyutu: ");
                        temp1 = s.next();
                        break;
                    } else if (IntegeraDonustur(temp1) == 1) {
                        System.out.println("1'den buyuk sayi giriniz..");
                        System.out.print("Sutun boyutu: ");
                        temp1 = s.next();
                        break;
                    } else {
                        kontrol1 = false;
                    }
                }
            }
        }
        dizi[1] = IntegeraDonustur(temp1);
        boolean kontrol3 = true;
        System.out.print("Sayi araligi: ");
        String temp3 = s.next();

        while (kontrol3) {
            if (kontrol3) {
                for (int i = 0; i < temp3.length(); i++) {
                    if (temp3.charAt(i) > 57 || temp3.charAt(i) < 48) {
                        System.out.println("0'dan buyuk sayi giriniz..");
                        System.out.print("Sayi araligi: ");
                        temp3 = s.next();
                        break;
                    } else if (IntegeraDonustur(temp3) == 0) {
                        System.out.println("0'dan buyuk sayi giriniz..");
                        System.out.print("Sayi araligi: ");
                        temp3 = s.next();
                        break;
                    } else {
                        kontrol3 = false;
                    }
                }
            }
        }
        dizi[3] = IntegeraDonustur(temp3);
    }
//  Matrisin dondurulecegi yon icin method olusturuyorum.

    public static void direction(int[] dizi) {
        Scanner s = new Scanner(System.in);
        boolean kontrol2_1 = true;
        System.out.print("Direction(1,-1): ");
        String temp = s.next();
//      Yon icin kontrolleri yapiyorum.
        while (kontrol2_1) {
            if (kontrol2_1) {
                for (int i = 0; i < temp.length(); i++) {
                    if (temp.charAt(i) > 49 || temp.charAt(i) < 45) {
                        System.out.println("1 ya da -1 giriniz..");
                        System.out.print("Direction(1,-1): ");
                        temp = s.next();
                        break;
                    } else if (temp.charAt(i) == '0') {
                        System.out.println("1 ya da -1 giriniz..");
                        System.out.print("Direction(1,-1): ");
                        temp = s.next();
                        break;
                    } else if (temp.charAt(i) == '.') {
                        System.out.println("1 ya da -1 giriniz..");
                        System.out.print("Direction(1,-1): ");
                        temp = s.next();
                        break;
                    } else if (temp.charAt(i) == '/') {
                        System.out.println("1 ya da -1 giriniz..");
                        System.out.print("Direction(1,-1): ");
                        temp = s.next();
                        break;
                    } else {
                        kontrol2_1 = false;
                    }
                }
            }
        }
        dizi[2] = IntegeraDonustur(temp);
    }
//  Matrisin donme sayisi icin method olusturuyorum.

    public static void donme(int[] dizi) {
        Scanner s = new Scanner(System.in);
        boolean kontrol4 = true;
        System.out.print("Dondurulme sayisi: ");
        String temp = s.next();
//      Donme icin kontrolleri yapiyorum.
        while (kontrol4) {
            if (kontrol4) {
                for (int i = 0; i < temp.length(); i++) {
                    if (temp.charAt(i) > 57 || temp.charAt(i) < 48) {
                        System.out.println("0'dan buyuk sayi giriniz..");
                        System.out.print("Dondurulme sayisi: ");
                        temp = s.next();
                        break;
                    } else if (IntegeraDonustur(temp) == 0) {
                        System.out.println("0'dan buyuk sayi giriniz..");
                        System.out.print("Dondurulme sayisi: ");
                        temp = s.next();
                        break;
                    } else {
                        kontrol4 = false;
                    }
                }
            }
        }
        dizi[4] = IntegeraDonustur(temp);
    }
//  Matrisin donme islemi icin method olusturuyorum.

    public static void ArrayDondur(int[] dizi, int[][] array) {

        int boyut = (dizi[0] + dizi[1]) * 2 - 4;
        int[] arrayTemp = new int[boyut];
        int boyutCount = 0;
//      Matrisin kenarindaki elemanlari bir diziye yaziyorum.

        for (int e = 0; e < dizi[1]; e++) {
            arrayTemp[boyutCount] = array[0][e];
            boyutCount++;
        }
        for (int e = 1; e < dizi[0]; e++) {
            arrayTemp[boyutCount] = array[e][dizi[0] - 1];
            boyutCount++;
        }

        for (int e = dizi[1] - 2; e > -1; e--) {
            arrayTemp[boyutCount] = array[dizi[0] - 1][e];
            boyutCount++;
        }

        for (int e = dizi[0] - 2; e > 0; e--) {
            arrayTemp[boyutCount] = array[e][0];
            boyutCount++;
        }
//      Yazdigim dizinin elemanlarini girilen deger kadar kaydiriyorum.

        for (int j = 0; j < dizi[4]; j++) {
            if (dizi[2] == 1) {
                arrayTemp = anticlockwise(arrayTemp);
            }
            if (dizi[2] == -1) {
                arrayTemp = clockwise(arrayTemp);
            }
        }

//      Kaydirdigimiz elemanlari diziye yerlestiriyorum
        int lel = 0;
        for (int e = 0; e < dizi[1]; e++) {
            array[0][e] = arrayTemp[lel];
            lel++;
        }
        for (int e = 1; e < dizi[0]; e++) {
            array[e][dizi[0] - 1] = arrayTemp[lel];
            lel++;
        }
        for (int e = dizi[1] - 2; e > -1; e--) {
            array[dizi[0] - 1][e] = arrayTemp[lel];
            lel++;
        }
        for (int e = dizi[0] - 2; e > 0; e--) {
            array[e][0] = arrayTemp[lel];
            lel++;
        }
        for (int i = 0; i < dizi[0]; i++) {
            for (int j = 0; j < dizi[1]; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }
//  Saat yönünde elemanlari kaydirmak icin method olusturuyorum.

    public static int[] clockwise(int[] a) {
        int temp = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = temp;
        return a;
    }

//  Saat yönünün tersinde elemanlari kaydirmak icin bir method olusturuyorum.
    public static int[] anticlockwise(int[] a) {
        int temp = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = temp;
        return a;
    }
//  Stringin integera cevrildigi bir method olusturuyorum.

    public static int IntegeraDonustur(String temp) {
        int i = 0;
        int sayi = 0;
        boolean negatifMi = false;
        int uzunluk = temp.length();
        if (temp.charAt(0) == '-') {
            negatifMi = true;
            i = 1;
        }
        while (i < uzunluk) {
            sayi = sayi * 10;
            sayi = sayi + (temp.charAt(i++) - '0');
        }
        if (negatifMi) {
            sayi = -sayi;
        }
        return sayi;
    }
}