package com.person;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * Sample Person CRUD Contracts.
 * 
 * @author Sabby Anandan
 * 
 */
public class PersonCRUDAction {

	@Resource(name = "someUserService")
	SomeUserService someUserService;

	@Override
	protected ActionForward executeMethod(final ActionMapping mapping,
			final ActionForm form, final HttpServletRequest request,
			final HttpServletResponse response) throws Exception {

		this.someUserService.completeRegistration(new PersonDetail());

		return mapping.findForward("create_success");
	}
}
