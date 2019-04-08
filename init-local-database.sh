#!/usr/bin/env bash

mkdir -p target

if [ ! -f target/hap-liquibase-tools.jar ]
then
    curl http://nexus.saas.hand-china.com/content/repositories/rdc/com/hand/hap/cloud/hap-liquibase-tools/1.0/hap-liquibase-tools-1.0.jar -o target/hap-liquibase-tools.jar
fi

java -Dspring.datasource.url="jdbc:mysql://10.211.55.4:3306/authorized?useUnicode=true&characterEncoding=utf-8&useSSL=false" \
 -Dspring.datasource.username=root \
 -Dspring.datasource.password=123456 \
 -Ddata.init=false -Ddata.drop=false \
 -Ddata.dir=src/main/resources \
 -jar target/hap-liquibase-tools.jar
