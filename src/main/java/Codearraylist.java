package kopo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Codearraylist {

    public static void main(String[] args) {

        List<String> List = new ArrayList<>();
        List.add("엄태훈");
        List.add("홍길동");
        List.add("임꺽정");
        List.add("고길동");

        int listSize = List.size();

        System.out.println("저장된 데이터 수 : " + listSize);
    }

}
