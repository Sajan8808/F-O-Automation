@CustomerEntitiesForm
Feature: Testing for Customer Entities Form in Tenancy Management
# @BlocksForm
 
  #Scenario: TC28281_C8800-Validation of Blocks Form
    #Given User navigates to CRM login page
    #When user selects App "Customer Service Hub"
    #Then user is navigated to "Tier 1 Dashboard - Dynamics 365" page
    #When user click on "Blocks" under customer
    #Then user is navigated to "Blocks Active Blocks - Dynamics 365" page
    #And user click on Drop Down List
    #And user select "Active Blocks" from drop down list
    #When user search "100012, Block Flat 34/Flat 36 Hoopers Walk, Longwell Green, Bristol, BS30 9DZ" and cick on contact name link
    #Then verify all tabs are appearing on the "Block Form" Form
      #| General | Assets | Repair Cases | Related |
    #When click on "General" tab
    #Then verify all section under tab
      #| General | Main Address | Timeline |
    #When click on "Assets" tab
    #Then verify link for Account Name and Household Group
    #Then user open "154967, 34 Hoopers Walk, Longwell Green, Bristol, BS30 9DZ" Form
    #Then verify all tabs are appearing on the "Account Form" Form
    #| Summary | Asset Information | Tenancy Information | Repair Cases |Rent Account| Related |
    #And user click on Back button
    #When click on "Summary" tab
    #Then verify all section under tab
    #| Summary |ACCOUNT INFORMATION|ASSET INFORMATION  | MAIN ADDRESS | CORRESPONDENCE ADDRESS | TIMELINE |
    #When click on "Repair Cases" tab
    #When click on "Related" tab

  #Then user upload document
  
  #@SchemeForm
  #Scenario: TC28367_C8800 -Validation of Scheme Form
    #Given User navigates to CRM login page
    #When user selects App "Customer Service Hub"
    #Then user is navigated to "Tier 1 Dashboard - Dynamics 365" page
    #When user click on "Schemes" under customer
    #Then user is navigated to "Schemes Active Scheme's - Dynamics 365" page
    #And user click on Drop Down List
    #And user select "Default" from drop down list
    #When user search "159172, Scheme Bints Place, Northmoor, Witney, Oxfordshire, OX29 5TF" and cick on contact name link
    #Then verify all tabs are appearing on the "Scheme Form" Form
      #| General | Blocks | Assets | Repair Cases | Related |
    #When click on "General" tab
    #Then verify all section under tab
      #| General | Main Address | Timeline |
      #When click on "Blocks" tab
       #When click on "Assets" tab
       #When click on "Repair Cases" tab
    #When click on "Related" tab

  #Then user upload document
  
  @HouseholdGroupForm
  Scenario: TC28279_C11542 -Validation of Household Group  Form
    Given User navigates to CRM login page
    When user selects App "Customer Service Hub"
    Then user is navigated to "Tier 1 Dashboard - Dynamics 365" page
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then user Scroll down to Account field and click on the address hyperlink 
   Then user is navigated to "Account:SHA Tenancy Management Account Form" page
     Then verify all tabs are appearing on the "Account Form" Form
      | Summary | Household Group Information | SMS Contact Information | SMS Tenancy Information | SMS Asset Information | Related |
    Then verify all section under tab
      | Summary | ACCOUNT INFORMATION | TIMELINE | Flags | MAIN ADDRESS | CORRESPONDENCE ADDRESS |
#    And verify Locked fields under GENERAL INFORMATION section
    And verify Unlocked fields under GENERAL INFORMATION section
    When click on "Household Group Information" tab
    Then verify all section under tab
      | Household Group Information | HOUSEHOLD GROUP DETAILS | HOUSEHOLD GROUP CONTACTS | ASSETS |
    Then click on New Contact
    And user click on save button
    And user click on save and close button
#    Then click on New Account
    And user click on save button
    And user click on save button
    When click on "SMS Contact Information" tab
    When click on "SMS Tenancy Information" tab
    When click on "SMS Asset Information" tab
    When click on "Related" tab

  #Then user upload document
  @AssetForm
  Scenario: TC28280_C8799 -Validation of Asset Form
    Given User navigates to CRM login page
    When user selects App "Customer Service Hub"
    Then user is navigated to "Tier 1 Dashboard - Dynamics 365" page
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being Followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "Assets" from drop down list
    When user search "93960, 23 Odiham Drive, Speen, Newbury, Berkshire, RG14 1GA" and cick on contact name link
    Then verify all tabs are appearing on the "Account Form" Form
    | Summary | Asset Information | Tenancy Information | Repair Cases |Rent Account| Related |
    When click on "Summary" tab
    Then verify all section under tab
    | Summary |ACCOUNT INFORMATION|ASSET INFORMATION  | MAIN ADDRESS | CORRESPONDENCE ADDRESS | TIMELINE |
    When click on "Asset Information" tab
    Then verify all section under tab
    | Asset Information | ASSET DETAILS | ASSET ADDRESS |Rent Account|
    When click on "Tenancy Information" tab
    When click on "Repair Cases" tab
    When click on "Rent Account" tab
    When click on "Related" tab
