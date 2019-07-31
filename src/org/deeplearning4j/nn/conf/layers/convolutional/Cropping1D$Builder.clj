(ns org.deeplearning4j.nn.conf.layers.convolutional.Cropping1D$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.convolutional Cropping1D$Builder]))

(defn ->builder
  "Constructor.

  crop-top - Amount of cropping to apply to the top of the input activations - `int`
  crop-bottom - Amount of cropping to apply to the bottom of the input activations - `int`"
  (^Cropping1D$Builder [^Integer crop-top ^Integer crop-bottom]
    (new Cropping1D$Builder crop-top crop-bottom))
  (^Cropping1D$Builder [cropping]
    (new Cropping1D$Builder cropping))
  (^Cropping1D$Builder []
    (new Cropping1D$Builder )))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.convolutional.Cropping1D`"
  (^org.deeplearning4j.nn.conf.layers.convolutional.Cropping1D [^Cropping1D$Builder this]
    (-> this (.build))))

