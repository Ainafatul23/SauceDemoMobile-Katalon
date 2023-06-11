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

// Verify user can add product to cart
Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Sauce Labs Backpack'), 0)

Mobile.scrollToText('Add To Cart')

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Add To Cart - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Remove - Assert Add 1'), 'REMOVE')

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Add Number Cart - Assert add 2'), '1')

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Back to Products - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Remove - Assert Add Dash 3'), 'REMOVE')

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Cart - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/cart - Sauce Labs Backpack'), 'Sauce Labs Backpack')

Mobile.scrollToText('CONTINUE SHOPPING', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Continue Shopping - Button'), 0)

//Verify user can remove product after add product to cart
Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Sauce Labs Backpack'), 0)

Mobile.scrollToText('REMOVE', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Remove - Assert Add 1'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/Card - ADD TO CART'), 'ADD TO CART')

Mobile.verifyElementNotExist(findTestObject('Application/SauceDemo/Checkout/Remove - Assert Add 1'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Cart - Button'), 0)

Mobile.verifyElementNotExist(findTestObject('Application/SauceDemo/Checkout/cart - Sauce Labs Backpack'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Continue Shopping - Button'), 0)

//Verify user can Remove product on cart
Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Sauce Labs Backpack'), 0)

Mobile.scrollToText('Add To Cart')

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Add To Cart - Button'), 0)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Cart - Button'), 0)

Mobile.verifyElementText(findTestObject('Application/SauceDemo/Checkout/cart - Sauce Labs Backpack'), 'Sauce Labs Backpack')

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Remove Backpack - Button'), 0)

Mobile.verifyElementNotExist(findTestObject('Application/SauceDemo/Checkout/cart - Sauce Labs Backpack'), 0)

Mobile.scrollToText('CONTINUE SHOPPING', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/SauceDemo/Checkout/Continue Shopping - Button'), 0)

