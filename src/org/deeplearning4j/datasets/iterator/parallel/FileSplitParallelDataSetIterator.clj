(ns org.deeplearning4j.datasets.iterator.parallel.FileSplitParallelDataSetIterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.parallel FileSplitParallelDataSetIterator]))

(defn ->file-split-parallel-data-set-iterator
  "Constructor.

  root-folder - `java.io.File`
  pattern - `java.lang.String`
  callback - `org.deeplearning4j.datasets.iterator.callbacks.FileCallback`
  num-threads - `int`
  buffer-per-thread - `int`
  inequality-handling - `org.nd4j.linalg.dataset.api.iterator.enums.InequalityHandling`"
  (^FileSplitParallelDataSetIterator [^java.io.File root-folder ^java.lang.String pattern ^org.deeplearning4j.datasets.iterator.callbacks.FileCallback callback ^Integer num-threads ^Integer buffer-per-thread ^org.nd4j.linalg.dataset.api.iterator.enums.InequalityHandling inequality-handling]
    (new FileSplitParallelDataSetIterator root-folder pattern callback num-threads buffer-per-thread inequality-handling))
  (^FileSplitParallelDataSetIterator [^java.io.File root-folder ^java.lang.String pattern ^org.deeplearning4j.datasets.iterator.callbacks.FileCallback callback ^Integer num-threads ^org.nd4j.linalg.dataset.api.iterator.enums.InequalityHandling inequality-handling]
    (new FileSplitParallelDataSetIterator root-folder pattern callback num-threads inequality-handling))
  (^FileSplitParallelDataSetIterator [^java.io.File root-folder ^java.lang.String pattern ^org.deeplearning4j.datasets.iterator.callbacks.FileCallback callback ^Integer num-threads]
    (new FileSplitParallelDataSetIterator root-folder pattern callback num-threads))
  (^FileSplitParallelDataSetIterator [^java.io.File root-folder ^java.lang.String pattern ^org.deeplearning4j.datasets.iterator.callbacks.FileCallback callback]
    (new FileSplitParallelDataSetIterator root-folder pattern callback)))

(def *-default-pattern
  "Static Constant.

  type: java.lang.String"
  FileSplitParallelDataSetIterator/DEFAULT_PATTERN)

(defn has-next-for?
  "Description copied from interface: ParallelDataSetIterator

  consumer - `int`

  returns: `boolean`"
  (^Boolean [^FileSplitParallelDataSetIterator this ^Integer consumer]
    (-> this (.hasNextFor consumer))))

(defn next-for
  "Description copied from interface: ParallelDataSetIterator

  consumer - `int`

  returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^FileSplitParallelDataSetIterator this ^Integer consumer]
    (-> this (.nextFor consumer))))

