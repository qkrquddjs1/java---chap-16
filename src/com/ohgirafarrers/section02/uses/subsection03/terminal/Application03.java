package com.ohgirafarrers.section02.uses.subsection03.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application03 {
    public static void main(String[] args) {
        /* 스트림의 최종 연산 중 하나인 colleect에 대해 이해하고 사용할 수 있다.
        * collect() 메소드는 Collectors에서 제공하는 정적 메소드를 사용할수 있으며 ,컬렉션을 출력으로 받을 수 있다. */

        List<Member> memberList = Arrays.asList(
                new Member("test01", "홍길동"),
                new Member("test02", "유관순"),
                new Member("test03", "신사임당")
        );

        List<String> memberNameList = memberList.stream()
//                .map(member -> member.getMemberName())
                .map(Member::getMemberName)
                .collect(Collectors.toList());  //toList() 리스트로 바꿔주세요 ~

        System.out.println("memberNameList : " + memberNameList);

        String str = memberList
                .stream()
                .map(Member::getMemberId)
                .collect(Collectors.joining());
        System.out.println("str : " + str);

        String str2 = memberList
                .stream()
                .map(Member::getMemberId)
                .collect(Collectors.joining(" || ", "** ", " **"));
        System.out.println("str : " + str2);




    }
}
