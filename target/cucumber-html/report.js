$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/FbSignUp.feature");
formatter.feature({
  "name": "Facebook sign up feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify that user is able to create the new account using cucumber datatable",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DataTable"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opened the facebook application",
  "keyword": "Given "
});
formatter.match({
  "location": "FbSignUpSteps.user_opened_the_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Create New Account button",
  "keyword": "When "
});
formatter.match({
  "location": "FbSignUpSteps.user_clicks_on_the_create_new_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User creates the new account",
  "rows": [
    {
      "cells": [
        "Field",
        "Value"
      ]
    },
    {
      "cells": [
        "FirstName",
        "Raj"
      ]
    },
    {
      "cells": [
        "LastName",
        "Sharma"
      ]
    },
    {
      "cells": [
        "MobileNum",
        "12345678"
      ]
    },
    {
      "cells": [
        "Password",
        "abc@abc123"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FbSignUpSteps.user_creates_the_new_account(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects",
  "rows": [
    {
      "cells": [
        "Field",
        "Value"
      ]
    },
    {
      "cells": [
        "Day",
        "8"
      ]
    },
    {
      "cells": [
        "Month",
        "Aug"
      ]
    },
    {
      "cells": [
        "Year",
        "1990"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FbSignUpSteps.user_selects(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Sign Up button",
  "keyword": "And "
});
formatter.match({
  "location": "FbSignUpSteps.user_clicks_on_the_sign_up_utton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to see the success message",
  "keyword": "Then "
});
formatter.match({
  "location": "FbSignUpSteps.user_should_be_able_to_see_the_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});