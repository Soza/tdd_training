package com.person;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;

/**
 * Procedural mocks abstracted to inherit and reuse as needed by other
 * controllers.
 * 
 * @author Sabby Anandan
 * 
 */
public abstract class AbstractStrutsUnitTest {
	public ActionMapping actionMapping;
	public ActionForm actionForm;
	public ActionForward actionForward;
	public HttpServletRequest request;
	public HttpServletResponse response;

	@Before
	public void setUp() throws Exception {
		this.actionMapping = EasyMock.createMock(ActionMapping.class);
		this.actionForm = EasyMock.createMock(ActionForm.class);
		this.request = EasyMock.createMock(HttpServletRequest.class);
		this.response = EasyMock.createMock(HttpServletResponse.class);
		this.actionForward = EasyMock.createMock(ActionForward.class);
	}

	@After
	public void tearDown() throws Exception {
		this.request = null;
		this.response = null;
		this.actionMapping = null;
		this.actionForm = null;
		this.actionForward = null;
	}
}
