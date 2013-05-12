package test.de.michael.tests;

import static org.junit.Assert.assertEquals;
import main.de.michael.Calc;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;

public class CalcStepdefs {

	private Calc calc;
	private Integer[] number = new Integer[2];
	private boolean numberA = true;
	private Integer result = 0;

	@Given("^I started the program$")
	public void initProgramm() {
		calc = new Calc();
	}

	@When("^I type \"([^\"]*)\"$")
	public void type_a_number(Integer number) {
		if(numberA) {
			this.number[0] = number;
			numberA = false;
		}
		else {
			this.number[1] = number;
			numberA = true;
		}
	}

	@When("^I press ADD")
	public void type_add() {
		result = calc.add(number[0], number[1]);
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void showResult(Integer expected) {
		assertEquals(expected, result);
	}

	
	
}