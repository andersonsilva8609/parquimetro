FROM openjdk:18
ARG JAR_FILE=out/artifacts/parquimetro_jar/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT java,-jar,app.jar
EXPOSE 8189:8189