(ns org.deeplearning4j.datasets.iterator.file.FileMultiDataSetIterator
  "Iterate over a directory (and optionally subdirectories) containing a number of MultiDataSet objects that have
 previously been saved to files with MultiDataSet.save(File).
 This iterator supports the following (optional) features, depending on the constructor used:
 - Recursive listing of all files (i.e., include files in subdirectories)
 - Filtering based on a set of file extensions (if null, no filtering - assume all files are saved MultiDataSet objects)
 - Randomization of iteration order (default enabled, if a Random instance is provided
 - Combining and splitting of MultiDataSets (disabled by default, or if batchSize == -1. If enabled, MultiDataSet
 objects will be split or combined as required to ensure the specified minibatch size is returned. In other words, the
 saved MultiDataSet objects can have a different number of examples vs. those returned by the iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.file FileMultiDataSetIterator]))

(defn ->file-multi-data-set-iterator
  "Constructor.

  Create a FileMultiDataSetIterator with all settings specified

  root-dir - Root directory containing the saved DataSet objects - `java.io.File`
  recursive - If true: include files in subdirectories - `boolean`
  rng - May be null. If non-null, use this to randomize order - `java.util.Random`
  batch-size - Batch size. If > 0, DataSets will be split/recombined as required. If <= 0, DataSets willsimply be loaded and returned unmodified - `int`
  valid-extensions - May be null. If non-null, only files with one of the specified extensions will be used - `java.lang.String`"
  (^FileMultiDataSetIterator [^java.io.File root-dir ^Boolean recursive ^java.util.Random rng ^Integer batch-size ^java.lang.String valid-extensions]
    (new FileMultiDataSetIterator root-dir recursive rng batch-size valid-extensions))
  (^FileMultiDataSetIterator [^java.io.File root-dir ^Integer batch-size ^java.lang.String valid-extensions]
    (new FileMultiDataSetIterator root-dir batch-size valid-extensions))
  (^FileMultiDataSetIterator [^java.io.File root-dir ^Integer batch-size]
    (new FileMultiDataSetIterator root-dir batch-size))
  (^FileMultiDataSetIterator [^java.io.File root-dir]
    (new FileMultiDataSetIterator root-dir)))

(defn merge
  "to-merge - `java.util.List`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^FileMultiDataSetIterator this ^java.util.List to-merge]
    (-> this (.merge to-merge))))

(defn next
  "Description copied from interface: MultiDataSetIterator

  num - Number of examples to fetch - `int`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^FileMultiDataSetIterator this ^Integer num]
    (-> this (.next num))))

