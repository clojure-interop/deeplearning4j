(ns org.nd4j.weightinit.BaseWeightInitScheme
  "Abstract class for WeightInitScheme
 This handles boilerplate like delegating to the parameters view."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit BaseWeightInitScheme]))

(defn ->base-weight-init-scheme
  "Constructor.

  Initialize with c weight ordering by default"
  (^BaseWeightInitScheme []
    (new BaseWeightInitScheme ))
  (^BaseWeightInitScheme [^Character order]
    (new BaseWeightInitScheme order)))

(defn do-create
  "shape - `long[]`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWeightInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.doCreate shape params-view))))

(defn create
  "Description copied from interface: WeightInitScheme

  shape - the shape of the array - `long[]`
  params-view - the parameters view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the created array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWeightInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.create shape params-view)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWeightInitScheme this ^Long shape]
    (-> this (.create shape))))

(defn order
  "Description copied from interface: WeightInitScheme

  returns: `char`"
  (^Character [^BaseWeightInitScheme this]
    (-> this (.order))))

