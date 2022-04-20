@AutoRouting
Feature: Task Allocation: Validation of Tasks Auto Routing of Category

  @TC28926_TC28927_TC28930_TC28931_TC28933_TC29005_TC29006
  Scenario: TC28926 -Task Allocation: Validation of Tasks Auto Routing of Category = Sales and Marketing
    Given User navigates to CRM login page
    When user selects App "Customer Service Hub"
    Then user is navigated to "Tier 1 Dashboard - Dynamics 365" page
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Sales and Marketing" and Sub Category "Sales and Marketing"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    # When user select a queue filter "<Sovereign Sales>"
    Then user selects "Entered Queue" as "Sort newer to older"
    # When user filters "Type" as "Filter by" with "Task"
    Then user click on refresh button
    And select task with contact "Jerrilee Shepherd"
    Then verify the task is routed to "Sovereign Living"
    And click on Vertical symbol of Queues and select "Queue Item Details"
    Then Verify details in the Queue
      | General | Related | Queue | Worked By | Entered Queue | Modified On |
    And click on queue and validate details in the queue
      | <Sovereign Sales> | SUMMARY | QUEUE ITEMS | EMAIL SETTINGS | MEMBERS | RECORD CREATION AND UPDATE RULES |
    Then user click on Back button
    #Scenario: TC28927- Task Allocation: Validation of Tasks Auto Routing Category = Home Ownership
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Home Ownership" and Sub Category "Resales"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "Jerrilee Shepherd"
    Then verify the task is routed to "Resales"
    And click on Vertical symbol of Queues and select "Queue Item Details"
    Then Verify details in the Queue
      | General | Related | Queue | Worked By | Entered Queue | Modified On |
    And click on queue and validate details in the queue
      | <Resales> | SUMMARY | QUEUE ITEMS | EMAIL SETTINGS | MEMBERS | RECORD CREATION AND UPDATE RULES |
    Then user click on Back button
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Home Ownership" and Sub Category "Resales & Staircasing Consultants"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "Jerrilee Shepherd"
    # Failed - Then verify the task is routed to "Right to Buy"
    Then verify the task is routed to "Resales"
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Home Ownership" and Sub Category "Staircasing"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "Jerrilee Shepherd"
    Then verify the task is routed to "Staircasing"
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Home Ownership" and Sub Category "Home Ownership"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "Jerrilee Shepherd"
    Then verify the task is routed to "Home Ownership"
    #TC28930- Task Allocation: Validation of Tasks Auto Routing of Category = "Customer Contact"
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Customer Contact" and Sub Category "Customer Contact Admin"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "Jerrilee Shepherd"
    Then verify the task is routed to "Customer Contact Admin"
    And click on Vertical symbol of Queues and select "Queue Item Details"
    Then Verify details in the Queue
      | General | Related | Queue | Worked By | Entered Queue | Modified On |
    And click on queue and validate details in the queue
      | <Customer Contact Admin> | SUMMARY | QUEUE ITEMS | EMAIL SETTINGS | MEMBERS | RECORD CREATION AND UPDATE RULES |
    #TC28931- Task Allocation: Validation of Tasks Auto Routing Category = Market Rent
    Then user click on Back button
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Market Rent" and Sub Category "Market Rent"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "Jerrilee Shepherd"
    Then verify the task is routed to "Market Rent"
    And click on Vertical symbol of Queues and select "Queue Item Details"
    Then Verify details in the Queue
      | General | Related | Queue | Worked By | Entered Queue | Modified On |
    And click on queue and validate details in the queue
      | <Market Rent> | SUMMARY | QUEUE ITEMS | EMAIL SETTINGS | MEMBERS | RECORD CREATION AND UPDATE RULES |
    #TC28933-Task Allocation: Validation of Task Auto Routing of Category = "Out Of Hours"
    Then user click on Back button
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Out Of Hours" and Sub Category "Out of Hours / Care Alarm"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "Jerrilee Shepherd"
    Then verify the task is routed to "Out Of Hours"
    And click on Vertical symbol of Queues and select "Queue Item Details"
    Then Verify details in the Queue
      | General | Related | Queue | Worked By | Entered Queue | Modified On |
    And click on queue and validate details in the queue
      | <Out Of Hours> | SUMMARY | QUEUE ITEMS | EMAIL SETTINGS | MEMBERS | RECORD CREATION AND UPDATE RULES |
    #TC29005-Task Allocation: Validation of Tasks Auto routing of Category = Income & Sub Category = Rent Card
    Then user click on Back button
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "Rent Card"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "Jerrilee Shepherd"
    Then verify the task is routed to "Customer Contact Admin"
    #TC29006-Task Allocation: Validation of Tasks Auto routing of Category = Income & Sub Category = Rent Statement
    Then user click on Back button
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "Rent Statement"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "Jerrilee Shepherd"
    Then verify the task is routed to "Customer Contact Admin"

  @TC28983_TC28993_TC32173
  Scenario Outline: <TCID>: Task Allocation: Validation of Tasks Auto routing of Category = Income & Sub Category = <Sub Category>
    Given User navigates to CRM login page
    When user selects App "Customer Service Hub"
    Then user is navigated to "Tier 1 Dashboard - Dynamics 365" page
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "100197, Flat 19 Whatcombe House Kingman Way, Newbury, Berkshire, RG14 7GQ" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "100197, Flat 19 Whatcombe House Kingman Way, Newbury,"
    Then verify the task is routed to "Berkshire Income"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "14 Wheat Close, Bentley, Farnham, Hampshire, GU10 5DS" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "14 Wheat Close,"
    Then verify the task is routed to "Hampshire Income"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "100083, 4 Snowdrop Drive, Didcot, Oxfordshire, OX11 6GW" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "100083, 4 Snowdrop Drive, Didcot,"
    Then verify the task is routed to "Oxford shire Income"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "100007, Flat 16 Hoopers Walk, Longwell Green, Bristol, BS30 9DZ" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "100007, Flat 16 Hoopers Walk"
    Then verify the task is routed to "West of England Income"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "35593, Swindon Area Office," and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "35593,"
    Then verify the task is routed to "West of England Income"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "1183, 1 Bourne View Ludgershall Road, Tidworth, Wiltshire, SP9 7NJ" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "1183, 1 Bourne View Ludgershall Road"
    Then verify the task is routed to "Blandford Income"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "11032, North Devon, Local Authority," and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "11032,"
    Then verify the task is routed to "Devon Income"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "154983, Flat 134 Myrtlebury Way, Exeter, Devon, EX1 3WX" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "154983, Flat 134 Myrtlebury Way,"
    Then verify the task is routed to "Devon Income"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "10020, 12 Chestnut Way, Burton, Christchurch, BH23 7LL" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "10020, 12 Chestnut Way"
    Then verify the task is routed to "Christchurch Income"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "31 Burton Road, Christchurch, Dorset, BH23 3AA" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "31 Burton Road"
    Then verify the task is routed to "Christchurch Income"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "14905, Shg Offices & Depots, Poole, Dorset," and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "14905, Shg Offices & Depots,"
    Then verify the task is routed to "Christchurch Income"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "11021, Eastleigh Local Authority" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "11021,"
    Then verify the task is routed to "IOW & Hythe Income"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "10033, *Disposed* 17 Woodbine Close, Newport, Isle Of Wight, PO30 1AF" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "10033,"
    Then verify the task is routed to "IOW & Hythe Income"

    Examples: 
      | TCID    | Sub Category           |
      | TC28983 | Account                |
      | TC28993 | Arrangement            |
      | TC32173 | Benefit Advice/Support |

  @TC29004
  Scenario Outline: <TCID>: Task Allocation: Validation of Tasks Auto routing of Category = Income & Sub Category = <Sub Category>
    Given User navigates to CRM login page
    When user selects App "Customer Service Hub"
    Then user is navigated to "Tier 1 Dashboard - Dynamics 365" page
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "100197, Flat 19 Whatcombe House Kingman Way, Newbury, Berkshire, RG14 7GQ" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "100197, Flat 19 Whatcombe House Kingman Way, Newbury,"
    Then verify the task is routed to "Rents Team Newbury"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "1183, 1 Bourne View Ludgershall Road, Tidworth, Wiltshire, SP9 7NJ" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "1183, 1 Bourne View Ludgershall Road"
    Then verify the task is routed to "Blandford Income"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "11032, North Devon, Local Authority," and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "11032,"
    Then verify the task is routed to "Devon Income"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "154983, Flat 134 Myrtlebury Way, Exeter, Devon, EX1 3WX" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "154983, Flat 134 Myrtlebury Way,"
    Then verify the task is routed to "Devon Income"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "10020, 12 Chestnut Way, Burton, Christchurch, BH23 7LL" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "10020, 12 Chestnut Way"
    Then verify the task is routed to "Christchurch Income"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "31 Burton Road, Christchurch, Dorset, BH23 3AA" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "31 Burton Road"
    Then verify the task is routed to "Christchurch Income"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "14905, Shg Offices & Depots, Poole, Dorset," and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "14905, Shg Offices & Depots,"
    Then verify the task is routed to "Christchurch Income"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "11021, Eastleigh Local Authority" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "11021,"
    Then verify the task is routed to "IOW & Hythe Income"
    When user click on "Accounts" under customer
    Then user is navigated to "Accounts Accounts Being followed - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Accounts" from drop down list
    When user search "10033, *Disposed* 17 Woodbine Close, Newport, Isle Of Wight, PO30 1AF" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Income" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "10033,"
    Then verify the task is routed to "IOW & Hythe Income"

    Examples: 
      | TCID    | Sub Category |
      | TC29004 | Direct Debit |

  @TC29019_TC29021_TC29022_TC29506_TC29034_TC29035_TC29036_TC29037
  Scenario Outline: "<TCID>" -Task Allocation: Validation of Tasks Auto routing of Category = <Category> & Sub Category = <Sub Category>
    Given User navigates to CRM login page
    When user selects App "Customer Service Hub"
    Then user is navigated to "Tier 1 Dashboard - Dynamics 365" page
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "<Contact1>" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "<Category>" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "<Contact1>"
    Then verify the task is routed to "<Route1>"
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "<Contact2>" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "<Category>" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "<Contact2>"
    Then verify the task is routed to "<Route2>"
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "<Contact3>" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "<Category>" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "<Contact3>"
    Then verify the task is routed to "<Route3>"

    Examples: 
      | TCID    | Category           | Sub Category              | Contact1     | Contact2         | Contact3    | Route1                                     | Route2                                     | Route3                                      |
      | TC29019 | Housing Management | Housing                   | Julie Utting | Amanda Batchelor | Liam Donald | East Housing Advice and Resolution Service | West Housing Advice and Resolution Service | South Housing Advice and Resolution Service |
      | TC29021 | Housing Management | Safeguarding              | Julie Utting | Amanda Batchelor | Liam Donald | East Safeguarding                          | West Safeguarding                          | South Safeguarding                          |
      | TC29022 | Housing Management | Anti-Social Behaviour     | Julie Utting | Amanda Batchelor | Liam Donald | Housing Advice and Resolution Service      | West Housing Advice and Resolution Service | South Housing Advice and Resolution Service |
      | TC29506 | Housing Management | Housing Intervention Team | Julie Utting | Amanda Batchelor | Liam Donald | Housing Intervention Team                  | Housing Intervention Team                  | Housing Intervention Team                   |
      | TC29034 | Lettings           | Decant                    | Julie Utting | Amanda Batchelor | Liam Donald | East Lettings                              | West Lettings                              | South Lettings                              |
      | TC29035 | Lettings           | Garages                   | Julie Utting | Amanda Batchelor | Liam Donald | East Garages                               | West Garages                               | South Garages                               |
      | TC29036 | Lettings           | Lettings Query            | Julie Utting | Amanda Batchelor | Liam Donald | East Lettings                              | West Lettings                              | South Garages                               |
      | TC29037 | Lettings           | Mutual Exchange           | Julie Utting | Amanda Batchelor | Liam Donald | East Mutual Exchange                       | West Mutual Exchange                       | South Mutual Exchange                       |

  @TC29020
  Scenario: TC29020 -Task Allocation: Validation of Tasks Auto routing of Category = Housing Management & Sub Category = Supported
    Given User navigates to CRM login page
    When user selects App "Customer Service Hub"
    Then user is navigated to "Tier 1 Dashboard - Dynamics 365" page
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Julie Utting" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Housing Management" and Sub Category "Supported"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "Julie Utting"
    Then verify the task is routed to "Supported Housing Response"

  @TC32174_TC32175_TC32176
  Scenario Outline: "<TCID>" -Task Allocation: Validation of Tasks Auto routing of Category = <Category> & Sub Category = <Sub Category>
    Given User navigates to CRM login page
    When user selects App "Customer Service Hub"
    Then user is navigated to "Tier 1 Dashboard - Dynamics 365" page
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "<Contact>" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "<Category>" and Sub Category "<Sub Category>"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "<Contact>"
    Then verify the task is routed to "<Route>"

    Examples: 
      | TCID    | Category | Sub Category            | Contact           | Route                   |
      | TC32174 | Income   | Former Tenant Arears    | Julie Utting      | Former Tenant Arears    |
      | TC32175 | Income   | Garage                  | Liam Donald       | Income team             |
      | TC32175 | Income   | Admin                   | Liam Donald       | Income Admin team       |
      | TC32175 | Income   | Refunds                 | Liam Donald       | Income Admin team       |
      | TC32176 | Income   | Tenancy Support Advisor | Jerrilee Shepherd | Tenancy Support Advisor |

  @TC29056
  Scenario: TC29056 -Task Allocation: Validation of Tasks Auto routing of Category = Finance
    Given User navigates to CRM login page
    When user selects App "Customer Service Hub"
    Then user is navigated to "Tier 1 Dashboard - Dynamics 365" page
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Finance" and Sub Category "Service Charge"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "Jerrilee Shepherd"
    Then verify the task is routed to "Service Charges"
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Finance" and Sub Category "Missing Payments"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "Jerrilee Shepherd"
    Then verify the task is routed to "Rents Team Christchurch"
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Finance" and Sub Category "Former Tenant Arrears"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "Jerrilee Shepherd"
    Then verify the task is routed to "Former Tenant Arrears"
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Finance" and Sub Category "Recharges"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "Jerrilee Shepherd"
    Then verify the task is routed to "Account Receivable"

  @TC29063
  Scenario: TC29063 -Task Allocation: Validation of Tasks Auto routing of Category = Compliants
    Given User navigates to CRM login page
    When user selects App "Customer Service Hub"
    Then user is navigated to "Tier 1 Dashboard - Dynamics 365" page
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Compliants" and Sub Category "New Compliant"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "Jerrilee Shepherd"
    Then verify the task is routed to "Resolutions"
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Compliants" and Sub Category "Existing Compliant"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "Jerrilee Shepherd"
    Then verify the task is routed to "Resolutions"

  @TC29064
  Scenario: TC29064 -Task Allocation: Validation of Tasks Auto routing of Category = Other Departments
    Given User navigates to CRM login page
    When user selects App "Customer Service Hub"
    Then user is navigated to "Tier 1 Dashboard - Dynamics 365" page
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Other Departments" and Sub Category "Query"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "Jerrilee Shepherd"
    Then verify the task is routed to "Customer Contact Admin"
    When user click on "Contacts" under customer
    Then user is navigated to "Contacts My Active Contacts - Dynamics 365" page
    And user click on Drop Down List
    And user select "All Contacts" from drop down list
    When user search "Jerrilee Shepherd" and cick on contact name link
    Then user click on Create Time line and select "Task"
    And select Task category "Other Departments" and Sub Category "Accident Report Line"
    Then user enter description
    And user click on save and close button
    Then User stores the current date and time "Asia/Kolkata"
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    Then user selects "Entered Queue" as "Sort newer to older"
    Then user click on refresh button
    And select task with contact "Jerrilee Shepherd"
    Then verify the task is routed to "Customer Contact Admin"

  Scenario: TC28301 - C10714-Validation of Tasks - Reassign
    Given User navigates to CRM login page
    When user selects App "Customer Service Hub"
    Then user is navigated to "Tier 1 Dashboard - Dynamics 365" page
    Then user click on "Queues" under Service
    And user click on Drop Down List
    And user select "All Items" from drop down list
    Then user click on refresh button
    When user select a queue filter "<Sovereign Sales>"
    And select task with contact "Jerrilee Shepherd"
    Then verify the task is routed to "Sovereign Living"
    And click on Vertical symbol of Queues and select "Queue Item Details"
    Then user selects "Entered Queue" as "Sort newer to older"
    When user filters "Type" as "Filter By" with "Task"
