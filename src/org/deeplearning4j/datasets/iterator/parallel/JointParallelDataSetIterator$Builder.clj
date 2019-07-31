(ns org.deeplearning4j.datasets.iterator.parallel.JointParallelDataSetIterator$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.parallel JointParallelDataSetIterator$Builder]))

(defn ->builder
  "Constructor.

  iterators - `java.util.List`
  inequality-handling - `org.nd4j.linalg.dataset.api.iterator.enums.InequalityHandling`"
  (^JointParallelDataSetIterator$Builder [^java.util.List iterators ^org.nd4j.linalg.dataset.api.iterator.enums.InequalityHandling inequality-handling]
    (new JointParallelDataSetIterator$Builder iterators inequality-handling))
  (^JointParallelDataSetIterator$Builder [^org.nd4j.linalg.dataset.api.iterator.enums.InequalityHandling inequality-handling]
    (new JointParallelDataSetIterator$Builder inequality-handling)))

(defn add-source-iterator
  "iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`

  returns: `org.deeplearning4j.datasets.iterator.parallel.JointParallelDataSetIterator$Builder`"
  (^org.deeplearning4j.datasets.iterator.parallel.JointParallelDataSetIterator$Builder [^JointParallelDataSetIterator$Builder this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (-> this (.addSourceIterator iterator))))

(defn set-buffer-size-per-split
  "buffer-size - `int`

  returns: `org.deeplearning4j.datasets.iterator.parallel.JointParallelDataSetIterator$Builder`"
  (^org.deeplearning4j.datasets.iterator.parallel.JointParallelDataSetIterator$Builder [^JointParallelDataSetIterator$Builder this ^Integer buffer-size]
    (-> this (.setBufferSizePerSplit buffer-size))))

(defn enforce-single-device
  "really-enforce - `boolean`

  returns: `org.deeplearning4j.datasets.iterator.parallel.JointParallelDataSetIterator$Builder`"
  (^org.deeplearning4j.datasets.iterator.parallel.JointParallelDataSetIterator$Builder [^JointParallelDataSetIterator$Builder this ^Boolean really-enforce]
    (-> this (.enforceSingleDevice really-enforce))))

(defn build
  "returns: `org.deeplearning4j.datasets.iterator.parallel.JointParallelDataSetIterator`"
  (^org.deeplearning4j.datasets.iterator.parallel.JointParallelDataSetIterator [^JointParallelDataSetIterator$Builder this]
    (-> this (.build))))

