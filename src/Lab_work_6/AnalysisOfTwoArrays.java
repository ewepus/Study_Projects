package Lab_work_6;

import java.util.*;

public class AnalysisOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arrayFirst = sc.nextLine().split(" ");
        String[] arraySecond = sc.nextLine().split(" ");

        ArrayList<String> combinedArray = new ArrayList<>();
        ArrayList<String> combinedArraySorted = new ArrayList<>();
        for (int i = 0; i < Math.max(arrayFirst.length, arraySecond.length); i++) {
            //добавляем в лист элементы из массивов (без дубликатов)
            if (!combinedArray.contains(arrayFirst[i])) combinedArray.add(arrayFirst[i]);
            if (!combinedArray.contains(arraySecond[i])) combinedArray.add(arraySecond[i]);
        }
        combinedArray.trimToSize();

        int maxWordLength = Integer.MIN_VALUE;
        int minWordLength = Integer.MAX_VALUE;
        for (int i = 0; i < combinedArray.size(); i++) { //определили максимальную и минимальную длины слов
            if (combinedArray.get(i).length() > maxWordLength) maxWordLength = combinedArray.get(i).length();
            if (combinedArray.get(i).length() < minWordLength) minWordLength = combinedArray.get(i).length();
        }

        for (int i = maxWordLength; i >= minWordLength; i--) {
            for (int j = 0; j < combinedArray.size(); j++) {
                if (combinedArray.get(j).length() == i) {
                    combinedArraySorted.add(combinedArray.get(j)); //сортируем по убыванию длины слова
                }
            }
        }

        for (int i = 0; i < combinedArraySorted.size(); i++) {
            if (i == combinedArraySorted.size() - 1) System.out.print(combinedArraySorted.get(i));
            else System.out.print(combinedArraySorted.get(i) + " ");
        }
    }
}
//var_9
/*
write once run anywhere
run anywhere and everywhere
*/
