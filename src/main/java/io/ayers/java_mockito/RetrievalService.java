package io.ayers.java_mockito;

import org.springframework.stereotype.Service;

@Service
public class RetrievalService implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[0];
    }
}
