import java.util.Scanner;
public class DongulerAtmProjesiOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        int right=3;
        int select;
        int balance = 2000;
        int maxlimit = 0;
        boolean kosul=true;

        while (right > 0){
            System.out.print("Kullanıcı Adınızı Giriniz:");
            username = input.nextLine();
            System.out.print("Parolanızı Giriniz:");
            password = input.nextLine();

            if (username.equals("ssomkan60") && password.equals("6060")){
                System.out.println("Yazılımcı Bankasına Hoşgeldiniz.");
                System.out.println("Ana Menü:");
                while (kosul){
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap");
                    System.out.print("Yapmak İstediğiniz İşlemi Seçin:");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Para Miktarı:");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("İşleminiz Gerçekleşmiştir.\nAna Menü:");
                            break;
                        case 2:
                            System.out.print("Para Miktarı:");
                            price = input.nextInt();
                            if (price > maxlimit){
                                System.out.println("Bakiyeniz Yetersiz.");
                            }
                            else {
                                balance -= price;
                                System.out.println("İşleminiz Gerçekleşmiştir.\nAna Menü:");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz:"+balance);
                            maxlimit = 1000 + balance;
                            System.out.println("Esnek Limit:"+maxlimit);
                            System.out.println("Ana Menü:");
                            break;
                        case 4:
                            System.out.println("Tekrar Görüşmek Üzere.");
                            kosul = false;
                            right = 0;
                            break;
                        default:
                            System.out.println("Yanlış Tuşlama Yaptınız.\nAna Menü:");
                    }
                }
            }
            else {
                --right;
                System.out.println("Hatalı Kullanıcı Adı Veya Şifre. Tekrar Deneyin");
                System.out.println("Kalan Hakkınız:"+right);
                if (right == 0){
                    System.out.println("Hesabınız Bloke Olmuştur.");
                }
            }
        }
    }
}
