/*
 * Copyright (c) 2020 by 티거, 제이미
 * All rights reserved.
 *
 * @author      티거, 제이미
 * @version     1.0
 * @date        12 Feb 2020
 *
 */

package racingcar.domain;

import java.util.List;
import java.util.Random;

public class RacingGame {

    private final static String NEW_LINE = "\n";
    private final Cars cars;
    private final int tryCount;

    public RacingGame(List<Car> cars, int tryCount) {
        this.cars = new Cars(cars);
        this.tryCount = tryCount;
    }

    public String getRacingProgress() {
        StringBuilder executionResult = new StringBuilder();
        for (int i = 0; i < tryCount; i++) {
            playRacing(executionResult);
        }
        return executionResult.toString();
    }

    private void playRacing(StringBuilder racingProgress) {
        racingProgress.append(NEW_LINE);
        for (Car car : cars.getCars()) {
            car.move(RandomNumber.getRandomNo());
            racingProgress.append(car.toString());
        }
    }

    public String getWinner() {
        return Winner.getWinner(cars);
    }
}
