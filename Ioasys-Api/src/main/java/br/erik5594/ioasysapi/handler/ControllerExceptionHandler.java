package br.erik5594.ioasysapi.handler;

import br.erik5594.ioasysapi.dto.ErrorDto;
import br.erik5594.ioasysapi.exception.NotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @author erik_
 * Data Criacao: 31/10/2020 - 23:59
 */

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NotFound.class)
    public ResponseEntity<ErrorDto> handleError(NotFound e, HttpServletRequest request){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorDto(e.getStatus(), e.getError()));
    }
}
