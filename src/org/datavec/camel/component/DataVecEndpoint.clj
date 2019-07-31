(ns org.datavec.camel.component.DataVecEndpoint
  "Represents a DataVec endpoint."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.camel.component DataVecEndpoint]))

(defn ->data-vec-endpoint
  "Constructor.

  uri - `java.lang.String`
  component - `org.datavec.camel.component.DataVecComponent`"
  (^DataVecEndpoint [^java.lang.String uri ^org.datavec.camel.component.DataVecComponent component]
    (new DataVecEndpoint uri component))
  (^DataVecEndpoint [^java.lang.String endpoint-uri]
    (new DataVecEndpoint endpoint-uri)))

(defn create-producer
  "returns: `org.apache.camel.Producer`

  throws: java.lang.Exception"
  (^org.apache.camel.Producer [^DataVecEndpoint this]
    (-> this (.createProducer))))

(defn create-consumer
  "processor - `org.apache.camel.Processor`

  returns: `org.apache.camel.Consumer`

  throws: java.lang.Exception"
  (^org.apache.camel.Consumer [^DataVecEndpoint this ^org.apache.camel.Processor processor]
    (-> this (.createConsumer processor))))

(defn singleton?
  "returns: `boolean`"
  (^Boolean [^DataVecEndpoint this]
    (-> this (.isSingleton))))

