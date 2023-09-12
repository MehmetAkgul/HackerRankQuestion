package org.Algorithms.Implementation;

import java.util.List;

/**
 * Created by Mehmet AKGUL on 9/12/23.
 * HackerLand University has the following grading policy:
 * Every student receives a grade in the inclusive range from 0 to 100 .
 * Any grade  less than 40 is a failing grade.
 * Sam is a professor at the university and likes to round each student's grade according to these rules:
 * If the difference between the grade  and the next multiple of 5  is less than 3 , round  grade up to the next multiple of 5.
 * If the value of  is less than 38, no rounding occurs as the result will still be a failing grade.
 * Examples
 *  grade = 84 round to 85   (85 - 84 is less than 3)
 *   grade = 29 do not round (result is less than 40)
 *   grade =  57 do not round (60 - 57 is 3 or higher)
 * Given the initial value of grade for each of Sam's  n students, write code to automate the rounding process.
 * Function Description
 * Complete the function gradingStudents in the editor below.
 * gradingStudents has the following parameter(s):
 * int grades[n]: the grades before rounding
 *
 *
 * Açıklama:
 * Bu soruda, HackerLand Üniversitesi'nin not yuvarlama politikasını uygulamanız gerekmektedir. Üniversitenin politikası şu şekildedir:
 *
 * Öğrencilerin notları 0 ile 100 arasında bir değer olabilir.
 * 40'tan düşük notlar başarısızlık olarak kabul edilir.
 * Sam isimli profesör, her öğrencinin notunu aşağıdaki kurala göre yuvarlamak ister:
 * Eğer notun ve en yakın 5'in katı arasındaki fark 3'ten küçükse, notu en yakın 5'in katına yuvarla.
 * Eğer not 38'den küçükse, notu yuvarlama. Çünkü sonuç yine başarısız olacaktır.
 * Örnekler:
 *
 * Not 84 ise, 85'e yuvarlanır. (Çünkü 85 - 84 < 3)
 * Not 29 ise, yuvarlanmaz. (Çünkü not 40'tan küçük)
 * Not 57 ise, yuvarlanmaz. (Çünkü 60 - 57 = 3)
 * Fonksiyon Tanımı:
 *
 * Fonksiyonun adı gradingStudents olacak ve parametre olarak yuvarlanmamış notları içeren bir tamsayı dizisi alacak.
 */
public class GradingStudents {

    public static void main(String[] args) {
        List<Integer> grades = new java.util.ArrayList<>(List.of(45, 66, 78, 37, 39, 83, 84, 82));
        List<Integer> newGrades = new java.util.ArrayList<>();

        for (Integer grade : grades) {
            if (grade<38) {
                newGrades.add(grade);
            }else{
                int newGrade=((grade/5)+1)*5;
                if(newGrade-grade<3){
                    grade= newGrade;
                }
                newGrades.add(grade);
            }
        }

        for (Integer newGrade : newGrades) {
            System.out.println(newGrade);
        }
    }
}
