FROM openjdk:8-alpine

ARG APP_RUN=/service
ARG APP_JAR=service.jar

WORKDIR ${APP_RUN}

COPY ./target/${APP_JAR} ${APP_RUN}

ENTRYPOINT ["java", "-jar", "service.jar"]
