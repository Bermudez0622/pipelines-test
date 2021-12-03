#!/bin/bash

clear

export $(cat src/main/resources/properties.env)

mvn spring-boot:run