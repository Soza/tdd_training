package com.person;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.apache.struts.action.ActionForward;
import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.person.PersonCRUDAction;

/**
 * Test coverage to capture simple person CRUD {@link PersonCRUDAction}
 * operation.
 * 
 * @author Sabby Anandan
 * 
 */
public class PersonCRUDActionTest extends AbstractStrutsUnitTest {
	PersonCRUDAction personAction;
	SomeUserService someUserService;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		this.personAction = new PersonCRUDAction();
		this.someUserService = EasyMock.createMock(SomeUserService.class);
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
		this.personAction = null;
		this.someUserService = null;
	}

	@Test
	public void test_personObjectCreation_isSuccessful() {
		assertNotNull(this.personAction);
	}

	@Test
	public void test_createPerson_isSuccessful() throws Exception {
		EasyMock.expect(this.actionMapping.findForward("create_success"))
				.andReturn(this.actionForward);

		this.personAction.someUserService = this.someUserService;
		this.someUserService.completeRegistration(new PersonDetail());
		EasyMock.expectLastCall();

		EasyMock.replay(this.actionMapping, this.actionForward,
				this.isiteUserService);

		final ActionForward result = this.personAction.executeMethod(
				this.actionMapping, this.actionForm, this.request,
				this.response);

		assertThat(result, is(this.actionForward));
	}
}
