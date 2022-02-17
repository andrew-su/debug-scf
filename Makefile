.PHONY: func app demo

app_jar := application/target/my-app-dev.jar
$(app_jar): $(shell find application/src/ -type f -iname '*.java') application/pom.xml
	cd application && mvn package

func_jar := func/target/hire-0.0.1-full.jar
$(func_jar): $(shell find func/src/ -type f -iname '*.java') func/pom.xml
	cd func && mvn package

demo: $(app_jar) $(func_jar)
	java -jar $(app_jar) --spring.cloud.function.location=$(func_jar)

clean:
	cd application && mvn clean
	cd func && mvn clean