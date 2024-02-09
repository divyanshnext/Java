import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortAndMergeLists {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        List<Integer> list1 = takeInputList(scanner, "Enter elements for the first list:");

        
        List<Integer> list2 = takeInputList(scanner, "Enter elements for the second list:");

        
        Collections.sort(list1);
        Collections.sort(list2);

       
        List<Integer> mergedList = mergeSortedLists(list1, list2);

        
        System.out.println("Merged sorted list:");
        System.out.println(mergedList);

        
        scanner.close();
    }

    private static List<Integer> takeInputList(Scanner scanner, String message) {
        System.out.println(message);
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter the number of elements: ");
        int numberOfElements = scanner.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < numberOfElements; i++) {
            int element = scanner.nextInt();
            list.add(element);
        }
        return list;
    }


    private static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}
