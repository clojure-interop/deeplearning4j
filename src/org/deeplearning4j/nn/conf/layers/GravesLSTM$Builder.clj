(ns org.deeplearning4j.nn.conf.layers.GravesLSTM$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers GravesLSTM$Builder]))

(defn ->builder
  "Constructor."
  (^GravesLSTM$Builder []
    (new GravesLSTM$Builder )))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.GravesLSTM`"
  (^org.deeplearning4j.nn.conf.layers.GravesLSTM [^GravesLSTM$Builder this]
    (-> this (.build))))

