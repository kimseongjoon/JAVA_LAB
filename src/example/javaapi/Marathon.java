package example.javaapi;

import java.util.HashMap;

public class Marathon {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"병주", "병헌", "승언"}, new String[]{"병헌", "승언"}));
        System.out.println(solution(new String[]{"병주", "병헌", "승언", "송군"}, new String[]{"병주", "병헌", "송군"}));
        System.out.println(solution(new String[]{"병주", "병헌", "승언", "병헌"}, new String[]{"병주", "병헌", "승언"}));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();

//        for (String name : participant) {
//            if (hm.get(name) == null) {
//                hm.put(name, 1);
//            }
//            else {
//                int value = hm.get(name) + 1;
//                hm.put(name, value);
//            }
//        }
        for (String player : participant) {
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        }

//        for (String name : completion) {
//            int value = hm.get(name) - 1; // 키값으로 value값 가져옴
//            hm.put(name, value); // 해시맵에 입력
//        }

        for (String player : completion) {
            hm.put(player, hm.getOrDefault(player, 0) - 1);
        }


        // 마지막에 이름에 해당값이 1인 사람을 찾습니다. (참가는 했지만 완주안함)
        for (String name : hm.keySet()) { // 해시맵 요소를 전체 반복
            if (hm.get(name) == 1) answer = name; //
        }

        return answer;
    }
}
