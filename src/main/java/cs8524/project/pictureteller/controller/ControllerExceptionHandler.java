package cs8524.project.pictureteller.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@ControllerAdvice
public class ControllerExceptionHandler {

    @ResponseStatus
    @ExceptionHandler(Exception.class)
    public ModelAndView defaultControllerErrorHandler(HttpServletRequest req, Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("e", e);
        mv.addObject("uri", req.getRequestURI());
        mv.setViewName("errorpage/controllererror");
        return mv;
    }
}
