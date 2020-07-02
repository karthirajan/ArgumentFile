package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class InspectionPage extends Commonactions{

	public InspectionPage() {
		PageFactory.initElements(Commonactions.driver, this);
	}
	
	@FindBy(xpath="(//div[@id='pageContent']/div/div/div/div[3])[1]")
	private WebElement PagecontentArrow;
	
	@FindBy(xpath="//span[text()='Inspections' or @data-csi-tab='Data-Inspections']")
	private WebElement InspectionTab;

	@FindBy(xpath="//span[text()='Inspection Security Groups' or @data-csi-tab='Data-InspectionSecurityGroups']")
	private WebElement InspectionSecGrpTab;

	@FindBy(xpath="//span[text()='Defects' or @data-csi-tab='Data-InspectionDefects']")
	private WebElement Defects;
	
	@FindBy(xpath="//a[text()='VeryLow']/ancestor::td/following-sibling::td//span[text()='content_copy']")
	private WebElement DefectCopy;

	@FindBy(xpath="//span[text()='Acceptance Limits' or @data-csi-tab='Data-AcceptanceLimits']")
	private WebElement AccLimit;

	@FindBy(xpath="//span[text()='Sampling Plans' or @data-csi-tab='Data-SamplingPlans']")
	private WebElement Samplingplan;
	
	@FindBy(xpath="//span[text()='Test Specifications' or @data-csi-tab='Data-InspectionTestSpecs']")
	private WebElement TestSpecification;

	@FindBy(xpath="//span[text()='Error Types' or @data-csi-tab='Data-InspectionErrorTypes']")
	private WebElement ErrorType;

	@FindBy(xpath="//span[text()='Templates' or @data-csi-tab='Data-InspectionTemplates']")
	private WebElement Template;

	@FindBy(xpath="//table[contains(@data-csi-automation,'InspectionDefects')]//div[contains(text(),'New Defect')]")
	private WebElement NewDefectBtn;

	@FindBy(xpath="//div[contains(text(),'New Defect')]")
	private WebElement NewDefect;

	@FindBy(xpath="//table[contains(@data-csi-automation,'AcceptanceLimits')]//div[contains(text(),'New Acceptance Limit')]")
	private WebElement NewAccBtn;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'field-AcceptanceLimit')]//div[2]/div/input")
	private WebElement AccLimitvalue;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-AcceptanceLimit')]/div[2]/input[1]")
	private WebElement SortOrder;
	
	@FindBy(xpath="(//td[contains(text(),'ACL')]//following-sibling::td//span[@data-csi-act='Edit'])[1]")
	private WebElement Edit_Btn;

	@FindBy(xpath="(//td[contains(text(),'ACL')]//following-sibling::td//span[@data-csi-act='Delete'])[1]")
	private WebElement DeleteAccLimit;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'SamplingPlans')]//div[contains(text(),'New Sampling Plan')]")
	private WebElement NewSamplingBtn;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-SamplingPlan')]//div[2]/div/input")
	private WebElement SamplingPlanValue;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'SamplingPlanAcceptanceLimits')]/div)[1]")
	private WebElement AccLimitExpand;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'SamplingPlanAcceptanceLimits')]/div/div/input)[2]")
	private WebElement selectAccLimit;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'InspectionTestSpecs')]//div[contains(text(),'New Test Specification')])[1]")
	private WebElement NewTestSpec;

	@FindBy(xpath="//div[contains(@data-csi-automation,'InspectionTestSpec-Form-Node Name')]//div[2]/div/input")
	private WebElement TestSpecValue;

	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'-InspectionTestSpec-Form-LinkingType')]//div[3]/input)[1]")
	private WebElement LinkTypevalue;

	@FindBy(xpath="//div[contains(@data-csi-automation,'-InspectionTestSpec-Form-LinkingType')]//div[text()='No Link']")
	private WebElement TypeNoLink;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'-InspectionTestSpec-Form-LinkingType')]//div[text()='BOM']")
	private WebElement TypeBOM;

	@FindBy(xpath="//div[contains(@data-csi-automation,'-InspectionTestSpec-Form-LinkingType')]//div[text()='Size Chart']")
	private WebElement TypeSizeChart;

	@FindBy(xpath="//div[contains(@data-csi-automation,'-InspectionTestSpec-Form-LinkingType')]//div[text()='Spec Data Sheet']")
	private WebElement TypeSpecDataSheet;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'-InspectionTestSpec-Form-LinkingType')]//div[text()='Style Review']")
	private WebElement TypeStyleReview;

	@FindBy(xpath="//a[text()='Style Review']/parent::td//following-sibling::td//span[contains(text(),'copy')]")
	private WebElement CopyTestSpec;

	@FindBy(xpath="//a[contains(text(),'Copy')]/parent::td//following-sibling::td//span[contains(text(),'edit')]")
	private WebElement EditTestSpec;

	@FindBy(xpath="//a[contains(text(),'Delete')]/parent::td//following-sibling::td//span[contains(text(),'close')]")
	private WebElement DeleteTestSpec;

	@FindBy(xpath="//table[contains(@data-csi-automation,'InspectionErrorTypes')]//div[contains(text(),'New Error Type')]")
	private WebElement NewErrorBtn;

	@FindBy(xpath="//div[contains(@data-csi-act,'FullInspection')]")
	private WebElement fullinsChkbox;

	@FindBy(xpath="//td[contains(@data-csi-heading,'FullInspection')]/following-sibling::td/div/span[text()='close']")
	private WebElement DeleteErrorBtn;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'InspectionTemplates')]//div[contains(text(),'New Inspection Template')]")
	private WebElement NewInspTemplateBtn;
	
	@FindBy(xpath="//td[contains(@data-csi-heading,'SamplingPlan')]/preceding-sibling::td/a")
	private WebElement InspectionTempName;

	@FindBy(xpath="(//span[contains(@data-csi-tab,'FinalInspectionTemplate') and text()='Inspection Template'])")
	private WebElement InspectionTemplatetab;

	@FindBy(xpath="//td[contains(@data-csi-heading,'SamplingPlan')]")
	private WebElement TempSamplingPlan;

	@FindBy(xpath="(//span[contains(@data-csi-tab,'ErrorTypes') and text()='Error Types'])")
	private WebElement ErrorTypestab;

	@FindBy(xpath="//table[contains(@data-csi-automation,'ErrorTypes')]//div[contains(text(),'New Inspection Error Type')]")
	private WebElement NewInspErrorType;

	@FindBy(xpath="//div[@data-csi-automation='field-FinalInspectionErrorType-Form-ErrorType']/div[3]/input[1]")
	private WebElement ErrorTypevalue;

	@FindBy(xpath="(//span[contains(@data-csi-tab,'InspectionSections') and text()='Test Specifications'])")
	private WebElement Testspecificationtab;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'AbstractFinalInspection-InspectionSections')]//div[contains(text(),'New from Inspection Section Type')])[1]")
	private WebElement NewTestSpecBtn;

	@FindBy(xpath="//span[text()='Inspection Section Type']/ancestor::tr/th/div/input")
	private WebElement InspSecChkBox;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'FinalInspectionSection-InspectionTestSpecs')]//div[contains(text(),'Select Test Specifications')])[1]")
	private WebElement selectTestSpec;

	@FindBy(xpath="//span[text()='Test Specification']/ancestor::tr/th/div/input")
	private WebElement TestSpecChkBox;

	@FindBy(xpath="(//span[contains(@data-csi-tab,'FIBOMs') and text()='BOM'])")
	private WebElement BOMTab;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'AbstractFinalInspection-FIBOMs')]//div[contains(text(),'New Special')])[1]")
	private WebElement NewBombtn;

	@FindBy(xpath="//a[text()='(Unnamed)']/ancestor::td")
	private WebElement EditName;

	@FindBy(xpath="//span[text()='Inspection BOM']/ancestor::div[2]//table//td/a")
	private WebElement BOMName;

	@FindBy(xpath="(//span[contains(@data-csi-tab,'FinalInspectionBOM-Properties') and text()='Properties'])")
	private WebElement BOMInspProperties;

	@FindBy(xpath="(//span[contains(@data-csi-tab,'FinalInspectionBOM-Placements') and text()='Placements'])")
	private WebElement BOMInspPlacement;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'FinalInspectionBOM-Placements')]//div[contains(text(),'New from Material')])[1]")
	private WebElement NewFromMaterialBtn;

	@FindBy(xpath="(//td[contains(text(),'100% Cotton Jersey')]/ancestor::tr/td/div/input)[1]")
	private WebElement materialchkBox;

	@FindBy(xpath="(//span[contains(@data-csi-tab,'FISizeCharts') and text()='Size Charts'])")
	private WebElement SizeChartTab;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'AbstractFinalInspection-FISizeCharts')]//div[contains(text(),'New Special')])[1]")
	private WebElement NewSplSizeChartBtn;

	@FindBy(xpath="//span[text()='Inspection Size Chart']/ancestor::div[2]//table//td/a")
	private WebElement InsSpecName;

	@FindBy(xpath="(//span[contains(@data-csi-tab,'FinalInspectionSizeChart-Properties') and text()='Properties'])")
	private WebElement SizeChartInspProperty;

	@FindBy(xpath="(//span[contains(@data-csi-tab,'FinalInspectionSizeChart-Dimensions') and text()='Inspection Size Charts Dimensions'])")
	private WebElement SizeChartDimension;

	@FindBy(xpath="//table[contains(@data-csi-automation,'FinalInspectionSizeChart-Dimensions-ToolbarNewActions')]//td[2]")
	private WebElement DimesionExpand;

	@FindBy(xpath="//td[contains(text(),'New Inspection Size Chart Dimension')]")
	private WebElement NewinpeSizeChart;

	@FindBy(xpath="//td[contains(@data-csi-heading,'Description')]/preceding-sibling::td[@data-csi-act='Node Name::0']")
	private WebElement EditDimName;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'InspectionSecurityGroups')]//div[contains(text(),'New Inspection Security Group')])[1]")
	private WebElement NewInspSecGrpBtn;

	public WebElement getPagecontentArrow() {
		return PagecontentArrow;
	}

	public WebElement getInspectionTab() {
		return InspectionTab;
	}

	public WebElement getInspectionSecGrpTab() {
		return InspectionSecGrpTab;
	}

	public WebElement getDefects() {
		return Defects;
	}
	public WebElement getDefectCopy() {
		return DefectCopy;
	}
	
	public WebElement getAccLimit() {
		return AccLimit;
	}

	public WebElement getSamplingplan() {
		return Samplingplan;
	}

	public WebElement getTestSpecification() {
		return TestSpecification;
	}

	public WebElement getErrorType() {
		return ErrorType;
	}

	public WebElement getTemplate() {
		return Template;
	}

	public WebElement getNewDefectBtn() {
		return NewDefectBtn;
	}

	public WebElement getNewDefect() {
		return NewDefect;
	}

	public WebElement getNewAccBtn() {
		return NewAccBtn;
	}

	public WebElement getAccLimitvalue() {
		return AccLimitvalue;
	}

	public WebElement getSortOrder() {
		return SortOrder;
	}
	
	public WebElement getEdit_Btn() {
		return Edit_Btn;
	}
	
	public WebElement getDeleteAccLimit() {
		return DeleteAccLimit;
	}

	public WebElement getNewSamplingBtn() {
		return NewSamplingBtn;
	}

	public WebElement getSamplingPlanValue() {
		return SamplingPlanValue;
	}

	public WebElement getAccLimitExpand() {
		return AccLimitExpand;
	}

	public WebElement getSelectAccLimit() {
		return selectAccLimit;
	}

	public WebElement getNewTestSpec() {
		return NewTestSpec;
	}

	public WebElement getTestSpecValue() {
		return TestSpecValue;
	}

	public WebElement getLinkTypevalue() {
		return LinkTypevalue;
	}

	public WebElement getTypeNoLink() {
		return TypeNoLink;
	}

	public WebElement getTypeBOM() {
		return TypeBOM;
	}

	public WebElement getTypeSizeChart() {
		return TypeSizeChart;
	}

	public WebElement getTypeSpecDataSheet() {
		return TypeSpecDataSheet;
	}

	public WebElement getTypeStyleReview() {
		return TypeStyleReview;
	}

	public WebElement getCopyTestSpec() {
		return CopyTestSpec;
	}

	public WebElement getEditTestSpec() {
		return EditTestSpec;
	}

	public WebElement getDeleteTestSpec() {
		return DeleteTestSpec;
	}

	public WebElement getNewErrorBtn() {
		return NewErrorBtn;
	}

	public WebElement getFullinsChkbox() {
		return fullinsChkbox;
	}

	public WebElement getDeleteErrorBtn() {
		return DeleteErrorBtn;
	}

	public WebElement getNewInspTemplateBtn() {
		return NewInspTemplateBtn;
	}

	public WebElement getInspectionTempName() {
		return InspectionTempName;
	}

	public WebElement getInspectionTemplatetab() {
		return InspectionTemplatetab;
	}

	public WebElement getTempSamplingPlan() {
		return TempSamplingPlan;
	}

	public WebElement getErrorTypestab() {
		return ErrorTypestab;
	}

	public WebElement getNewInspErrorType() {
		return NewInspErrorType;
	}

	public WebElement getErrorTypevalue() {
		return ErrorTypevalue;
	}

	public WebElement getTestspecificationtab() {
		return Testspecificationtab;
	}

	public WebElement getNewTestSpecBtn() {
		return NewTestSpecBtn;
	}

	public WebElement getInspSecChkBox() {
		return InspSecChkBox;
	}

	public WebElement getSelectTestSpec() {
		return selectTestSpec;
	}

	public WebElement getTestSpecChkBox() {
		return TestSpecChkBox;
	}

	public WebElement getBOMTab() {
		return BOMTab;
	}

	public WebElement getNewBombtn() {
		return NewBombtn;
	}

	public WebElement getEditName() {
		return EditName;
	}

	public WebElement getBOMName() {
		return BOMName;
	}

	public WebElement getBOMInspProperties() {
		return BOMInspProperties;
	}

	public WebElement getBOMInspPlacement() {
		return BOMInspPlacement;
	}

	public WebElement getNewFromMaterialBtn() {
		return NewFromMaterialBtn;
	}

	public WebElement getMaterialchkBox() {
		return materialchkBox;
	}

	public WebElement getSizeChartTab() {
		return SizeChartTab;
	}

	public WebElement getNewSplSizeChartBtn() {
		return NewSplSizeChartBtn;
	}

	public WebElement getInsSpecName() {
		return InsSpecName;
	}

	public WebElement getSizeChartInspProperty() {
		return SizeChartInspProperty;
	}

	public WebElement getSizeChartDimension() {
		return SizeChartDimension;
	}

	public WebElement getDimesionExpand() {
		return DimesionExpand;
	}

	public WebElement getNewinpeSizeChart() {
		return NewinpeSizeChart;
	}

	public WebElement getEditDimName() {
		return EditDimName;
	}

	public WebElement getNewInspSecGrpBtn() {
		return NewInspSecGrpBtn;
	}
	

}
