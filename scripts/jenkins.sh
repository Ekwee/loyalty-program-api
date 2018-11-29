#!/bin/sh
kill `cat run.pid` || true

USER_HOME="$(echo -n $(bash -c "cd ~${USER} && pwd"))"
nohup java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=9999 -jar -Dspring.profiles.active=prod loyalty-program-api-0.0.1-SNAPSHOT.jar > $USER_HOME/logs/server.log & echo $! > run.pid
