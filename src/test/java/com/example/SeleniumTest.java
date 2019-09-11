package com.example;

import org.testng.annotations.*;

public class SeleniumTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void findingASiteOnGoogle() {
        // Given I open "http://google.com"
        actionwords.iOpenHttpGoogleCom("http://google.com");
        // When I search for "Hiptest"
        actionwords.iSearchForHiptest("Hiptest");
        // Then a link to "Hiptest: Agile test management tool & behavior driven development"
        actionwords.aLinkToHiptestAgileTestManagementToolBehaviorDrivenDevelopment("Hiptest: Agile test management tool & behavior driven development");
    }

    @Test
    public void loginToAccountWithValidValues() {
        // Given I open page
        actionwords.iOpenPage("https://test.loadedreports.com/");
        // And click login button
        actionwords.clickLoginButton();
        // When I input valid email
        actionwords.iInputValidEmail("evgeniia.vecheria@redwerk.com");
        // And input valid password
        actionwords.inputValidPassword("ZK13+bbf70");
        // And click on Login button
        actionwords.clickOnLoginButton();
        // Then the url contains
        actionwords.theUrlContains("/dashboard");
    }

    @Test
    public void newScenario() {
        // When go to page
        actionwords.goToPage();
        // When go to England
        actionwords.goToEngland();
        // Then assert England url
        actionwords.assertEnglandUrl();
    }

    @Test
    public void new2() {
        actionwords.goToPage2();
        actionwords.goToEngland2();
    }
}