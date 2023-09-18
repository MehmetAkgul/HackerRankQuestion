package org.Algorithms.Implementation;

/**
 * Created by Mehmet AKGUL on 9/18/23.
 * İki dizin tam sayıları olacak. Aşağıdaki iki koşulu sağlayan tüm tam sayıları belirleyin:
 * <p>
 * İlk dizinin elemanları, dikkate alınan tam sayının tüm çarpanlarıdır.
 * Dikkate alınan tam sayı, ikinci dizinin tüm elemanlarının bir çarpanıdır.
 * Bu sayılar, iki dizi arasında olarak kabul edilir. Kaç tane böyle sayı olduğunu belirleyin.
 * Örnek
 * <p>
 * a=[2,6]
 * b=[24,36]
 * Diziler arasında iki sayı vardır: ve .
 * İlk değer için 6%2=0, 6%6=0 , 24%6=0 ve 36%6=0.
 * İkinci değer için 12%2=0, 12%6=0 ve 24%12=0 , 36%12=0. 2 döndür.
 * <p>
 * <p>
 * <p>
 * Soruyu Açıklama
 * Bu soru iki dizi arasında yer alan tüm tam sayıları belirlememizi istiyor.
 * Bu tam sayılar iki koşulu karşılamalıdır:
 * İlk dizi (a[]) elemanlarının tümü, bu tam sayının çarpanı olmalı.
 * Bu tam sayı, ikinci dizi (b[]) elemanlarının tümünün bir çarpanı olmalıdır.
 * Bu tür sayıları belirleyip sayısını döndürmemiz gerekiyor.
 * Matematiksel Açıklama
 * İlk olarak, a[] dizisindeki tüm elemanların EKOK'unu (En Küçük Ortak Kat)hesaplıyoruz.
 * Sonra, b[] dizisindeki tüm elemanların EBOB'unu (En Büyük Ortak Bölen) hesaplıyoruz.
 * EKOK ve EBOB arasındaki tüm sayıları kontrol ediyoruz.
 * EKOK'un çarpanları ve EBOB'un bölenleri arasındaki sayıları arıyoruz.
 * Bu adımlar, aradığımız tüm tam sayıları belirlememize yardımcı olacaktır.
 */
public class BetweenTwoSets {
    public static void main(String[] args) {
        int[] a = {2, 4};
        int[] b = {16, 32,96};
        System.out.print("getTotalX1 :");
        System.out.println(getTotalX(a, b)); // Output should be 2

        System.out.print("getTotalX2 :");
        getTotalX2(a, b); // Output should be 2

        System.out.println("EBOB (Brute-Force): " + findGCDByBruteForce(56, 48));
        System.out.println("EKOK (Brute-Force): " + findLCMByBruteForce(56, 48));
    }

    public static void getTotalX2(int[] a, int[] b) {
        int count = 0;
        for (int i = a[a.length - 1]; i <= b[0]; i++) {
            boolean isBetween = true;

            for (int num : a) {
                if (i % num != 0) {
                    isBetween = false;
                    break;
                }
            }

            for (int num : b) {
                if (num % i != 0) {
                    isBetween = false;
                    break;
                }
            }

            if (isBetween) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int getTotalX(int[] a, int[] b) {
        // LCM of all elements in a
        int lcmOfA = a[0];
        for (int i = 1; i < a.length; i++) {
            lcmOfA = lcm(lcmOfA, a[i]);
        }

        // GCD of all elements in b
        int gcdOfB = b[0];
        for (int i = 1; i < b.length; i++) {
            gcdOfB = gcd(gcdOfB, b[i]);
        }

        // Count numbers that are multiple of LCM of a[] and factor of GCD of b[]
        int count = 0;
        for (int i = lcmOfA, j = 2; i <= gcdOfB; i = lcmOfA * j, j++) {
            if (gcdOfB % i == 0) {
                count++;
            }
        }

        return count;
    }

    public static int findLCMByBruteForce(int a, int b) {
        int lcm = Math.max(a, b);
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                return lcm;
            }
            lcm++;
        }
    }

    public static int findGCDByBruteForce(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
/**
 * There will be two arrays of integers. Determine all integers that satisfy the following two conditions:
 * The elements of the first array are all factors of the integer being considered
 * The integer being considered is a factor of all elements of the second array
 * These numbers are referred to as being between the two arrays. Determine how many such numbers exist.
 * Example
 * a=[2,6]
 * b=[24,36]
 * There are two numbers between the arrays: and .
 * 6%2=0, 6%6=0 , 24%6=0  and 36%6=0 for the first value.
 * 12%2=0,12%6=0  and 24%12=0 , 36%12=0 for the second value. Return 2.
 * Function Description
 * Complete the getTotalX function in the editor below. It should return the number of integers that are betwen the sets.
 * getTotalX has the following parameter(s):
 * int a[n]: an array of integers
 * int b[m]: an array of integers
 * Returns
 * int: the number of integers that are between the sets
 */


