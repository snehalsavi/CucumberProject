$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test.feature");
formatter.feature({
  "line": 2,
  "name": "We want to automate Oranage HRM site",
  "description": "",
  "id": "we-want-to-automate-oranage-hrm-site",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I ve the site running",
  "keyword": "Given "
});
formatter.match({
  "location": "Cucumberclass.running()"
});
formatter.result({
  "duration": 14919149656,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Title of your scenario",
  "description": "",
  "id": "we-want-to-automate-oranage-hrm-site;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@do"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I ve the site running",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I want to check the title of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "Cucumberclass.running()"
});
formatter.result({
  "duration": 16713971545,
  "status": "passed"
});
formatter.match({
  "location": "Cucumberclass.meth()"
});
formatter.result({
  "duration": 1151102998,
  "status": "passed"
});
});