kafka single server


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

multi broker kafka cluster
https://www.michael-noll.com/blog/2013/03/13/running-a-multi-broker-apache-kafka-cluster-on-a-single-node/
System Design (HLD)
https://completedesigninterviewcourse.com/system-design-interview/

LLD
https://www.udemy.com/course/low-level-system-design-an-interview-perspective/learn/lecture/21421572#overview

