package com.ohgirafarrers.section02.uses.subsection03.terminal;

import java.util.Arrays;
import java.util.List;

public class Application04 {
    public static void main(String[] args) {
        /* 최종 연산 중 하나인 match에 대해 이해하고 사용할 수 있다. */
        List<String> stringList = Arrays.asList("java", "spring", "SpringBoot");

        boolean anyMatch = stringList.stream().anyMatch(str -> str.contains("p"));  //  anyMatch 글자안에 p가 들어가니 ?
        boolean allMatch = stringList.stream().allMatch(str -> str.length() > 3);  // allMatch 글자가 3글자가 넘어가니 ?
        boolean noneMatch = stringList.stream().noneMatch(str -> str.contains("c")); // noneMatc c라는 문자가들어가니?

        System.out.println("anyMatch : " + anyMatch);
        System.out.println("allMatch : " + allMatch);
        System.out.println("noneMatch : " + noneMatch);

    }
}
