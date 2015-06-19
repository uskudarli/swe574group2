# Requirements #
This page presents requirements about the project of swe574 group 2.

## Quick Links ##


## Home Page ##

  1. Users must register in order to login the system, new users can use register link and fill necessary form to register. User whom forgets his password can use “forgotten password” link in order to retrieve his password.
  1. There should be a table called “Recent Services” which shows most recent service exchanges between service providers and service users. Recent services should contains, the service name, place time, unit and service provider and service user.
  1. There should be a table that introduces active users, new users and volunteer admins. Active Users tab should contain basic view of user profile since page can be viewed by public without login to the system. Basic view should contains, user’s name, tags, recent offers and recent requests.  New users tab should contain newly joined members with basic profile. If the new user has offers and request, those should be in the basic profile.
  1. There should be one tag cloud per offers and one tag cloud per requests since both have different demand rates. Popular tags should have bigger fonts.

## Create Offer Screen ##
  1. The **Create Offer Screen** should have a container which has tools like text boxes, check boxes and menus enabling a user to define the specifics about the offer.
  1. There should be text box labeled as **Title** which can be used by the user to set the title of the offer.
    1. The title text box should allow at most 80 characters.
    1. The title text box must be non-empty in order for a new order to be created.
  1. A text box labeled as **Tags** should be present in the container which should include a comma separated list of tags relevant to the user's offer.
    1. The user must enter at least one tag to be able to create the offer.
    1. The user may enter at most 5 tags.
    1. The tags text box should have auto-complete function to enable the user to select from previously entered tags.
    1. Each tag should have a button next to it, on the right hand side, which may be used to remove the tag before the offer is created.
  1. There should be text box labeled as **Description** to provide additional information about the user's offer.
    1. Entering text into the description text box is not mandatory for the creation of a new offer.
    1. The description text box must allow at most 200 characters.
  1. A region designated as **Limitations** should be included in the main container. The **Limitations** region should contain the necessary tools to set the details of the offer.. The options should be **Multiple Attendees**, **Requires Attendance**, **Place**, **Valid Until** and **Total Hours Per Week**.
    1. There should be a checkbox labeled as **Multiple Attendees** and should be unchecked by default. The numeric stepper should be disabled and set to one by default. Checking the multiple attendees checkbox should enable the numeric stepper. This tool may be used to set if the offers allow multiple attendees and number of maximum attendees allowed for the offer.
    1. The **Requires Attendance** checkbox should be selected by default. This button should enable the user to select if the service needs to be performed in the presence of the associate.
    1. The **Place** checkbox should be checked by default. Next to it, there should be a map view. The map view should be zoomed into the user's current location if they have allowed location sharing. If location sharing has not been enabled, to map should be zoomed out to show display user's city fully. The map view should enable to user to select a region in which they are willing to provide the service.
    1. Next to the **Valid Until** there should be a checkbox which may be used to enable the data selector next to it. This checkbox should be deselected by default.
    1. There should be a heading titled **Total Hours Per Week**. Next to it there should be a numeric stepper. This numeric stepper may be used to set the amount of hours the offerer is willing to perform the services per week.
  1. There should be region designated as "Availability". The tools in this region may be used to provide the desired schedule of the offerer.
    1. The radio buttons in this region should be labeled as **Flexible** and **Only During**. They should enable the user to set a specific time period for the service, if desired. The **Flexible** radio button should be selected by default.
      1. Below the **Only During** radio button, there should be checkboxes and comboboxes to be used for data selection. They should be enabled only when the **Only During** radio button is selected.
      1. There should be checkboxes below a header titled **Days**.The checkboxes should be labeled as **Monday**, **Tuesday**, **Wednesday**, **Thursday**, **Friday**, **Saturday** and **Sunday**. All of them should be unchecked by default.
      1. Checking each of this checkboxes should make two formatted numeric steppers visible. These numeric steppers may be used to set the times of day during which the service may be provided.
      1. If the **Only During** radio button is selected, there should be a **Hours Allocation** label to display the total hours of the service which have been allocated.
  1. The container should have a header title **Photos**.
    1. Next to the header there should be a checkbox. This checkbox should be deselected by default.
    1. Next to the checkbox there should be a button titled **Upload**. The button should be enable only when the checkbox is selected.
    1. The **Upload** button should enable a user to upload descriptive photos of the service.
    1. Adding photos should be optional.
    1. At most 3 photos should be allowed.
  1. There should be a numeric stepper next to a heading titled **Units**. The creator will enter how much credits he wants for this offer. He will also be informed that he cannot change this amount after he creates this offer.
  1. Below the container there should be three buttons labeled as **Create**, **Discard** and **Save as Draft**.
    1. The **Create** button should save the request in the database and publish it as a new service.
    1. The **Discard** button should discard all the changes and should navigate the user the their profile page, after a dialogue box confirmation is made.
    1. The **Save as Draft** button should save the request in the database without publishing it.
  1. There should be a sidebar to contain user's **Service History**, **Recent Offers** and **Recent Requests**. In the sidebar, te user will see his last 5 offers, last 5 requests, last 5 handshakes.
    1. The **Service History** table should display the services the user has participated. The table should display the **Title**, **Your Role**, **Associate** and **Units** headings to signify service's title, user's role in the services, user's counterpart in the service and the amount of units exchanged in the service, respectively.
    1. He can navigate to see his all offers, requests and handshakes by clicking _see all_ link below them.

