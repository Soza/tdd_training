package com.radio;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.person.AbstractStrutsUnitTest;
import com.radio.RadioAction;
import com.radio.RadioForm;

public class RadioActionTest extends AbstractStrutsUnitTest {

	RadioAction action;
	RadioForm radioForm;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		this.action = new RadioAction();
		this.radioForm = new RadioForm();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void test_radioDeault_toYes() throws Exception {
		this.action.executeMethod(this.actionMapping, this.radioForm,
				this.request, this.response);
		assertEquals(this.radioForm.getSite(), "Y");
	}
}
