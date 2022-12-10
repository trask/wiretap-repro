# Wiretap repro

To run:

```
./mvnw package
export APPLICATIONINSIGHTS_CONNECTION_STRING=<Copy connection string from Application Insights Resource Overview>
export APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL=debug
java -javaagent:target/agent/applicationinsights-agent.jar -jar target/app.jar
```
