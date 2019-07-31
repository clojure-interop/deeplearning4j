(ns org.nd4j.list.compat.TensorList
  "This class implements basic storage for NDArrays"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.list.compat TensorList]))

(defn ->tensor-list
  "Constructor.

  name - `java.lang.String`
  source - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^TensorList [^java.lang.String name ^org.nd4j.linalg.api.ndarray.INDArray source]
    (new TensorList name source))
  (^TensorList [^java.lang.String name]
    (new TensorList name)))

(defn get
  "index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^TensorList this ^Integer index]
    (-> this (.get index))))

(defn put
  "index - `int`
  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^TensorList this ^Integer index ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.put index array))))

(defn stack
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^TensorList this]
    (-> this (.stack))))

(defn gather
  "indices - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^TensorList this ^org.nd4j.linalg.api.ndarray.INDArray indices]
    (-> this (.gather indices))))

(defn concat
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^TensorList this]
    (-> this (.concat))))

(defn size
  "returns: `int`"
  (^Integer [^TensorList this]
    (-> this (.size))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TensorList this]
    (-> this (.getName))))

