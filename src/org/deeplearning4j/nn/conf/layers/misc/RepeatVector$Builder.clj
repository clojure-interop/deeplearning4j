(ns org.deeplearning4j.nn.conf.layers.misc.RepeatVector$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.misc RepeatVector$Builder]))

(defn ->builder
  "Constructor.

  n - `int`"
  (^RepeatVector$Builder [^Integer n]
    (new RepeatVector$Builder n)))

(defn repetition-factor
  "Set repetition factor for RepeatVector layer

  n - upsampling size in height and width dimensions - `int`

  returns: `org.deeplearning4j.nn.conf.layers.misc.RepeatVector$Builder`"
  (^org.deeplearning4j.nn.conf.layers.misc.RepeatVector$Builder [^RepeatVector$Builder this ^Integer n]
    (-> this (.repetitionFactor n))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.misc.RepeatVector`"
  (^org.deeplearning4j.nn.conf.layers.misc.RepeatVector [^RepeatVector$Builder this]
    (-> this (.build))))

