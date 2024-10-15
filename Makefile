MAKEFLAGS += --silent --always-make
.PHONY: *

DOCKER = docker compose -f docker-compose.yaml

up:
	${DOCKER} up --build

tests:
	${DOCKER} exec game gradle test

run:
	${DOCKER} exec game gradle run

sh:
	${DOCKER} run --build --rm --remove-orphans game bash

