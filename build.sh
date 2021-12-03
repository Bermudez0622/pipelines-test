#!/bin/bash

clear

export $(cat src/main/resources/properties.env)

mvn -B package --file pom.xml
