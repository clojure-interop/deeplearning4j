(ns org.deeplearning4j.datasets.iterator.file.FileDataSetIterator
  "Iterate over a directory (and optionally subdirectories) containing a number of DataSet objects that have
 previously been saved to files with DataSet.save(File).
 This iterator supports the following (optional) features, depending on the constructor used:
 - Recursive listing of all files (i.e., include files in subdirectories)
 - Filtering based on a set of file extensions (if null, no filtering - assume all files are saved DataSet objects)
 - Randomization of iteration order (default enabled, if a Random instance is provided
 - Combining and splitting of DataSets (disabled by default, or if batchSize == -1. If enabled, DataSet objects will
 be split or combined as required to ensure the specified minibatch size is returned. In other words, the saved
 DataSet objects can have a different number of examples vs. those returned by the iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.file FileDataSetIterator]))

(defn ->file-data-set-iterator
  "Constructor.

  Create a FileDataSetIterator with all settings specified

  root-dir - Root directory containing the saved DataSet objects - `java.io.File`
  recursive - If true: include files in subdirectories - `boolean`
  rng - May be null. If non-null, use this to randomize order - `java.util.Random`
  batch-size - Batch size. If > 0, DataSets will be split/recombined as required. If <= 0, DataSets willsimply be loaded and returned unmodified - `int`
  valid-extensions - May be null. If non-null, only files with one of the specified extensions will be used - `java.lang.String`"
  (^FileDataSetIterator [^java.io.File root-dir ^Boolean recursive ^java.util.Random rng ^Integer batch-size ^java.lang.String valid-extensions]
    (new FileDataSetIterator root-dir recursive rng batch-size valid-extensions))
  (^FileDataSetIterator [^java.io.File root-dir ^Integer batch-size ^java.lang.String valid-extensions]
    (new FileDataSetIterator root-dir batch-size valid-extensions))
  (^FileDataSetIterator [^java.io.File root-dir ^Integer batch-size]
    (new FileDataSetIterator root-dir batch-size))
  (^FileDataSetIterator [^java.io.File root-dir]
    (new FileDataSetIterator root-dir)))

(defn next
  "Description copied from interface: DataSetIterator

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^FileDataSetIterator this ^Integer num]
    (-> this (.next num))))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^FileDataSetIterator this]
    (-> this (.inputColumns))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^FileDataSetIterator this]
    (-> this (.totalOutcomes))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^FileDataSetIterator this]
    (-> this (.batch))))

