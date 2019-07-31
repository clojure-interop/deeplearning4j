(ns org.nd4j.linalg.dataset.api.iterator.ParallelMultiDataSetIterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.iterator ParallelMultiDataSetIterator]))

(defn attach-thread
  "This method sets consumer affinity to specific producer
  PLEASE NOTE: this method is optional, and it'll change only nextFor()/hasNextFor() mechanics

  producer - `int`"
  ([^ParallelMultiDataSetIterator this ^Integer producer]
    (-> this (.attachThread producer))))

(defn has-next-for?
  "Returns true, if attached producer has something in queue, false otherwise

  consumer - `int`

  returns: `boolean`"
  (^Boolean [^ParallelMultiDataSetIterator this ^Integer consumer]
    (-> this (.hasNextFor consumer)))
  (^Boolean [^ParallelMultiDataSetIterator this]
    (-> this (.hasNextFor))))

(defn next-for
  "Returns next DataSet for given consumer

  consumer - `int`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^ParallelMultiDataSetIterator this ^Integer consumer]
    (-> this (.nextFor consumer)))
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^ParallelMultiDataSetIterator this]
    (-> this (.nextFor))))

