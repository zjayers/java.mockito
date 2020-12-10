package io.ayers.java_mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class BusinessImplTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    BusinessImpl business;

    @BeforeEach
    public void initMocks(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFindGreatestValue() {
        // Mockito implementation
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25, 15, 3});
        int result = business.findGreatestNumber();
        assertThat(result).isEqualTo(25);
    }

}
