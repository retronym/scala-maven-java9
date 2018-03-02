Test of the Maven Scala plugin with Java 9

```
⚡ (java_use 9; java -version; mvn -q clean install; cd m2; mvn -q exec:java  -Dexec.mainClass="m2.M2")
java version "9.0.4"
Java(TM) SE Runtime Environment (build 9.0.4+11)
Java HotSpot(TM) 64-Bit Server VM (build 9.0.4+11, mixed mode)
Java HotSpot(TM) 64-Bit Server VM warning: Ignoring option MaxPermSize; support was removed in 8.0
/code/scala-maven-java9/m2
Java HotSpot(TM) 64-Bit Server VM warning: Ignoring option MaxPermSize; support was removed in 8.0
hello, Maven, Scala, Java 9
```