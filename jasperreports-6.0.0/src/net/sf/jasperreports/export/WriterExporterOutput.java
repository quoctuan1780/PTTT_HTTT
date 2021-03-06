/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.export;

import java.io.Writer;

import net.sf.jasperreports.engine.JRPropertiesUtil;


/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id: WriterExporterOutput.java 7197 2014-08-27 11:59:50Z teodord $
 */
public interface WriterExporterOutput extends ExporterOutput
{
	/**
	 * Property whose value is used as default for the {@link #getEncoding()} export output setting.
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_CHARACTER_ENCODING = JRPropertiesUtil.PROPERTY_PREFIX + "export.character.encoding";

	/**
	 * @see #PROPERTY_CHARACTER_ENCODING 
	 */
	public String getEncoding();

	/**
	 * 
	 */
	public Writer getWriter(); 

	/**
	 * 
	 */
	public void close(); 
}
