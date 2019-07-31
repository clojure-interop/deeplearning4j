(ns org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.recurrent Bidirectional$Builder]))

(defn ->builder
  "Constructor."
  (^Bidirectional$Builder []
    (new Bidirectional$Builder )))

(defn mode
  "mode - `org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional$Mode`

  returns: `org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional$Builder`"
  (^org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional$Builder [^Bidirectional$Builder this ^org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional$Mode mode]
    (-> this (.mode mode))))

(defn rnn-layer
  "layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: `org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional$Builder`"
  (^org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional$Builder [^Bidirectional$Builder this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.rnnLayer layer))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional`"
  (^org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional [^Bidirectional$Builder this]
    (-> this (.build))))

