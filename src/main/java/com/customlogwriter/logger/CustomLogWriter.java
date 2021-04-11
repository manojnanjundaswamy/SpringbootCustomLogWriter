package com.customlogwriter.logger;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.customlogwriter.logger.enums.ModuleName;

/**
 * <p>
 * CustomLogWriter is a class which contains static methods, which is
 * used to write log information in different log level in our customized format
 * EX:INFO,DEBUG,ERROR,TRACE and WARN. Levels used for identifying the severity
 * of an event.
 * 
 * @author Manoj Nanjundaswamy
 * @since 07-04-2021
 */
public final class CustomLogWriter {

	private static final Logger LOGGER = LogManager.getLogger(CustomLogWriter.class);

	private static final String SYMBOL = " @:@ ";

	private CustomLogWriter() {
	}

	/**
	 * Logs a message with parameters at the {@link Level#INFO INFO} level.
	 * 
	 * @param moduleName name of the module which your working.
	 * @param className  name of the class where the info method is called.
	 * @param message    the message string to log.
	 */
	public static void info(ModuleName moduleName, Object className, String message) {
		StringBuilder msg = new StringBuilder(moduleName + SYMBOL + className.getClass().getName() + SYMBOL + " INFO " + SYMBOL + message);
		LOGGER.info(msg);
	}

	/**
	 * Logs a message with parameters at the {@link Level#ERROR ERROR} level.
	 * 
	 * @param moduleName name of the module which your working.
	 * @param className  name of the class where the error method is called.
	 * @param error      the message string to log.
	 */
	public static void error(ModuleName moduleName, Object className, String error) {
		StringBuilder errormsg = new StringBuilder(moduleName + SYMBOL + className.getClass().getName() + SYMBOL + " ERROR " + SYMBOL + error);
		LOGGER.error(errormsg);
	}

	/**
	 * Logs a message with parameters at the {@link Level#ERROR ERROR} level
	 * including the stack trace of the {@link Throwable} <code>e</code> passed as
	 * parameter.
	 *
	 * @param moduleName name of the module which your working.
	 * @param className  name of the class where the error method is called.
	 * @param e          the exception to log, including its stack trace.
	 */
	public static void error(ModuleName moduleName, Object className, Throwable e) {

		StringBuilder msg = new StringBuilder(moduleName + SYMBOL + className.getClass().getName() + SYMBOL + " ERROR " + SYMBOL
				+ e.getMessage());
		LOGGER.error(msg, e);
	}

	/**
	 * Logs a message with parameters at the {@link Level#DEBUG DEBUG} level.
	 * 
	 * @param moduleName name of the module which your working.
	 * @param className  name of the class where the debug method is called.
	 * @param message    the message string to log.
	 */
	public static void debug(ModuleName moduleName, Object className, String message) {
		StringBuilder debugmsg = new StringBuilder(moduleName + SYMBOL + className.getClass().getName() + SYMBOL + " DEBUG " + SYMBOL + message);
		LOGGER.debug(debugmsg);
	}

	/**
	 * Logs a message with parameters at the {@link Level#WARN WARN} level.
	 * 
	 * @param moduleName name of the module which your working.
	 * @param className  name of the class where the warning method is called.
	 * @param message    the message string to log.
	 */
	public static void warn(ModuleName moduleName, Object className, String message) {
		StringBuilder warnmsg = new StringBuilder(moduleName + SYMBOL + className.getClass().getName() + SYMBOL + " WARN " + SYMBOL + message);
		LOGGER.warn(warnmsg);
	}

	/**
	 * Logs a message with parameters at the {@link Level#TRACE TRACE} level.
	 * 
	 * @param moduleName name of the module which your working.
	 * @param className  name of the class where the warning method is called.
	 * @param message    the message string to log.
	 */
	public static void trace(ModuleName moduleName, Object className, String message) {
		StringBuilder warnmsg = new StringBuilder(moduleName + SYMBOL + className.getClass().getName() + SYMBOL + " TRACE " + SYMBOL + message);
		LOGGER.trace(warnmsg);
	}

}
