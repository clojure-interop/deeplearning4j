(ns org.datavec.api.writable.batch.NDArrayRecordBatch
  "A List<List<Writable>> record batch, backed by a List<INDArray>
 Each INDArray in the underlying list is assumed to represent a minibatch of examples, with dimension 0 indexing
 the example.
 On calls to methods like .get(int) the appropriate view is extracted from the underlying arrays and returned
 as an NDArrayWritable"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable.batch NDArrayRecordBatch]))

(defn ->nd-array-record-batch
  "Constructor.

  arrays - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^NDArrayRecordBatch [^org.nd4j.linalg.api.ndarray.INDArray arrays]
    (new NDArrayRecordBatch arrays)))

(defn size
  "returns: `int`"
  (^Integer [^NDArrayRecordBatch this]
    (-> this (.size))))

(defn get
  "index - `int`

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^NDArrayRecordBatch this ^Integer index]
    (-> this (.get index))))

