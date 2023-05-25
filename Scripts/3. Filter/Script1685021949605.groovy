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

Mobile.tap(findTestObject('Application/SauceDemo/Filter/Filter'), 0)

// Verify cancel button
Mobile.tap(findTestObject('Application/SauceDemo/Filter/Cancel - Button'), 0)


// Verify filter price (high to low)
Mobile.tap(findTestObject('Application/SauceDemo/Filter/Filter'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Filter/Price (high to low) - Sort'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Filter/49.99 - Assert Price Highest'), 0)


//Verify filter price (low to high)
Mobile.tap(findTestObject('Application/SauceDemo/Filter/Filter'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Filter/Price (low to high) - Sort'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Filter/7.99 - Assert Price Lowest'), 0)

//Verify filter name (Z to A)
Mobile.tap(findTestObject('Application/SauceDemo/Filter/Filter'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Filter/Name (Z to A) - Sort'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Filter/T-Shirt (Red) - Assertion Z to A'), 0)


// Verify filter name (A to Z)
Mobile.tap(findTestObject('Application/SauceDemo/Filter/Filter'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Filter/Name (A to Z) - Sort'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Filter/Sauce Labs Backpack - Assertion A to Z'), 0)

