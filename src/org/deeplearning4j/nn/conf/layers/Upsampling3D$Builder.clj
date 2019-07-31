(ns org.deeplearning4j.nn.conf.layers.Upsampling3D$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers Upsampling3D$Builder]))

(defn ->builder
  "Constructor.

  size - `int`"
  (^Upsampling3D$Builder [^Integer size]
    (new Upsampling3D$Builder size)))

(defn size
  "Upsampling size as int, so same upsampling size is used for depth, width and height

  size - upsampling size in height, width and depth dimensions - `int`

  returns: `org.deeplearning4j.nn.conf.layers.Upsampling3D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Upsampling3D$Builder [^Upsampling3D$Builder this ^Integer size]
    (-> this (.size size))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.Upsampling3D`"
  (^org.deeplearning4j.nn.conf.layers.Upsampling3D [^Upsampling3D$Builder this]
    (-> this (.build))))

