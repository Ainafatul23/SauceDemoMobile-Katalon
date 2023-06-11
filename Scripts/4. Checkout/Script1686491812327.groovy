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

//Verify user can checkout the products on cart

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Sauce Labs Backpack'), 0)

Mobile.scrollToText('Add To Cart')

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Add To Cart - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Remove - Assert Add 1'), 'REMOVE')

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Add Number Cart - Assert add 2'), '1')

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Cart - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Your Cart - Assetion Cart'), 'YOUR CART')

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/cart - Sauce Labs Backpack'), 'Sauce Labs Backpack')

Mobile.scrollToText('CHECKOUT', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Checkout - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Checkout Information'), 'CHECKOUT: INFORMATION')

//Verify user can cancel checkout information activity

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Cancel Checkout Info - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Products - Assertion Continue Shopping'), 'PRODUCTS')

// On Checkout Information Activity

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Cart - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Your Cart - Assetion Cart'), 'YOUR CART')

Mobile.scrollToText('CHECKOUT', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Checkout - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Checkout Information'), 'CHECKOUT: INFORMATION')

// Verify user can't  leaving first name field empty

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/First Name - Field'), 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/Last Name - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/Last Name - Field'), 'muslikah', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/ZipPostal Code - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/ZipPostal Code - Field'), '1234', 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Continue Checkout - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/First Name is required - Validation'), 'First Name is required')

//Verify user can't  leaving last name field empty

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/First Name - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/First Name - Field'), 'ainafatul', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/Last Name - Field'), 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/ZipPostal Code - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/ZipPostal Code - Field'), '1234', 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Continue Checkout - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Last Name is required - Validation'), 'Last Name is required')

//Verify user can't  leaving last name field empty

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/First Name - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/First Name - Field'), 'ainafatul', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/Last Name - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/Last Name - Field'), 'muslikah', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/ZipPostal Code - Field'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Continue Checkout - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Postal Code is required - Validation'), 'Postal Code is required')

// Verify user can input valid information data on checkout information activity

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/First Name - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/First Name - Field'), 'ainafatul', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/Last Name - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/Last Name - Field'), 'muslikah', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/ZipPostal Code - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/ZipPostal Code - Field'), '1234', 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Continue Checkout - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Checkout Overview - Assertion'), 'CHECKOUT: OVERVIEW')

//Verify user can cancel checkout overview activity

Mobile.scrollToText('CANCEL', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Cancel - Checkout Overview'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Products - Assertion Continue Shopping'), 'PRODUCTS')

//Verify user can make a payment

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Cart - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Your Cart - Assetion Cart'), 'YOUR CART')

Mobile.scrollToText('CHECKOUT', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Checkout - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Checkout Information'), 'CHECKOUT: INFORMATION')

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/First Name - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/First Name - Field'), 'ainafatul', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/Last Name - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/Last Name - Field'), 'muslikah', 0)

Mobile.clearText(findTestObject('Application/SauceDemo/Checkout/ZipPostal Code - Field'), 0)

Mobile.setText(findTestObject('Application/SauceDemo/Checkout/ZipPostal Code - Field'), '1234', 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Continue Checkout - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Checkout Overview - Assertion'), 'CHECKOUT: OVERVIEW')

Mobile.scrollToText('finish', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Finish - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/CHECKOUT COMPLETE'), 'CHECKOUT: COMPLETE!')

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Thankyou - Assertion finish order'), 'THANK YOU FOR YOU ORDER')

//Verify user can back to dashboard after make a payment

Mobile.scrollToText('BACK HOME', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Back Home - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Products - Assertion Continue Shopping'), 'PRODUCTS')

