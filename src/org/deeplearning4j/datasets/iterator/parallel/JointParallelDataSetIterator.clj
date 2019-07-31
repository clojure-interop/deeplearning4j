(ns org.deeplearning4j.datasets.iterator.parallel.JointParallelDataSetIterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.parallel JointParallelDataSetIterator]))

(defn ->joint-parallel-data-set-iterator
  "Constructor.

  iterators - `java.util.List`
  single-device-mode - `boolean`
  buffer-size - `int`
  inequality-handling - `org.nd4j.linalg.dataset.api.iterator.enums.InequalityHandling`"
  (^JointParallelDataSetIterator [^java.util.List iterators ^Boolean single-device-mode ^Integer buffer-size ^org.nd4j.linalg.dataset.api.iterator.enums.InequalityHandling inequality-handling]
    (new JointParallelDataSetIterator iterators single-device-mode buffer-size inequality-handling)))

(defn has-next-for?
  "Description copied from interface: ParallelDataSetIterator

  consumer - `int`

  returns: `boolean`"
  (^Boolean [^JointParallelDataSetIterator this ^Integer consumer]
    (-> this (.hasNextFor consumer))))

(defn next-for
  "Description copied from interface: ParallelDataSetIterator

  consumer - `int`

  returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^JointParallelDataSetIterator this ^Integer consumer]
    (-> this (.nextFor consumer))))

