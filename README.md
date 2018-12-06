# java-quotes
### Authors: 
- Pablo Rosales
- Darrin Howell

### Project 
This application reads a JSON file containing information for book objects and parses through it
using Google's gson library. After gson parses the JSON file book instances are constructed
and set them into an array. We then randomly select a book instance from that array and return
a notable quote and it's author. 

### Installing Dependencies and Running our App
For gradle users, go into buiild.gradle and locate the dependencies code block and insert this line:
implementation 'com.google.code.gson:gson:2.8.5' <br/>

Save your project immediately after inserting that snippet so that your editor can download
and build the new dependencies using gradle. <br/>

Finally, to run our application, run the main method from the App.java file.  


