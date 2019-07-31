(ns org.deeplearning4j.nn.conf.layers.Upsampling2D$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers Upsampling2D$Builder]))

(defn ->builder
  "Constructor.

  size - `int`"
  (^Upsampling2D$Builder [^Integer size]
    (new Upsampling2D$Builder size)))

(defn size
  "Upsampling size int, used for both height and width

  size - upsampling size in height and width dimensions - `int`

  returns: `org.deeplearning4j.nn.conf.layers.Upsampling2D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Upsampling2D$Builder [^Upsampling2D$Builder this ^Integer size]
    (-> this (.size size))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.Upsampling2D`"
  (^org.deeplearning4j.nn.conf.layers.Upsampling2D [^Upsampling2D$Builder this]
    (-> this (.build))))

