# directory

### Instructions to run from the command line. 
#### Prerequisites: Maven and Java needs to be installed

- Go to directory folder. 
- Build the jar; command : 
>>mvn clean install 
- Run the jar with input directory path argument (e.g. /home); command : 
>>java -jar target/directory-1.0.0-SNAPSHOT.jar /home

##### Assumptions

Since requirement doesn't say anything about hidden files, application doesn't return hidden files by default. We need to pass second argument as true to include hidden files.
e.g: following command will include the hidden files.
>> java -jar target/directory-1.0.0-SNAPSHOT.jar /home true

