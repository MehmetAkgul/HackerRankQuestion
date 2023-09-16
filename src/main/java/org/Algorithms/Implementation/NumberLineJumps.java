package org.Algorithms.Implementation;

/**
 * Created by Mehmet AKGUL on 9/16/23.
 */
public class NumberLineJumps {
    public static void main(String[] args) {
        v1();
        v2();
    }
    public static void v1() {
        int x1 = 2, v1 = 1, x2 = 1, v2 = 2;
        for (int i = 1; i <= 10000; i++) {
            if ((x1 + (i * v1)) == (x2 + (i * v2))) {
                System.out.println("Yes");
                break;
            }
            System.out.println("No");
        }
    }
    public static void v2() {
        /**
         Verilen ifade: (x2 - x1) % (v1 - v2) == 0

         Bu ifadeyi türetmek için, iki kangurunun aynı anda aynı konumda olabilmeleri için
         mantıksal bir koşulu ifade etmemiz gerekiyor.
         İşte bu koşulu nasıl türetebileceğimize dair adımlar:

         İki kanguru aynı anda aynı konumda olabilmeleri için,
         aynı zamanda aynı mesafeyi kat etmiş olmaları gerekmektedir.
         Yani, her iki kanguru aynı sayıda zıplamış olmalıdır.
         İlk kangurunun başlangıç konumu x1 ve hızı v1,
         ikinci kangurunun başlangıç konumu x2 ve hızı v2 olsun.
         İlk kangurunun n kez zıplaması durumunda konumu: x1 + n * v1
         İkinci kangurunun n kez zıplaması durumunda konumu: x2 + n * v2
         İki kangurunun aynı anda aynı konumda olabilmesi için,
         bu iki ifadenin eşit olması gerekir:
         (x1 + n * v1) = (x2 + n * v2)
         İki kangurunun aynı anda aynı konumda olabilmesi için,
         bu iki ifadenin farkı sıfır olmalıdır:
         (x1 + n * v1) - (x2 + n * v2) = 0
         Şimdi bu ifadeyi sadeleştirelim:
         (x1 - x2) + n * (v1 - v2) = 0
         Burada n katlarına odaklanalım ve diğer terimleri izole edelim:
         n * (v1 - v2) = -(x1 - x2)
         n'yi izole etmek için her iki tarafı (v1 - v2) ile bölelim:
         n = -(x1 - x2) / (v1 - v2)
         Şimdi bu ifadeyi daha genel bir formda yazalım:
         n = (x2 - x1) / (v1 - v2)
         Şimdi, işte bu ifadeyi türettik.
         Eğer (x2 - x1) ve (v1 - v2) terimleri arasındaki bölme işlemi
         tam bir sayı sonucu veriyorsa (yani, tam bölünebiliyorsa),
         o zaman n bir tam sayı olacaktır. Bu durumda,
         iki kanguru aynı anda aynı konumda olabilirler ve ifade 0'a eşit olur.
         Eğer bu bölme işlemi tam bir sayı sonucu vermiyorsa,
         yani kesirli bir sonuç varsa, o zaman n bir tam sayı değil
         ve iki kanguru aynı anda aynı konumda olamazlar
         ve ifade 0'dan farklı bir değere sahip olur.

         Sonuç olarak, (x2 - x1) % (v1 - v2) == 0 ifadesi,
         iki kangurunun aynı anda aynı konumda olabilme koşulunu ifade eder
         ve bu koşulun sağlanması durumunda "YES" (evet),
         sağlanmaması durumunda ise "NO" (hayır) döndürülür.
         */
        int x1 = 2, v1 = 1, x2 = 1, v2 = 2;
        if (v1 == v2) {
            if (x1 == x2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            if (((x2 - x1) % (v1 - v2) == 0) && ((x2 - x1) / (v1 - v2) >= 0)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}


/**
 * You are choreographing a circus show with various animals.
 * For one act,
 * you are given two kangaroos on a number line ready to jump in the positive direction
 * (i.e, toward positive infinity).
 * The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
 * The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
 * You have to figure out a way to get both kangaroos
 * at the same location at the same time as part of the show.
 * If it is possible, return YES, otherwise return NO.
 */