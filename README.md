# ExplicitIntentWithExtras_GettingResultBackDemo
Demo app to show my students how to make an intent with extras to load a second activity and get a result back from the second activity.

This app allows the user to press a button every day they worked out, and it will update the number of days displayed (increasing it by 1).
If the user presses the "submit" button, they are taken to a new activity, which displays the number of days worked out from the previous screen. 
If the user presses the "start over" button on this screen, the number of days the user exercised is reset, and no number is displayed.
When the user pressed the back button, they are taken back to the original activity.
If the user hadn't previously pressed "start over," this screen looks the same as before and the user can continue to increase the number of days.
However, if the user had previously pressed "start over," this screen shows the number of days as 0 and displays a toast letting the user know the count has been restarted.

This app demonstrates:
- Intent extras (setting and retrieving)
- Having the second activity create the intent that will load it in a method, and the first activity calling this method
- startActivityForResult
- Request codes
- Result codes
- onActivityResult

![Screenshot of app](https://github.com/alj968/ExplicitIntentWithExtras_GettingResultBackDemo/blob/master/Screenshot1.png "Screenshot of app")
![Screenshot of app](https://github.com/alj968/ExplicitIntentWithExtras_GettingResultBackDemo/blob/master/Screenshot2.png "Screenshot of app")
![Screenshot of app](https://github.com/alj968/ExplicitIntentWithExtras_GettingResultBackDemo/blob/master/Screenshot3.png "Screenshot of app")
![Screenshot of app](https://github.com/alj968/ExplicitIntentWithExtras_GettingResultBackDemo/blob/master/Screenshot4.png "Screenshot of app")
![Screenshot of app](https://github.com/alj968/ExplicitIntentWithExtras_GettingResultBackDemo/blob/master/Screenshot5.png "Screenshot of app")
![Screenshot of app](https://github.com/alj968/ExplicitIntentWithExtras_GettingResultBackDemo/blob/master/Screenshot6.png "Screenshot of app")
![Screenshot of app](https://github.com/alj968/ExplicitIntentWithExtras_GettingResultBackDemo/blob/master/Screenshot7.png "Screenshot of app")
