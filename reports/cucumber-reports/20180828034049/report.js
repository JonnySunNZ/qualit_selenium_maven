$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Search.feature");
formatter.feature({
  "name": "Visit Qual IT website so that can perform search action",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "search feature",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in the qualit home page",
  "keyword": "Given "
});
formatter.match({
  "location": "QualitSmokeStepDefinition.i_am_in_the_qualit_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input search content",
  "keyword": "And "
});
formatter.match({
  "location": "QualitSmokeStepDefinition.i_input_search_content()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see search result",
  "keyword": "Then "
});
formatter.match({
  "location": "QualitSmokeStepDefinition.verify()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "go to contect us page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in the qualit home page",
  "keyword": "Given "
});
formatter.match({
  "location": "QualitSmokeStepDefinition.i_am_in_the_qualit_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click contact us link",
  "keyword": "And "
});
formatter.match({
  "location": "QualitSmokeStepDefinition.i_click_contact_us_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see contact us page",
  "keyword": "Then "
});
formatter.match({
  "location": "QualitSmokeStepDefinition.i_should_see_contact_us_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});