mvn clean -DskipTests package

java -agentlib:native-image-agent=experimental-class-loader-support,config-output-dir=native-image -DSPRING_CLOUD_CONFIG_URI=http://127.0.0.1:9804 -jar target/demo-0.0.1-SNAPSHOT.jar

mvn -X -Pnative -DskipTests package && ./target/com.example.demo.DemoApplication
