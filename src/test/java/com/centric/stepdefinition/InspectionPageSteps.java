package com.centric.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.centric.objectrepository.DocumentPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.InspectionPage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.QualityPage;
import com.centric.objectrepository.SourcingPage;
import com.centric.objectrepository.StylePage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.When;

public class InspectionPageSteps  extends Commonactions {

	HomePage hp = new HomePage();
	Commonactions ca = new Commonactions();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	PopupPage pp = new PopupPage();
	SourcingPage sp = new SourcingPage();
	DocumentPage dp = new DocumentPage(); 
	StylePage st = new StylePage();
	InspectionPage in = new InspectionPage();

	String file,name,filter;

	@When("user creates setup in Inspection {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_creates_setup_in_Inspection(String defects, String AccLimit, String SortOrder,String TestSpecification,String Samplingvalue,String ErrorType,String TemplateName , String BOMName, String SizeChart, String DimensioName, String InspectionGrpName) throws Throwable {

		in.getPagecontentArrow().click();
		Commonactions.isElementPresent(hp.getInspectionBtn());
		hp.getInspectionBtn().click();
		Commonactions.isElementPresent(in.getInspectionTab());
		in.getInspectionTab().click();
		Commonactions.isElementPresent(in.getInspectionSecGrpTab());
		in.getInspectionSecGrpTab().click();
		Commonactions.isElementPresent(sp.getSetup());
		sp.getSetup().click();
		String[] def = defects.split(",");
		String[] Acclimit = AccLimit.split(",");
		String[] sort = SortOrder.split(",");
		String[] specvalue = TestSpecification.split(",");
		String[] SapValue = Samplingvalue.split(",");
		String[] Error = ErrorType.split(",");




		Commonactions.isElementPresent(in.getDefects());
		in.getDefects().click();
		Commonactions.isElementPresent(in.getNewDefectBtn());
		in.getNewDefectBtn().click();
		ca.eleToBeClickable();



		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, def[0]);
		ca.eleToBeClickable();
		e.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(in.getNewDefectBtn());
		in.getNewDefectBtn().click();
		ca.eleToBeClickable();

		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, def[1]);
		ca.eleToBeClickable();
		e1.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(in.getNewDefectBtn());
		in.getNewDefectBtn().click();
		ca.eleToBeClickable();


		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, def[2]);
		ca.eleToBeClickable();
		e2.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(in.getNewDefectBtn());
		in.getNewDefectBtn().click();
		ca.eleToBeClickable();


		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e3, def[3]);
		ca.eleToBeClickable();
		e3.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(in.getDefectCopy());		
		in.getDefectCopy().click();
		Commonactions.isElementPresent(sp.getSP_Delete());
		sp.getSP_Delete().click();
		Commonactions.isElementPresent(pp.getDelete_Btn());
		pp.getDelete_Btn().click();
		Commonactions.isElementPresent(in.getAccLimit());
		System.out.println("Defect types created, copied, deleted");


		in.getAccLimit().click();
		Commonactions.isElementPresent(in.getNewAccBtn());
		in.getNewAccBtn().click();
		Commonactions.isElementPresent(in.getAccLimitvalue());
		insertText(in.getAccLimitvalue(), Acclimit[0]);
		Commonactions.isElementPresent(in.getSortOrder());
		insertText(in.getSortOrder(), sort[0]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		mp.getSave_btn1().click();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(in.getNewAccBtn());
		in.getNewAccBtn().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getAccLimitvalue());
		insertText(in.getAccLimitvalue(), Acclimit[1]);
		Commonactions.isElementPresent(in.getSortOrder());
		insertText(in.getSortOrder(), sort[1]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		mp.getSave_btn1().click();
		ca.eleToBeClickable();

		Commonactions.isElementPresent(in.getNewAccBtn());
		in.getNewAccBtn().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getAccLimitvalue());
		insertText(in.getAccLimitvalue(), Acclimit[2]);
		Commonactions.isElementPresent(in.getSortOrder());
		insertText(in.getSortOrder(), sort[2]);
		Commonactions.isElementPresent(mp.getSave_btn1());
		mp.getSave_btn1().click();
		ca.eleToBeClickable();
		System.out.println("Acceptance limit created");

		Commonactions.isElementPresent(in.getEdit_Btn());
		in.getEdit_Btn().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getAccLimitvalue());
		insertText(in.getAccLimitvalue(), Acclimit[2]+1);
		Commonactions.isElementPresent(mp.getSave_btn1());
		mp.getSave_btn1().click();
		ca.eleToBeClickable();
		System.out.println("Acceptance limit Edited and Deleted");


		Commonactions.isElementPresent(in.getDeleteAccLimit());
		in.getDeleteAccLimit().click();
		Commonactions.isElementPresent(pp.getDelete_Btn());
		pp.getDelete_Btn().click();
		
		Commonactions.isElementPresent(in.getSamplingplan());
		in.getSamplingplan().click();
		driver.navigate().refresh();
		
		Commonactions.isElementPresent(in.getSamplingplan());
		in.getSamplingplan().click();
		Commonactions.isElementPresent(in.getNewSamplingBtn());
		in.getNewSamplingBtn().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getSamplingPlanValue());
		insertText(in.getSamplingPlanValue(), SapValue[0]);
		Commonactions.isElementPresent(in.getAccLimitExpand());
		in.getAccLimitExpand().click();
		Commonactions.isElementPresent(in.getSelectAccLimit());
		in.getSelectAccLimit().click();
		Commonactions.isElementPresent(in.getSamplingPlanValue());
		in.getSamplingPlanValue().click();
		Commonactions.isElementPresent(mp.getSave_btn1());
		mp.getSave_btn1().click();
		ca.eleToBeClickable();

		in.getNewSamplingBtn().click();
		Commonactions.isElementPresent(in.getSamplingPlanValue());
		ca.eleToBeClickable();
		insertText(in.getSamplingPlanValue(), SapValue[1]);
		Commonactions.isElementPresent(in.getAccLimitExpand());
		in.getAccLimitExpand().click();
		Commonactions.isElementPresent(in.getSelectAccLimit());
		in.getSelectAccLimit().click();
		Commonactions.isElementPresent(in.getSamplingPlanValue());
		in.getSamplingPlanValue().click();
		Commonactions.isElementPresent(mp.getSave_btn1());
		mp.getSave_btn1().click();
		ca.eleToBeClickable();

		in.getNewSamplingBtn().click();
		Commonactions.isElementPresent(in.getSamplingPlanValue());
		ca.eleToBeClickable();
		insertText(in.getSamplingPlanValue(), SapValue[2]);
		Commonactions.isElementPresent(in.getAccLimitExpand());
		in.getAccLimitExpand().click();
		Commonactions.isElementPresent(in.getSelectAccLimit());
		in.getSelectAccLimit().click();
		Commonactions.isElementPresent(in.getSamplingPlanValue());
		in.getSamplingPlanValue().click();
		Commonactions.isElementPresent(mp.getSave_btn1());
		mp.getSave_btn1().click();
		ca.eleToBeClickable();
		System.out.println("Sampling Plan Created");

		Commonactions.isElementPresent(in.getTestSpecification());
		in.getTestSpecification().click();
		Commonactions.isElementPresent(in.getNewTestSpec());
		in.getNewTestSpec().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getTestSpecValue());
		insertText(in.getTestSpecValue(), specvalue[0]);
		Commonactions.isElementPresent(in.getLinkTypevalue());
		insertText(in.getLinkTypevalue(), specvalue[0]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();		
		mp.getSave_btn1().click();
		ca.eleToBeClickable();
		dp.getApproveAction().click();
		ca.eleToBeClickable();

		in.getNewTestSpec().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getTestSpecValue());
		insertText(in.getTestSpecValue(), specvalue[1]);
		Commonactions.isElementPresent(in.getLinkTypevalue());
		insertText(in.getLinkTypevalue(), specvalue[1]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();	
		mp.getSave_btn1().click();
		ca.eleToBeClickable();
		dp.getApproveAction().click();
		ca.eleToBeClickable();

		in.getNewTestSpec().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getTestSpecValue());
		insertText(in.getTestSpecValue(), specvalue[2]);
		Commonactions.isElementPresent(in.getLinkTypevalue());
		insertText(in.getLinkTypevalue(), specvalue[2]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();		
		mp.getSave_btn1().click();
		ca.eleToBeClickable();
		dp.getApproveAction().click();
		ca.eleToBeClickable();

		in.getNewTestSpec().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getTestSpecValue());
		insertText(in.getTestSpecValue(), specvalue[3]);
		Commonactions.isElementPresent(in.getLinkTypevalue());
		insertText(in.getLinkTypevalue(), specvalue[3]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		mp.getSave_btn1().click();
		ca.eleToBeClickable();
		dp.getApproveAction().click();
		ca.eleToBeClickable();

		in.getNewTestSpec().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getTestSpecValue());
		insertText(in.getTestSpecValue(), specvalue[4]);
		Commonactions.isElementPresent(in.getLinkTypevalue());
		insertText(in.getLinkTypevalue(), specvalue[4]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();		
		mp.getSave_btn1().click();
		ca.eleToBeClickable();
		dp.getApproveAction().click();
		ca.eleToBeClickable();
		System.out.println("Test Specification Created");

		in.getCopyTestSpec().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getTestSpecValue());
		insertText(in.getTestSpecValue(), specvalue[4]+" Copy");
		Commonactions.isElementPresent(mp.getSave_btn1());
		mp.getSave_btn1().click();
		ca.eleToBeClickable();
		in.getEditTestSpec().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getTestSpecValue());
		insertText(in.getTestSpecValue(), specvalue[4]+" Delete");
		Commonactions.isElementPresent(mp.getSave_btn1());
		mp.getSave_btn1().click();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(in.getDeleteTestSpec());
		in.getDeleteTestSpec().click();
		Commonactions.isElementPresent(pp.getDelete_Btn());
		pp.getDelete_Btn().click();
		System.out.println("Test Specification copied, Edited and deleted");

		Commonactions.isElementPresent(in.getErrorType());
		in.getErrorType().click();
		Commonactions.isElementPresent(in.getNewErrorBtn());
		in.getNewErrorBtn().click();
		ca.eleToBeClickable();
		WebElement e4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e4, Error[0]);
		ca.eleToBeClickable();
		e4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		in.getFullinsChkbox().click();

		Commonactions.isElementPresent(in.getNewErrorBtn());
		in.getNewErrorBtn().click();
		ca.eleToBeClickable();
		WebElement e5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e5, Error[1]);
		ca.eleToBeClickable();
		e5.sendKeys(Keys.TAB);
		System.out.println("Full Error, Batch Error  Created");

		Commonactions.isElementPresent(in.getNewErrorBtn());
		in.getNewErrorBtn().click();
		ca.eleToBeClickable();
		WebElement e6 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e6, Error[2]);
		ca.eleToBeClickable();
		e6.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(in.getDeleteErrorBtn());
		in.getDeleteErrorBtn().click();
		Commonactions.isElementPresent(pp.getDelete_Btn());
		pp.getDelete_Btn().click();
		System.out.println("Check Error Deleted");

		Commonactions.isElementPresent(in.getTemplate());
		in.getTemplate().click();
		Commonactions.isElementPresent(in.getNewInspTemplateBtn());
		in.getNewInspTemplateBtn().click();
		ca.eleToBeClickable();
		WebElement e7 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e7, TemplateName);
		ca.eleToBeClickable();
		e7.sendKeys(Keys.TAB);
		ca.eleToBeClickable();


		in.getInspectionTempName().click();
		Commonactions.isElementPresent(in.getInspectionTemplatetab());
		in.getInspectionTemplatetab().click();
		Commonactions.isElementPresent(in.getTempSamplingPlan());
		in.getTempSamplingPlan().click();
		ca.eleToBeClickable();
		WebElement e8 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e8, SapValue[0]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();

		in.getErrorTypestab().click();
		Commonactions.isElementPresent(in.getNewInspErrorType());
		in.getNewInspErrorType().click();
		Commonactions.isElementPresent(in.getErrorTypevalue());
		insertText(in.getErrorTypevalue(), Error[0]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		mp.getSave_btn1().click();
		ca.eleToBeClickable();

		in.getNewInspErrorType().click();
		Commonactions.isElementPresent(in.getErrorTypevalue());
		insertText(in.getErrorTypevalue(), Error[1]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		mp.getSave_btn1().click();
		ca.eleToBeClickable();

		in.getTestspecificationtab().click();
		Commonactions.isElementPresent(in.getNewTestSpecBtn());
		in.getNewTestSpecBtn().click();
		Commonactions.isElementPresent(in.getInspSecChkBox());
		in.getInspSecChkBox().click();
		Commonactions.isElementPresent(mp.getSave_btn1());
		mp.getSave_btn1().click();
		ca.eleToBeClickable();

		int size = driver.findElements(By.xpath("(//input[@type='radio'])")).size();
		for(int i=1;i<=size;i++)
		{
			driver.findElement(By.xpath("(//input[@type='radio'])["+i+"]")).click();
			Commonactions.isElementPresent(in.getSelectTestSpec());
			in.getSelectTestSpec().click();
			Commonactions.isElementPresent(in.getTestSpecChkBox());
			in.getTestSpecChkBox().click();
			Commonactions.isElementPresent(mp.getSave_btn1());
			mp.getSave_btn1().click();
			ca.eleToBeClickable();

		}
		System.out.println("Template created and TestSpec added");

		Commonactions.isElementPresent(in.getBOMTab());
		in.getBOMTab().click();
		Commonactions.isElementPresent(in.getNewBombtn());
		in.getNewBombtn().click();
		Commonactions.isElementPresent(in.getEditName());
		in.getEditName().click();
		ca.eleToBeClickable();

		WebElement b1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b1, BOMName);
		ca.eleToBeClickable();
		b1.sendKeys(Keys.TAB);

		Commonactions.isElementPresent(in.getBOMName());
		in.getBOMName().click();
		Commonactions.isElementPresent(in.getBOMInspPlacement());
		in.getBOMInspPlacement().click();
		Commonactions.isElementPresent(in.getNewFromMaterialBtn());
		in.getNewFromMaterialBtn().click();
		Commonactions.isElementPresent(in.getMaterialchkBox());
		in.getMaterialchkBox().click();
		Commonactions.isElementPresent(mp.getSave_btn1());
		mp.getSave_btn1().click();
		ca.eleToBeClickable();
		System.out.println("Inspection BOM created");
		QualityPage  qp = new QualityPage();
		

		ca.eleToBeClickable();
        ca.click(hp.getUser_homeBtn()); 
	     
	     System.out.println("Home tab clicked successfully");
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(qp.getRightArrow());
		ca.click(qp.getRightArrow());
		Commonactions.isElementPresent(hp.getInspectionBtn());
		hp.getInspectionBtn().click();
		Commonactions.isElementPresent(sp.getSetup());
		sp.getSetup().click();
		Commonactions.isElementPresent(in.getTemplate());
		in.getTemplate().click();
		Commonactions.isElementPresent(in.getInspectionTempName());
		in.getInspectionTempName().click();
		Commonactions.isElementPresent(in.getSizeChartTab());
		in.getSizeChartTab().click();
		Commonactions.isElementPresent(in.getNewSplSizeChartBtn());
		in.getNewSplSizeChartBtn().click();
		Commonactions.isElementPresent(in.getEditName());
		in.getEditName().click();

		WebElement b2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b2, SizeChart);
		ca.eleToBeClickable();
		b2.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		in.getInsSpecName().click();
		Commonactions.isElementPresent(in.getSizeChartDimension());
		in.getSizeChartDimension().click();
		Commonactions.isElementPresent(in.getDimesionExpand());
		in.getDimesionExpand().click();
		Commonactions.isElementPresent(in.getNewinpeSizeChart());
		in.getNewinpeSizeChart().click();
		Commonactions.isElementPresent(in.getEditDimName());
		in.getEditDimName().click();
		System.out.println("Inspection SizeChart and Dimension created");

		WebElement b3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b3, DimensioName);
		ca.eleToBeClickable();
		b3.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		ca.eleToBeClickable();
        ca.click(hp.getUser_homeBtn()); 
	     
	     System.out.println("Home tab clicked successfully");
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(qp.getRightArrow());
		ca.click(qp.getRightArrow());
		Commonactions.isElementPresent(hp.getInspectionBtn());
		hp.getInspectionBtn().click();

		
		Commonactions.isElementPresent(in.getInspectionSecGrpTab());
		in.getInspectionSecGrpTab().click();
		Commonactions.isElementPresent(in.getNewInspSecGrpBtn());
		in.getNewInspSecGrpBtn().click();
		ca.eleToBeClickable();
		WebElement b4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(b4, InspectionGrpName);
		ca.eleToBeClickable();
		b4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();
		System.out.println("New Inspection Group created");


	}






}
