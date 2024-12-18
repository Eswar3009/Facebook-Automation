$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/eclipse/Cucumber/src/test/resources/FeatureFile/login.feature");
formatter.feature({
  "name": "To validate the login functionality of facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the login by using valid username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User have to enter the facebook application through chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_the_facebook_application_through_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter valid username and valid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_valid_username_and_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User reach the valid or invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_reach_the_valid_or_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
});