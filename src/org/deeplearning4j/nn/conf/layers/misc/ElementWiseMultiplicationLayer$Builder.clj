(ns org.deeplearning4j.nn.conf.layers.misc.ElementWiseMultiplicationLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.misc ElementWiseMultiplicationLayer$Builder]))

(defn ->builder
  "Constructor."
  (^ElementWiseMultiplicationLayer$Builder []
    (new ElementWiseMultiplicationLayer$Builder )))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.misc.ElementWiseMultiplicationLayer`"
  (^org.deeplearning4j.nn.conf.layers.misc.ElementWiseMultiplicationLayer [^ElementWiseMultiplicationLayer$Builder this]
    (-> this (.build))))

