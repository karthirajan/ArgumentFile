#Author:Tharun
@TK @LB
Feature: Libraries Creation creation & validation scenario


  Scenario Outline: Libraries Creation and regression scenario
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to libraries tab
    Then user creates the data for the libraries "<CareLibrary>"
    And user creates the data for New specification library "<NewSpecLibrary>"
    Then user creates the data for New Material library "<NewMatLibrary>"
    And user creates the data for print design library "<NewPrintDesignLibrary>"
    Then user creates the data for New size library "<NewSizeLibrary>"

    Examples:
      |CareLibrary  |NewSpecLibrary|NewMatLibrary      |NewPrintDesignLibrary   |NewSizeLibrary|
      |Electric Boho|Blue Haze     |Fall 2020 Materials|Fall 2020 Concept Prints|Winter 2020 3D|
    #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
