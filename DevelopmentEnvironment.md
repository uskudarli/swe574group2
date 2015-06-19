# Development Environment #

## Eclipse Setup ##
  1. Download Eclipse Indigo: Select your OS on the right-hand side. http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/indigosr1
  1. Extract the compressed file and put the resulting eclipse directory in a convenient place.
  1. Run the eclipse executable in the eclipse directory. (Maybe Windows version comes with an installer and creates a shortcut)

## Subversive Plugin Setup ##
  1. Help > Install New Software...
  1. Enter http://download.eclipse.org/technology/subversive/0.7/update-site/ to "Work with" and press enter
  1. Select "Subversive SVN Team Provider Plugin (Incubation)"
  1. Next, Next, Finish
  1. Restart Eclipse.
  1. Select and install SVN Kit 1.3.5 as the SVN Connector
  1. File > Import > Project from SVN
  1. URL: https://swe574group2.googlecode.com/svn/trunk/
  1. Enter your e-mail as the user name and find your password from: https://code.google.com/hosting/settings
  1. Next, Next, Finish

## Play Setup ##
  1. Download http://download.playframework.org/releases/play-1.2.3.zip
  1. Extract the zip file to the project directory.

## Play-Eclipse Integration ##
  1. cd src
  1. ../play-1.2.3/play eclipsify
  1. Delete project.
  1. Import the project again (File > Import > Existing projects into workspace)
  1. Copy the JAR file from $PLAY\_HOME/support/eclipse to $ECLIPSE\_HOME/dropins.
  1. Restart Eclipse.

## MySQL Setup ##

  1. XAMPP is recommended: http://www.apachefriends.org/en/xampp.html
  1. Change the db parameter in src/conf/application.conf to suit your mysql configuration.

## Development Server ##
  1. cd src
  1. ../play-1.2.3/play run
  1. Go to http://localhost:9000/