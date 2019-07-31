(ns org.deeplearning4j.nn.conf.layers.convolutional.Cropping3D$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.convolutional Cropping3D$Builder]))

(defn ->builder
  "Constructor.

  crop-left-d - Amount of cropping to apply to the left of the depth dimension - `int`
  crop-right-d - Amount of cropping to apply to the right of the depth dimension - `int`
  crop-left-h - Amount of cropping to apply to the left of the height dimension - `int`
  crop-right-h - Amount of cropping to apply to the right of the height dimension - `int`
  crop-left-w - Amount of cropping to apply to the left of the width dimension - `int`
  crop-right-w - Amount of cropping to apply to the right of the width dimension - `int`"
  (^Cropping3D$Builder [^Integer crop-left-d ^Integer crop-right-d ^Integer crop-left-h ^Integer crop-right-h ^Integer crop-left-w ^Integer crop-right-w]
    (new Cropping3D$Builder crop-left-d crop-right-d crop-left-h crop-right-h crop-left-w crop-right-w))
  (^Cropping3D$Builder [^Integer crop-depth ^Integer crop-height ^Integer crop-width]
    (new Cropping3D$Builder crop-depth crop-height crop-width))
  (^Cropping3D$Builder [cropping]
    (new Cropping3D$Builder cropping))
  (^Cropping3D$Builder []
    (new Cropping3D$Builder )))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.convolutional.Cropping3D`"
  (^org.deeplearning4j.nn.conf.layers.convolutional.Cropping3D [^Cropping3D$Builder this]
    (-> this (.build))))

