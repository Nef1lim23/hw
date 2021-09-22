package ru.netology.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


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
        Radio radio = new Radio();
        radio.setCurrentWave(currentWave);
        assertEquals(expected, radio.getCurrentWave());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"4,5",
                    "9,0"
            }
    )
    void shouldPressNext(int currentWave, int expected){
        Radio radio = new Radio();
        radio.setCurrentWave(currentWave);
        radio.next();
        assertEquals(expected, radio.getCurrentWave());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"0,9",
                    "4,3"
            }
    )
    void shouldPressPrevious (int currentWave, int expected){
        Radio radio = new Radio();
        radio.setCurrentWave(currentWave);
        radio.previous();
        assertEquals(expected, radio.getCurrentWave());

    }

    @ParameterizedTest
    @CsvSource(
            value = {"-1, 0",
                    "0, 0",
                    "5, 5",
                    "11, 0",
                    "10, 10"}
    )
    void shouldSetAndGetCurrentValume(int currentVolumeLevel, int expected ){
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(currentVolumeLevel);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"10,9",
                    "0, 0",
                    "5, 4"}
    )
    void shouldMinusCurrentValume (int currentVolumeLevel, int expected){
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(currentVolumeLevel);
        radio.minusVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"10, 10",
                    "5, 6"}
    )
    void shouldPlusCurrentValume (int currentVolumeLevel, int expected){
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(currentVolumeLevel);
        radio.plusVolume();
        assertEquals(expected, radio.getCurrentVolume() );
    }
}