## Update Offer Page ##
  1. this page will be used to update offer info.
  1. This page will have same properties similar to create offer page.
  1. User will not be able to change units for this offer.

## Offer Detail Page ##
  1. this page will present all info about offer.
  1. Offer creator info will be visible.
    1. Image
    1. name surname
    1. unit balance
    1. Age
    1. Reputation
  1. Users can navigate to the profile of creator by clicking on his name.
  1. Offer details will be presented.
    1. Offer name
    1. description
    1. credits wanted
    1. tags
  1. Applicants will be listed.
    1. Applicant name surname
    1. credit balance
    1. reputation
  1. users can navigate to profile of applicant by clicking on his name.
  1. Comments for this offer will be listed.
    1. commentor name surname
    1. commenter reputation
    1. commenter comment
    1. commenter comment of time
  1. users can navigate to profile of commenters profile by clicking on his name.
  1. Users will be able to comment under this offer by using a text area.
  1. Max 1000 chars can be entered in 1 comment.
  1. There will be a button to for users to apply bunder this offer.
  1. There will be a button for the creator of this offer to accept a application.
  1. after an application is accepted, no other people can apply under this offer.
  1. after an application is accepted, the accepted application will be highlighed in the page and other users will understand that that user has taken this service.
  1. After a application is accepted, the **complete offer** button will be visible to owner.
    1. by clicking this button, he accepts that the applicant has completed his task.
    1. After click, this offer will not be visible as an offer. It is now a handshake.
    1. After click, the credit balance will be edited for both of the users.
    1. After click, user will be redirected to his handshakes page.
  1. After a application is accepted **cancel application** button will be visible to owner.
    1. if user clicks on this button, application will be canceled.
    1. after click, others can continue to application on this offer.


