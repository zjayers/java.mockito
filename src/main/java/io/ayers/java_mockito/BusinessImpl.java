package io.ayers.java_mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BusinessImpl {

    @Autowired
    private DataService dataService;

    int findGreatestNumber() {
        int[] data = dataService.retrieveAllData();
        int greatestValue = Integer.MIN_VALUE;

        for (int value : data) {
            if (value > greatestValue) {
                greatestValue = value;

            }
        }

        return greatestValue;

    }
}
