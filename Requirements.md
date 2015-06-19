# Entities-Actions #
  * service (relation to offer and request?)

  * tag
    * tag an item (what items?)
  * rating
    * rate an item (what items?)
    * add comment (optional)
  * user
    * display unit
    * signup
    * login
    * add tag
    * accept an offer
    * list an offer
    * accept a request
    * list a request
    * display and search offers
    * display and search requests

  * admin
    * delete user
    * tag CRUD

# Pages #
  * main page
    * recent offers
    * recent request
    * tag cloud (popular or pushed offers have priority)
    * tag cloud (popüler or pushed requests have priority)
    * recent transactions
    * active members
    * new members
    * undiscovered gems (members who have several offers and good feedback but are rarely receiving requests)

  * services page

  * offers page

  * requests page

  * user account page

  * user profile page
    * photo (photo is not mandatory)
    * user information (name surname, sex, location, age, hobies, job.) => none of there areas are mandatory except name
    * current user offers
    * current user requests
    * completed user offers (list: service offerer name, rating, date, unit value)
    * completed user requests (list: service requester name, rating, date, unit value)
    * recommendations (other users can write recommendation for the user, regardless of completed requests and offers. this section is under control of user, and can delete inappropirate inputs)

  * admin panel
    * edit user page
    * RUD recent offers (recent offers listed with RUD buttons. Update and Delete operations are valid after user approval)
    * RUD recent requests (recent requests listed with RUD buttons. Update and Delete operations are valid after user approval)
    * suspend / activate user (this actions need uber-admin approval)
    * delete user
    * tag RUD (tag is populated by the system, by calculating popular requests and offers, and also giving priority to critical min/max balance users. On the other hand admins can change the tag cloud manually. When tag cloud is changed a reason should be entered, and a mail goes to all admins with reason and changes made.)

  * uber-admin panel
    * assign / unassign admin role to user
    * set max balance and min balance (users over max balance are motivated to spend their units, users under min balance are motivated to earn units. motivation through mail and tag cloud priority)
    * system log (errors and important messages are entered to database. uber-admin views those messages with a system log message list)
    * set maximum user logged in
    * set maximum offer per user (to avoid abuse)
    * set maximum request per user (to avoid abuse)