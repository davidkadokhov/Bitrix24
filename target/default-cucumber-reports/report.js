$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "  As user I want to login under different roles",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Britix"
    }
  ]
});
formatter.scenario({
  "name": "User names test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Britix"
    },
    {
      "name": "@login_with_outline"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "user logs in with following credentials \u003cusername\u003e and \u003cpassword\u003e",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "helpdesk13@cybertekschool.com",
        "UserUser"
      ]
    },
    {
      "cells": [
        "marketing13@cybertekschool.com",
        "UserUser"
      ]
    },
    {
      "cells": [
        "hr@cybertekschool.com",
        "UserUser"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify that user succesfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.verify_that_user_succesfully_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});