mvn clean package
podman build -f src/main/docker/Dockerfile.jvm -t quarkus/sensortrain-monitoring-app-jvm --platform linux/arm64/v8 . 
#podman tag quarkus/Sensortrain-monitoring-app-jvm:latest quay.io/mouachan/Sensortrain-monitoring-app-arm64:latest    
# podman push quay.io/mouachan/Sensortrain-monitoring-app-arm64:latest 
