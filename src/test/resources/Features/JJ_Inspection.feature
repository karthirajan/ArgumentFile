@Selenium  
Feature: Inspection_creation

  @inspection 
  Scenario Outline: Inspection Creation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user creates setup in Inspection "<Defects>","<AccLimit>","<sortOrder>","<TestSpecification>","<SamplingValue>","<ErrorType>","<TemplateName>","<BOMName>","<SizeChart>","<DimensioName>","<InspectionGrpName>"

    Examples: 
      | Defects                 | AccLimit                | sortOrder | TestSpecification                                   | SamplingValue        | ErrorType                          | TemplateName    | BOMName        | SizeChart   | DimensioName  | InspectionGrpName    |
      | High,Medium,Low,VeryLow | ACL 1.0,ACL 2.0,ACL 3.0 |     0,1,2 | No Link,BOM,Size Chart,Spec Data Sheet,Style Review | SP 1.0,SP 2.0,SP 3.0 | Full Error,Batch Error,Check Error | auto-inspection | Inspection BOM | Ins Special | New Dimension | New Inspection Group |
