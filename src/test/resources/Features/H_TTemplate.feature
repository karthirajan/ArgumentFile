#Author:Tharun
@TK @Template
Feature: Template creation & validation scenario

  Scenario Outline: User create templates
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to template tab
    And user creates the template "<Template>","<Type>"
    Then user creates the datasheet template for style "<DataSheetType>","<TemplateStyle>"
    Then Go to homepage
    When user navigates to template tab
    And user creates the datasheet template for material "<DataSheetType1>","<TemplateMaterial>"
    
    Examples:
      |Template                    |Type          |DataSheetType                       |TemplateStyle  |DataSheetType1                                   |TemplateMaterial|
      |Costing Package,DPT Material|Style,Material|Artwork,Routing,Size Chart,Style BOM|Costing Package|Test Run,Material BOM,Routing,Material Data Sheet|DPT Material    |