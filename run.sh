#!/bin/bash
cd /opt/EmptyProject/
./build.sh >> build-output.log &
cd target/
java -jar EmptyApplication2-0.0.1-SNAPSHOT.jar >> ../app-output.log &

