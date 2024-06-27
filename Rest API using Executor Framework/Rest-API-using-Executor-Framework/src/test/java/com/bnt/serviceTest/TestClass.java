package com.bnt.serviceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import com.bnt.service.Cube;
import com.bnt.service.EvenOdd;
import com.bnt.service.Square;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class TestClass {

    @Mock
    private Logger loggerMock;

    @InjectMocks
    private EvenOdd evenOdd;

    @Test
    void testSquare(){
        int number = 5;
        Square square = new Square(number);
        int expectedResult = 25;
        square.run();
        int actualResult = number * number;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testCube(){
        int number = 5;
        Cube cube = new Cube(number);
        int expectedResult = 125;
        cube.run();
        int actualResult = number * number * number;
        assertEquals(expectedResult, actualResult);
    }

    }
