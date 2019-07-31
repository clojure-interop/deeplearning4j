(ns org.nd4j.camel.kafka.KafkaConnectionInformation
  "Kafka connection information
 to generate camel uris"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.camel.kafka KafkaConnectionInformation]))

(defn ->kafka-connection-information
  "Constructor."
  (^KafkaConnectionInformation []
    (new KafkaConnectionInformation )))

(defn kafka-uri
  "Returns a kafka connection uri

  returns: a kafka connection uri
  represented by this connection information - `java.lang.String`"
  (^java.lang.String [^KafkaConnectionInformation this]
    (-> this (.kafkaUri))))

