package com.example.obm_technical_assessment.service;


import java.util.ArrayList;
import lombok.AllArgsConstructor;
import org.openapitools.model.Algorithms;
import org.openapitools.model.Prime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service


public class PrimeService {
  public Prime getPrimes(Integer number, Algorithms algorithm){
    List<Integer> result = new ArrayList<Integer>();
    switch(algorithm){
      case RECURSIVE -> {
        return getAllPrimesRecursive(number, result);
      }
      default -> {
        return getAllPrimesBruteForce(number,result);
      }
    }
  }

  /*
  getAllPrimesBruteForce takes a target number and iterates from 2 to the input,
  checks each number for primality, using the primeCheck function, and adds the prime numbers to a list.
   */
  private Prime getAllPrimesBruteForce(int input, List<Integer> result){

    for(int i = 2; i <= input; i++) {
      if(primeCheck(i)) result.add(i);
    }
    return new Prime().primeNumbers(result);
  }

  /*

   */
  private Prime getAllPrimesRecursive(int input, List<Integer> result){

    if(input > 1){                            //recursive base condition
      if(primeCheck(input)){
        result.add(input);
      }
      getAllPrimesRecursive(input - 1, result); //recurse over input - 1
    }
    return new Prime().primeNumbers(result);
  }

  /*
  primeCheck takes an input and checks it against each value up to its half for primality,
  it does this as if the value
   */
  private boolean primeCheck(int value){
    if(value < 2) return false;
    for(int i = 2; i <= value / 2; i++) if(value % i == 0) return false;
    return true;
  }
}
