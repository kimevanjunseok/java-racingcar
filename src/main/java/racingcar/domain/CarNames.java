/*
 * Copyright (c) 2020 by 티거, 제이미
 * All rights reserved.
 *
 * @author      티거, 제이미
 * @version     1.0
 * @date        11 Feb 2020
 *
 */

package racingcar.domain;

import java.util.Arrays;
import java.util.List;

public class CarNames {

    private final static String BLANK = " ";
    private final static String DELIMITER = ",";
    private static List<String> carNames;

    public static void setCarNames(String input) throws IllegalArgumentException {
        validateHasBlank(input);
        carNames = split(input);
        for (String carName : carNames) {
            validateNameLength(carName);
        }
    }

    private static void validateHasBlank(String input) {
        if (input.contains(BLANK)) {
            throw new IllegalArgumentException("공백은 허용되지 않습니다.");
        }
    }

    private static void validateNameLength(String input) {
        if (input.length() > 5) {
            throw new IllegalArgumentException("5자 이상 이름은 허용되지 않습니다.");
        }
    }

    private static List<String> split(String input) {
        return Arrays.asList(input.split(DELIMITER));
    }

    public static List<String> getCarNames() {
        return carNames;
    }
}
