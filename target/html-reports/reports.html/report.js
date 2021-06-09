$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "This feature is for implementing login functionality.",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Valid Login for admin",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Admin is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin enter login credentials",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_enter_login_credentials(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Should display home page",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.should_display_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid login",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Admin is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin enters valid username and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_enters_valid_username_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should display error message",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.should_display_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid login",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Admin is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin enters invalid username and valid password",
  "keyword": "When "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_enters_invalid_username_and_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should display error message",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.should_display_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid login",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Admin is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin enters invalid username and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_enters_invalid_username_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should display error message",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.should_display_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid login",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Admin is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin enters valid username and don\u0027t enter password",
  "keyword": "When "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_enters_valid_username_and_don_t_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should display empty password error message",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.should_display_empty_password_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid login",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Admin is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin don\u0027t enters valid username and  enter password",
  "keyword": "When "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_don_t_enters_valid_username_and_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should display empty username error message",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.should_display_empty_username_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Forget Password functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Admin is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin clicks on forgot your password",
  "keyword": "When "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_clicks_on_forgot_your_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should display reset password page",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.should_display_reset_password_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Forget Password Functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Admin clicks on Forget your password",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_clicks_on_Forget_your_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin enters valid username",
  "keyword": "When "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_enters_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should display password change success message",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.should_display_password_change_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Forget Password Functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Admin clicks on Forget your password",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_clicks_on_Forget_your_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin enters invalid username",
  "keyword": "When "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_enters_invalid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should display invalid username error message",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.should_display_invalid_username_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Forget Password Functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Admin clicks on Forget your password",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_clicks_on_Forget_your_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin clicks on cancel",
  "keyword": "When "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.admin_clicks_on_cancel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should display login page",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMloginstepdef.should_display_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});