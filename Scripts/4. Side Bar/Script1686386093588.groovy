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

Mobile.startExistingApplication('com.swaglabsmobileapp')

//All Items

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Sidebar'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/AllItems-Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Side Bar/Products - Assert All Items'), 0)

// Reset App
Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Add to Cart'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Side Bar/Remove - Assert'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Sidebar'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/ResetApp-Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Side Bar/Add to Cart'), 0)

// Web View

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Sidebar'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/WebView-Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Side Bar/WEBVIEW SELECTION'), 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Side Bar/https - field'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Go to site - Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Side Bar/Please provide a correct https url - Validation'), 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Side Bar/https - field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Side Bar/https - field'), 'https://www.saucedemo.com/', 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Go to site - Button'), 0)

// Scan QR Code

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Sidebar'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/QRCode-Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Side Bar/ScanQR - assert scanQR'), 0)

// Geo Location

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Sidebar'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/GeoLoc-Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Side Bar/GeoLoc - Assert'), 0)

//Drawing

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Sidebar'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Drawing-Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Side Bar/Drawing - Assert'), 0)

//About

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Sidebar'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/About-Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Side Bar/About- Assert'), 0)

Mobile.pressBack()

//Log Out

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Sidebar'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Logout-Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Side Bar/Login - Assert Logout'), 0)

