# directory

### Instructions to run from the command line. 
#### Prerequisites: Maven and Java needs to be installed

- Go to directory folder. 
- Build the jar; command : 
>>mvn clean install 
- Run the jar with input directory path argument (e.g. /home); command : 
>>java -jar target/directory-1.0.0-SNAPSHOT.jar /home

##### Assumptions

Since requirement doesn't say anything about hidden files, application only return hidden files if we pass second argument to include hidden file as true.
e.g: following command will include the hidden files as well.
>> java -jar target/directory-1.0.0-SNAPSHOT.jar /home true

