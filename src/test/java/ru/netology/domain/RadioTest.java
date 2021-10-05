package ru.netology.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();
    Radio radio1 = new Radio(15, 14);

    @ParameterizedTest
    @CsvSource(
            value = {"-1,0",
                    "0, 0",
                    "3,3",
                    "10,0",
                    "9,9"

            }
    )
    void shouldSetAndGetCurrentWave(int currentWave, int expected){
        radio.setCurrentWave(currentWave);
        assertEquals(expected, radio.getCurrentWave());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"-1, 0",
                    "0, 0",
                    "5, 5",
                    "15, 0",
                    "14, 14"
            }
    )
    void shouldSetAndGetCurrentWave1(int currentRadioWave, int expected) {
        radio1.setCurrentWave(currentRadioWave);
        assertEquals(expected, radio1.getCurrentWave());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"4,5",
                    "9,0"
            }
    )
    void shouldPressNext(int currentWave, int expected){
        radio.setCurrentWave(currentWave);
        radio.next();
        assertEquals(expected, radio.getCurrentWave());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"4, 5",
                    "14, 0"
            }
    )
    void shouldPressNext1(int currentRadioWave, int expected) {
        radio1.setCurrentWave(currentRadioWave);
        radio1.next();
        assertEquals(expected, radio1.getCurrentWave());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"0,9",
                    "4,3"
            }
    )
    void shouldPressPrevious (int currentWave, int expected){
        radio.setCurrentWave(currentWave);
        radio.previous();
        assertEquals(expected, radio.getCurrentWave());

    }

    @ParameterizedTest
    @CsvSource(
            value = {"-1, 0",
                    "0, 0",
                    "5, 5",
                    "110, 0",
                    "100, 100"}
    )
    void shouldSetAndGetCurrentWave3(int currentVolumeLevel, int expected ){
        radio.setCurrentVolumeLevel(currentVolumeLevel);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"100,99",
                    "0, 0",
                    "5, 4"}
    )
    void shouldMinusCurrentWave (int currentVolumeLevel, int expected){
        radio.setCurrentVolumeLevel(currentVolumeLevel);
        radio.minusVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"100, 100",
                    "5, 6",
                    "0,1"}
    )
    void shouldPlusCurrentWave (int currentVolumeLevel, int expected){
        radio.setCurrentVolumeLevel(currentVolumeLevel);
        radio.plusVolume();
        assertEquals(expected, radio.getCurrentVolume() );
    }
}