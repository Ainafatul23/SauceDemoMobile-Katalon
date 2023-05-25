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

//Add to Cart
Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Sauce Labs Backpack'), 0)

Mobile.scrollToText('Add To Cart')

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Add To Cart - Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Checkout/Remove - Assert Add 1'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Checkout/Add Number Cart - Assert add 2'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Back to Products - Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Checkout/Remove - Assert Add Dash 3'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Sauce Labs Bike - Card'), 0)

Mobile.scrollToText('Add To Cart')

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Add To Cart - Button'), 0)

// Verify Remove Button

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Cart - Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Checkout/Your Cart - Assetion Cart'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Remove Backpack - Button'), 0)

Mobile.verifyElementNotExist(findTestObject('Application/SauceDemo/Checkout/SauceLabsBackpack - Assertion Delete'), 0)

//Verify Continue shopping button

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Continue Shopping - Button'), 0)

//Checkout from cart

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Cart - Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Checkout/Your Cart - Assetion Cart'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Checkout - Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Checkout/Checkout Information'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Cancel Checkout Info - Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Checkout/Products - Assertion Continue Shopping'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Cart - Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Checkout/Your Cart - Assetion Cart'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Checkout - Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Checkout/Checkout Information'), 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/First Name - Field'), 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/Last Name - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/Last Name - Field'), 'muslikah', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/ZipPostal Code - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/ZipPostal Code - Field'), '1234', 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Continue Checkout - Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Checkout/First Name is required - Validation'), 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/First Name - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/First Name - Field'), 'ainafatul', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/Last Name - Field'), 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/ZipPostal Code - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/ZipPostal Code - Field'), '1234', 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Continue Checkout - Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Checkout/Last Name is required - Validation'), 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/First Name - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/First Name - Field'), 'ainafatul', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/Last Name - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/Last Name - Field'), 'muslikah', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/ZipPostal Code - Field'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Continue Checkout - Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Checkout/Postal Code is required - Validation'), 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/First Name - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/First Name - Field'), 'ainafatul', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/Last Name - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/Last Name - Field'), 'muslikah', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/ZipPostal Code - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/ZipPostal Code - Field'), '1234', 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Continue Checkout - Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Checkout/Checkout Overview - Assertion'), 0)

Mobile.scrollToText('finish', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Finish - Button'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Checkout/CHECKOUT COMPLETE'), 0)

Mobile.getText(findTestObject('Application/SauceDemo/Checkout/Thankyou - Assertion finish order'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Back Home - Button'), 0)

