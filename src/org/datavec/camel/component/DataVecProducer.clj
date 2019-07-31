(ns org.datavec.camel.component.DataVecProducer
  "The DataVec producer.
 Converts input records in to their final form
 based on the input split generated from
 the given exchange."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.camel.component DataVecProducer]))

(defn ->data-vec-producer
  "Constructor.

  endpoint - `org.datavec.camel.component.DataVecEndpoint`"
  (^DataVecProducer [^org.datavec.camel.component.DataVecEndpoint endpoint]
    (new DataVecProducer endpoint)))

(defn process
  "exchange - `org.apache.camel.Exchange`

  throws: java.lang.Exception"
  ([^DataVecProducer this ^org.apache.camel.Exchange exchange]
    (-> this (.process exchange))))

