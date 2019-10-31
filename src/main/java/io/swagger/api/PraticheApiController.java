package io.swagger.api;

import io.swagger.model.DocumentoDto;
import io.swagger.model.DocumentoResource;
import io.swagger.model.PacchettoDocumentale;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-31T14:28:58.734Z")

@Controller
public class PraticheApiController implements PraticheApi {

    private static final Logger log = LoggerFactory.getLogger(PraticheApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PraticheApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> invioPacchettoDocumentaleUsingPOST1(@ApiParam(value = "idPratica",required=true) @PathVariable("idPratica") Integer idPratica,@ApiParam(value = "pacchettoDocumentale" ,required=true )  @Valid @RequestBody PacchettoDocumentale pacchettoDocumentale,@ApiParam(value = "flgRefresh") @Valid @RequestParam(value = "flgRefresh", required = false) Boolean flgRefresh) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<byte[]> retrieveAndDownloadDocumentUsingGET1(@NotNull @ApiParam(value = "documentoDto", required = true, allowableValues = "LIBERATORIA_RIFIUTO, LIBERATORIA_RINUNCIA, COMUNICAZIONE_RIFIUTO") @Valid @RequestParam(value = "documentoDto", required = true) String documentoDto,@ApiParam(value = "idPratica",required=true) @PathVariable("idPratica") Integer idPratica) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
                return new ResponseEntity<byte[]>(objectMapper.readValue("", byte[].class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type ", e);
                return new ResponseEntity<byte[]>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<byte[]>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<DocumentoResource>> retrieveDocumentUsingGET1(@NotNull @ApiParam(value = "documentoDto", required = true, allowableValues = "LIBERATORIA_RIFIUTO, LIBERATORIA_RINUNCIA, COMUNICAZIONE_RIFIUTO") @Valid @RequestParam(value = "documentoDto", required = true) String documentoDto,@ApiParam(value = "idPratica",required=true) @PathVariable("idPratica") Integer idPratica,@ApiParam(value = "flgArchiviazioneDocumentale") @Valid @RequestParam(value = "flgArchiviazioneDocumentale", required = false) Boolean flgArchiviazioneDocumentale) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<DocumentoResource>>(objectMapper.readValue("[ {  \"_links\" : [ {    \"hreflang\" : \"hreflang\",    \"templated\" : true,    \"rel\" : \"rel\",    \"href\" : \"href\",    \"media\" : \"media\",    \"deprecation\" : \"deprecation\",    \"title\" : \"title\",    \"type\" : \"type\"  }, {    \"hreflang\" : \"hreflang\",    \"templated\" : true,    \"rel\" : \"rel\",    \"href\" : \"href\",    \"media\" : \"media\",    \"deprecation\" : \"deprecation\",    \"title\" : \"title\",    \"type\" : \"type\"  } ],  \"documento\" : {    \"nomeFile\" : \"nomeFile\",    \"codMimeType\" : \"codMimeType\",    \"codMatricola\" : \"codMatricola\",    \"codSistemaDocumentale\" : \"codSistemaDocumentale\",    \"codTipoDocumento\" : \"codTipoDocumento\",    \"cognomeUtente\" : \"cognomeUtente\",    \"idDocumentale\" : \"idDocumentale\",    \"datAcquisizione\" : \"2000-01-23T04:56:07.000+00:00\",    \"nomeUtente\" : \"nomeUtente\",    \"content\" : \"content\"  },  \"returnMessages\" : {    \"key\" : [ {      \"severity\" : \"severity\",      \"messageKey\" : \"messageKey\",      \"errorCode\" : \"errorCode\",      \"messageTitle\" : \"messageTitle\",      \"language\" : \"language\",      \"message\" : \"message\",      \"messagesForm\" : [ {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      }, {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      } ],      \"retry\" : true    }, {      \"severity\" : \"severity\",      \"messageKey\" : \"messageKey\",      \"errorCode\" : \"errorCode\",      \"messageTitle\" : \"messageTitle\",      \"language\" : \"language\",      \"message\" : \"message\",      \"messagesForm\" : [ {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      }, {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      } ],      \"retry\" : true    } ]  },  \"id\" : \"id\"}, {  \"_links\" : [ {    \"hreflang\" : \"hreflang\",    \"templated\" : true,    \"rel\" : \"rel\",    \"href\" : \"href\",    \"media\" : \"media\",    \"deprecation\" : \"deprecation\",    \"title\" : \"title\",    \"type\" : \"type\"  }, {    \"hreflang\" : \"hreflang\",    \"templated\" : true,    \"rel\" : \"rel\",    \"href\" : \"href\",    \"media\" : \"media\",    \"deprecation\" : \"deprecation\",    \"title\" : \"title\",    \"type\" : \"type\"  } ],  \"documento\" : {    \"nomeFile\" : \"nomeFile\",    \"codMimeType\" : \"codMimeType\",    \"codMatricola\" : \"codMatricola\",    \"codSistemaDocumentale\" : \"codSistemaDocumentale\",    \"codTipoDocumento\" : \"codTipoDocumento\",    \"cognomeUtente\" : \"cognomeUtente\",    \"idDocumentale\" : \"idDocumentale\",    \"datAcquisizione\" : \"2000-01-23T04:56:07.000+00:00\",    \"nomeUtente\" : \"nomeUtente\",    \"content\" : \"content\"  },  \"returnMessages\" : {    \"key\" : [ {      \"severity\" : \"severity\",      \"messageKey\" : \"messageKey\",      \"errorCode\" : \"errorCode\",      \"messageTitle\" : \"messageTitle\",      \"language\" : \"language\",      \"message\" : \"message\",      \"messagesForm\" : [ {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      }, {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      } ],      \"retry\" : true    }, {      \"severity\" : \"severity\",      \"messageKey\" : \"messageKey\",      \"errorCode\" : \"errorCode\",      \"messageTitle\" : \"messageTitle\",      \"language\" : \"language\",      \"message\" : \"message\",      \"messagesForm\" : [ {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      }, {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      } ],      \"retry\" : true    } ]  },  \"id\" : \"id\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<DocumentoResource>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<DocumentoResource>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<DocumentoResource>> retrieveDocumentsUsingGET1(@ApiParam(value = "idPratica",required=true) @PathVariable("idPratica") Integer idPratica,@ApiParam(value = "codTipoDocumento") @Valid @RequestParam(value = "codTipoDocumento", required = false) String codTipoDocumento) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<DocumentoResource>>(objectMapper.readValue("[ {  \"_links\" : [ {    \"hreflang\" : \"hreflang\",    \"templated\" : true,    \"rel\" : \"rel\",    \"href\" : \"href\",    \"media\" : \"media\",    \"deprecation\" : \"deprecation\",    \"title\" : \"title\",    \"type\" : \"type\"  }, {    \"hreflang\" : \"hreflang\",    \"templated\" : true,    \"rel\" : \"rel\",    \"href\" : \"href\",    \"media\" : \"media\",    \"deprecation\" : \"deprecation\",    \"title\" : \"title\",    \"type\" : \"type\"  } ],  \"documento\" : {    \"nomeFile\" : \"nomeFile\",    \"codMimeType\" : \"codMimeType\",    \"codMatricola\" : \"codMatricola\",    \"codSistemaDocumentale\" : \"codSistemaDocumentale\",    \"codTipoDocumento\" : \"codTipoDocumento\",    \"cognomeUtente\" : \"cognomeUtente\",    \"idDocumentale\" : \"idDocumentale\",    \"datAcquisizione\" : \"2000-01-23T04:56:07.000+00:00\",    \"nomeUtente\" : \"nomeUtente\",    \"content\" : \"content\"  },  \"returnMessages\" : {    \"key\" : [ {      \"severity\" : \"severity\",      \"messageKey\" : \"messageKey\",      \"errorCode\" : \"errorCode\",      \"messageTitle\" : \"messageTitle\",      \"language\" : \"language\",      \"message\" : \"message\",      \"messagesForm\" : [ {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      }, {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      } ],      \"retry\" : true    }, {      \"severity\" : \"severity\",      \"messageKey\" : \"messageKey\",      \"errorCode\" : \"errorCode\",      \"messageTitle\" : \"messageTitle\",      \"language\" : \"language\",      \"message\" : \"message\",      \"messagesForm\" : [ {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      }, {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      } ],      \"retry\" : true    } ]  },  \"id\" : \"id\"}, {  \"_links\" : [ {    \"hreflang\" : \"hreflang\",    \"templated\" : true,    \"rel\" : \"rel\",    \"href\" : \"href\",    \"media\" : \"media\",    \"deprecation\" : \"deprecation\",    \"title\" : \"title\",    \"type\" : \"type\"  }, {    \"hreflang\" : \"hreflang\",    \"templated\" : true,    \"rel\" : \"rel\",    \"href\" : \"href\",    \"media\" : \"media\",    \"deprecation\" : \"deprecation\",    \"title\" : \"title\",    \"type\" : \"type\"  } ],  \"documento\" : {    \"nomeFile\" : \"nomeFile\",    \"codMimeType\" : \"codMimeType\",    \"codMatricola\" : \"codMatricola\",    \"codSistemaDocumentale\" : \"codSistemaDocumentale\",    \"codTipoDocumento\" : \"codTipoDocumento\",    \"cognomeUtente\" : \"cognomeUtente\",    \"idDocumentale\" : \"idDocumentale\",    \"datAcquisizione\" : \"2000-01-23T04:56:07.000+00:00\",    \"nomeUtente\" : \"nomeUtente\",    \"content\" : \"content\"  },  \"returnMessages\" : {    \"key\" : [ {      \"severity\" : \"severity\",      \"messageKey\" : \"messageKey\",      \"errorCode\" : \"errorCode\",      \"messageTitle\" : \"messageTitle\",      \"language\" : \"language\",      \"message\" : \"message\",      \"messagesForm\" : [ {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      }, {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      } ],      \"retry\" : true    }, {      \"severity\" : \"severity\",      \"messageKey\" : \"messageKey\",      \"errorCode\" : \"errorCode\",      \"messageTitle\" : \"messageTitle\",      \"language\" : \"language\",      \"message\" : \"message\",      \"messagesForm\" : [ {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      }, {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      } ],      \"retry\" : true    } ]  },  \"id\" : \"id\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<DocumentoResource>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<DocumentoResource>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DocumentoResource> uploadDocumentUsingPOST1(@ApiParam(value = "datiDocumentoDto" ,required=true )  @Valid @RequestBody DocumentoDto datiDocumentoDto,@ApiParam(value = "idPratica",required=true) @PathVariable("idPratica") Integer idPratica) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DocumentoResource>(objectMapper.readValue("{  \"_links\" : [ {    \"hreflang\" : \"hreflang\",    \"templated\" : true,    \"rel\" : \"rel\",    \"href\" : \"href\",    \"media\" : \"media\",    \"deprecation\" : \"deprecation\",    \"title\" : \"title\",    \"type\" : \"type\"  }, {    \"hreflang\" : \"hreflang\",    \"templated\" : true,    \"rel\" : \"rel\",    \"href\" : \"href\",    \"media\" : \"media\",    \"deprecation\" : \"deprecation\",    \"title\" : \"title\",    \"type\" : \"type\"  } ],  \"documento\" : {    \"nomeFile\" : \"nomeFile\",    \"codMimeType\" : \"codMimeType\",    \"codMatricola\" : \"codMatricola\",    \"codSistemaDocumentale\" : \"codSistemaDocumentale\",    \"codTipoDocumento\" : \"codTipoDocumento\",    \"cognomeUtente\" : \"cognomeUtente\",    \"idDocumentale\" : \"idDocumentale\",    \"datAcquisizione\" : \"2000-01-23T04:56:07.000+00:00\",    \"nomeUtente\" : \"nomeUtente\",    \"content\" : \"content\"  },  \"returnMessages\" : {    \"key\" : [ {      \"severity\" : \"severity\",      \"messageKey\" : \"messageKey\",      \"errorCode\" : \"errorCode\",      \"messageTitle\" : \"messageTitle\",      \"language\" : \"language\",      \"message\" : \"message\",      \"messagesForm\" : [ {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      }, {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      } ],      \"retry\" : true    }, {      \"severity\" : \"severity\",      \"messageKey\" : \"messageKey\",      \"errorCode\" : \"errorCode\",      \"messageTitle\" : \"messageTitle\",      \"language\" : \"language\",      \"message\" : \"message\",      \"messagesForm\" : [ {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      }, {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      } ],      \"retry\" : true    } ]  },  \"id\" : \"id\"}", DocumentoResource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DocumentoResource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DocumentoResource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DocumentoResource> uploadOrModifyDocumentUsingPUT1(@ApiParam(value = "datiDocumentoDto" ,required=true )  @Valid @RequestBody DocumentoDto datiDocumentoDto,@ApiParam(value = "idDocumento",required=true) @PathVariable("idDocumento") Integer idDocumento,@ApiParam(value = "idPratica",required=true) @PathVariable("idPratica") Integer idPratica) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DocumentoResource>(objectMapper.readValue("{  \"_links\" : [ {    \"hreflang\" : \"hreflang\",    \"templated\" : true,    \"rel\" : \"rel\",    \"href\" : \"href\",    \"media\" : \"media\",    \"deprecation\" : \"deprecation\",    \"title\" : \"title\",    \"type\" : \"type\"  }, {    \"hreflang\" : \"hreflang\",    \"templated\" : true,    \"rel\" : \"rel\",    \"href\" : \"href\",    \"media\" : \"media\",    \"deprecation\" : \"deprecation\",    \"title\" : \"title\",    \"type\" : \"type\"  } ],  \"documento\" : {    \"nomeFile\" : \"nomeFile\",    \"codMimeType\" : \"codMimeType\",    \"codMatricola\" : \"codMatricola\",    \"codSistemaDocumentale\" : \"codSistemaDocumentale\",    \"codTipoDocumento\" : \"codTipoDocumento\",    \"cognomeUtente\" : \"cognomeUtente\",    \"idDocumentale\" : \"idDocumentale\",    \"datAcquisizione\" : \"2000-01-23T04:56:07.000+00:00\",    \"nomeUtente\" : \"nomeUtente\",    \"content\" : \"content\"  },  \"returnMessages\" : {    \"key\" : [ {      \"severity\" : \"severity\",      \"messageKey\" : \"messageKey\",      \"errorCode\" : \"errorCode\",      \"messageTitle\" : \"messageTitle\",      \"language\" : \"language\",      \"message\" : \"message\",      \"messagesForm\" : [ {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      }, {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      } ],      \"retry\" : true    }, {      \"severity\" : \"severity\",      \"messageKey\" : \"messageKey\",      \"errorCode\" : \"errorCode\",      \"messageTitle\" : \"messageTitle\",      \"language\" : \"language\",      \"message\" : \"message\",      \"messagesForm\" : [ {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      }, {        \"fieldName\" : \"fieldName\",        \"formName\" : \"formName\"      } ],      \"retry\" : true    } ]  },  \"id\" : \"id\"}", DocumentoResource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DocumentoResource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DocumentoResource>(HttpStatus.NOT_IMPLEMENTED);
    }

}