## Create Request Page ##
  1. This page will be used to create new requests.
  1. There should be text box labeled as **Title** which can be used by the user to set the title of the request.
    1. The title text box should allow at most 80 characters.
    1. The title text box must be non-empty in order for a new order to be created.
  1. A text box labeled as **Tags** should be present in the container which should include a comma separated list of tags relevant to the user's request.
    1. The user must enter at least one tag to be able to create the request.
    1. The user may enter at most 5 tags.
    1. The tags text box should have auto-complete function to enable the user to select from previously entered tags.
    1. Each tag should have a button next to it, on the right hand side, which may be used to remove the tag before the request is created.
  1. There should be text box labeled as **Description** to provide additional information about the user's request
    1. Entering text into the description text box is not mandatory for the creation of a new request.
    1. The description text box must allow at most 200 characters.
  1. A region designated as **Limitations** should be included in the main container. The **Limitations** region should contain the necessary tools to set the details of the request. The options should be **Multiple Attendees**, **Requires Attendance**, **Place**, **Valid Until** and **Total Hours Per Week**.
    1. There should be a checkbox labeled as **Multiple Attendees** and should be unchecked by default. The numeric stepper should be disabled and set to one by default. Checking the multiple attendees checkbox should enable the numeric stepper. This tool may be used to set if the request allows multiple attendees and define the number of maximum attendees allowed for the request.
    1. The **Requires Attendance** checkbox should be selected by default. This button should enable the user to select if the service needs to be performed in the presence of the associate.
    1. The **Place** checkbox should be checked by default. Next to it, there should be a map view. The map view should be zoomed into the user's current location if they have allowed location sharing. If location sharing has not been enabled, to map should be zoomed out to show display user's city fully. The map view should enable to user to select a region in which they are willing to procure the service.
    1. Next to the **Valid Until** there should be a checkbox which may be used to enable the data selector next to it. This checkbox should be deselected by default.
    1. There should be a heading titled **Total Hours Per Week**. Next to it there should be a numeric stepper. This numeric stepper may be used to set the amount of hours the request is willing to utilize the service per week.
  1. There should be region designated as **Availability**. The tools in this region may be used to provide the desired schedule of the requester.
    1. The radio buttons in this region should be labeled as **Flexible** and **Only During**. They should enable the user to set a specific time period for the service, if desired. The **Flexible** radio button should be selected by default.
      1. Below the **Only During** radio button, there should be checkboxes and comboboxes to be used for data selection. They should be enabled only when the **Only During** radio button is selected.
      1. There should be checkboxes below a header titled **Days**.The checkboxes should be labeled as **Monday**, **Tuesday**, **Wednesday**, **Thursday**, **Friday**, **Saturday** and **Sunday**. All of them should be unchecked by default.
      1. Checking each of this checkboxes should make two formatted numeric steppers visible. These numeric steppers may be used to set the times of day during which the service may be provided.
      1. If the **Only During** radio button is selected, there should be a **Hours Allocation** label to display the total hours of the service which have been allocated.
  1. The container should have a header title **Photos**.
    1. Next to the header there should be a checkbox. This checkbox should be deselected by default.
    1. Next to the checkbox there should be a button titled **Upload**. The button should be enable only when the checkbox is selected.
    1. The **Upload** button should enable a user to upload descriptive photos of the service.
    1. Adding photos should be optional.
    1. At most 3 photos should be allowed.
  1. Below the container there should be three buttons labeled as **Create**, **Discard** and **Save as Draft**.
    1. The **Create** button should save the offer in the database and publish it as a new service.
    1. The **Discard** button should discard all the changes and should navigate the user the their profile page, after a dialogue box confirmation is made.
    1. The **Save as Draft** button should save the offer in the database without publishing it.
  1. There should be a sidebar to contain user's **Service History**, **Recent Offers** and **Recent Requests**. In the sidebar, te user will see his last 5 offers, last 5 requests, last 5 handshakes.
    1. The **Service History** table should display the services the user has participated. The table should display the **Title**, **Your Role**, **Associate** and **Units** headings to signify service's title, user's role in the services, user's counterpart in the service and the amount of units exchanged in the service, respectively.
    1. He can navigate to see his all offers, requests and handshakes by clicking _see all_ link below them.

## Update request Page ##
  1. This page will be used to update info about a request.

## Request Detail Page ##
  1. This page will present all info about selected request.

