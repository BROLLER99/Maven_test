javac -classpath ./src/resources/spring_lib/* -d ./out/production/Spring_primer -sourcepath ./src/main/java/com ./src/main/java/com/chapter1/Main.java ./src/main/java/com/chapter2/*.java
xcopy "./src/resources" "./out/production/Spring_primer" /e
java -cp "./src/resources/spring_lib/*";./out/production/Spring_primer com.chapter1.Main
pause