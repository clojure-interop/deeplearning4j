(ns org.datavec.camel.component.DataVecComponent
  "Represents the component that manages DataVecEndpoint."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.camel.component DataVecComponent]))

(defn ->data-vec-component
  "Constructor.

  context - `org.apache.camel.CamelContext`"
  (^DataVecComponent [^org.apache.camel.CamelContext context]
    (new DataVecComponent context))
  (^DataVecComponent []
    (new DataVecComponent )))

