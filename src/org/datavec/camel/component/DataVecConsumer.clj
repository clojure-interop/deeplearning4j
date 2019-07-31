(ns org.datavec.camel.component.DataVecConsumer
  "The DataVec consumer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.camel.component DataVecConsumer]))

(defn ->data-vec-consumer
  "Constructor.

  endpoint - `org.datavec.camel.component.DataVecEndpoint`
  processor - `org.apache.camel.Processor`"
  (^DataVecConsumer [^org.datavec.camel.component.DataVecEndpoint endpoint ^org.apache.camel.Processor processor]
    (new DataVecConsumer endpoint processor)))

