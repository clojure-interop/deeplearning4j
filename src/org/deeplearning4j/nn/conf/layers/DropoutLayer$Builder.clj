(ns org.deeplearning4j.nn.conf.layers.DropoutLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers DropoutLayer$Builder]))

(defn ->builder
  "Constructor.

  dropout - `double`"
  (^DropoutLayer$Builder [^Double dropout]
    (new DropoutLayer$Builder dropout)))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.DropoutLayer`"
  (^org.deeplearning4j.nn.conf.layers.DropoutLayer [^DropoutLayer$Builder this]
    (-> this (.build))))

