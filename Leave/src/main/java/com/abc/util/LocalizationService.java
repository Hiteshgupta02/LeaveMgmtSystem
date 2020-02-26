package com.abc.util;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
public class LocalizationService {
	
	private static final String UNKNOWN = "Unknown Error";
	
	@Autowired
	MessageSource msg;
	
	/**
	 * Get localized message
	 * @param code
	 * @return
	 */
	public String getMessage(String code) {
		try {
			Locale locale = LocaleContextHolder.getLocale();
			return msg.getMessage(code, null, locale);
		} catch (Exception e) {
			return UNKNOWN;
		}
	}
	
	/**
	 * Get localized message
	 * @param code
	 * @param args
	 * @return
	 */
	public String getMessage(String code, Object[] args) {
		try {
			Locale locale = LocaleContextHolder.getLocale();
			return msg.getMessage(code, args, locale);
		} catch (Exception e) {
			return UNKNOWN;
		}
	}

}
