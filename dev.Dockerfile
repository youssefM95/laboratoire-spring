FROM maven
WORKDIR /app
COPY pom.xml .
RUN mvn install -fn
COPY . .
CMD ["mvn", "spring-boot:run"]