***Application Running Steps:

Windows:
1) Make 'New Folder' in 'Macintosh HD\Users' and name it as 'IsProject'.(C:\IsProject)
2) Copy 'IndvPakTrainedModel.model' file to the above folder 'IsProject'.(C:\IsProject\IndvPakTrainedModel.model)

Mac OS:
1) Make 'New Folder' in 'Macintosh HD\Users' and name it as 'IsProject'.(\Users\IsProject)
2) Copy 'IndvPakTrainedModel.model' file to the above folder 'IsProject'.(\Users\IsProject\IndvPakTrainedModel.model)

All other steps are same:
3) Download apache tomcat v7.0 (http://apache.spinellicreations.com/tomcat/tomcat-7/v7.0.61/bin/apache-tomcat-7.0.61.tar.gz )
4) Extract .tar file and copy attached 'IsCricketWebProject.war' (web application file) to '\apache-tomcat-7.0.61\webapps' folder.
5) Start the Tomcat server by the command: './startup.sh' in the Terminal/cmd. (in Terminal: change current directory to '\apache-tomcat-7.0.61\bin')
6) After starting the server, type the following link in the browser.
	http://localhost:8080/IsCricketWebProject/home
7) Enter valid values for the attributes.
8) Stop the server by the command : './shutdown.sh' in the terminal/cmd.

Note: For windows, you need to change the code where path is hard-coded. The war file is generated to support Mac OS.

***Application working screenshots
![1](https://github.com/harshitshah436/game_prediction_Cricket/blob/master/screenshots/ui1.jpg)
![2](https://github.com/harshitshah436/game_prediction_Cricket/blob/master/screenshots/ui2.jpg)
![3](https://github.com/harshitshah436/game_prediction_Cricket/blob/master/screenshots/ui3.jpg)