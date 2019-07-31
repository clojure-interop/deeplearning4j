(ns org.datavec.camel.component.csv.marshaller.ListStringInputMarshaller
  "Marshals List>"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.camel.component.csv.marshaller ListStringInputMarshaller]))

(defn ->list-string-input-marshaller
  "Constructor."
  (^ListStringInputMarshaller []
    (new ListStringInputMarshaller )))

(defn get-split
  "exchange - `org.apache.camel.Exchange`

  returns: `org.datavec.api.split.InputSplit`"
  (^org.datavec.api.split.InputSplit [^ListStringInputMarshaller this ^org.apache.camel.Exchange exchange]
    (-> this (.getSplit exchange))))

