FROM eclipse-temurin:17-jdk-alpine AS build

WORKDIR /app

RUN apk add --no-cache maven

COPY . .

RUN mvn clean package -DskipTests -pl microservices/cart-microservices -am

FROM eclipse-temurin:17-jre-alpine
RUN apk add --no-cache curl bash
WORKDIR /app

COPY --from=build /app/microservices/cart-microservices/target/*.jar app.jar

EXPOSE 8092

ENTRYPOINT [ "java","-jar","app.jar" ]