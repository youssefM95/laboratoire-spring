FROM maven
WORKDIR /app
COPY pom.xml .
RUN mvn prepare-package -Dmaven.test.skip=true
RUN mvn install -fn
COPY . .
CMD ["mvn", "spring-boot:run"]