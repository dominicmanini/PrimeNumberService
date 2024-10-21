package com.example.obm_technical_assessment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openapitools.model.Algorithms.BRUTE_FORCE;
import static org.openapitools.model.Algorithms.RECURSIVE;

import com.example.obm_technical_assessment.service.PrimeService;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.openapitools.model.Algorithms;
import org.openapitools.model.Prime;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class ObmTechnicalAssessmentApplicationTests {

  @Test
  void testBruteForce() {
    PrimeService primeService = new PrimeService();
    List<Integer> expectedInput = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);
    Prime expectedPrime = new Prime().primeNumbers(expectedInput);
    assertEquals(expectedPrime, primeService.getPrimes(19, BRUTE_FORCE));

  }

  @Test
  void testRecursion() {
    PrimeService primeService = new PrimeService();
    List<Integer> expectedInput = Arrays.asList(19, 17, 13, 11, 7, 5, 3, 2);
    Prime expectedPrime = new Prime().primeNumbers(expectedInput);
    assertEquals(expectedPrime, primeService.getPrimes(19, RECURSIVE));
  }

  @Test
  void shouldReturnFullResponseWithValidInput(){
    PrimeService primeService = new PrimeService();
    String actual = ResponseEntity.ok(primeService.getPrimes(17,BRUTE_FORCE)).toString();
    assertEquals("<200 OK OK,class Prime {\n"
        + "    primeNumbers: [2, 3, 5, 7, 11, 13, 17]\n"
        + "},[]>>\n", actual);
  }
}


