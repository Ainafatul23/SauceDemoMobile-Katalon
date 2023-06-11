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

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Side Bar/Products - Assert All Items'), 'PRODUCTS')

// Reset App
Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Add to Cart'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Side Bar/Remove - Assert'), 'REMOVE')

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Sidebar'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/ResetApp-Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Side Bar/Add to Cart'), 'ADD TO CART')

Mobile.verifyElementNotExist(findTestObject('Application/SauceDemo/Checkout/Add Number Cart - Assert add 2'), 0)

// Web View
Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Sidebar'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/WebView-Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Side Bar/WEBVIEW SELECTION'), 'WEBVIEW SELECTION')

Mobile.clearText(findTestObject('Application/SauceDemo/Side Bar/https - field'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Go to site - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Side Bar/Please provide a correct https url - Validation'), 
    'Please provide a correct https url')

Mobile.clearText(findTestObject('Application/SauceDemo/Side Bar/https - field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Side Bar/https - field'), 'http://ainafatul.cloud', 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Go to site - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Side Bar/Please provide a correct https url - Validation'), 
    'Please provide a correct https url')

Mobile.clearText(findTestObject('Application/SauceDemo/Side Bar/https - field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Side Bar/https - field'), 'https://www.saucedemo.com', 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Go to site - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Side Bar/Swag Labs - Web'), 'Swag Labs')

// Scan QR Code
Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Sidebar'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/QRCode-Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Side Bar/ScanQR - assert scanQR'), 'Scan a QR Code that contains a url.')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Side Bar/QR - Wikipedia'), 'Wikipedia')

Mobile.pressBack()

// Geo Location
Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Sidebar'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/GeoLoc-Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Side Bar/GeoLoc - Assert'), 'GEO LOCATION')

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Side Bar/Geo - Latitude'), 'Latitude:')

Mobile.verifyElementExist(findTestObject('Application/SauceDemo/Side Bar/Geo - Latitude Value'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Side Bar/Geo - Longitude'), 'Longitude:')

Mobile.verifyElementExist(findTestObject('Application/SauceDemo/Side Bar/Geo - Longitute Value'), 0)

//Drawing
Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Sidebar'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Drawing-Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Side Bar/Drawing - Assert'), 'DRAWING')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/drawing - clear'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/drawing - save'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Side Bar/Drawing saved successfully to gallery'), 'Drawing saved successfully to gallery')

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/save drawing - OK button'), 0)

//About

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Sidebar'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/About-Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Side Bar/about - saucelabs web'), 'Website and mobile testing at every stage of development')

Mobile.pressBack()

//Log Out
Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Sidebar'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Side Bar/Logout-Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Side Bar/Login - Assert Logout'), 'LOGIN')

