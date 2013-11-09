package com.radio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * Sample controller to reproduce bug
 * 
 * @author Sabby Anandan
 * 
 */
public class RadioAction {

	@Override
	protected ActionForward executeMethod(final ActionMapping mapping,
			final ActionForm form, final HttpServletRequest request,
			final HttpServletResponse response) throws Exception {
		// form manipulation
		final RadioForm radioForm = (RadioForm) form;
		radioForm.reset(mapping, request);

		// service call
		// ...

		// forward
		return mapping.findForward("detail_page");
	}
}
