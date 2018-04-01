package com.dejans.TestNew;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestNewController {

    protected Logger logger = Logger.getLogger(TestNewController.class.getName());

	@RequestMapping("/testnew/")
	public String root(HttpServletRequest req) {
		logger.info("test-new root() invoked");
		return "TestNew tekst " + req.getPathInfo();
	}

	@RequestMapping("/testnew/**")
	public String others(HttpServletRequest req) {
		logger.info("test-new OTHERS() invoked");
		return "Wrong CALL in TestNew. Ask administrator ";
	}


}