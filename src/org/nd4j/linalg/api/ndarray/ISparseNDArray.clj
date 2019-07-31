(ns org.nd4j.linalg.api.ndarray.ISparseNDArray
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ndarray ISparseNDArray]))

(defn get-vector-coordinates
  "Return a array of non-major pointers
  i.e. return the column indexes in case of row-major ndarray

  returns: a DataBuffer of indexes - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^ISparseNDArray this]
    (-> this (.getVectorCoordinates))))

(defn to-dense
  "Return a dense representation of the sparse ndarray

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ISparseNDArray this]
    (-> this (.toDense))))

(defn nnz
  "Return the number of non-null element

  returns: nnz - `int`"
  (^Integer [^ISparseNDArray this]
    (-> this (.nnz))))

(defn get-format
  "Return the sparse format (i.e COO, CSR, ...)

  returns: format - `org.nd4j.linalg.api.ndarray.SparseFormat`"
  (^org.nd4j.linalg.api.ndarray.SparseFormat [^ISparseNDArray this]
    (-> this (.getFormat))))

