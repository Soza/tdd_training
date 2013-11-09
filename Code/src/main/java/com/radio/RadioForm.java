package com.radio;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class RadioForm extends ActionForm {

	private static final long serialVersionUID = -3527509789064192674L;

	private String site = "Y";

	public String getSite() {
		return this.site;
	}

	public void setSite(final String site) {
		this.site = site;
	}

	@Override
	public void reset(final ActionMapping mapping,
			final HttpServletRequest request) {
		super.reset(mapping, request);

		// Form attributes were getting reset, which was the reason behind the
		// problem (un-comment the following line and run the test to see it
		// fail, thus reproducing the bug and demonstrating how TDD can help fix
		// problems sooner than letting it propagate and be more expensive to
		// fix in production)

		// site = null;
	}
}
