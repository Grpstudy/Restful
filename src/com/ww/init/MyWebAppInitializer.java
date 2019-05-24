package com.ww.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.ww.config.PersistenceConfig;
import com.ww.config.RootConfig;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	// create CLL and DispatcherServlet

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { PersistenceConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { RootConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/*" };
	}

}
