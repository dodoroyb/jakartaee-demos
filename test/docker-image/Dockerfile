FROM centos:centos7.9.2009
LABEL maintainer=dodoroyb
COPY ./target/*.war /root/
COPY ./target/*.zip /root/
RUN yum install -y java-1.8.0-openjdk
RUN yum install -y unzip
WORKDIR /root
RUN unzip jboss-eap-7.4.0.zip
ENV JBOSS_HOME=/root/jboss-eap-7.4
RUN cp /root/batch-processing.war ${JBOSS_HOME}/standalone/deployments/
ENTRYPOINT ["/root/jboss-eap-7.4/bin/standalone.sh"]