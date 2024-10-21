package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Prime
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-21T14:27:33.723291300+01:00[Europe/London]", comments = "Generator version: 7.6.0")
public class Prime {

  @Valid
  private List<Integer> primeNumbers = new ArrayList<>();

  public Prime primeNumbers(List<Integer> primeNumbers) {
    this.primeNumbers = primeNumbers;
    return this;
  }

  public Prime addPrimeNumbersItem(Integer primeNumbersItem) {
    if (this.primeNumbers == null) {
      this.primeNumbers = new ArrayList<>();
    }
    this.primeNumbers.add(primeNumbersItem);
    return this;
  }

  /**
   * Get primeNumbers
   * @return primeNumbers
  */
  
  @Schema(name = "primeNumbers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primeNumbers")
  public List<Integer> getPrimeNumbers() {
    return primeNumbers;
  }

  public void setPrimeNumbers(List<Integer> primeNumbers) {
    this.primeNumbers = primeNumbers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Prime prime = (Prime) o;
    return Objects.equals(this.primeNumbers, prime.primeNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primeNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Prime {\n");
    sb.append("    primeNumbers: ").append(toIndentedString(primeNumbers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

