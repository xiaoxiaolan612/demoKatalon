import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(null)

WebUI.navigateToUrl('https://demo.seleniumeasy.com/basic-checkbox-demo.html')

WebUI.click(findTestObject('Page_Selenium Easy - Checkbox demo for automation using selenium/input_Click on this check box_isAgeSelected'))

boolean isChecked = WebUI.verifyElementChecked(findTestObject('Object Repository/Page_Selenium Easy - Checkbox demo for automation using selenium/input_Click on this check box_isAgeSelected'), 
    5)

WebUI.verifyEqual(isChecked, true)

TestObject checkAllButton = findTestObject('Object Repository/Page_Selenium Easy - Checkbox demo for automation using selenium/input_CheckAll')

WebUI.click(checkAllButton)

List<TestObject> checkboxes = [
    findTestObject('Object Repository/Page_Selenium Easy - Checkbox demo for automation using selenium/input_Option 1_cb1-element'),
    findTestObject('Object Repository/Page_Selenium Easy - Checkbox demo for automation using selenium/input_Option 2_cb1-element'),
    findTestObject('Object Repository/Page_Selenium Easy - Checkbox demo for automation using selenium/input_Option 3_cb1-element'),
    findTestObject('Object Repository/Page_Selenium Easy - Checkbox demo for automation using selenium/input_Option 4_cb1-element')
]
checkboxes.each { checkbox ->
	isChecked = WebUI.verifyElementChecked(checkbox, 5)
	WebUI.verifyEqual(isChecked, true)
}

WebUI.closeBrowser()


