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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://shop.demoqa.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_Dismiss'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_My Account'))

WebUI.setText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__username'), 'dummy2225079@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__password'), '2a5piYK/fw33LQ+WquueHQ==')

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__rememberme'))

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/a_Search'))

WebUI.setText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    'dress')

WebUI.sendKeys(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Search Results for dress  ToolsQA Demo Site/img_Browse Wishlist_product-one-thumb'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ShopDemoQA/Page_white bandage cut out bodycon mini dre_228afb/select_Choose an optionWhite'), 
    'white', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ShopDemoQA/Page_white bandage cut out bodycon mini dre_228afb/select_Choose an optionLargeMediumSmallX-Large'), 
    'x-large', true)

WebUI.click(findTestObject('Object Repository/Page_ShopDemoQA/Page_white bandage cut out bodycon mini dre_228afb/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_ShopDemoQA/Page_white bandage cut out bodycon mini dre_228afb/a_Search'))

WebUI.setText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    'dress')

WebUI.sendKeys(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Search Results for dress  ToolsQA Demo Site/img_Add to Wishlist_product-one-thumb_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_black satin one shoulder cut out midi _f65846/select_Choose an optionBlack'), 
    'black', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_black satin one shoulder cut out midi _f65846/select_Choose an optionLargeMediumSmall'), 
    'small', true)

WebUI.click(findTestObject('Object Repository/Page_black satin one shoulder cut out midi _f65846/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_black satin one shoulder cut out midi _f65846/a_View cart'))

WebUI.click(findTestObject('Object Repository/Page_ShopDemoQA/Page_Cart  ToolsQA Demo Site/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_first_name'), 'mohammad zakaria')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_last_name'), 'yusri')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_company'), 'juara coding')

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/span_Indonesia'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_address_1'), 'bukit kencana 3')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_address_2'), 'depan lapangan')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_city'), 'bekasi')

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/span_Jawa Barat'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_postcode'), '174141')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_phone'), '08123456789')

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_privacy policy_terms'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/button_Place order'))

WebUI.closeBrowser()

