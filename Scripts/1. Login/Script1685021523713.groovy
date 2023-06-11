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

//open app
Mobile.startExistingApplication('com.swaglabsmobileapp')

//Verify user can't  leaving username field empty
Mobile.clearText(findTestObject('Application/SauceDemo/Login/LoginUsername-Field'), 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Login/LoginPassword-Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Login/LoginPassword-Field'), 'secret_sauce', 0)

Mobile.tap(findTestObject('Application/SauceDemo/Login/Login-Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Login/UsernameRequired-Validation'), 'Username is required')

//Verify user can't  leaving password field empty
Mobile.clearText(findTestObject('Application/SauceDemo/Login/LoginUsername-Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Login/LoginUsername-Field'), 'standard_user', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Login/LoginPassword-Field'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Login/Login-Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Login/PasswordRequired-Validation'), 'Password is required')

//Verify user can't input invalid username
Mobile.clearText(findTestObject('Application/SauceDemo/Login/LoginUsername-Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Login/LoginUsername-Field'), 'standart_user', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Login/LoginPassword-Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Login/LoginPassword-Field'), 'secret_sauce', 0)

Mobile.tap(findTestObject('Application/SauceDemo/Login/Login-Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Login/UsernamePasswordDoNotMatch-Validation'), 'Username and password do not match any user in this service.')

//Verify user can't input invalid password
Mobile.clearText(findTestObject('Application/SauceDemo/Login/LoginUsername-Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Login/LoginUsername-Field'), 'standard_user', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Login/LoginPassword-Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Login/LoginPassword-Field'), 'sauce_secret', 0)

Mobile.tap(findTestObject('Application/SauceDemo/Login/Login-Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Login/UsernamePasswordDoNotMatch-Validation'), 'Username and password do not match any user in this service.')

// Verify user can't login using locked out user
Mobile.clearText(findTestObject('Application/SauceDemo/Login/LoginUsername-Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Login/LoginUsername-Field'), 'locked_out_user', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Login/LoginPassword-Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Login/LoginPassword-Field'), 'secret_sauce', 0)

Mobile.tap(findTestObject('Application/SauceDemo/Login/Login-Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Login/LockedOutUser-Validation'), 'Sorry, this user has been locked out.')

// Verify user can login with problem user
Mobile.clearText(findTestObject('Application/SauceDemo/Login/LoginUsername-Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Login/LoginUsername-Field'), 'problem_user', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Login/LoginPassword-Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Login/LoginPassword-Field'), 'secret_sauce', 0)

Mobile.tap(findTestObject('Application/SauceDemo/Login/Login-Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Login/Products-Assertion'), 'PRODUCTS')

Mobile.tap(findTestObject('Application/SauceDemo/Login/SideBar-Dashboard'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Login/Logout-Button'), 0)

//Verify user can login using standard user
Mobile.clearText(findTestObject('Application/SauceDemo/Login/LoginUsername-Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Login/LoginUsername-Field'), 'standard_user', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Login/LoginPassword-Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Login/LoginPassword-Field'), 'secret_sauce', 0)

Mobile.tap(findTestObject('Application/SauceDemo/Login/Login-Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Login/Products-Assertion'), 'PRODUCTS')

