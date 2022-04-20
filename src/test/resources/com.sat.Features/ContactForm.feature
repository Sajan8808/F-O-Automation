@CustomerEntitiesForm
Feature: Testing for Contact Form in Tenancy Management

#@ContactsForm
  Scenario Outline: TC28278_C8798-Validation of Contact Form
    Given User navigates to CRM login page
    When user selects App "<App_Name>"
    Then user is navigated to "Tier 1 Dashboard - Dynamics 365" page
    When user click on "<Tab>" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "<Options>" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then verify all tabs are appearing on the Contact Form
      | Summary | Correspondence | Data Protection | Tenancies | Rent Accounts | Conflicts Tab | Related |
    When click on "Summary" tab
    Then verify all section under tab
      | Summary | GENERAL INFORMATION | TIMELINE | Flags |
   	And verify Locked and unlocked fields under section
   	|GENERAL INFORMATION |Password | Legal Tenancy Name | Title | First Name | Middle Name | Last Name | Date of Birth | Age | Gender | Relationship | Person Reference | Account | Household Group Association | Effective From | Home Phone | Work Phone | National Insurance Number | Contact Preferences | Preferred Language | Special Communication Requirement | Authority | Status | Lead Source | Contact Type | Email | Mobile Phone | Mobile Phone 2 | Email Address 1 | Address 2 | Mortgage Offer Approved | Mortgage Offer Expiry | Marital Status|
    #And verify Unlocked fields under GENERAL INFORMATION section
    #Then verify filter options on the timeline
    When click on "Correspondence" tab
    #Then verify all section under tab
      #| Correspondence | MAIN ADDRESS | CORRESPONDENCE ADDRESS | EMERGENCY CONTACTS | AUTHORITY TO DISCUSS THESE ACCOUNTS |
    #Then click on New Emergency Contact
    #And user click on save and close button
    Then click on New Contact
    #And user click on save button
    And user click on save and close button
    When click on "Data Protection" tab
    And verify all section "DATA PROTECTION DETAILS" under Data Protection tab
    And click on New Data Protection link
    Then verify all section under tab
      | General | CUSTOMER INFORMATION | DATA PROTECTION QUESTIONS | ACCOUNT INFORMATION |
    And user click on save button
    And user click on save and close button
    When click on "Tenancies" tab
    Then user open "Miss J Shepherd" Form
    And user click on save button
    And user click on save and close button
    When click on "Rent Accounts" tab
    Then user open "Flat- Flat 25 Odiham Drive, Newbury ,RG14 1GA" Form
    And user click on save button
    And user click on save and close button
    When click on "Conflicts Tab" tab
    When click on "Related" tab
    #Then user upload document
    
  #@BlocksForm
    When user click on "Blocks" under customer
    Then user is navigated to "Blocks Active Blocks - Dynamics 365" page
    And user click on Drop Down List
    And user select "Active Blocks" from drop down list
    When user search "100012, Block Flat 34/Flat 36 Hoopers Walk, Longwell Green, Bristol, BS30 9DZ" and cick on contact name link
    Then verify all tabs are appearing on the "Block Form" Form
      | General | Assets | Repair Cases | Related |
    When click on "General" tab
    Then verify all section under tab
      | General | Main Address | Timeline |
    When click on "Assets" tab
     Then user open "154967, 34 Hoopers Walk, Longwell Green, Bristol, BS30 9DZ" Form
      And user click on Back button
       When click on "Repair Cases" tab
    When click on "Related" tab
    
  #@SchemesForm   
     When user click on "Schemes" under customer
    Then user is navigated to "Schemes Active Scheme's - Dynamics 365" page
    And user click on Drop Down List
    And user select "Default" from drop down list
    When user search "159172, Scheme Bints Place, Northmoor, Witney, Oxfordshire, OX29 5TF" and cick on contact name link
    Then verify all tabs are appearing on the "Scheme Form" Form
      | General | Blocks | Assets | Repair Cases | Related |
    When click on "General" tab
    Then verify all section under tab
      | General | Main Address | Timeline |
      When click on "Blocks" tab
       When click on "Assets" tab
       When click on "Repair Cases" tab
    When click on "Related" tab
    
    
    Examples: 
      | App_Name             | Tab      | Options      | 
      | Customer Service Hub | Contacts | All Contacts | 
