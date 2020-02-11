package racingcar.view;/*
 * Copyright (c) 2019 by 이름
 * All rights reserved.
 *
 * 클래스명.java
 * 클래스 설명
 *
 * @author      이름
 * @version     1.0
 * @date        dd mm yyyy
 *
 */

public class OutputView {
    public static void printInputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public static void printInputTryCount() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void printExecutionResult() {
        System.out.println("실행 결과");
    }

    public static void printString(String string) {
        System.out.println(string);
    }

    public static void printWinner(String winners) {
        System.out.println(winners + "가 최종 우승했습니다.");
    }
}
