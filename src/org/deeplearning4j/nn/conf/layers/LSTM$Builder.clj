(ns org.deeplearning4j.nn.conf.layers.LSTM$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers LSTM$Builder]))

(defn ->builder
  "Constructor."
  (^LSTM$Builder []
    (new LSTM$Builder )))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.LSTM`"
  (^org.deeplearning4j.nn.conf.layers.LSTM [^LSTM$Builder this]
    (-> this (.build))))

