(ns org.nd4j.weightinit.impl.NDArraySupplierInitScheme
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit.impl NDArraySupplierInitScheme]))

(defn ->nd-array-supplier-init-scheme
  "Constructor."
  (^NDArraySupplierInitScheme []
    (new NDArraySupplierInitScheme )))

(defn create
  "Description copied from interface: WeightInitScheme

  shape - the shape of the array - `long[]`
  params-view - the parameters view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the created array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArraySupplierInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.create shape params-view)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArraySupplierInitScheme this shape]
    (-> this (.create shape))))

(defn order
  "Description copied from interface: WeightInitScheme

  returns: `char`"
  (^Character [^NDArraySupplierInitScheme this]
    (-> this (.order))))

(defn type
  "Description copied from interface: WeightInitScheme

  returns: `org.nd4j.weightinit.WeightInit`"
  (^org.nd4j.weightinit.WeightInit [^NDArraySupplierInitScheme this]
    (-> this (.type))))

