/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.webservices.rest.web.response;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Generic exception, to be thrown if nothing more specific can be thrown. (Please try to throw a
 * more specif exception whenever possible.)
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class GenericRestException extends ResponseException {
	
	private static final long serialVersionUID = 1L;
	
	public GenericRestException() {
		super();
	}
	
	public GenericRestException(String message, Throwable cause) {
		super(message, cause);
	}

	public GenericRestException(String message) {
		super(message);
	}

	public GenericRestException(Throwable cause) {
		super(cause);
	}
}
