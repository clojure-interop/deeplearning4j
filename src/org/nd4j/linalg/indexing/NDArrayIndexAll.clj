(ns org.nd4j.linalg.indexing.NDArrayIndexAll
  "Mainly meant for internal use:
 represents all of the elements of a dimension"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing NDArrayIndexAll]))

(defn ->nd-array-index-all
  "Constructor.

  inclusive - whether to include the last number - `boolean`"
  (^NDArrayIndexAll [^Boolean inclusive]
    (new NDArrayIndexAll inclusive)))

(defn init
  "Description copied from interface: INDArrayIndex

  arr - the array to initialize on - `org.nd4j.linalg.api.ndarray.INDArray`
  begin - the beginning index - `long`
  dimension - the dimension to initialize on - `int`"
  ([^NDArrayIndexAll this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Long begin ^Integer dimension]
    (-> this (.init arr begin dimension))))

