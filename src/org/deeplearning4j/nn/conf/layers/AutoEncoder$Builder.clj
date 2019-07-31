(ns org.deeplearning4j.nn.conf.layers.AutoEncoder$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers AutoEncoder$Builder]))

(defn ->builder
  "Constructor.

  corruption-level - `double`"
  (^AutoEncoder$Builder [^Double corruption-level]
    (new AutoEncoder$Builder corruption-level))
  (^AutoEncoder$Builder []
    (new AutoEncoder$Builder )))

(defn corruption-level
  "corruption-level - `double`

  returns: `org.deeplearning4j.nn.conf.layers.AutoEncoder$Builder`"
  (^org.deeplearning4j.nn.conf.layers.AutoEncoder$Builder [^AutoEncoder$Builder this ^Double corruption-level]
    (-> this (.corruptionLevel corruption-level))))

(defn sparsity
  "sparsity - `double`

  returns: `org.deeplearning4j.nn.conf.layers.AutoEncoder$Builder`"
  (^org.deeplearning4j.nn.conf.layers.AutoEncoder$Builder [^AutoEncoder$Builder this ^Double sparsity]
    (-> this (.sparsity sparsity))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.AutoEncoder`"
  (^org.deeplearning4j.nn.conf.layers.AutoEncoder [^AutoEncoder$Builder this]
    (-> this (.build))))

