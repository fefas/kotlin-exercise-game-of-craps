# Target
FROM gradle

WORKDIR /home/gradle/project
COPY . .

ENTRYPOINT ["tail", "-f", "/dev/null"]

