(ns org.nd4j.camel.kafka.Nd4jKafkaConsumer
  "Created by agibsonccc on 7/19/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.camel.kafka Nd4jKafkaConsumer]))

(defn ->nd-4j-kafka-consumer
  "Constructor."
  (^Nd4jKafkaConsumer []
    (new Nd4jKafkaConsumer )))

(defn receive
  "Receive an ndarray

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Nd4jKafkaConsumer this]
    (-> this (.receive))))

