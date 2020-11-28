# java-http-echo
A simple spring boot web application that echos what you start it with.

```
$ ./gradlew :bootBuildImage
$ docker run -e text=hello -p 8080:8080 java-http-echo:xxx-SNAPSHOT
```
