(ns org.nd4j.aeron.ipc.NDArrayHolder
  "A simple interface for retrieving an
 ndarray"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.aeron.ipc NDArrayHolder]))

(defn set-array
  "Set the ndarray

  arr - the ndarray for this holderto use - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^NDArrayHolder this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.setArray arr))))

(defn total-updates
  "The number of updates
  that have been sent to this older.

  returns: `int`"
  (^Integer [^NDArrayHolder this]
    (-> this (.totalUpdates))))

(defn get
  "Retrieve an ndarray

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayHolder this]
    (-> this (.get))))

(defn get-tad
  "Retrieve a partial view of the ndarray.
  This method uses tensor along dimension internally
  Note this will call dup()

  idx - the index of the tad to get - `int`
  dimensions - the dimensions to use - `int`

  returns: the tensor along dimension based on the index and dimensions
  from the master array. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayHolder this ^Integer idx ^Integer dimensions]
    (-> this (.getTad idx dimensions))))

