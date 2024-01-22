package Lab_work_6;

import java.util.*;

public class AnalysisOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arrayFirst = sc.nextLine().split(" ");
        String[] arraySecond = sc.nextLine().split(" ");
        String[] combinedArray = new String[arrayFirst.length + arraySecond.length];

        int iGlobal = 0;
        for (int i = 0; i < arrayFirst.length; i++) {
            combinedArray[iGlobal] = arrayFirst[i];
            iGlobal++;
        } //записываем в общий массив элементы из первого, занимаем индексы с 0 до последнего(из первого)

        for (int i = 0; i < arraySecond.length; i++) {
            combinedArray[iGlobal] = arraySecond[i];
            iGlobal++;
        } //записываем в общий массив элементы из второго,
          //занимаем индексы с последнего(из первого) до последнего(из второго)

        combinedArray = Arrays.stream(combinedArray).sorted(Comparator.comparing(String::length))
                .toArray(a -> new String[arrayFirst.length + arraySecond.length]);
        //обработка массива(в поток), сортируем по возрастанию, сравнивая длины строковых элементов, (из потока обратно в массив)

        ArrayList<String> combinedArrayList = new ArrayList<>(Arrays.asList(combinedArray));

        for (int i = 0; i < combinedArrayList.size(); i++) {
            try {
                if (combinedArrayList.get(i).equals(combinedArrayList.get(i+1))) {
                    combinedArrayList.remove(i);
                }
            } catch (Exception e) {
                break;
            }
        }

        for (int i = combinedArrayList.size() - 1; i >= 0; i--) {
            System.out.print(combinedArrayList.get(i) + " ");
        }
    }
}
//var_9
/*
write once run anywhere
run anywhere and everywhere
*/
