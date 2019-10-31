/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.9).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.BaseResource;
import io.swagger.model.ErrorDto;
import io.swagger.model.MicroServiceExceptionResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-31T14:28:58.734Z")

@Api(value = "error", description = "the error API")
public interface ErrorApi {

    @ApiOperation(value = "callGestioneErrore", nickname = "callGestioneErroreUsingPOST1", notes = "", response = BaseResource.class, tags={ "gestione-errori-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = BaseResource.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 500, message = "Internal BearCustom Server Error", response = MicroServiceExceptionResponse.class) })
    @RequestMapping(value = "/error/gestioneErrore",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<BaseResource> callGestioneErroreUsingPOST1(@ApiParam(value = "errorDto" ,required=true )  @Valid @RequestBody ErrorDto errorDto);

}
