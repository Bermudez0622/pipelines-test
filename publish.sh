#!/bin/bash

clear

export $(cat src/main/resources/properties.env)

mvn deploy -s $GITHUB_WORKSPACE/settings.xml
