package kopo;

import java.util.*;

public class ListMapExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        Map<String, String> map = null;

        for(int i = 0;i < 3;i++) {

            System.out.println("이름 : ");
            String name = scanner.next();

            System.out.println("이메일 : ");
            String email = scanner.next();

            System.out.println("부서 : ");
            String dapt = scanner.next();

            map = new HashMap<>();

            map.put("name", name);
            map.put("email", email);
            map.put("dapt", dapt);

            list.add(map);

            map = null;

        }
        int Listsize = list.size();

        System.out.println("저장된 데이터의 수 : " + Listsize);

            System.out.println("1세대 반복문");

            for (int i = 0; i < Listsize; i++) {
                Map<String, String> rMap = List.get(i);

                System.out.println(rMap.get("name :  " + rMap.get("name"));
                System.out.println(rMap.get("email : " + rMap.get("email"));
                System.out.println(rMap.get("dept : " + rMap.get("dept"));

                rMap = null;
            }
        }
    }

}
