package com.example.obm_technical_assessment.controller;

import com.example.obm_technical_assessment.service.PrimeService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.openapitools.api.PrimesApi;
import org.openapitools.model.Algorithms;
import org.openapitools.model.Prime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController

public class PrimeController implements PrimesApi {
  private final PrimeService primeService;

  @Override
  public ResponseEntity<Prime> getPrimes(Integer number, Algorithms algorithm) {
    return ResponseEntity.ok(primeService.getPrimes(number,algorithm));
  }
}
