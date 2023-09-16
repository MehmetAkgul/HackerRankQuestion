package org.Algorithms.Implementation;

import java.util.List;

/**
 * Created by Mehmet AKGUL on 9/12/23.
 * Sam'ın evinde bir elma ağacı ve bir portakal ağacı bulunmaktadır ve her iki ağaç da bol miktarda meyve vermektedir. Aşağıdaki bilgilere göre, Sam'in evine kaç tane elma ve portakal düştüğünü belirleyin.
 *
 * Aşağıdaki diyagramda:
 * Kırmızı bölge, evi temsil eder, s başlangıç noktasıdır,
 * ve t son noktasıdır. Elma ağacı evin solunda bulunur,
 * ve portakal ağacı ise sağında. Ağaçlar tek bir noktada bulunuyor gibi kabul edilir,
 * elma ağacı noktasında a bulunur ve portakal ağacı ise b noktasında bulunur.
 * Bir meyve ağacından düştüğünde,
 * köken ağacından x-ekseni boyunca d birim uzaklığa düşer.
 * d'nin negatif bir değeri, meyvenin ağacın soluna d birim düştüğü anlamına gelir,
 * ve d'nin pozitif bir değeri, d birim sağa düştüğü anlamına gelir.
 * Meyve düşüşlerinin d değerleri için m elma ve n portakal verildiğinde,
 * Sam'in evine kaç elma ve portakal düşeceğini belirleyin
 * (yani, dahil edilen aralık [s, t] içinde)?
 * Örneğin, Sam'ın evi s=7 ve t=10 arasında bulunuyor.
 * Elma ağacı a=4 noktasında ve portakal ağacı b=12 noktasında bulunur.
 * m=3 elma ve n=3 portakal bulunmaktadır.
 * Elmalar, a'dan [2,3,-4] birim uzaklığa atılır,
 * ve portakallar [3,-2,-4] birim uzaklığa atılır.
 * Her elma mesafesini ağacın pozisyonuna ekleyerek,
 * onlar [4+2,4=#,4+-4]=[6,7,0] noktasına düşerler.
 * Portakallar [12+3,12+-2,12+-4]=[15,10,8] noktasına düşerler.
 * Bir elma ve iki portakal, dahil edilen 7-10 aralığında düşer, bu nedenle
 * 1
 * 2
 */
public class AppleAndOrange {
    public static void main(String[] args) {
        int s = 7;
        int t = 10;
        int a = 4;
        int b = 12;
        List<Integer> apples = List.of(2, 3, -4);
        List<Integer> oranges = List.of(3, -2, -4);


        System.out.println(fruitCount(s, t, apples, a));
        System.out.println(fruitCount(s, t, oranges, b));
    }

    public static int fruitCount(int s, int t, List<Integer> fruits, int distance) {
        int min = s, max = t, count = 0;
        if (s > t) {
            min = t;
            max = s;
        }
        for (int fruit : fruits) {
          if ( (distance+fruit) <= max && (distance+fruit) >=min) {
                count++;
            }
        }
        return count;
    }
}
/**
 * Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the information given below,
 * determine the number of apples and oranges that land on Sam's house.
 * In the diagram below:
 * The red region denotes the house, where s is the start point,
 * and t is the endpoint. The apple tree is to the left of the house,
 * and the orange tree is to its right.
 * Assume the trees are located on a single point,
 * where the apple tree is at point a , and the orange tree is at point b.
 * When a fruit falls from its tree,
 * it lands d units of distance from its tree of origin along the x-axis.
 * A negative value of d means the fruit fell d units to the tree's left,
 * and a positive value of d means it falls d units to the tree's right. *
 * Apple and orange(2).png
 * Given the value of d for m  apples and n oranges,
 * determine how many apples and oranges will fall on Sam's house
 * (i.e., in the inclusive range[s,t] )?
 * For example, Sam's house is between s=7 and t=10.
 * The apple tree is located at a=4 and the orange at b=12.
 * There are m=3  apples and n=3 oranges.
 * Apples are thrown apples=[2,3,-4] units distance from a,
 * and oranges=[3,-2,-4]  units distance.
 * Adding each apple distance to the position of the tree,
 * they land at [4+2,4+3,4+-4]=[6,7,0].
 * Oranges land at [12+3,12+-2,12+-4]=[15,10,8].
 * One apple and two oranges land in the inclusive range 7-10 so we print
 * 1
 * 2
 * Function Description
 * Complete the countApplesAndOranges function in the editor below. It should print the number of apples and oranges that land on Sam's house, each on a separate line.
 * countApplesAndOranges has the following parameter(s):
 * s: integer, starting point of Sam's house location.
 * t: integer, ending location of Sam's house location.
 * a: integer, location of the Apple tree.
 * b: integer, location of the Orange tree.
 * apples: integer array, distances at which each apple falls from the tree.
 * oranges: integer array, distances at which each orange falls from the tree.
 */