/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.9).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.DocumentoDto;
import io.swagger.model.DocumentoResource;
import io.swagger.model.PacchettoDocumentale;
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

@Api(value = "pratiche", description = "the pratiche API")
public interface PraticheApi {

    @ApiOperation(value = "API per il salvataggio e il successivo recupero di un pacchetto documentale legato a una di Pratica di Affidamento Digitale.", nickname = "invioPacchettoDocumentaleUsingPOST1", notes = "", tags={ "pacchetto-documentale-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 500, message = "Server error") })
    @RequestMapping(value = "/pratiche/{idPratica}/documenti/pacchettoDocumentale",
        produces = { "application/json", "application/hal+json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> invioPacchettoDocumentaleUsingPOST1(@ApiParam(value = "idPratica",required=true) @PathVariable("idPratica") Integer idPratica,@ApiParam(value = "pacchettoDocumentale" ,required=true )  @Valid @RequestBody PacchettoDocumentale pacchettoDocumentale,@ApiParam(value = "flgRefresh") @Valid @RequestParam(value = "flgRefresh", required = false) Boolean flgRefresh);


    @ApiOperation(value = "API che effettua la stampa e il download di un documento legato a una di Pratica di Affidamento Digitale. SOLO PER TEST.", nickname = "retrieveAndDownloadDocumentUsingGET1", notes = "", response = byte[].class, tags={ "stampa-documento-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = byte[].class),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 500, message = "Server error") })
    @RequestMapping(value = "/pratiche/{idPratica}/documenti/stampa/download",
        produces = { "application/pdf" }, 
        method = RequestMethod.GET)
    ResponseEntity<byte[]> retrieveAndDownloadDocumentUsingGET1(@NotNull @ApiParam(value = "documentoDto", required = true, allowableValues = "LIBERATORIA_RIFIUTO, LIBERATORIA_RINUNCIA, COMUNICAZIONE_RIFIUTO") @Valid @RequestParam(value = "documentoDto", required = true) String documentoDto,@ApiParam(value = "idPratica",required=true) @PathVariable("idPratica") Integer idPratica);


    @ApiOperation(value = "API che effettua la stampa di un documento legato a una di Pratica di Affidamento Digitale.", nickname = "retrieveDocumentUsingGET1", notes = "", response = DocumentoResource.class, responseContainer = "List", tags={ "stampa-documento-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DocumentoResource.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 500, message = "Server error") })
    @RequestMapping(value = "/pratiche/{idPratica}/documenti/stampa",
        produces = { "application/json", "application/hal+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<DocumentoResource>> retrieveDocumentUsingGET1(@NotNull @ApiParam(value = "documentoDto", required = true, allowableValues = "LIBERATORIA_RIFIUTO, LIBERATORIA_RINUNCIA, COMUNICAZIONE_RIFIUTO") @Valid @RequestParam(value = "documentoDto", required = true) String documentoDto,@ApiParam(value = "idPratica",required=true) @PathVariable("idPratica") Integer idPratica,@ApiParam(value = "flgArchiviazioneDocumentale") @Valid @RequestParam(value = "flgArchiviazioneDocumentale", required = false) Boolean flgArchiviazioneDocumentale);


    @ApiOperation(value = "API per il recupero dei documenti che soddisfano i filtri inseriti in query string.", nickname = "retrieveDocumentsUsingGET1", notes = "", response = DocumentoResource.class, responseContainer = "List", tags={ "documento-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DocumentoResource.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 500, message = "Server error") })
    @RequestMapping(value = "/pratiche/{idPratica}/documenti",
        produces = { "application/json", "application/hal+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<DocumentoResource>> retrieveDocumentsUsingGET1(@ApiParam(value = "idPratica",required=true) @PathVariable("idPratica") Integer idPratica,@ApiParam(value = "codTipoDocumento") @Valid @RequestParam(value = "codTipoDocumento", required = false) String codTipoDocumento);


    @ApiOperation(value = "API per il caricamento in RUD di un dato documento e salvataggio delle relative informazioni.", nickname = "uploadDocumentUsingPOST1", notes = "", response = DocumentoResource.class, tags={ "documento-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DocumentoResource.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 500, message = "Server error") })
    @RequestMapping(value = "/pratiche/{idPratica}/documenti",
        produces = { "application/json", "application/hal+json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<DocumentoResource> uploadDocumentUsingPOST1(@ApiParam(value = "datiDocumentoDto" ,required=true )  @Valid @RequestBody DocumentoDto datiDocumentoDto,@ApiParam(value = "idPratica",required=true) @PathVariable("idPratica") Integer idPratica);


    @ApiOperation(value = "API per il salvataggio o l'aggiornamento di un dato documento e delle relative informazioni.", nickname = "uploadOrModifyDocumentUsingPUT1", notes = "", response = DocumentoResource.class, tags={ "documento-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DocumentoResource.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 500, message = "Server error") })
    @RequestMapping(value = "/pratiche/{idPratica}/documenti/{idDocumento}",
        produces = { "application/json", "application/hal+json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<DocumentoResource> uploadOrModifyDocumentUsingPUT1(@ApiParam(value = "datiDocumentoDto" ,required=true )  @Valid @RequestBody DocumentoDto datiDocumentoDto,@ApiParam(value = "idDocumento",required=true) @PathVariable("idDocumento") Integer idDocumento,@ApiParam(value = "idPratica",required=true) @PathVariable("idPratica") Integer idPratica);

}