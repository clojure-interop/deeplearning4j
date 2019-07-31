(ns org.nd4j.camel.kafka.Nd4jKafkaProducer
  "Created by agibsonccc on 7/19/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.camel.kafka Nd4jKafkaProducer]))

(defn ->nd-4j-kafka-producer
  "Constructor."
  (^Nd4jKafkaProducer []
    (new Nd4jKafkaProducer )))

(defn publish
  "Publish to a kafka topic
  based on the connection information

  arr - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Nd4jKafkaProducer this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.publish arr))))

