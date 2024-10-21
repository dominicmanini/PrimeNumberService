package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets Algorithms
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-21T14:27:33.723291300+01:00[Europe/London]", comments = "Generator version: 7.6.0")
public enum Algorithms {
  
  BRUTE_FORCE("BRUTE_FORCE"),
  
  RECURSIVE("RECURSIVE");

  private String value;

  Algorithms(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Algorithms fromValue(String value) {
    for (Algorithms b : Algorithms.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

