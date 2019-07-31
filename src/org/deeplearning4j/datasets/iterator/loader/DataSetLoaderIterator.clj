(ns org.deeplearning4j.datasets.iterator.loader.DataSetLoaderIterator
  "A DataSetLoader that loads DataSets from a path, using a Loader<DataSet> such as SerializedDataSetLoader.
 Paths are converted to input streams using SourceFactory such as LocalFileSourceFactory.
 Note that this iterator does not implement any sort of merging/batching functionality - it simply returns the DataSets
 as-is from the path/loader.
 Note: If using DataSetLoaderIterator(Collection, Random, Loader, SourceFactory) constructor with non-null
 Random instance, the data will be shuffled,"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.loader DataSetLoaderIterator]))

(defn ->data-set-loader-iterator
  "Constructor.

  Iterate of the specified collection of strings with optional randomization

  paths - Paths to iterate over - `java.util.Collection`
  rng - Optional random instance to use for shuffling of order. If null, no shuffling will be used. - `java.util.Random`
  loader - Loader to use when loading DataSets - `org.nd4j.api.loader.Loader`
  source-factory - The factory to use to convert the paths into streams via Source - `org.nd4j.api.loader.SourceFactory`"
  (^DataSetLoaderIterator [^java.util.Collection paths ^java.util.Random rng ^org.nd4j.api.loader.Loader loader ^org.nd4j.api.loader.SourceFactory source-factory]
    (new DataSetLoaderIterator paths rng loader source-factory))
  (^DataSetLoaderIterator [^java.util.Iterator paths ^org.nd4j.api.loader.Loader loader ^org.nd4j.api.loader.SourceFactory source-factory]
    (new DataSetLoaderIterator paths loader source-factory)))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^DataSetLoaderIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  i - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^DataSetLoaderIterator this ^Integer i]
    (-> this (.next i)))
  (^org.nd4j.linalg.dataset.DataSet [^DataSetLoaderIterator this]
    (-> this (.next))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^DataSetLoaderIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^DataSetLoaderIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^DataSetLoaderIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^DataSetLoaderIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^DataSetLoaderIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DataSetLoaderIterator this]
    (-> this (.getLabels))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^DataSetLoaderIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^DataSetLoaderIterator this]
    (-> this (.resetSupported))))

