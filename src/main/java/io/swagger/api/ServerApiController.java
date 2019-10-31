package io.swagger.api;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-31T14:28:58.734Z")

@Controller
public class ServerApiController implements ServerApi {

    private static final Logger log = LoggerFactory.getLogger(ServerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ServerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @Override
	public ResponseEntity<List<String>> directoryUsingGET1(@ApiParam(value = "The path to be read") @Valid @RequestParam(value = "path", required = false) String path) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<String>>(objectMapper.readValue("[ \"\", \"\" ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<String>>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
	public ResponseEntity<Map<String, String>> springEnvironmentUsingGET1(@ApiParam(value = "The name of the property to be read") @Valid @RequestParam(value = "propertyName", required = false) String propertyName,@ApiParam(value = "The PropertySource to be read") @Valid @RequestParam(value = "propertySourceName", required = false) String propertySourceName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Map<String, String>> (objectMapper.readValue("{  \"key\" : {    \"key\" : \"\"  }}", Map.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Map<String, String>> (HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Map<String, String>> (HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
	public ResponseEntity<Map<String, String>> systemEnvironmentUsingGET1(@ApiParam(value = "The name of the property to be read") @Valid @RequestParam(value = "propertyName", required = false) String propertyName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Map<String, String>>(objectMapper.readValue("{  \"key\" : \"\"}", Map.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Map<String, String>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Map<String, String>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
