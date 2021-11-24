kafka single server
Refer
https://www.c-sharpcorner.com/article/step-by-step-installation-and-configuration-guide-of-apache-kafka-on-windows-ope/
# kafka-publisher
Apache Kafka Publisher Example using SpringBoot

# start zookeeper.start bat file like below
zookeeper-server-start.bat D:\DEV-SOFTWARES\kafka_2.12-1.1.0\config\zookeeper.properties

# start kafka server
kafka-server-start.bat D:\DEV-SOFTWARES\kafka_2.12-1.1.0\config\server.properties

# Create Topic:
kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 -topic javatechie

# Produce a message
kafka-console-producer.bat --broker-list localhost:9092 --topic javatechie

# Consume a message
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic javatechie


multi broker kafka cluster
https://www.michael-noll.com/blog/2013/03/13/running-a-multi-broker-apache-kafka-cluster-on-a-single-node/
cd C:\Code\kafka_2.12-2.2.0\bin\windows
zookeeper-server-start.bat C:\Code\kafka_2.12-2.2.0\config\zookeeper.properties
kafka-server-start.bat C:\Code\kafka_2.12-2.2.0\config\server1.properties
kafka-server-start.bat C:\Code\kafka_2.12-2.2.0\config\server2.properties
kafka-server-start.bat C:\Code\kafka_2.12-2.2.0\config\server3.properties
cd C:\Code\kafka_2.12-2.2.0\bin\windows
kafka-topics.bat --create --zookeeper localhost:2181 -replication-factor 2 --partitions 3 --topic chat-message
kafka-topics.bat --zookeeper localhost:2181 --describe --topic chat-message

kafka-console-producer.bat --broker-list localhost:9092,localhost:9093,localhost:9094 --topic chat-message
kafka-console-consumer.bat --zookeeper localhost:2181 --topic chat-message --from-beginning
kafka-console-consumer.bat --bootstrap-server localhost:9092,localhost:9093,localhost:9094 --topic chat-message --from-beginning

System Design (HLD)
https://completedesigninterviewcourse.com/system-design-interview/

LLD
https://www.udemy.com/course/low-level-system-design-an-interview-perspective/learn/lecture/21421572#overview

