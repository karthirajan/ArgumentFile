#Author:Tharun
@TK @PD
Feature: Print design creation & validation scenario

  Scenario Outline: Print design Creation and regression scenario
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to print design tab
    Then user creates print design data "<PrintDesign>","<PrintType>","<NoOfPrintPosition>","<RepeatHeight>","<RepeatWidth>"
    And user creates the new print color "<NewPrintColor>","<PrintDesign1>","<NewPrintColor1>","<code>"
    Then user navigates to position tab and create data "<PrintPositionName>","<PrintTech>"

    Examples:
      |PrintDesign                            |PrintType              |NoOfPrintPosition|RepeatHeight|RepeatWidth|NewPrintColor       |PrintDesign1   |NewPrintColor1      |code   |PrintPositionName |PrintTech   |
      |Abstract Floral,Batik Print,Lilac Print|All Over,Placement,Logo|3,4,6            |12,12,12    |12,12,24   |Blue Abstract Floral|Abstract Floral|Grey Abstract Floral|PDC 100|ground,leaf,swoosh|Screen Print|
    #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
