(ns org.deeplearning4j.nn.conf.layers.recurrent.SimpleRnn$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.recurrent SimpleRnn$Builder]))

(defn ->builder
  "Constructor."
  (^SimpleRnn$Builder []
    (new SimpleRnn$Builder )))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.recurrent.SimpleRnn`"
  (^org.deeplearning4j.nn.conf.layers.recurrent.SimpleRnn [^SimpleRnn$Builder this]
    (-> this (.build))))

