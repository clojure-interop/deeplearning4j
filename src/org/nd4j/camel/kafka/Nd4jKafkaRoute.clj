(ns org.nd4j.camel.kafka.Nd4jKafkaRoute
  "Sends a test ndarray
 to kafka"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.camel.kafka Nd4jKafkaRoute]))

(defn ->nd-4j-kafka-route
  "Constructor."
  (^Nd4jKafkaRoute []
    (new Nd4jKafkaRoute )))

(defn configure
  "throws: java.lang.Exception"
  ([^Nd4jKafkaRoute this]
    (-> this (.configure))))

