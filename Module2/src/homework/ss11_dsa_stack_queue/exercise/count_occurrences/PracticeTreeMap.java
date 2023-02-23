package homework.ss11_dsa_stack_queue.exercise.count_occurrences;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PracticeTreeMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new TreeMap<>();

        System.out.println("Enter a string ");
        String arrString = sc.nextLine();
        arrString = arrString.toLowerCase();

        for (int i = 0; i < arrString.length(); i++) {
            char keyMap = arrString.charAt(i);

            if (map.containsKey(keyMap)) {
                map.put(keyMap, map.get(keyMap) + 1);
            } else {
                map.put(keyMap, 1);
            }
        }
        System.out.println(map);
    }
}

