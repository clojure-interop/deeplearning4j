(ns org.deeplearning4j.spark.iterator.PortableDataStreamDataSetIterator
  "A DataSetIterator that loads serialized DataSet objects (saved with DataSet.save(OutputStream)) from
 a PortableDataStream, usually obtained from SparkContext.binaryFiles()"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.iterator PortableDataStreamDataSetIterator]))

(defn ->portable-data-stream-data-set-iterator
  "Constructor.

  iter - `java.util.Iterator`"
  (^PortableDataStreamDataSetIterator [^java.util.Iterator iter]
    (new PortableDataStreamDataSetIterator iter)))

(defn next
  "returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^PortableDataStreamDataSetIterator this]
    (-> this (.next))))

