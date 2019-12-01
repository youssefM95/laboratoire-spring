FROM maven as builder
WORKDIR /app
COPY . .
RUN mvn clean package -Dmaven.test.skip=true

FROM openjdk:8u232-stretch
WORKDIR /app
COPY --from=builder /app/target/laboratoire-spring.jar .
CMD ["java", "-jar", "laboratoire-spring.jar"]