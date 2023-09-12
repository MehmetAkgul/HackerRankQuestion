package org.warmup;


/**
 Staircase detail
 This is a staircase of size :
    #
   ##
  ###
 ####
 Its base and height are both equal to . It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
 Write a program that prints a staircase of size .
 Function Description
 Complete the staircase function in the editor below.
 staircase has the following parameter(s):
 Açıklama:
 Bu problemde, verilen bir boyut n için bir merdiven şekli çizmeniz gerekmektedir. Merdiven "#" sembollerinden oluşur ve boşluklar ile yerleştirilir. Merdivenin tabanı ve yüksekliği her ikisi de n eşittir.

 Örneğin,
 n =  4
 n=4 için merdiven şu şekilde görünecektir:

    #
   ##
  ###
 ####
 Fonksiyon Tanımı:

 staircase adında bir fonksiyonu tamamlayacaksınız.

 Parametreler:

 int n: Bir tam sayı, merdivenin boyutunu belirtir.
 */
public class Staircase {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

}
