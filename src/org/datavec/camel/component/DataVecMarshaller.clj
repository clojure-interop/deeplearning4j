(ns org.datavec.camel.component.DataVecMarshaller
  "Marshals na exchange in to an input split"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.camel.component DataVecMarshaller]))

(defn get-split
  "exchange - `org.apache.camel.Exchange`

  returns: `org.datavec.api.split.InputSplit`"
  (^org.datavec.api.split.InputSplit [^DataVecMarshaller this ^org.apache.camel.Exchange exchange]
    (-> this (.getSplit exchange))))

