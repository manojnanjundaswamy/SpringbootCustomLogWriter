package com.customlogwriter.logger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.customlogwriter.logger.CustomLogWriter;
import com.customlogwriter.logger.enums.ModuleName;

/**
 * Spring boot starter class
 * 
 * @author Manoj Nanjundaswamy
 * @since 07-04-2021
 */
@Controller
public class LoggerController {
	
	@RequestMapping("/testLogger")
	public @ResponseBody String testLogger() {
		CustomLogWriter.info(ModuleName.LOGGING_APP,this, "In log testing method.");
		CustomLogWriter.debug(ModuleName.LOGGING_APP, this, "Application log for debugging.");
		CustomLogWriter.trace(ModuleName.LOGGER, this, "Tracing Application being logging.");
		CustomLogWriter.warn(ModuleName.LOGGER, this, "Warning application being logging.");
		CustomLogWriter.error(ModuleName.LOGGER, this, new NullPointerException());
		CustomLogWriter.error(ModuleName.LOGGER, this, new NullPointerException().getMessage());
		return "logging..";
	}

}
