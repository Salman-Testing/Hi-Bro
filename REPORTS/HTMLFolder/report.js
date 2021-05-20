$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/login.feature");
formatter.feature({
  "name": "To validate the login functionality of given application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify the username and password with given credentials for facebook",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User will enter the given URL",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.userWillEnterTheGivenURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter username and password in the respected field",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Java",
        "Java@12345"
      ]
    },
    {
      "cells": [
        "Selenium",
        "Selenium@1234"
      ]
    },
    {
      "cells": [
        "Python",
        "Python@1234"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enter_username_and_password_in_the_respected_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_will_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies the login functionnality",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verifies_the_login_functionnality()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/login2.feature");
formatter.feature({
  "name": "To validate the login functionality of given application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify the username and password with given credentials for Amazon",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User will enter the given URL.",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.userWillEnterTheGivenURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter username and password in the respected field.",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.userEnterUsernameAndPasswordInTheRespectedField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click the login button.",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.userWillClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies the login functionnality.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.userVerifiesTheLoginFunctionnality()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});