/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Algorithms;
import org.openapitools.model.Prime;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-21T14:27:33.723291300+01:00[Europe/London]", comments = "Generator version: 7.6.0")
@Validated
@Tag(name = "primes", description = "the primes API")
public interface PrimesApi {

    /**
     * GET /primes/{number}/{algorithm} : Get Primes for a provided input
     *
     * @param number  (required)
     * @param algorithm  (required)
     * @return Primes Calculated (status code 200)
     */
    @Operation(
        operationId = "getPrimes",
        summary = "Get Primes for a provided input",
        tags = { "primes" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Primes Calculated", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Prime.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/primes/{number}/{algorithm}",
        produces = { "application/json" }
    )
    
    ResponseEntity<Prime> getPrimes(
        @Parameter(name = "number", description = "", required = true, in = ParameterIn.PATH) @PathVariable("number") Integer number,
        @Parameter(name = "algorithm", description = "", required = true, in = ParameterIn.PATH) @PathVariable("algorithm") Algorithms algorithm
    );

}
