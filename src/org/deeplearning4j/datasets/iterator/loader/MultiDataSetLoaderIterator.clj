(ns org.deeplearning4j.datasets.iterator.loader.MultiDataSetLoaderIterator
  "A MultiDataSetLoader that loads MultiDataSets from a path, using a Loader<MultiDataSet> such as SerializedMultiDataSetLoader.
 Paths are converted to input streams using SourceFactory such as LocalFileSourceFactory.
 Note that this iterator does not implement any sort of merging/batching functionality - it simply returns the DataSets
 as-is from the path/loader.
 Note: If using MultiDataSetLoaderIterator(Collection, Random, Loader, SourceFactory) constructor with non-null
 Random instance, the data will be shuffled,"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.loader MultiDataSetLoaderIterator]))

(defn ->multi-data-set-loader-iterator
  "Constructor.

  Iterate of the specified collection of strings with optional randomization

  paths - Paths to iterate over - `java.util.Collection`
  rng - Optional random instance to use for shuffling of order. If null, no shuffling will be used. - `java.util.Random`
  loader - Loader to use when loading DataSets - `org.nd4j.api.loader.Loader`
  source-factory - The factory to use to convert the paths into streams via Source - `org.nd4j.api.loader.SourceFactory`"
  (^MultiDataSetLoaderIterator [^java.util.Collection paths ^java.util.Random rng ^org.nd4j.api.loader.Loader loader ^org.nd4j.api.loader.SourceFactory source-factory]
    (new MultiDataSetLoaderIterator paths rng loader source-factory))
  (^MultiDataSetLoaderIterator [^java.util.Iterator paths ^org.nd4j.api.loader.Loader loader ^org.nd4j.api.loader.SourceFactory source-factory]
    (new MultiDataSetLoaderIterator paths loader source-factory)))

(defn next
  "Description copied from interface: MultiDataSetIterator

  i - Number of examples to fetch - `int`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^MultiDataSetLoaderIterator this ^Integer i]
    (-> this (.next i)))
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^MultiDataSetLoaderIterator this]
    (-> this (.next))))

(defn reset-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^MultiDataSetLoaderIterator this]
    (-> this (.resetSupported))))

(defn async-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^MultiDataSetLoaderIterator this]
    (-> this (.asyncSupported))))

(defn reset
  "Description copied from interface: MultiDataSetIterator"
  ([^MultiDataSetLoaderIterator this]
    (-> this (.reset))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^MultiDataSetLoaderIterator this]
    (-> this (.hasNext))))

(defn remove
  ""
  ([^MultiDataSetLoaderIterator this]
    (-> this (.remove))))

