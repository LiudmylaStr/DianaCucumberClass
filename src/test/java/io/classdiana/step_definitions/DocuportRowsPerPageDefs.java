package io.classdiana.step_definitions;

import io.classdiana.pages.SupervisorDocuportPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.SoftAssertions;

public class DocuportRowsPerPageDefs {
    SupervisorDocuportPage supervisorDocuportPage = new SupervisorDocuportPage();
    private Logger LOG = LogManager.getLogger();


    private SoftAssertions softAssertions = new SoftAssertions();

    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {

    }
    @When("user logs in as a supervisor")
    public void userLogsInAsASupervisor() {
    }
    @Then("user validates {string} text is displayed")
    public void user_validates_text_is_displayed(String string) {

    }
    @When("user enters credentials")
    public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks leads on left menu bar")
    public void user_clicks_leads_on_left_menu_bar() {


    }
    @Then("user sees {int} by default Rows Per Page")
    public void user_sees_by_default_rows_per_page(Integer int1) {

    }
    @Then("user changes Rows Per Page to {int}")
    public void user_changes_rows_per_page_to(Integer int1) {

    }
    @Then("user sees that after changing it is showing {int}")
    public void user_sees_that_after_changing_it_is_showing(Integer int1) {

    }
    @Then("user Clicks Users on left menu bar")
    public void user_clicks_users_on_left_menu_bar() {

    }
    @Then("ser sees that after changing it is showing {int}")
    public void ser_sees_that_after_changing_it_is_showing(Integer int1) {

    }


}