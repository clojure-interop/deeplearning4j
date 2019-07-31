(ns org.nd4j.weightinit.impl.NDArraySupplierInitScheme$NDArraySupplier
  "A simple facade"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit.impl NDArraySupplierInitScheme$NDArraySupplier]))

(defn get-arr
  "An array proxy method.

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArraySupplierInitScheme$NDArraySupplier this]
    (-> this (.getArr))))

