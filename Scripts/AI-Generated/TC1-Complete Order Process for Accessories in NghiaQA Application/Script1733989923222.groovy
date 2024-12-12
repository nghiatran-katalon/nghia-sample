import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on accessoriesMenuLink -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/accessoriesMenuLink'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on accessoriesMenuLink - Navigate to page category pagecategory.png')

"Step 3: Click on addToCartButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/addToCartButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on addToCartButton.png')

"Step 4: Click on placeOrderButton -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/placeOrderButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on placeOrderButton - Navigate to page cart pagecart.png')

"Step 5: Click on incrementButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/incrementButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on incrementButton.png')

"Step 6: Click on proceedToCheckoutButton -> Navigate to page 'checkout page#checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/proceedToCheckoutButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on proceedToCheckoutButton - Navigate to page checkout pagecheckoutinfo.png')

"Step 7: Click on emailInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/emailInputField'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on emailInputField.png')

"Step 8: Enter input value in emailInputField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/emailInputField'), emailInputField2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Enter input value in emailInputField2.png')

"Step 9: Click on continueToShippingButton -> Navigate to page 'checkout page#checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/continueToShippingButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on continueToShippingButton - Navigate to page checkout pagecheckoutshipping-address.png')

"Step 10: Click on firstNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/firstNameInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on firstNameInput.png')

"Step 11: Enter input value in firstNameInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/firstNameInput'), firstNameInput2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Enter input value in firstNameInput2.png')

"Step 12: Enter input value in lastNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/lastNameInput'), lastNameInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Enter input value in lastNameInput.png')

"Step 13: Enter input value in addressInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/addressInputField'), addressInputField)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Enter input value in addressInputField.png')

"Step 14: Enter input value in zipCodeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/zipCodeInput'), zipCodeInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Enter input value in zipCodeInput.png')

"Step 15: Enter input value in cityInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/cityInputField'), cityInputField)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Enter input value in cityInputField.png')

"Step 16: Enter input value in stateInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/stateInputField'), stateInputField)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Enter input value in stateInputField.png')

"Step 17: Click on continueToPaymentButton -> Navigate to page 'checkout page#checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/continueToPaymentButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on continueToPaymentButton - Navigate to page checkout pagecheckoutpayment.png')

"Step 18: Click on completeOrderButton -> Navigate to page 'thank you page#thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/completeOrderButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on completeOrderButton - Navigate to page thank you pagethank-you.png')

"Step 19: Click on kCellphoneShopLogo -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_thank_you/kCellphoneShopLogo'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on kCellphoneShopLogo - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Order Process for Accessories in NghiaQA Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}