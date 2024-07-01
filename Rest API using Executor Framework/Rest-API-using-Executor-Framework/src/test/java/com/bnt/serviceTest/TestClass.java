package com.bnt.serviceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.bnt.service.Cube;
import com.bnt.service.EvenOdd;
import com.bnt.service.Factorial;
import com.bnt.service.Palindrome;
import com.bnt.service.Prime;
import com.bnt.service.Reverse;
import com.bnt.service.Square;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class TestClass {

    @Mock
    private Square square;

    @Mock
    private Cube cube;

    @Mock
    private Factorial factorial;

    @Mock
    private Reverse reverse;

    @Mock
    private Palindrome palindrome;

    @Mock
    private Prime prime;

     @Test
    void testSquare(){
        Integer expectedResult = 25;
        when(square.getSquareResult(5)).thenReturn(expectedResult);
        Integer actualResult = square.getSquareResult(5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testCube(){
        Integer expectedResult = 125;
        when(cube.getCubeResult(5)).thenReturn(expectedResult);
        Integer actualResult = cube.getCubeResult(5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testFactorial(){
        Integer expectedResult = 120;
        when(factorial.getFactorial(5)).thenReturn(expectedResult);
        Integer actualResult = factorial.getFactorial(5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testReverse(){
        Integer expectedResult = 321;
        when(reverse.getReverse(123)).thenReturn(expectedResult);
        Integer actualResult = reverse.getReverse(123);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testPalindrome(){
        Integer expectedResult = 121;
        when(palindrome.getPalindrome(121)).thenReturn(expectedResult);
        Integer actualResult = palindrome.getPalindrome(121);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testPrime(){
        Boolean expectedResult = true;
        when(prime.getPrime(8)).thenReturn(expectedResult);
        Boolean actualResult = prime.getPrime(8);
        assertEquals(expectedResult, actualResult);
    }


   
    }
