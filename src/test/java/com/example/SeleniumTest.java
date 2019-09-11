package com.example;

import org.testng.annotations.*;

public class SeleniumTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void findingASiteOnGoogleUid04058d8a519848d9a423df387c4bd368() {
        // Given I open "http://google.com"
        actionwords.iOpenHttpGoogleCom("http://google.com");
        // When I search for "Hiptest"
        actionwords.iSearchForHiptest("Hiptest");
        // Then a link to "Hiptest: Agile test management tool & behavior driven development"
        actionwords.aLinkToHiptestAgileTestManagementToolBehaviorDrivenDevelopment("hiptest");
    }

    @Test
    public void loginToAccountWithValidValuesUid5585c7a8d44c48a289b88774b5f34269() {
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

    @AfterMethod
    public void stop(){
        actionwords.getDriver().quit();
    }
}