#!/usr/bin/env bash

mvn clean install

cd hub

mvn spring-boot:run
