(ns org.deeplearning4j.nn.conf.layers.convolutional.Cropping2D$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.convolutional Cropping2D$Builder]))

(defn ->builder
  "Constructor.

  crop-top - Amount of cropping to apply to the top of the input activations - `int`
  crop-bottom - Amount of cropping to apply to the bottom of the input activations - `int`
  crop-left - Amount of cropping to apply to the left of the input activations - `int`
  crop-right - Amount of cropping to apply to the right of the input activations - `int`"
  (^Cropping2D$Builder [^Integer crop-top ^Integer crop-bottom ^Integer crop-left ^Integer crop-right]
    (new Cropping2D$Builder crop-top crop-bottom crop-left crop-right))
  (^Cropping2D$Builder [^Integer crop-top-bottom ^Integer crop-left-right]
    (new Cropping2D$Builder crop-top-bottom crop-left-right))
  (^Cropping2D$Builder [cropping]
    (new Cropping2D$Builder cropping))
  (^Cropping2D$Builder []
    (new Cropping2D$Builder )))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.convolutional.Cropping2D`"
  (^org.deeplearning4j.nn.conf.layers.convolutional.Cropping2D [^Cropping2D$Builder this]
    (-> this (.build))))

