
# Dockerize node application
1. docker build -t demo-api .
2. docker images
3. docker run -p 8080:3000 -d demo-api
4. docker exec -it <container id> /bin/bash -> Para entrar al bash del container

# Send to Dockerhub docker image
1. docker image tag demo-api racorrea13/demo-api-pis-2021:v1
2. docker image push racorrea13/demo-api-pis-2021:v1

# Add feature-b
