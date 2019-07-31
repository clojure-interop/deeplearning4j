(ns org.deeplearning4j.nn.conf.layers.Upsampling1D$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers Upsampling1D$Builder]))

(defn ->builder
  "Constructor.

  size - `int`"
  (^Upsampling1D$Builder [^Integer size]
    (new Upsampling1D$Builder size)))

(defn size
  "Upsampling size int

  size - upsampling size in single spatial dimension of this 1D layer - `int`

  returns: `org.deeplearning4j.nn.conf.layers.Upsampling1D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Upsampling1D$Builder [^Upsampling1D$Builder this ^Integer size]
    (-> this (.size size))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.Upsampling1D`"
  (^org.deeplearning4j.nn.conf.layers.Upsampling1D [^Upsampling1D$Builder this]
    (-> this (.build))))

