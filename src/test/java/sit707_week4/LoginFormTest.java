package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * 
 * @author Ahsan Habib
 */
public class LoginFormTest {

	@Test
	public void testStudentIdentity() {
		String studentId = "222207899";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Vishuddha Samarasekara";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login(null, null);
		Assert.assertTrue(status.isLoginSuccess() == false);
	}

	@Test
	public void testFailEmptyUsernameAndWrongPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login(null, "abc");
		Assert.assertTrue(status.isLoginSuccess() == false);
	}

	@Test
	public void testFailEmptyUsernameAndCorrectPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login(null, "ahsan_pass");
		Assert.assertTrue(status.isLoginSuccess() == false);
	}

	@Test
	public void testFailWrongUsernameAndEmptyPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login("abc", null);
		Assert.assertTrue(status.isLoginSuccess() == false);
	}

	@Test
	public void testFailWrongUsernameAndWrongPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login("abc", "xyz");
		Assert.assertTrue(status.isLoginSuccess() == false);
	}

	@Test
	public void testFailWrongUsernameAndCorrectPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login("abc", "ahsan_pass");
		Assert.assertTrue(status.isLoginSuccess() == false);
	}

	@Test
	public void testFailCorrectUsernameAndEmptyPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login("ahsan", null);
		Assert.assertTrue(status.isLoginSuccess() == false);
	}

	@Test
	public void testFailCorrectUsernameAndWrongPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login("ahsan", "xyz");
		Assert.assertTrue(status.isLoginSuccess() == false);
	}

	@Test
	public void testSuccessCorrectUsernameAndCorrectPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		Assert.assertTrue(status.isLoginSuccess() == true);
	}

}