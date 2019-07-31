(ns org.deeplearning4j.spark.ordering.DataSetOrdering
  "Orders by data set size.
 This will force the dataset with a certain number of mini batches to be grouped at th end."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.ordering DataSetOrdering]))

(defn ->data-set-ordering
  "Constructor."
  (^DataSetOrdering []
    (new DataSetOrdering )))

(defn compare
  "data-set - `org.nd4j.linalg.dataset.DataSet`
  t-1 - `org.nd4j.linalg.dataset.DataSet`

  returns: `int`"
  (^Integer [^DataSetOrdering this ^org.nd4j.linalg.dataset.DataSet data-set ^org.nd4j.linalg.dataset.DataSet t-1]
    (-> this (.compare data-set t-1))))

(defn min
  "data-set - `org.nd4j.linalg.dataset.DataSet`
  t-1 - `org.nd4j.linalg.dataset.DataSet`

  returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^DataSetOrdering this ^org.nd4j.linalg.dataset.DataSet data-set ^org.nd4j.linalg.dataset.DataSet t-1]
    (-> this (.min data-set t-1))))

(defn lt
  "data-set - `org.nd4j.linalg.dataset.DataSet`
  t-1 - `org.nd4j.linalg.dataset.DataSet`

  returns: `boolean`"
  (^Boolean [^DataSetOrdering this ^org.nd4j.linalg.dataset.DataSet data-set ^org.nd4j.linalg.dataset.DataSet t-1]
    (-> this (.lt data-set t-1))))

(defn reverse
  "returns: `scala.math.Ordering<org.nd4j.linalg.dataset.DataSet>`"
  (^scala.math.Ordering [^DataSetOrdering this]
    (-> this (.reverse))))

(defn lteq
  "data-set - `org.nd4j.linalg.dataset.DataSet`
  t-1 - `org.nd4j.linalg.dataset.DataSet`

  returns: `boolean`"
  (^Boolean [^DataSetOrdering this ^org.nd4j.linalg.dataset.DataSet data-set ^org.nd4j.linalg.dataset.DataSet t-1]
    (-> this (.lteq data-set t-1))))

(defn max
  "data-set - `org.nd4j.linalg.dataset.DataSet`
  t-1 - `org.nd4j.linalg.dataset.DataSet`

  returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^DataSetOrdering this ^org.nd4j.linalg.dataset.DataSet data-set ^org.nd4j.linalg.dataset.DataSet t-1]
    (-> this (.max data-set t-1))))

(defn try-compare
  "data-set - `org.nd4j.linalg.dataset.DataSet`
  t-1 - `org.nd4j.linalg.dataset.DataSet`

  returns: `scala.Some<java.lang.Object>`"
  (^scala.Some [^DataSetOrdering this ^org.nd4j.linalg.dataset.DataSet data-set ^org.nd4j.linalg.dataset.DataSet t-1]
    (-> this (.tryCompare data-set t-1))))

(defn gt
  "data-set - `org.nd4j.linalg.dataset.DataSet`
  t-1 - `org.nd4j.linalg.dataset.DataSet`

  returns: `boolean`"
  (^Boolean [^DataSetOrdering this ^org.nd4j.linalg.dataset.DataSet data-set ^org.nd4j.linalg.dataset.DataSet t-1]
    (-> this (.gt data-set t-1))))

(defn gteq
  "data-set - `org.nd4j.linalg.dataset.DataSet`
  t-1 - `org.nd4j.linalg.dataset.DataSet`

  returns: `boolean`"
  (^Boolean [^DataSetOrdering this ^org.nd4j.linalg.dataset.DataSet data-set ^org.nd4j.linalg.dataset.DataSet t-1]
    (-> this (.gteq data-set t-1))))

(defn on
  "function-1 - `scala.Function1`

  returns: `<U> scala.math.Ordering<U>`"
  ([^DataSetOrdering this ^scala.Function1 function-1]
    (-> this (.on function-1))))

(defn mk-ordering-ops
  "data-set - `org.nd4j.linalg.dataset.DataSet`

  returns: `scala.math.Ordering.Ops`"
  (^scala.math.Ordering.Ops [^DataSetOrdering this ^org.nd4j.linalg.dataset.DataSet data-set]
    (-> this (.mkOrderingOps data-set))))

(defn equiv
  "data-set - `org.nd4j.linalg.dataset.DataSet`
  t-1 - `org.nd4j.linalg.dataset.DataSet`

  returns: `boolean`"
  (^Boolean [^DataSetOrdering this ^org.nd4j.linalg.dataset.DataSet data-set ^org.nd4j.linalg.dataset.DataSet t-1]
    (-> this (.equiv data-set t-1))))

