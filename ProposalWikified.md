## SWE 574, Group 2 - Project Proposal ##

## Social Considerations ##
When we look to the current situation in social interactions sites on the web, we can observe that the habits of this generations has changed a lot compared to previous ones in many ways.

One of the important results of todays' online social interactions is that we create a significant archive of our lives today. In every minute, 48 hours of video is added to youtube, 200 million of tweets are added on twitter in every day and an average user on facebook adds 90 pieces of content. This is an important archive that has been created any time before us.

Another important issue is that usage of social services is changing in a very rapid manner. People react changes in social media and use the services presented like a game. Seth Priebatsch says describes this as "the game layer on top of the world". Everything we do is very similar to a game, especially in social interaction services. We try to build a better profile on facebook, gather more friends, try to reach more followers on twitter. Now the success becomes a more measurable event, since this becomes more like a game rather than a sharing and reaching connections.

According to these social considerations, we will try to build a social service that allows people to communicate and interact with peers in light of current social trends.

## Description ##
The aim of this project is to develop and deploy a web application which may be used by a community as a medium for exchanging services and goods within the community. This application will be modelled as Local Exchange Trading Systems (LETS), which is a foundation used by communities to conduct transactions using their locally valid currencies.

LETS are started in order to empower local economic control, encourage to self-sufficiency by providing a system that facilitates indirect trading services, skills and resources among the members which aims to be a non-profit organization. Goals are to help saving money, getting to know each other, sharing resources and arouse the local economy as well as reducing dependence on imports while boosting local quality of life.

### Legal Issues/Problems ###
It is known that LET Systems are used to evade taxation. LETS are legal community help programs that operated for informal trade of similar services on noncommercial basis, not a scheme to avoiding paying taxes. In order to protect data, an agreement that takes a permission on sharing and using personal details should be signed.

There is a substantial amount of work associated with running and participating in a LET System. Transactions and balances of each of the members should be logged and updated regularly. Also the list of services offered and demanded by members should be up-to-date in order avoid transaction requests for unavailable services.

### Scope ###
The proposed web application will implemented as a Local Exchange Trading System in a closed community, namely a university. The members of the community will consist of university students, lecturers and staff who have voluntarily registered themselves. During the registration process each user will be required to describe services and goods they can offer and are interested in.

## Implementation Details ##
The LETS is designed to deal with the problems associated with conventional money. The system is defined by underlying considerations such as community which refers a finite group of people who decide to participate to the systems, personal which refers the promises of the participants.

### Rules ###
  * Nobody can claim the ownership. Administrative tasks will be handled by volunteers and completion of these tasks will give them credits.
  * The consent of the individual is required at all times (no obligation to trade).
  * No third party can have control over the money and the money cannot leave the system.
  * Every account starts at 0 but trading option is available right away. A negative account balance simply represents a commitment to provide to the community in the future and users are not charged to having a negative account balance.

### User Functions ###
  * Unregistered users will have the ability to search for services and goods which are offered and demanded. Also they should be able to reach information about most active users, recent transactions and user's most recent transactions.
  * Registered users will have the option to associate themselves with a limited selection of available services and goods.
  * Trusted users should be able to extend their lists and define new categories.
  * Administrators will have the ability to inspect transaction histories, new registrations and user activities, remove services and goods which do not agree to the terms of service, temporarily or permanently banning users because of repeated offenses.

## Work Plan ##
  * Creating the infrastructure which can dynamically create LET System web pages (user profiles, main page advertising popular services, goods, users)
  * Implementing the business logic of the LET System and creating the entities, e.g. users, services, transactions
  * Associating user interfaces with the user and administrator functions and the available entities as dictated by the business logic
  * Tests related to user and administrator functions may be performed to detect inconsistencies
  * Deploying the fully functional web service on a server

## References ##
  1. http://www.ashevillelets.org/
  1. http://en.wikipedia.org/wiki/Local_Exchange_Trading_Systems