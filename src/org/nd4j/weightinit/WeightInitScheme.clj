(ns org.nd4j.weightinit.WeightInitScheme
  "Defines weight initialization for neural networks.
 Use BaseWeightInitScheme
 to create a new WeightInitScheme
 This is needed to handle things like the parameters view."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit WeightInitScheme]))

(defn create
  "Create the array

  shape - the shape of the array - `long[]`
  params-view - the parameters view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the created array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WeightInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.create shape params-view)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^WeightInitScheme this ^Long shape]
    (-> this (.create shape))))

(defn order
  "The order of the weight init

  returns: `char`"
  (^Character [^WeightInitScheme this]
    (-> this (.order))))

(defn type
  "The type of the weight init

  returns: `org.nd4j.weightinit.WeightInit`"
  (^org.nd4j.weightinit.WeightInit [^WeightInitScheme this]
    (-> this (.type))))