## User Profile Page ##
  1. This page will present info about the user.
  1. User profile photo will be visible in this page.
  1. User name and surname will be visible on this page.
  1. nformation about this user will be visible in this page.
    1. Age
    1. Balance (Credit ?)
    1. City
    1. Other attributes
  1. ser's tag claoud will be visible on this page.
  1. ser's offers, requests and handshakes links will be visible on this page.
  1. n offers page, offers serviced by this user will be visible.
    1. Offer title
    1. Offer tags
    1. Offer expire date (if any)
    1. Offer avaiability
    1. Offer limitations
  1. Owner of this profile will be able to edit these offers.
    1. user will click edit button or link and will navigate to offer update page.
    1. user will update visibility of this offer in update page. (@problem: eger bozukmesini istemiyorsa neden offer etsin?)
  1. When a user clicks on an offer, he will navigate to offer detail page.
  1. In requests page, user will see current profile owner's service requests.
    1. Request name
    1. Other request attributes (@todo: define other request attributes)
  1. User will edit requests by clicking an edit button visible near each request.
    1. when a user clicks on this link he will navigate to request update page.
    1. in request update page, the owner can edit the visibility of this request. (@problem: eger gozukmesini istemiyorsa neden bir request yaratsin?)
  1. When user clicks on the name of request, he will navigate to request detail page.
  1. In handshakes tab, user will be presented the handshakes that the owner has made so far.
    1. offerer of that service
    1. consumer of that service
    1. handshake time
    1. handshake status
    1. credit consumed or earned
  1. when a user clicks on a handshake row, he will navigate to handshake detail page.


## Offer Search Page ##
  1. this page will list current open offers in the system.
    1. When the page first loads, it will load current offers and sort them according to creation date in descending manner.
  1. Offers info will be presented in a table of data.
    1. Offer creator
    1. Creation date
    1. tags
    1. validation date
    1. offerer availability
    1. credits required
  1. Search field will be visible on this page on the right top of the page.
    1. Search input box and to-search field will be selected by user. (ex: guitar - in tags)
  1. A select area will define the results sorting area.
    1. Date
    1. offerer credits
    1. offerer name
    1. credits required
    1. offerer reputation
  1. a select area will define the results sorting type.
    1. ASC
    1. DESC
  1. search results will be visible on this page.
  1. user will search by clicking search button.
  1. Offers after expire date will not be visible.
  1. When a user clicks an offer, he will navigate to the details page.

## Request Search Page ##
  1. this page will list current open requests in the system.
    1. When the page first loads, it will load current requests and sort them according to creation date in descending manner.
  1. Requests info will be presented in a table of data.
    1. Request creator
    1. Creation date
    1. tags
    1. Credit to pay
    1. requester credits
  1. Search field will be visible on this page on the right top of the page.
    1. Search input box and to-search field will be selected by user. (ex: guitar - in tags)
  1. A select area will define the results sorting area.
    1. Date
    1. requester credits
    1. requester name
    1. credit to pay
    1. requester reputation
  1. a select area will define the results sorting type.
    1. ASC
    1. DESC
  1. search results will be visible on this page.
  1. user will search by clicking search button.
  1. when a user clicks a requst, he will navigate to request detail page.

## Registration Page ##
  1. this page will be used to register to the system.
  1. In order to register, user will enter the following info:
    1. Name
    1. surname
    1. Date of birth
    1. email
    1. Job
    1. Password
  1. email must be validated according to our validated email array.
  1. Password must be at least 5 characters.
  1. name - surname - email and password are required fields.
  1. After user successfully created his/her account, he will be informed as "_your account is created successfully, now you can login from home page._"

## handshake detail page ##
  1. This page will present info about a handshake.
  1. Offerer name and info will be presented. (@todo: how much info? => image, age, credit balance maybe.)
  1. Service consumer(s)' info will be presented.
  1. Credits earned or cost in this handshake will be presented.
  1. All users will be able to comment on this handshake.
  1. Only consumer will be able to rate this service.
    1. rates will be out of 5 stars.
  1. Other info of this offer will be visible. (tags, hours, availability...)
  1. Similar handshakes will be visible on the sidebar.
    1. handshake offer, consumer and credit info will be presented.
    1. handshakes will be matched by tags.
  1. Similar offers will be visible on the sidebar.
    1. offer owner, tags, and credit info will be visible
    1. offers will be matched by tags.
  1. Similar requests will be visible on the sidebar.
    1. request owner, credit info and tags will be visible.
    1. Requests will be matched by tags.

