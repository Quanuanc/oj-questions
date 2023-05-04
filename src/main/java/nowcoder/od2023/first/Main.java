package nowcoder.od2023.first;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @see <a href="https://wiki.amoscloud.com/zh/ProgramingPractice/NowCoder/Adecco/Topic0198">题目</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Map<Integer, Integer> countMap = new HashMap<>();

        for (Integer num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> countList = new ArrayList<>(countMap.entrySet());
        countList.sort((a, b) -> {
            if (Objects.equals(b.getValue(), a.getValue())) {
                return b.getKey() - a.getKey();
            }
            return b.getValue() - a.getValue();
        });
        StringBuilder result = new StringBuilder();
        List<Integer> pukeCards = new ArrayList<>();
        for (int i = 0; i < countList.size(); i++) {
            Map.Entry<Integer, Integer> entry = countList.get(i);
            int cardNum = entry.getKey();
            int cardCount = entry.getValue();
            if (i > 0 && countList.get(i - 1).getValue() == 3 && cardCount == 3) {
                pukeCards.add(cardNum);
                cardCount--;
                entry.setValue(cardCount);
            } else if (cardCount == 1 && !pukeCards.isEmpty()) {
                for (int k = 0; k < pukeCards.size(); k++) {
                    if (pukeCards.get(k) > cardNum) {
                        result.append(pukeCards.get(k)).append(" ");
                        pukeCards.remove(k);
                        k--;
                    }
                }
            }
            for (int j = 0; j < cardCount; j++) {
                result.append(cardNum).append(" ");
            }
        }
        if (!pukeCards.isEmpty()) {
            for (int card : pukeCards) {
                result.append(card).append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }
}
