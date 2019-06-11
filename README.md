# Quotes

Initial lab completed by [Kent](https://github.com/KKetter) and [Tim](https://github.com/GoldBeardSea).
Lab 09 only [Kent](https://github.com/KKetter)

## Contents

Program purpose - command line interface operated by scanner. 

Setup
* Clone down the repository. 
* "gradle init" from command line in cloned directory.
* Open in intellij and run the application.

The execution takes in a filepath to your json file in order to grab the quotes. Preferrably you would use the included
quote file in assets. You can read in any file that at least has an author and text structured like the Quote class
constructor. 

Lab 09
* Make a request to an API to get a random quote
* Ensure that if your app has errors in connecting to the Internet, you instead display a random quote from your file.
* When a quote comes back from a request, it’s also cached in the json file