## Admin Page ##
  1. This page will be used by admins to maintain system.
  1. There will be 5 tabs named as: **User Profiles**, **Active Offers**, **Active Requests**, **Achieve Offers**, **Achieve Requests**
  1. User Profiles :
    1. In a tabular format, the following data will be presented: **UserID**, **Name**, **Surname**, **Mail**, **Actions** (View/Edit,Freeze,Unfreeze)
    1. **View/Edit** button will open a popup screen where admin can modify these user information fields : **Profile photo**, **City**, **Name**, **Surname**. All modifications will be sent to user for approval.
    1. **Freeze** button will freeze user account and requests and offers related to that account.
    1. **Unfreeze** button will unfreeze user account. The requests and offers related to that account will also become active.
  1. Active Offers :
    1. In a tabular format, the following data will be presented: **OfferID**, **Status**, **Offerer**, **Requester**, **Start Date**, **Completion Date**, **Rating**, **Actions** (View/Edit,Freeze,Unfreeze)
    1. **View/Edit** button will open a popup screen where admin can modify these offer fields: **Title**, **Description**, **Photo**, **Limitations**. All modifications will be sent to user for approval.
    1. **Freeze** button will freeze offer. No further action is allowed.
    1. **Unfreeze** button will unfreeze offer.
  1. Active Requests:
    1. In a tabular format, the following data will be presented: **RequestID**, **Status**, **Requester**, **Start Date**, **Handshake Date**, **Handshake OfferID**, **Actions** (View/Edit,Freeze,Unfreeze)
    1. **View/Edit** button will open a popup screen where admin can modify these request fields: Title, Description, Photo, Limitations. All modifications will be sent to user for approval.
    1. **Freeze** button will freeze request. No further action is allowed.
    1. **Unfreeze** button will unfreeze request.
  1. Archieve Offers :
    1. In a tabular format, the following data will be presented: **OfferID**, **Status**, **Offerer**, **Requester**, **Start Date**, **Completion Date**, **Rating**, **Actions** (View,Mark as Invalid)
    1. **View** button will open a popup screen where admin can view offer details.
    1. **Mark as Invalid** button will make the offer invalid, and ratings given related to this offer will be discarded.
  1. Archieve Requests:
    1. In a tabular format, the following data will be presented: **RequestID**, **Status**, **Requester**, **Start Date**, **Close Date**, **Handshake Date**, **Handshake OfferID**, **Actions** (View,Request Rating)
    1. **View** button will open a popup screen where admin can view request details.
    1. **Request Rating** button will send a notifation mail to requester, informing that rating is needed for the completed offer.

## Super Admin Page ##
  1. This page will be used by super admins (site owners) to maintain system.
  1. **Admin assignment** section will have a dropdown list of user names with userid. Assign button will assign the selected user as admin, unassign button will unassign admin role form the user.
    1. If the user is already assigned to admin role, and assign button is pressed for this user, a warning message will popup with text "Selected user is already assigned to admin role."
    1. If the user is not assigned to admin role, and unassign button is pressed for this user, a warning message will popup with text "Selected user doesn't have admin role."
  1. **Safe domains assignment** section will have a textbox to enter new domains. When **add** button is pressed, domain will be added to safe domain list.
    1. If input domain is already on safe domain list, following warning message will be shown : "Domain name already exists in safe domain list."
    1. By selecting a domain name from list, and clicking **remove** button, admins can remove a domain name from safe domain list. Before removing a confirmation message will be shown as : "This action will remove domain from list, continue?"
    1. If a domain is removed from safe domain, all accounts related to that domain will be frozen. If same domain is added to list later on, those accounts will be unfrozen.
  1. **Delete User** section will have a dropdownlist containing active user names and id. Pressing **Delete** button will delete user information and offers and requests completed by that user. Credits gained due to that handshakes will not be erased, but ratings will be completely removed.
    1. After **Delete** button is pressed, following confirmation message will be shown : "Deletion of user will completely remove user data and related ratings, continue?".
  1. Right side of screen, the following sections will be listed with an input textbox and **set** button : **Max User Connected, Max Offer / User, Max Request / User, Max Credit Balance, Min Credit Balance**
    1. If admins sets those values, active handshakes and further requests/offers will be effected. Completed handshakes are not subject of those settings.
  1. **System Log** section will be at the bottom of screen. In a tabular format, the following fields will be shown : **Log Type, Date, Info**
    1. Log types are : **Warning, Info, Error**. Those types and messages will be inserted to database when pre-defined cases occurs.