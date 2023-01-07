FROM openjdk:17
COPY ./app/ /tmp
WORKDIR /tmp
# RUN javac HelloWorld.java  
# RUN javac BinarySearch.java
# RUN javac ReverseNumber.java
RUN javac GFG.java
CMD ["java","GFG"]