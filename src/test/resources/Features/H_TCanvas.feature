#Author:Tharun
@TK @canvas
Feature: canvas creation & validation scenario

  Scenario Outline: User create canvas
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to canvas tab
    Then user creates a manage view for the page "<RemoveAttributes>"
    And user creates the canvas template "<Template>","<Type>"
    Then verify the description of canvas template screen message "<TemplateStyle>"
    And create a canvas and select the rectangle box

    
    Examples:
      |Template                                           |Type                |TemplateStyle           |RemoveAttributes   |
      |1st Proto Review-Apparel,Fit Correction:Across Back|Artwork,Style Review|1st Proto Review-Apparel|Description,Subtype|

       #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  @TRun @canvas
  Scenario Outline: SizeChart Canvas creation & validation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to SizeCanvas tab
    Then user creates the sizeChart canvas "<SizeChartName>"
    And user creates the dimension inside the canvas "Bra"
    Then user enters the values in the dimensions "<Dimensions>"
    Examples:
      |SizeChartName            |Dimensions|
      |Bra,Womens Basic Knit Tee|A15E      |
