
package org.cysecurity.springdemo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ErrorController  extends AbstractController{
            protected ModelAndView handleRequestInternal(HttpServletRequest request,
                    HttpServletResponse response) throws Exception {

                    ModelAndView model = new ModelAndView("Error");
                    return model;
            }
}
