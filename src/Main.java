import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sınıfını başlatma
        Scanner scanner = new Scanner(System.in);

        // Tam sayı (integer) input alma
        System.out.print("Lütfen bir tam sayı girin: ");
        int intValue = scanner.nextInt();
        System.out.println("Girdiğiniz tam sayı: " + intValue);

        // Float (ondalık sayı) input alma
        System.out.print("Lütfen bir ondalık sayı girin: ");
        float floatValue = scanner.nextFloat();
        System.out.println("Girdiğiniz ondalık sayı: " + floatValue);

        // Boş satırı temizlemek için nextLine kullanımı
        scanner.nextLine(); // Bu satır, önceki nextInt veya nextFloat'dan sonra gereklidir.

        // String input alma
        System.out.print("Lütfen bir kelime veya cümle girin: ");
        String stringValue = scanner.nextLine();
        System.out.println("Girdiğiniz metin: " + stringValue);

        // Kullanıcı etkileşimi - yaş örneği
        System.out.print("Lütfen yaşınızı girin: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Yetişkinsiniz.");
        } else {
            System.out.println("Reşit değilsiniz.");
        }

        // Scanner sınıfını kapatma
        scanner.close();
    }
}