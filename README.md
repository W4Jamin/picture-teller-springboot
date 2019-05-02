# picture-teller-springboot

This project lets user upload images and return a related sentence.


## Getting Started 

### Prerequisites

Java 8  
Maven  
Python 2.7  
PyTorch  
Numpy
pycocotools
```
Give examples
```

### Installation 

OS X & Linux:

```sh
Give the example
```

Windows:

```sh
Give the example
```

### Usage example 
Change file path to your local path in /src/main/resources/resources.properties
```sh
# All user uploaded images stored in this path
imageService.file.path=C:/some-folder/picture-teller-springboot/src/main/resources/templates/static/image/
# Python path
imageService.python.path=C:\\some-folder\\somepython.py
```

Package this project and ready to run.
```sh
mvn package
```

## Deployment 
Run application on a local computer.
```sh
java -jar some-jar.jar
```

## Built With
* [Maven](https://maven.apache.org/) - Dependency Management



